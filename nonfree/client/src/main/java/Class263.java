import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class263 {

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
	public int anInt7387;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
	public int anInt7388 = 43594;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Z")
	public boolean aBoolean500 = false;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	public int anInt7390 = 443;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!vt;B)Z")
	public boolean method5932(@OriginalArg(0) Class263 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt7387 == arg0.anInt7387 && this.aString71.equals(arg0.aString71);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)I")
	public int method5935() {
		return this.aBoolean500 ? this.anInt7390 : this.anInt7388;
	}
}
