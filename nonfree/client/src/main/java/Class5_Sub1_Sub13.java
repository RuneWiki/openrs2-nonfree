import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class5_Sub1_Sub13 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gn", name = "D", descriptor = "[Lclient!iw;")
	private Class61[] aClass61Array1;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.aClass61Array1 = new Class61[arg1.method5539()];
			for (@Pc(26) int local26 = 0; local26 < this.aClass61Array1.length; local26++) {
				@Pc(32) int local32 = arg1.method5539();
				if (local32 == 0) {
					this.aClass61Array1[local26] = Static242.method3141(arg1);
				} else if (local32 == 1) {
					this.aClass61Array1[local26] = Static409.method5402(arg1);
				} else if (local32 == 2) {
					this.aClass61Array1[local26] = Static150.method2166(arg1);
				} else if (local32 == 3) {
					this.aClass61Array1[local26] = Static235.method3047(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([[II)V")
	private void method1985(@OriginalArg(0) int[][] arg0) {
		@Pc(12) int local12 = Static148.anInt2666;
		@Pc(14) int local14 = Static458.anInt7496;
		Static370.method4835(arg0);
		Static225.method2959(Static273.anInt4299, Static157.anInt2733);
		if (this.aClass61Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass61Array1.length; local28++) {
			@Pc(35) Class61 local35 = this.aClass61Array1[local28];
			@Pc(38) int local38 = local35.anInt5307;
			@Pc(41) int local41 = local35.anInt5306;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method4109(local14, local12);
				}
			} else if (local41 < 0) {
				local35.method4110(local14, local12);
			} else {
				local35.method4108(local14, local12);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			this.method1985(super.aClass239_41.method5403());
		}
		return local16;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(22) int local22 = Static148.anInt2666;
			@Pc(24) int local24 = Static458.anInt7496;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass154_41.method3175();
			this.method1985(local28);
			for (@Pc(39) int local39 = 0; local39 < Static458.anInt7496; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static148.anInt2666; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
