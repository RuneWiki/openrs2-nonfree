import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class251 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!ro;")
	public Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
	public boolean aBoolean473;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Lclient!a;")
	public Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!ip;")
	public Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Lclient!ip;")
	public Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Lclient!wr;")
	public Class251 aClass251_1;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Lclient!em;")
	public Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "Lclient!dg;")
	public Class46 aClass46_3;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "Z")
	public boolean aBoolean474;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "Lclient!pa;")
	public Class186 aClass186_2;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "Z")
	public boolean aBoolean475;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "Lclient!a;")
	public Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "B")
	public byte aByte76 = 0;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "B")
	public byte aByte74;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "B")
	public byte aByte71;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "S")
	public final short aShort100;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "S")
	public final short aShort101;

	static {
		new Class32("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
		new Class32("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(III)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte71 = this.aByte74 = (byte) arg0;
		this.aShort100 = (short) arg1;
		this.aShort101 = (short) arg2;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public void method5661() {
		while (this.aClass46_3 != null) {
			@Pc(7) Class46 local7 = this.aClass46_3.aClass46_1;
			this.aClass46_3.method925();
			this.aClass46_3 = local7;
		}
		this.aByte76 = 0;
	}
}
