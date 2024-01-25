import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class3_Sub3_Sub7 extends Class3_Sub3 {

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
	public int anInt1827;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
	public int anInt1829;

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
	public int anInt1831;

	@OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
	public int anInt1835;

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "Lclient!hd;")
	public final Class95 aClass95_1;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "Lclient!ff;")
	public final Class69 aClass69_1;

	static {
		new Class174("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
		new Class174("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!hd;Lclient!jg;)V")
	public Class3_Sub3_Sub7(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class23_Sub3 arg1) {
		this.aClass95_1 = arg0;
		this.aClass69_1 = this.aClass95_1.method2295();
		this.method1703();
	}

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)V")
	public void method1703() {
		this.anInt1831 = this.aClass95_1.anInt2685;
		this.anInt1832 = this.aClass95_1.anInt2681;
		this.anInt1835 = this.aClass95_1.anInt2680;
		if (this.aClass95_1.aClass11_4 != null) {
			this.aClass95_1.aClass11_4.N(this.aClass69_1.anInt1940, this.aClass69_1.anInt1936, this.aClass69_1.anInt1945, Static72.anIntArray69);
		}
		this.anInt1829 = Static72.anIntArray69[0];
		this.anInt1827 = Static72.anIntArray69[2];
	}
}
