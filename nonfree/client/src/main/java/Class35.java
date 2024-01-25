import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class35 {

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	public int anInt1006;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
	public int anInt1005 = 43594;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	public int anInt1004 = 443;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I")
	public int method735() {
		return this.aBoolean65 ? this.anInt1004 : this.anInt1005;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZLclient!bq;)Z")
	public boolean method737(@OriginalArg(1) Class35 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt1006 == this.anInt1006 && this.aString6.equals(arg0.aString6);
		}
	}
}
