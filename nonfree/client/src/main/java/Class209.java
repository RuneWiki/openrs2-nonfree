import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class209 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public int anInt5815;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	public int anInt5817 = 43594;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public int anInt5818 = 443;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)I")
	public int method4847() {
		return this.aBoolean406 ? this.anInt5818 : this.anInt5817;
	}
}
