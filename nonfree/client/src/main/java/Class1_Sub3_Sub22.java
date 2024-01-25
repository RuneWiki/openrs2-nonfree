import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!li", name = "G", descriptor = "I")
	private int anInt5185 = 4096;

	@OriginalMember(owner = "client!li", name = "K", descriptor = "I")
	private int anInt5188 = 0;

	static {
		new Class306("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5188 = arg0.method3967();
		} else if (arg1 == 1) {
			this.anInt5185 = arg0.method3967();
		} else if (arg1 == 2) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(21) int[] local21 = this.method7128(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static452.anInt7734; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt5188 > local29) {
					local11[local23] = this.anInt5188;
				} else if (this.anInt5185 >= local29) {
					local11[local23] = local29;
				} else {
					local11[local23] = this.anInt5185;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(29) int[][] local29 = this.method7130(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static452.anInt7734; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt5188 > local61) {
					local45[local55] = this.anInt5188;
				} else if (this.anInt5185 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt5185;
				}
				if (this.anInt5188 > local65) {
					local49[local55] = this.anInt5188;
				} else if (this.anInt5185 < local65) {
					local49[local55] = this.anInt5185;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt5188 > local69) {
					local53[local55] = this.anInt5188;
				} else if (this.anInt5185 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt5185;
				}
			}
		}
		return local11;
	}
}
