import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class106 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "Lclient!id;")
	public Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Z")
	public boolean aBoolean235;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Lclient!ei;")
	public Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Lclient!hm;")
	public Class3_Sub3 aClass3_Sub3_1;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "S")
	public short aShort35;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!hm;")
	public Class3_Sub3 aClass3_Sub3_2;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "B")
	public byte aByte44;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "Z")
	public boolean aBoolean236;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "Lclient!hg;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "Lclient!vr;")
	public Class3_Sub5 aClass3_Sub5_1;

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "Lclient!ae;")
	public Class4 aClass4_3;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "Lclient!vr;")
	public Class3_Sub5 aClass3_Sub5_2;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "Lclient!pn;")
	public Class194 aClass194_2;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "B")
	public byte aByte42 = 0;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "S")
	public final short aShort34;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "S")
	public final short aShort36;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "B")
	public byte aByte43;

	static {
		new Class209("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort34 = (short) arg1;
		this.aShort36 = (short) arg2;
		this.aByte43 = this.aByte45 = (byte) arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method2412() {
		while (this.aClass4_3 != null) {
			@Pc(7) Class4 local7 = this.aClass4_3.aClass4_1;
			this.aClass4_3.method140();
			this.aClass4_3 = local7;
		}
		this.aByte42 = 0;
	}
}
