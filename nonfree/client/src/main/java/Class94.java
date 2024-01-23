import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class94 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public int anInt2758;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public int anInt2760;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	public int anInt2762;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public int anInt2764;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class94() {
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class94(@OriginalArg(0) Class8_Sub2 arg0) {
		this.aByte8 = arg0.method2374();
		this.anInt2756 = arg0.method2375();
		this.anInt2762 = arg0.method2352();
		this.anInt2764 = arg0.method2352();
		this.anInt2760 = arg0.method2352();
		this.anInt2758 = arg0.method2352();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
	public int method2209() {
		return this.aByte8 & 0x7;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)I")
	public int method2212() {
		return (this.aByte8 & 0x8) == 8 ? 1 : 0;
	}
}
