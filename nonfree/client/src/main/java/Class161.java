import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class161 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public int anInt4557;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public int anInt4558;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public int anInt4560;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public int anInt4562;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	public int anInt4563;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "B")
	private byte aByte63;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class161() {
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class161(@OriginalArg(0) Class3_Sub25 arg0) {
		this.aByte63 = arg0.method4097();
		this.anInt4562 = arg0.method4083();
		this.anInt4558 = arg0.method4108();
		this.anInt4557 = arg0.method4108();
		this.anInt4563 = arg0.method4108();
		this.anInt4560 = arg0.method4108();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public int method3787() {
		return (this.aByte63 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
	public int method3789() {
		return this.aByte63 & 0x7;
	}
}
