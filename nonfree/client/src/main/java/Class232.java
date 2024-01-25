import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class232 {

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public int anInt6097;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public int anInt6098;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
	public int anInt6101;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
	public int anInt6102;

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
	public int anInt6103;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "B")
	private byte aByte93;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class232() {
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class232(@OriginalArg(0) Class4_Sub9 arg0) {
		this.aByte93 = arg0.method5063();
		this.anInt6097 = arg0.method5028();
		this.anInt6101 = arg0.method4997();
		this.anInt6103 = arg0.method4997();
		this.anInt6102 = arg0.method4997();
		this.anInt6098 = arg0.method4997();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)I")
	public int method4897() {
		return this.aByte93 & 0x7;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(Z)I")
	public int method4898() {
		return (this.aByte93 & 0x8) == 8 ? 1 : 0;
	}
}
