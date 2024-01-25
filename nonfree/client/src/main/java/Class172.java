import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class172 {

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public int anInt5621;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Lclient!rp;")
	public Class172 aClass172_4;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "Lclient!wl;")
	public Class62_Sub1 aClass62_Sub1_1;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	public void method5019() {
		if (Static103.anInt2334 >= 500) {
			return;
		}
		this.anInt5621 = 0;
		this.aClass172_4 = Static92.aClass172_3;
		this.aClass62_Sub1_1 = null;
		Static92.aClass172_3 = this;
		Static103.anInt2334++;
	}
}
