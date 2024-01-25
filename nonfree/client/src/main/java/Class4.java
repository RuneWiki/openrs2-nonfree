import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public int anInt111;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public int anInt114 = 443;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public int anInt113 = 43594;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)I")
	public int method243() {
		return this.aBoolean8 ? this.anInt114 : this.anInt113;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ac;I)Z")
	public boolean method246(@OriginalArg(0) Class4 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt111 == arg0.anInt111 && this.aString2.equals(arg0.aString2);
		}
	}
}
