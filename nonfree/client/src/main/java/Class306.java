import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class306 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public int anInt8655;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public int anInt8656;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public int anInt8657;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
	public int anInt8658;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "B")
	private byte aByte104;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	public int anInt8661;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class306() {
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!gw;)V")
	public Class306(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aByte104 = arg0.method3073();
		this.anInt8656 = arg0.method3056();
		this.anInt8661 = arg0.method3037();
		this.anInt8655 = arg0.method3037();
		this.anInt8657 = arg0.method3037();
		this.anInt8658 = arg0.method3037();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
	public int method7334() {
		return (this.aByte104 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)I")
	public int method7335() {
		return this.aByte104 & 0x7;
	}
}
