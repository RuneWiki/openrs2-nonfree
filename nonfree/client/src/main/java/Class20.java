import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class20 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "I")
	public int anInt958;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public int anInt961;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	public int anInt963;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "I")
	public int anInt965;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "B")
	private byte aByte3;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "I")
	public int anInt966;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class20() {
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class20(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aByte3 = arg0.method1508();
		this.anInt965 = arg0.method1510();
		this.anInt961 = arg0.method1540();
		this.anInt958 = arg0.method1540();
		this.anInt966 = arg0.method1540();
		this.anInt963 = arg0.method1540();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	public int method789() {
		return this.aByte3 & 0x7;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)I")
	public int method792() {
		return (this.aByte3 & 0x8) == 8 ? 1 : 0;
	}
}
