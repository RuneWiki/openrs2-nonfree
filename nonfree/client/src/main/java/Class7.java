import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class7 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public int anInt272;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public int anInt276;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public int anInt278;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	public int anInt280;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class7() {
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class7(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aByte1 = arg0.method7963();
		this.anInt278 = arg0.method7945();
		this.anInt272 = arg0.method7940();
		this.anInt280 = arg0.method7940();
		this.anInt275 = arg0.method7940();
		this.anInt276 = arg0.method7940();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
	public int method236() {
		return this.aByte1 & 0x7;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)I")
	public int method238() {
		return (this.aByte1 & 0x8) == 8 ? 1 : 0;
	}
}
