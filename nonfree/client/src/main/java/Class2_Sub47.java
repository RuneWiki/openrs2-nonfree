import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public int anInt9129;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	public int anInt9131;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	public int anInt9132;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public int anInt9133;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public int anInt9134;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public int anInt9135;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public int anInt9136;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public int anInt9137;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public int anInt9138;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
	public int anInt9139;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public int anInt9140;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	public int anInt9141;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	public int anInt9142;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	public int anInt9143;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
	public int anInt9145;

	static {
		new Class202("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	public Class63 method7632(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static525.anIntArray700[this.anInt9133];
		@Pc(15) Class63 local15 = null;
		if (local13 == 0) {
			@Pc(28) Class1_Sub2 local28 = Static524.method7595(this.anInt9142, this.anInt9139, this.anInt9134);
			if (local28 instanceof Class1_Sub2_Sub1) {
				@Pc(34) Class1_Sub2_Sub1 local34 = (Class1_Sub2_Sub1) local28;
				if (local34.aClass1_Sub2_1 != null) {
					local15 = ((Interface6) local34.aClass1_Sub2_1).method7689(arg1, arg0);
				}
			}
		} else if (local13 == 1) {
			@Pc(57) Class1_Sub3 local57 = Static55.method1029(this.anInt9142, this.anInt9139, this.anInt9134);
			if (local57 instanceof Class1_Sub3_Sub1) {
				@Pc(63) Class1_Sub3_Sub1 local63 = (Class1_Sub3_Sub1) local57;
				if (local63.aClass1_Sub3_1 != null) {
					local15 = ((Interface6) local63.aClass1_Sub3_1).method7689(arg1, arg0);
				}
			}
		} else if (local13 == 2) {
			@Pc(94) Class1_Sub1 local94 = Static214.method3907(this.anInt9142, this.anInt9139, this.anInt9134, ej.class);
			if (local94 instanceof Class1_Sub1_Sub6) {
				@Pc(100) Class1_Sub1_Sub6 local100 = (Class1_Sub1_Sub6) local94;
				if (local100.aClass1_Sub1_2 != null) {
					local15 = ((Interface6) local100.aClass1_Sub1_2).method7689(arg1, arg0);
				}
			}
		} else if (local13 == 3) {
			@Pc(123) Class1_Sub4 local123 = Static427.method6584(this.anInt9142, this.anInt9139, this.anInt9134);
			if (local123 instanceof Class1_Sub4_Sub3) {
				@Pc(129) Class1_Sub4_Sub3 local129 = (Class1_Sub4_Sub3) local123;
				if (local129.aClass1_Sub4_2 != null) {
					local15 = ((Interface6) local129.aClass1_Sub4_2).method7689(arg1, arg0);
				}
			}
		}
		return local15 == null ? null : local15.method7706((byte) 0, arg1, true);
	}
}
