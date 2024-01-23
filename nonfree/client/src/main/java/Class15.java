import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class15 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public int anInt376;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public int anInt381;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public int anInt389;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class15() {
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!im;)V")
	public Class15(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aByte1 = arg0.method2633();
		this.anInt383 = arg0.method2652();
		this.anInt389 = arg0.method2610();
		this.anInt382 = arg0.method2610();
		this.anInt381 = arg0.method2610();
		this.anInt376 = arg0.method2610();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	public int method311() {
		return this.aByte1 & 0x7;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I")
	public int method314() {
		return (this.aByte1 & 0x8) == 8 ? 1 : 0;
	}
}
