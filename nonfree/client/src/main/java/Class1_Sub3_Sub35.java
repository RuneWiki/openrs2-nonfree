import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class1_Sub3_Sub35 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
	private int anInt7372 = 4096;

	static {
		new Class84("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(32) int[] local32 = this.method6076(0, Static274.anInt4887 & arg0 - 1);
			@Pc(38) int[] local38 = this.method6076(0, arg0);
			@Pc(48) int[] local48 = this.method6076(0, arg0 + 1 & Static274.anInt4887);
			for (@Pc(50) int local50 = 0; local50 < Static347.anInt5974; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * this.anInt7372;
				@Pc(84) int local84 = (local38[local50 + 1 & Static307.anInt5524] - local38[local50 - 1 & Static307.anInt5524]) * this.anInt7372;
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local98 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local119 == 0 ? 0 : 16777216 / local119;
				local18[local50] = 4096 - local127;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7372 = arg0.method4093();
		}
	}
}
