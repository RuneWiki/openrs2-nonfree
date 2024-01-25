import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class6_Sub2_Sub6 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
	public int anInt3686;

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
	public int anInt3687;

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
	public int anInt3689;

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
	public int anInt3690;

	@OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
	public int anInt3692;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "Lclient!gq;")
	public final Class94 aClass94_2;

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "Lclient!dj;")
	public final Class49 aClass49_1;

	static {
		new Class267("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!gq;Lclient!ko;)V")
	public Class6_Sub2_Sub6(@OriginalArg(0) Class94 arg0, @OriginalArg(1) Class57_Sub4 arg1) {
		this.aClass94_2 = arg0;
		this.aClass49_1 = this.aClass94_2.method2406();
		this.method3042();
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
	public void method3042() {
		this.anInt3689 = this.aClass94_2.anInt2886;
		this.anInt3690 = this.aClass94_2.anInt2883;
		this.anInt3692 = this.aClass94_2.anInt2885;
		if (this.aClass94_2.aClass5_1 != null) {
			this.aClass94_2.aClass5_1.method3839(this.aClass49_1.anInt1830, this.aClass49_1.anInt1824, this.aClass49_1.anInt1832, Static330.anIntArray386);
		}
		this.anInt3687 = Static330.anIntArray386[0];
		this.anInt3686 = Static330.anIntArray386[2];
	}
}
