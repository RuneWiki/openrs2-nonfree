import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!eg", name = "Z", descriptor = "[Lclient!ia;")
	private Class74[] aClass74Array1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass74Array1 = new Class74[arg0.method4261()];
			for (@Pc(32) int local32 = 0; local32 < this.aClass74Array1.length; local32++) {
				@Pc(45) int local45 = arg0.method4261();
				if (local45 == 0) {
					this.aClass74Array1[local32] = Static250.method4001(arg0);
				} else if (local45 == 1) {
					this.aClass74Array1[local32] = Static114.method1197(arg0);
				} else if (local45 == 2) {
					this.aClass74Array1[local32] = Static127.method2259(arg0);
				} else if (local45 == 3) {
					this.aClass74Array1[local32] = Static241.method3940(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(22) int local22 = Static114.anInt1359;
			@Pc(24) int local24 = Static199.anInt4143;
			@Pc(29) int[][][] local29 = this.aClass150_41.method3896();
			@Pc(33) int[][] local33 = new int[local24][local22];
			this.method1125(local33);
			for (@Pc(41) int local41 = 0; local41 < Static199.anInt4143; local41++) {
				@Pc(52) int[] local52 = local33[local41];
				@Pc(56) int[][] local56 = local29[local41];
				@Pc(60) int[] local60 = local56[1];
				@Pc(64) int[] local64 = local56[2];
				@Pc(68) int[] local68 = local56[0];
				for (@Pc(70) int local70 = 0; local70 < Static114.anInt1359; local70++) {
					@Pc(81) int local81 = local52[local70];
					local64[local70] = (local81 & 0xFF) << 4;
					local60[local70] = local81 >> 4 & 0xFF0;
					local68[local70] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([[II)V")
	private void method1125(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static114.anInt1359;
		@Pc(9) int local9 = Static199.anInt4143;
		Static222.method3718(arg0);
		Static14.method305(Static39.anInt939, Static129.anInt2676);
		if (this.aClass74Array1 == null) {
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < this.aClass74Array1.length; local34++) {
			@Pc(44) Class74 local44 = this.aClass74Array1[local34];
			@Pc(47) int local47 = local44.anInt6029;
			@Pc(50) int local50 = local44.anInt6030;
			if (local47 < 0) {
				if (local50 >= 0) {
					local44.method4816(local7, local9);
				}
			} else if (local50 >= 0) {
				local44.method4820(local9, local7);
			} else {
				local44.method4818(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			this.method1125(this.aClass136_41.method3409());
		}
		return local14;
	}
}
