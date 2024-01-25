import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class142 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	public int anInt4106;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
	public int anInt4109;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "B")
	private byte aByte50;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	public int anInt4113;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
	public int anInt4115;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public int anInt4116;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class142() {
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class142(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aByte50 = arg0.method3928();
		this.anInt4113 = arg0.method3967();
		this.anInt4116 = arg0.method3925();
		this.anInt4106 = arg0.method3925();
		this.anInt4115 = arg0.method3925();
		this.anInt4109 = arg0.method3925();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
	public int method3596() {
		return (this.aByte50 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)I")
	public int method3598() {
		return this.aByte50 & 0x7;
	}
}
