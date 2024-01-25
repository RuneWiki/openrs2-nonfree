import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class165 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
	public int anInt4240;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
	public int anInt4241 = 443;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
	public int anInt4244 = 43594;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "Z")
	public boolean aBoolean279 = false;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
	public int method3381() {
		return this.aBoolean279 ? this.anInt4241 : this.anInt4244;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!mu;B)Z")
	public boolean method3382(@OriginalArg(0) Class165 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt4240 == arg0.anInt4240 && this.aString50.equals(arg0.aString50);
		}
	}
}
