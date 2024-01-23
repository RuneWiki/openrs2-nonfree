import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public final class Class80 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public int anInt2463;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public int anInt2466;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public int anInt2468;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public int anInt2469;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
	public int anInt2472;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class80() {
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class80(@OriginalArg(0) Class4_Sub24 arg0) {
		this.aByte5 = arg0.method3069();
		this.anInt2466 = arg0.method3085();
		this.anInt2468 = arg0.method3084();
		this.anInt2469 = arg0.method3084();
		this.anInt2463 = arg0.method3084();
		this.anInt2472 = arg0.method3084();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I")
	public int method2010() {
		return this.aByte5 & 0x7;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
	public int method2011() {
		return (this.aByte5 & 0x8) == 8 ? 1 : 0;
	}
}
