import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class156 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	public int anInt4501;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	public int anInt4505 = 443;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Z")
	public boolean aBoolean517 = false;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
	public int anInt4508 = 43594;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)I")
	public int method3552() {
		return this.aBoolean517 ? this.anInt4505 : this.anInt4508;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ml;I)Z")
	public boolean method3553(@OriginalArg(0) Class156 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt4501 == this.anInt4501 && this.aString53.equals(arg0.aString53);
		}
	}
}
