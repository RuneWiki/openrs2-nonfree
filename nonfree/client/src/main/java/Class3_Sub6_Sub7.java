import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class3_Sub6_Sub7 extends Class3_Sub6 {

	@OriginalMember(owner = "client!dk", name = "K", descriptor = "[Lclient!bm;")
	private Class37[] aClass37Array1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass37Array1 = new Class37[arg0.method5175()];
			for (@Pc(33) int local33 = 0; local33 < this.aClass37Array1.length; local33++) {
				@Pc(39) int local39 = arg0.method5175();
				if (local39 == 0) {
					this.aClass37Array1[local33] = Static134.method2623(arg0);
				} else if (local39 == 1) {
					this.aClass37Array1[local33] = Static46.method739(arg0);
				} else if (local39 == 2) {
					this.aClass37Array1[local33] = Static563.method7598(arg0);
				} else if (local39 == 3) {
					this.aClass37Array1[local33] = Static359.method5543(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(22) int local22 = Static521.anInt8383;
			@Pc(24) int local24 = Static522.anInt8394;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass155_41.method3665();
			this.method1776(local28);
			for (@Pc(39) int local39 = 0; local39 < Static522.anInt8394; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static521.anInt8383; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			this.method1776(super.aClass213_41.method4805());
		}
		return local9;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[[I)V")
	private void method1776(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int local15 = Static521.anInt8383;
		@Pc(17) int local17 = Static522.anInt8394;
		Static248.method3839(arg0);
		Static308.method4504(Static296.anInt5049, Static68.anInt1579);
		if (this.aClass37Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass37Array1.length; local31++) {
			@Pc(38) Class37 local38 = this.aClass37Array1[local31];
			@Pc(41) int local41 = local38.anInt9377;
			@Pc(44) int local44 = local38.anInt9376;
			if (local41 >= 0) {
				if (local44 >= 0) {
					local38.method7780(local15, local17);
				} else {
					local38.method7782(local15, local17);
				}
			} else if (local44 >= 0) {
				local38.method7778(local17, local15);
			}
		}
	}
}
