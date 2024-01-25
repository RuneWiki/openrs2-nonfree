import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class43 {

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
	public int anInt1149;

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
	public int anInt1152 = 443;

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
	public int anInt1154 = 43594;

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
	public int method1116() {
		return this.aBoolean60 ? this.anInt1152 : this.anInt1154;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!cba;B)Z")
	public boolean method1117(@OriginalArg(0) Class43 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt1149 == arg0.anInt1149 && this.aString27.equals(arg0.aString27);
		}
	}
}
