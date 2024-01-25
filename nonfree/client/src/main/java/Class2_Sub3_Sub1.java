import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!af", name = "H", descriptor = "I")
	private int anInt139;

	static {
		new Class140("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt139 = 4096;
		this.anInt139 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub1() {
		this(4096);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt139 = (arg1.method3124() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			Static369.method2580(local9, 0, Static263.anInt5504, this.anInt139);
		}
		return local9;
	}
}
