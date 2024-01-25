import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class220 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	public int anInt5746;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public int anInt5751 = 443;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	public int anInt5753 = 43594;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)I")
	public int method4602() {
		return this.aBoolean406 ? this.anInt5751 : this.anInt5753;
	}
}
