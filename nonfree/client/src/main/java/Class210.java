import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class210 {

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "Ljava/lang/String;")
	public String aString150;

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
	public int anInt6291;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
	public int anInt6287 = 43594;

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
	public int anInt6288 = 443;

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "Z")
	public boolean aBoolean468 = false;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!oca;)Z")
	public boolean method5714(@OriginalArg(1) Class210 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt6291 == arg0.anInt6291 && this.aString150.equals(arg0.aString150);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)I")
	public int method5716() {
		return this.aBoolean468 ? this.anInt6288 : this.anInt6287;
	}
}
