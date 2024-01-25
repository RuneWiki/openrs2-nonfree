import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public final class Class98 {

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "I")
	public int anInt2256;

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "I")
	public int anInt2258;

	@OriginalMember(owner = "client!eka", name = "j", descriptor = "I")
	public int anInt2263;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "I")
	public int anInt2255 = 128;

	@OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
	public int anInt2264 = 128;

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(I)V")
	public Class98(@OriginalArg(0) int arg0) {
		this.anInt2257 = arg0;
	}

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(IIIIII)V")
	private Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2255 = arg2;
		this.anInt2258 = arg5;
		this.anInt2257 = arg0;
		this.anInt2264 = arg1;
		this.anInt2256 = arg3;
		this.anInt2263 = arg4;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!eka;I)V")
	public void method2037(@OriginalArg(0) Class98 arg0) {
		this.anInt2264 = arg0.anInt2264;
		this.anInt2263 = arg0.anInt2263;
		this.anInt2258 = arg0.anInt2258;
		this.anInt2255 = arg0.anInt2255;
		this.anInt2256 = arg0.anInt2256;
		this.anInt2257 = arg0.anInt2257;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)Lclient!eka;")
	public Class98 method2038() {
		return new Class98(this.anInt2257, this.anInt2264, this.anInt2255, this.anInt2256, this.anInt2263, this.anInt2258);
	}
}
