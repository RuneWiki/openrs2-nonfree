import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class206 {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "B")
	private byte aByte74;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public int anInt6202;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public int anInt6203;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public int anInt6204;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
	public int anInt6207;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public int anInt6208;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	public Class206() {
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class206(@OriginalArg(0) Class3_Sub9 arg0) {
		this.aByte74 = arg0.method5619();
		this.anInt6208 = arg0.method5610();
		this.anInt6204 = arg0.method5585();
		this.anInt6207 = arg0.method5585();
		this.anInt6203 = arg0.method5585();
		this.anInt6202 = arg0.method5585();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	public int method5364() {
		return this.aByte74 & 0x7;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)I")
	public int method5366() {
		return (this.aByte74 & 0x8) == 8 ? 1 : 0;
	}
}
