import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class80 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	public int anInt3153;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public int anInt3154;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	public int anInt3155;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public int anInt3156;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public int anInt3159;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class80() {
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!k;)V")
	public Class80(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aByte13 = arg0.method3802();
		this.anInt3154 = arg0.method3805();
		this.anInt3153 = arg0.method3784();
		this.anInt3155 = arg0.method3784();
		this.anInt3159 = arg0.method3784();
		this.anInt3156 = arg0.method3784();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
	public int method2496() {
		return this.aByte13 & 0x7;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I")
	public int method2498() {
		return (this.aByte13 & 0x8) == 8 ? 1 : 0;
	}
}
