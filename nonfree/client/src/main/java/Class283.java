import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class283 {

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "B")
	private byte aByte114;

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
	public int anInt8024;

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
	public int anInt8025;

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
	public int anInt8027;

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
	public int anInt8029;

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
	public int anInt8030;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
	public Class283() {
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class283(@OriginalArg(0) Class3_Sub25 arg0) {
		this.aByte114 = arg0.method8621();
		this.anInt8029 = arg0.method8593();
		this.anInt8030 = arg0.method8618();
		this.anInt8024 = arg0.method8618();
		this.anInt8027 = arg0.method8618();
		this.anInt8025 = arg0.method8618();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)I")
	public int method7023() {
		return this.aByte114 & 0x7;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)I")
	public int method7024() {
		return (this.aByte114 & 0x8) == 8 ? 1 : 0;
	}
}
