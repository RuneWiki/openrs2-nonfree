import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!af", name = "A", descriptor = "I")
	public int anInt208;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)Lclient!rg;")
	public Class145 method108() {
		return Static174.aClass145Array4[this.anInt196];
	}
}
