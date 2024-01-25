import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class82_Sub3 extends Class82 {

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "[Lclient!j;")
	private static final Class143[] aClass143Array1;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
	private final int anInt4293;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	private final int anInt4287;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	private final int anInt4289;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	private final int anInt4290;

	static {
		new Class114("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		aClass143Array1 = new Class143[32];
		@Pc(120) Class143[] local120 = Static167.method3275();
		for (@Pc(122) int local122 = 0; local122 < local120.length; local122++) {
			aClass143Array1[local120[local122].anInt4449] = local120[local122];
		}
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIIIII)V")
	public Class82_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4293 = arg3;
		this.anInt4287 = arg2;
		this.anInt4289 = arg1;
		this.anInt4290 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt4290 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt4287 >> 12;
		@Pc(32) int local32 = this.anInt4289 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt4293 * arg0 >> 12;
		Static178.method3418(local32, super.anInt6514, super.anInt6513, super.anInt6516, local39, local18, local25);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)V")
	@Override
	public void method5660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4290 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt4287 * arg1 >> 12;
		@Pc(27) int local27 = arg0 * this.anInt4289 >> 12;
		@Pc(34) int local34 = this.anInt4293 * arg0 >> 12;
		Static95.method2183(local27, super.anInt6516, local17, local34, super.anInt6514, local10);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)V")
	@Override
	public void method5659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt4290 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt4287 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt4289 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt4293 >> 12;
		Static184.method3503(local39, local25, local18, local32, super.anInt6513);
	}
}
