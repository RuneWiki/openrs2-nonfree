import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public final class Class89 {

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "I")
	public int anInt2307;

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "I")
	public int anInt2309;

	@OriginalMember(owner = "client!eka", name = "f", descriptor = "I")
	public int anInt2312;

	@OriginalMember(owner = "client!eka", name = "g", descriptor = "I")
	public int anInt2313;

	@OriginalMember(owner = "client!eka", name = "j", descriptor = "I")
	public int anInt2315;

	@OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
	public int anInt2317;

	@OriginalMember(owner = "client!eka", name = "m", descriptor = "I")
	public int anInt2318;

	@OriginalMember(owner = "client!eka", name = "n", descriptor = "I")
	public int anInt2319;

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "I")
	public int anInt2310 = 128;

	@OriginalMember(owner = "client!eka", name = "e", descriptor = "I")
	public int anInt2311 = 128;

	@OriginalMember(owner = "client!eka", name = "p", descriptor = "I")
	public int anInt2320;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt2320 = arg0;
	}

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(IIIIII)V")
	private Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2311 = arg1;
		this.anInt2320 = arg0;
		this.anInt2319 = arg5;
		this.anInt2317 = arg4;
		this.anInt2310 = arg2;
		this.anInt2309 = arg3;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!eka;B)V")
	public void method2029(@OriginalArg(0) Class89 arg0) {
		this.anInt2311 = arg0.anInt2311;
		this.anInt2319 = arg0.anInt2319;
		this.anInt2309 = arg0.anInt2309;
		this.anInt2310 = arg0.anInt2310;
		this.anInt2320 = arg0.anInt2320;
		this.anInt2317 = arg0.anInt2317;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)Lclient!eka;")
	public Class89 method2030() {
		return new Class89(this.anInt2320, this.anInt2311, this.anInt2310, this.anInt2309, this.anInt2317, this.anInt2319);
	}
}
