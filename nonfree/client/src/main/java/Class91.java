import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class91 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public int anInt4213;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	public int anInt4214;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	public int anInt4217;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	public int anInt4220;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public int anInt4222;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class91() {
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class91(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aByte13 = arg0.method3009();
		this.anInt4222 = arg0.method3023();
		this.anInt4220 = arg0.method3058();
		this.anInt4217 = arg0.method3058();
		this.anInt4214 = arg0.method3058();
		this.anInt4213 = arg0.method3058();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
	public int method3188() {
		return this.aByte13 & 0x7;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)I")
	public int method3190() {
		return (this.aByte13 & 0x8) == 8 ? 1 : 0;
	}
}
