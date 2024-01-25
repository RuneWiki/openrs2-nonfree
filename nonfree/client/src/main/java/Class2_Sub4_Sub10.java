import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class2_Sub4_Sub10 extends Class2_Sub4 {

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "[Lclient!nu;")
	private Class187[] aClass187Array1;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([[IZ)V")
	private void method2476(@OriginalArg(0) int[][] arg0) {
		@Pc(15) int local15 = Static143.anInt7434;
		@Pc(17) int local17 = Static42.anInt782;
		Static386.method5340(arg0);
		Static347.method5024(Static464.anInt7427, Static407.anInt6676);
		if (this.aClass187Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass187Array1.length; local31++) {
			@Pc(38) Class187 local38 = this.aClass187Array1[local31];
			@Pc(41) int local41 = local38.anInt8301;
			@Pc(44) int local44 = local38.anInt8298;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method6720(local17, local15);
				}
			} else if (local44 < 0) {
				local38.method6716(local15, local17);
			} else {
				local38.method6715(local17, local15);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(24) int local24 = Static143.anInt7434;
			@Pc(26) int local26 = Static42.anInt782;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass143_41.method2536();
			this.method2476(local30);
			for (@Pc(41) int local41 = 0; local41 < Static42.anInt782; local41++) {
				@Pc(47) int[] local47 = local30[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static143.anInt7434; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			this.method2476(super.aClass271_41.method5624());
		}
		return local14;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.aClass187Array1 = new Class187[arg1.method4464()];
			for (@Pc(23) int local23 = 0; local23 < this.aClass187Array1.length; local23++) {
				@Pc(29) int local29 = arg1.method4464();
				if (local29 == 0) {
					this.aClass187Array1[local23] = Static33.method556(arg1);
				} else if (local29 == 1) {
					this.aClass187Array1[local23] = Static433.method5695(arg1);
				} else if (local29 == 2) {
					this.aClass187Array1[local23] = Static145.method2001(arg1);
				} else if (local29 == 3) {
					this.aClass187Array1[local23] = Static300.method4354(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}
}
