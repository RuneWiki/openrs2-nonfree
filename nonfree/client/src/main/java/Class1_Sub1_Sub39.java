import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wi", name = "P", descriptor = "[Lclient!dd;")
	private Class22[] aClass22Array1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			this.method3585(super.aClass40_41.method1363());
		}
		return local9;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass22Array1 = new Class22[arg0.method2771()];
			for (@Pc(32) int local32 = 0; local32 < this.aClass22Array1.length; local32++) {
				@Pc(38) int local38 = arg0.method2771();
				if (local38 == 0) {
					this.aClass22Array1[local32] = Static126.method2107(arg0);
				} else if (local38 == 1) {
					this.aClass22Array1[local32] = Static210.method3541(arg0);
				} else if (local38 == 2) {
					this.aClass22Array1[local32] = Static123.method2072(arg0);
				} else if (local38 == 3) {
					this.aClass22Array1[local32] = Static198.method3354(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(22) int local22 = Static115.anInt2578;
			@Pc(24) int local24 = Static31.anInt857;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass33_41.method1280();
			this.method3585(local28);
			for (@Pc(39) int local39 = 0; local39 < Static31.anInt857; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[2];
				@Pc(61) int[] local61 = local49[1];
				for (@Pc(63) int local63 = 0; local63 < Static115.anInt2578; local63++) {
					@Pc(69) int local69 = local45[local63];
					local57[local63] = (local69 & 0xFF) << 4;
					local61[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[[I)V")
	private void method3585(@OriginalArg(1) int[][] arg0) {
		@Pc(3) int local3 = Static31.anInt857;
		@Pc(9) int local9 = Static115.anInt2578;
		Static44.method819(arg0);
		Static165.method2813(Static48.anInt1202, Static91.anInt2110);
		if (this.aClass22Array1 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < this.aClass22Array1.length; local33++) {
			@Pc(40) Class22 local40 = this.aClass22Array1[local33];
			@Pc(43) int local43 = local40.anInt4155;
			@Pc(46) int local46 = local40.anInt4156;
			if (local46 >= 0) {
				if (local43 < 0) {
					local40.method3216(local3, local9);
				} else {
					local40.method3217(local9, local3);
				}
			} else if (local43 >= 0) {
				local40.method3215(local9, local3);
			}
		}
	}
}
