import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class202 {

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "B")
	private byte aByte71;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
	public int anInt5963;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public int anInt5964;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	public int anInt5967;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	public int anInt5968;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public int anInt5969;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class202() {
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!lh;)V")
	public Class202(@OriginalArg(0) Class1_Sub1 arg0) {
		this.aByte71 = arg0.method4112();
		this.anInt5967 = arg0.method4093();
		this.anInt5968 = arg0.method4087();
		this.anInt5963 = arg0.method4087();
		this.anInt5964 = arg0.method4087();
		this.anInt5969 = arg0.method4087();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I")
	public int method4828() {
		return this.aByte71 & 0x7;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)I")
	public int method4830() {
		return (this.aByte71 & 0x8) == 8 ? 1 : 0;
	}
}
