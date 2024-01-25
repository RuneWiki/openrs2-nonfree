import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!em", name = "G", descriptor = "[Lclient!th;")
	private Class57[] aClass57Array1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(24) int local24 = Static217.anInt3574;
			@Pc(26) int local26 = Static290.anInt4775;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass207_41.method4464();
			this.method1526(local30);
			for (@Pc(41) int local41 = 0; local41 < Static290.anInt4775; local41++) {
				@Pc(47) int[] local47 = local30[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static217.anInt3574; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			this.method1526(super.aClass170_41.method3646());
		}
		return local15;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass57Array1 = new Class57[arg0.method3580()];
			for (@Pc(30) int local30 = 0; local30 < this.aClass57Array1.length; local30++) {
				@Pc(36) int local36 = arg0.method3580();
				if (local36 == 0) {
					this.aClass57Array1[local30] = Static61.method902(arg0);
				} else if (local36 == 1) {
					this.aClass57Array1[local30] = Static92.method1465(arg0);
				} else if (local36 == 2) {
					this.aClass57Array1[local30] = Static121.method1813(arg0);
				} else if (local36 == 3) {
					this.aClass57Array1[local30] = Static210.method2811(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([[II)V")
	private void method1526(@OriginalArg(0) int[][] arg0) {
		@Pc(15) int local15 = Static217.anInt3574;
		@Pc(17) int local17 = Static290.anInt4775;
		Static279.method4993(arg0);
		Static223.method5283(Static157.anInt2698, Static127.anInt2287);
		if (this.aClass57Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass57Array1.length; local31++) {
			@Pc(38) Class57 local38 = this.aClass57Array1[local31];
			@Pc(41) int local41 = local38.anInt6157;
			@Pc(44) int local44 = local38.anInt6158;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method4807(local15, local17);
				}
			} else if (local44 >= 0) {
				local38.method4808(local17, local15);
			} else {
				local38.method4806(local15, local17);
			}
		}
	}
}
