import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class135_Sub2 extends Class135 implements Interface20 {

	static {
		new Class114("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
		new Class114("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!ag;IZ[[I)V")
	public Class135_Sub2(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static72.aClass16_3, Static489.aClass289_13, arg1 * arg1 * 6, arg2);
		super.aClass9_Sub1_Sub1_10.method7712(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7965(arg1, arg3[local22], local22 + 34069, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7963(), arg1, arg1, 0, Static456.method6571(super.aClass16_22), super.aClass9_Sub1_Sub1_10.anInt661, arg3[local22], 0);
			}
		}
	}
}
