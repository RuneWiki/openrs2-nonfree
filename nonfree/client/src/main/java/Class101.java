import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class101 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public int anInt3093;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public int anInt3094;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	public int anInt3095;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public int anInt3096;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	public int anInt3098;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class101() {
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!p;)V")
	public Class101(@OriginalArg(0) Class4_Sub17 arg0) {
		this.aByte13 = arg0.method1892();
		this.anInt3095 = arg0.method1837();
		this.anInt3093 = arg0.method1889();
		this.anInt3098 = arg0.method1889();
		this.anInt3096 = arg0.method1889();
		this.anInt3094 = arg0.method1889();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)I")
	public int method2441() {
		return (this.aByte13 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
	public int method2443() {
		return this.aByte13 & 0x7;
	}
}
