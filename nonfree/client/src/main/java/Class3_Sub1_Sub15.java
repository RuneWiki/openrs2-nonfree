import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!iu", name = "F", descriptor = "[Lclient!hm;")
	private Class55[] aClass55Array1;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.aClass55Array1 = new Class55[arg1.method2048(255)];
			for (@Pc(48) int local48 = 0; local48 < this.aClass55Array1.length; local48++) {
				@Pc(54) int local54 = arg1.method2048(255);
				if (local54 == 0) {
					this.aClass55Array1[local48] = Static331.method4767(arg1);
				} else if (local54 == 1) {
					this.aClass55Array1[local48] = Static529.method7056(arg1);
				} else if (local54 == 2) {
					this.aClass55Array1[local48] = Static273.method3856(arg1);
				} else if (local54 == 3) {
					this.aClass55Array1[local48] = Static168.method2727(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean773 = arg1.method2048(255) == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(27) int local27 = Static379.anInt5859;
			@Pc(29) int local29 = Static24.anInt740;
			@Pc(33) int[][] local33 = new int[local29][local27];
			@Pc(38) int[][][] local38 = super.aClass281_41.method6494();
			this.method4073(local33);
			for (@Pc(44) int local44 = 0; local44 < Static24.anInt740; local44++) {
				@Pc(50) int[] local50 = local33[local44];
				@Pc(54) int[][] local54 = local38[local44];
				@Pc(58) int[] local58 = local54[0];
				@Pc(62) int[] local62 = local54[1];
				@Pc(66) int[] local66 = local54[2];
				for (@Pc(68) int local68 = 0; local68 < Static379.anInt5859; local68++) {
					@Pc(74) int local74 = local50[local68];
					local66[local68] = (local74 & 0xFF) << 4;
					local62[local68] = local74 >> 4 & 0xFF0;
					local58[local68] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I[[I)V")
	private void method4073(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int local15 = Static379.anInt5859;
		@Pc(17) int local17 = Static24.anInt740;
		Static442.method5869(arg0);
		Static181.method2883(Static652.anInt2344, Static711.anInt10997);
		if (this.aClass55Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass55Array1.length; local31++) {
			@Pc(38) Class55 local38 = this.aClass55Array1[local31];
			@Pc(41) int local41 = local38.anInt7553;
			@Pc(44) int local44 = local38.anInt7555;
			if (local41 >= 0) {
				if (local44 >= 0) {
					local38.method6532(local17, local15);
				} else {
					local38.method6527(local15, local17);
				}
			} else if (local44 >= 0) {
				local38.method6528(local17, local15);
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			this.method4073(super.aClass305_41.method6986());
		}
		return local9;
	}
}
