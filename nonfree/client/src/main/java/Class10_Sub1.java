import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
	public int anInt274;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
	public int anInt272 = -1;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)Lclient!nn;")
	public Class144 method240() {
		return Static220.aClass144Array2[super.anInt265];
	}
}
