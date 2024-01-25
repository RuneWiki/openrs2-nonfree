import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	public int anInt2639;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
	public boolean aBoolean256;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public int anInt2645;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "J")
	public long aLong88;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "Lclient!hk;")
	public Class85_Sub1 aClass85_Sub1_1;

	static {
		new Class34("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)J")
	@Override
	public long method2446() {
		return this.aLong88;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)I")
	@Override
	public int method2441() {
		return this.anInt2639;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2449() {
		return this.aBoolean256;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)I")
	@Override
	public int method2448() {
		return this.anInt2645;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)C")
	@Override
	public char method2443() {
		return this.aChar4;
	}
}
