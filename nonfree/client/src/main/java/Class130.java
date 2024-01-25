import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class130 {

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
	public int anInt4072;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
	public int anInt4073 = 43594;

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
	public int anInt4074 = 443;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)I")
	public int method3628() {
		return this.aBoolean248 ? this.anInt4074 : this.anInt4073;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!iaa;)Z")
	public boolean method3631(@OriginalArg(1) Class130 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt4072 == this.anInt4072 && this.aString26.equals(arg0.aString26);
		}
	}
}
