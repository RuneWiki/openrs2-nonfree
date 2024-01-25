import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bs", name = "V", descriptor = "[Lclient!jc;")
	private Class63[] aClass63Array1;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(24) int local24 = Static434.anInt4326;
			@Pc(26) int local26 = Static452.anInt7412;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass117_41.method2344();
			this.method639(local30);
			for (@Pc(41) int local41 = 0; local41 < Static452.anInt7412; local41++) {
				@Pc(47) int[] local47 = local30[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static434.anInt4326; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.aClass63Array1 = new Class63[arg1.method4463()];
			for (@Pc(38) int local38 = 0; local38 < this.aClass63Array1.length; local38++) {
				@Pc(44) int local44 = arg1.method4463();
				if (local44 == 0) {
					this.aClass63Array1[local38] = Static6.method101(arg1);
				} else if (local44 == 1) {
					this.aClass63Array1[local38] = Static164.method2245(arg1);
				} else if (local44 == 2) {
					this.aClass63Array1[local38] = Static355.method4562(arg1);
				} else if (local44 == 3) {
					this.aClass63Array1[local38] = Static121.method1658(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			this.method639(super.aClass109_41.method2239());
		}
		return local9;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([[II)V")
	private void method639(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static434.anInt4326;
		@Pc(9) int local9 = Static452.anInt7412;
		Static259.method3341(arg0);
		Static94.method1356(Static429.anInt7144, Static249.anInt4068);
		if (this.aClass63Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass63Array1.length; local28++) {
			@Pc(35) Class63 local35 = this.aClass63Array1[local28];
			@Pc(38) int local38 = local35.anInt6683;
			@Pc(41) int local41 = local35.anInt6687;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method5133(local7, local9);
				}
			} else if (local41 < 0) {
				local35.method5135(local7, local9);
			} else {
				local35.method5134(local7, local9);
			}
		}
	}
}
