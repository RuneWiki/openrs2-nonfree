import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class2_Sub11_Sub27 extends Class2_Sub11 {

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "[Lclient!fia;")
	private Class120[] aClass120Array1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(27) int local27 = Static301.anInt10214;
			@Pc(29) int local29 = Static609.anInt9448;
			@Pc(33) int[][] local33 = new int[local29][local27];
			@Pc(38) int[][][] local38 = super.aClass370_41.method8743();
			this.method8428(local33);
			for (@Pc(44) int local44 = 0; local44 < Static609.anInt9448; local44++) {
				@Pc(50) int[] local50 = local33[local44];
				@Pc(54) int[][] local54 = local38[local44];
				@Pc(58) int[] local58 = local54[0];
				@Pc(62) int[] local62 = local54[1];
				@Pc(66) int[] local66 = local54[2];
				for (@Pc(68) int local68 = 0; local68 < Static301.anInt10214; local68++) {
					@Pc(74) int local74 = local50[local68];
					local66[local68] = (local74 & 0xFF) << 4;
					local62[local68] = local74 >> 4 & 0xFF0;
					local58[local68] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.aClass120Array1 = new Class120[arg1.method8581(-17416)];
			for (@Pc(14) int local14 = 0; local14 < this.aClass120Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method8581(-17416);
				if (local20 == 0) {
					this.aClass120Array1[local14] = Static361.method5168(arg1);
				} else if (local20 == 1) {
					this.aClass120Array1[local14] = Static6.method5191(arg1);
				} else if (local20 == 2) {
					this.aClass120Array1[local14] = Static317.method5767(arg1);
				} else if (local20 == 3) {
					this.aClass120Array1[local14] = Static576.method8011(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			this.method8428(super.aClass174_41.method3749());
		}
		return local9;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[[I)V")
	private void method8428(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static301.anInt10214;
		@Pc(9) int local9 = Static609.anInt9448;
		Static485.method6936(arg0);
		Static419.method6126(Static78.anInt1356, Static332.anInt5074);
		if (this.aClass120Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass120Array1.length; local23++) {
			@Pc(30) Class120 local30 = this.aClass120Array1[local23];
			@Pc(33) int local33 = local30.anInt10802;
			@Pc(36) int local36 = local30.anInt10799;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method9430(local7, local9);
				} else {
					local30.method9433(local7, local9);
				}
			} else if (local36 >= 0) {
				local30.method9432(local7, local9);
			}
		}
	}
}
