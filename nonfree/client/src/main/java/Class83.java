import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class83 {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
	public int anInt2676;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
	public int anInt2677;

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "Lclient!fca;")
	public Class83 aClass83_1;

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "I")
	public int anInt2682;

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
	public int anInt2684;

	@OriginalMember(owner = "client!fca", name = "o", descriptor = "I")
	public int anInt2686;

	@OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
	public int anInt2689;

	@OriginalMember(owner = "client!fca", name = "s", descriptor = "I")
	public int anInt2690;

	@OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
	public int anInt2691;

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
	public final int anInt2680;

	@OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
	public final int anInt2687;

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "B")
	public final byte aByte27;

	@OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
	private final int anInt2688;

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "I")
	public final int anInt2681;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(IIIIB)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2680 = arg1;
		this.anInt2687 = arg3;
		this.aByte27 = arg4;
		this.anInt2688 = arg0;
		this.anInt2681 = arg2;
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!fca;I)V")
	public Class83(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1) {
		this.aClass83_1 = arg0;
		this.anInt2687 = this.aClass83_1.anInt2687 + arg1;
		this.aByte27 = this.aClass83_1.aByte27;
		this.anInt2680 = this.aClass83_1.anInt2680 + arg1;
		this.anInt2681 = this.aClass83_1.anInt2681 + arg1;
		this.anInt2688 = this.aClass83_1.anInt2688;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIB)Lclient!fca;")
	public Class83 method2261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class83(this.anInt2688, arg0, arg1, arg2, this.aByte27);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lclient!gk;")
	public Class108 method2262() {
		return Static7.method550(this.anInt2688);
	}
}
