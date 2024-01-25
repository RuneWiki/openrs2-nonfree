import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
	public int anInt5444;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lclient!mfa;")
	public Class3_Sub9_Sub2 aClass3_Sub9_Sub2_2;

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
	public int anInt5446;

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lclient!st;")
	public Class314 aClass314_84;

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V")
	public void method4617() {
		if (Static505.anInt8527 < Static628.aClass3_Sub27Array1.length) {
			Static628.aClass3_Sub27Array1[Static505.anInt8527++] = this;
		}
	}
}
