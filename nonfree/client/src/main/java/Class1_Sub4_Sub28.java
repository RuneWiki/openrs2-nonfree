import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class1_Sub4_Sub28 extends Class1_Sub4 {

	@OriginalMember(owner = "client!os", name = "M", descriptor = "[Lclient!vf;")
	private Class78[] aClass78Array1;

	static {
		new Class119("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			this.method4067(super.aClass2_41.method13());
		}
		return local9;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(17) int local17 = Static395.anInt6592;
			@Pc(19) int local19 = Static186.anInt3223;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass50_41.method1085();
			this.method4067(local23);
			for (@Pc(34) int local34 = 0; local34 < Static186.anInt3223; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static395.anInt6592; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[[I)V")
	private void method4067(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static395.anInt6592;
		@Pc(9) int local9 = Static186.anInt3223;
		Static24.method346(arg0);
		Static319.method4281(Static247.anInt4469, Static452.anInt7487);
		if (this.aClass78Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass78Array1.length; local28++) {
			@Pc(35) Class78 local35 = this.aClass78Array1[local28];
			@Pc(38) int local38 = local35.anInt6428;
			@Pc(41) int local41 = local35.anInt6427;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method5065(local7, local9);
				}
			} else if (local41 >= 0) {
				local35.method5067(local9, local7);
			} else {
				local35.method5064(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass78Array1 = new Class78[arg0.method5337()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass78Array1.length; local11++) {
				@Pc(17) int local17 = arg0.method5337();
				if (local17 == 0) {
					this.aClass78Array1[local11] = Static310.method4223(arg0);
				} else if (local17 == 1) {
					this.aClass78Array1[local11] = Static95.method1488(arg0);
				} else if (local17 == 2) {
					this.aClass78Array1[local11] = Static414.method5330(arg0);
				} else if (local17 == 3) {
					this.aClass78Array1[local11] = Static427.method5662(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}
}
