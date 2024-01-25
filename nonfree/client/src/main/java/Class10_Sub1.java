import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!an", name = "h", descriptor = "[I")
	private final int[] anIntArray8 = new int[512];

	static {
		new Class151("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
		new Class151("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V")
	public Class10_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray8[local15] = this.anIntArray8[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray8[local44];
			this.anIntArray8[local44] = this.anIntArray8[local44 + 256] = this.anIntArray8[local37];
			this.anIntArray8[local37] = this.anIntArray8[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III[FFIFFZIF)V")
	@Override
	public void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg3 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg4 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg0 * arg4;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(63) float local63 = 1.0F - local59;
		@Pc(67) int local67 = local53 & local41;
		@Pc(71) float local71 = Static215.method2846(local59);
		@Pc(75) int local75 = local49 & local41;
		@Pc(80) int local80 = this.anIntArray8[local75];
		@Pc(90) int local90 = this.anIntArray8[local67];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg5 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(117) float local117 = 1.0F - local112;
			@Pc(121) int local121 = local102 & local29;
			@Pc(129) float local129 = Static215.method2846(local112);
			@Pc(133) int local133 = local106 & local29;
			@Pc(140) int local140 = this.anIntArray8[local121 + local80];
			@Pc(147) int local147 = this.anIntArray8[local80 + local133];
			@Pc(154) int local154 = this.anIntArray8[local121 + local90];
			@Pc(161) int local161 = this.anIntArray8[local90 + local133];
			for (@Pc(163) int local163 = 0; local163 < 128; local163++) {
				@Pc(170) float local170 = (float) local163 * arg3;
				@Pc(173) int local173 = (int) local170;
				@Pc(177) int local177 = local173 + 1;
				@Pc(182) float local182 = local170 - (float) local173;
				@Pc(187) float local187 = 1.0F - local182;
				@Pc(195) float local195 = Static215.method2846(local182);
				@Pc(199) int local199 = local177 & local17;
				@Pc(203) int local203 = local173 & local17;
				arg2[arg1++] = Static342.method4345(Static342.method4345(Static342.method4345(Static104.method5470(local63, local117, local187, this.anIntArray8[local140 + local203] & 0x7), Static104.method5470(local63, local117, local182, this.anIntArray8[local140 + local199] & 0x7), local195), Static342.method4345(Static104.method5470(local63, local112, local187, this.anIntArray8[local203 + local147] & 0x7), Static104.method5470(local63, local112, local182, this.anIntArray8[local147 + local199] & 0x7), local195), local129), Static342.method4345(Static342.method4345(Static104.method5470(local59, local117, local187, this.anIntArray8[local154 + local203] & 0x7), Static104.method5470(local59, local117, local182, this.anIntArray8[local154 + local199] & 0x7), local195), Static342.method4345(Static104.method5470(local59, local112, local187, this.anIntArray8[local161 + local203] & 0x7), Static104.method5470(local59, local112, local182, this.anIntArray8[local161 + local199] & 0x7), local195), local129), local71) * arg6;
			}
		}
	}
}
