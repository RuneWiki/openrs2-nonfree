import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	public int anInt886;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	public int anInt889;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	public int anInt890;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public int anInt892;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public int anInt894;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "Lclient!nk;")
	public final Class165 aClass165_1;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "Lclient!hm;")
	public final Class102 aClass102_1;

	static {
		new Class189("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!nk;Lclient!wk;)V")
	public Class3_Sub4_Sub2(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		this.aClass165_1 = arg0;
		this.aClass102_1 = this.aClass165_1.method3869();
		this.method613();
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
	public void method613() {
		this.anInt890 = this.aClass165_1.anInt5048;
		this.anInt892 = this.aClass165_1.anInt5054;
		this.anInt894 = this.aClass165_1.anInt5047;
		if (this.aClass165_1.aClass107_3 != null) {
			this.aClass165_1.aClass107_3.E(this.aClass102_1.anInt3092, this.aClass102_1.anInt3095, this.aClass102_1.anInt3091, Static88.anIntArray127);
		}
		this.anInt889 = Static88.anIntArray127[2];
		this.anInt886 = Static88.anIntArray127[0];
	}
}
