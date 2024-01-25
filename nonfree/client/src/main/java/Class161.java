import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class161 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	public int anInt4423;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Z")
	private boolean aBoolean343 = false;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	public int anInt4422 = 443;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
	public int anInt4421 = 43594;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "Z")
	private boolean aBoolean342 = true;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!lu;B)Lclient!fo;")
	public Class129 method3706(@OriginalArg(0) Class231 arg0) {
		return arg0.method5286(this.aBoolean342 ? this.anInt4422 : this.anInt4421, this.aString54, this.aBoolean343);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!hn;B)Z")
	public boolean method3707(@OriginalArg(0) Class161 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt4423 == arg0.anInt4423 && this.aString54.equals(arg0.aString54);
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public void method3709() {
		if (!this.aBoolean342) {
			this.aBoolean342 = true;
			this.aBoolean343 = true;
		} else if (this.aBoolean343) {
			this.aBoolean343 = false;
		} else {
			this.aBoolean342 = false;
		}
	}
}
