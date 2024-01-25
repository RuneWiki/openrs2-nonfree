import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class163 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public int anInt4593;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public int anInt4588 = 43594;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public int anInt4591 = 443;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Z")
	public boolean aBoolean339 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I")
	public int method3978() {
		return this.aBoolean339 ? this.anInt4591 : this.anInt4588;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!kn;B)Z")
	public boolean method3982(@OriginalArg(0) Class163 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt4593 == arg0.anInt4593 && this.aString104.equals(arg0.aString104);
		}
	}
}
