import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	public int anInt3728;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public int anInt3729;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	public int anInt3730;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
	public int anInt3731;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
	public int anInt3732;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
	public int anInt3734;

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	public int anInt3735;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	public int anInt3736;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
	public int anInt3740;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
	public int anInt3741;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	public int anInt3743;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
	public int anInt3744;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
	public int anInt3745;

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
	public int anInt3746;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	public int anInt3747;

	static {
		new Class62("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
		new Class62("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!oj;II)Lclient!qh;")
	public Class159 method3280(@OriginalArg(0) Class48 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static307.anIntArray497[this.anInt3732];
		if (local8 == 0) {
			@Pc(123) Class1_Sub5 local123 = Static94.method1598(this.anInt3744, this.anInt3731, this.anInt3745);
			if (local123 instanceof Class1_Sub5_Sub2) {
				@Pc(129) Class1_Sub5_Sub2 local129 = (Class1_Sub5_Sub2) local123;
				if (local129.aClass1_Sub5_3 != null) {
					return ((Interface8) local129.aClass1_Sub5_3).method6029(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(34) Class1_Sub3 local34 = Static204.method3744(this.anInt3744, this.anInt3731, this.anInt3745);
			if (local34 instanceof Class1_Sub3_Sub2) {
				@Pc(40) Class1_Sub3_Sub2 local40 = (Class1_Sub3_Sub2) local34;
				if (local40.aClass1_Sub3_1 != null) {
					return ((Interface8) local40.aClass1_Sub3_1).method6029(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(98) Class1_Sub2 local98 = Static278.method4615(this.anInt3744, this.anInt3731, this.anInt3745, td.class);
			if (local98 instanceof Class1_Sub2_Sub3) {
				@Pc(104) Class1_Sub2_Sub3 local104 = (Class1_Sub2_Sub3) local98;
				if (local104.aClass1_Sub2_2 != null) {
					return ((Interface8) local104.aClass1_Sub2_2).method6029(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(65) Class1_Sub1 local65 = Static266.method4518(this.anInt3744, this.anInt3731, this.anInt3745);
			if (local65 instanceof Class1_Sub1_Sub3) {
				@Pc(71) Class1_Sub1_Sub3 local71 = (Class1_Sub1_Sub3) local65;
				if (local71.aClass1_Sub1_1 != null) {
					return ((Interface8) local71.aClass1_Sub1_1).method6029(arg1, arg0);
				}
			}
		}
		return null;
	}
}
