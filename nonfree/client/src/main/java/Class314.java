import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class314 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public int anInt8316;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public int anInt8319;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public int anInt8320;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "B")
	private byte aByte104;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public int anInt8321;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public int anInt8324;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class314() {
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class314(@OriginalArg(0) Class6_Sub21 arg0) {
		this.aByte104 = arg0.method6055();
		this.anInt8321 = arg0.method6003();
		this.anInt8320 = arg0.method6036();
		this.anInt8324 = arg0.method6036();
		this.anInt8319 = arg0.method6036();
		this.anInt8316 = arg0.method6036();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
	public int method6754() {
		return this.aByte104 & 0x7;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)I")
	public int method6756() {
		return (this.aByte104 & 0x8) == 8 ? 1 : 0;
	}
}
