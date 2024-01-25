import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class90 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
	public int anInt2364;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	public int anInt2365;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
	public int anInt2366;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	public int anInt2370;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
	public int anInt2374;

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
	public int anInt2375;

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
	public int anInt2377;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
	public int anInt2378;

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
	public int anInt2373 = 128;

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
	public int anInt2367 = 128;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
	public int anInt2380;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
	public Class90(@OriginalArg(0) int arg0) {
		this.anInt2380 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIIII)V")
	private Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2367 = arg2;
		this.anInt2378 = arg5;
		this.anInt2373 = arg1;
		this.anInt2375 = arg4;
		this.anInt2380 = arg0;
		this.anInt2365 = arg3;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Lclient!dw;")
	public Class90 method2180() {
		return new Class90(this.anInt2380, this.anInt2373, this.anInt2367, this.anInt2365, this.anInt2375, this.anInt2378);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!dw;I)V")
	public void method2181(@OriginalArg(0) Class90 arg0) {
		this.anInt2378 = arg0.anInt2378;
		this.anInt2367 = arg0.anInt2367;
		this.anInt2380 = arg0.anInt2380;
		this.anInt2373 = arg0.anInt2373;
		this.anInt2375 = arg0.anInt2375;
		this.anInt2365 = arg0.anInt2365;
	}
}
