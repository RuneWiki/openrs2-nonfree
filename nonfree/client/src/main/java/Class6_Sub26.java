import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class6_Sub26 extends Class6 {

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
	public int anInt3955;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
	public int anInt3956;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lclient!gs;")
	public Class6_Sub23_Sub1 aClass6_Sub23_Sub1_2;

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "Lclient!qk;")
	public Class289 aClass289_57;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
	public void method3398() {
		if (Static90.aClass6_Sub26Array1.length > Static469.anInt8087) {
			Static90.aClass6_Sub26Array1[Static469.anInt8087++] = this;
		}
	}
}
