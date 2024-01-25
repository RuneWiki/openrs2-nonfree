import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class98 {

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public int anInt2461;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	public int anInt2462;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
	public int anInt2467;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	public int anInt2466 = 128;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	public int anInt2463 = 128;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public int anInt2460;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
	public Class98(@OriginalArg(0) int arg0) {
		this.anInt2460 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIII)V")
	private Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2463 = arg1;
		this.anInt2461 = arg3;
		this.anInt2460 = arg0;
		this.anInt2466 = arg2;
		this.anInt2467 = arg4;
		this.anInt2462 = arg5;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Lclient!ei;")
	public Class98 method2131() {
		return new Class98(this.anInt2460, this.anInt2463, this.anInt2466, this.anInt2461, this.anInt2467, this.anInt2462);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ei;Z)V")
	public void method2133(@OriginalArg(0) Class98 arg0) {
		this.anInt2460 = arg0.anInt2460;
		this.anInt2461 = arg0.anInt2461;
		this.anInt2466 = arg0.anInt2466;
		this.anInt2462 = arg0.anInt2462;
		this.anInt2467 = arg0.anInt2467;
		this.anInt2463 = arg0.anInt2463;
	}
}
