import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class3_Sub1_Sub36 extends Class3_Sub1 {

	@OriginalMember(owner = "client!to", name = "J", descriptor = "[Lclient!cm;")
	private Class42[] aClass42Array1;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			this.method5142(super.aClass4_41.method60());
		}
		return local14;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B[[I)V")
	private void method5142(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static238.anInt4221;
		@Pc(9) int local9 = Static220.anInt3914;
		Static314.method4812(arg0);
		Static273.method4276(Static300.anInt5187, Static171.anInt3000);
		if (this.aClass42Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass42Array1.length; local31++) {
			@Pc(38) Class42 local38 = this.aClass42Array1[local31];
			@Pc(41) int local41 = local38.anInt5254;
			@Pc(44) int local44 = local38.anInt5253;
			if (local41 >= 0) {
				if (local44 >= 0) {
					local38.method4693(local9, local7);
				} else {
					local38.method4694(local9, local7);
				}
			} else if (local44 >= 0) {
				local38.method4691(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(24) int local24 = Static238.anInt4221;
			@Pc(26) int local26 = Static220.anInt3914;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass206_41.method4684();
			this.method5142(local30);
			for (@Pc(41) int local41 = 0; local41 < Static220.anInt3914; local41++) {
				@Pc(47) int[] local47 = local30[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static238.anInt4221; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass42Array1 = new Class42[arg0.method2739()];
			for (@Pc(42) int local42 = 0; local42 < this.aClass42Array1.length; local42++) {
				@Pc(48) int local48 = arg0.method2739();
				if (local48 == 0) {
					this.aClass42Array1[local42] = Static269.method4255(arg0);
				} else if (local48 == 1) {
					this.aClass42Array1[local42] = Static136.method2193(arg0);
				} else if (local48 == 2) {
					this.aClass42Array1[local42] = Static251.method4084(arg0);
				} else if (local48 == 3) {
					this.aClass42Array1[local42] = Static220.method3678(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean487 = arg0.method2739() == 1;
			return;
		}
	}
}
