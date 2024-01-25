import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cq", name = "L", descriptor = "[Lclient!pb;")
	private Class221[] aClass221Array1;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass221Array1 = new Class221[arg0.method4325()];
			for (@Pc(29) int local29 = 0; local29 < this.aClass221Array1.length; local29++) {
				@Pc(37) int local37 = arg0.method4325();
				if (local37 == 0) {
					this.aClass221Array1[local29] = Static435.method615(arg0);
				} else if (local37 == 1) {
					this.aClass221Array1[local29] = Static563.method7644(arg0);
				} else if (local37 == 2) {
					this.aClass221Array1[local29] = Static578.method7807(arg0);
				} else if (local37 == 3) {
					this.aClass221Array1[local29] = Static100.method1502(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(25) int local25 = Static153.anInt3070;
			@Pc(27) int local27 = Static377.anInt6692;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass314_41.method7007();
			this.method1163(local31);
			for (@Pc(42) int local42 = 0; local42 < Static377.anInt6692; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static153.anInt3070; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			this.method1163(super.aClass238_41.method5573());
		}
		return local17;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B[[I)V")
	private void method1163(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static153.anInt3070;
		@Pc(9) int local9 = Static377.anInt6692;
		Static315.method7018(arg0);
		Static412.method370(Static431.anInt7305, Static28.anInt6368);
		if (this.aClass221Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass221Array1.length; local31++) {
			@Pc(38) Class221 local38 = this.aClass221Array1[local31];
			@Pc(41) int local41 = local38.anInt8716;
			@Pc(44) int local44 = local38.anInt8713;
			if (local41 >= 0) {
				if (local44 < 0) {
					local38.method7274(local7, local9);
				} else {
					local38.method7271(local7, local9);
				}
			} else if (local44 >= 0) {
				local38.method7276(local9, local7);
			}
		}
	}
}
