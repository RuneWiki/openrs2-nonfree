import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class96 {

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
	public int anInt2529;

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
	public int anInt2530;

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
	public int anInt2531;

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
	public int anInt2535;

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "I")
	public int anInt2541;

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "I")
	public int anInt2542;

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "I")
	public int anInt2543;

	@OriginalMember(owner = "client!eea", name = "r", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
	public int anInt2537 = 128;

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
	public int anInt2532 = 128;

	@OriginalMember(owner = "client!eea", name = "m", descriptor = "I")
	public int anInt2539;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V")
	public Class96(@OriginalArg(0) int arg0) {
		this.anInt2539 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IIIIII)V")
	private Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2539 = arg0;
		this.anInt2529 = arg3;
		this.anInt2531 = arg5;
		this.anInt2532 = arg1;
		this.anInt2537 = arg2;
		this.anInt2541 = arg4;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!eea;B)V")
	public void method2236(@OriginalArg(0) Class96 arg0) {
		this.anInt2532 = arg0.anInt2532;
		this.anInt2539 = arg0.anInt2539;
		this.anInt2531 = arg0.anInt2531;
		this.anInt2541 = arg0.anInt2541;
		this.anInt2537 = arg0.anInt2537;
		this.anInt2529 = arg0.anInt2529;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Lclient!eea;")
	public Class96 method2238() {
		return new Class96(this.anInt2539, this.anInt2532, this.anInt2537, this.anInt2529, this.anInt2541, this.anInt2531);
	}
}
