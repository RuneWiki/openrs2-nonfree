import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class77 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public int anInt2858;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public int anInt2860;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public int anInt2864;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
	public int anInt2868 = 128;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	public int anInt2871 = 128;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	public int anInt2862;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.anInt2862 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIIII)V")
	private Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2862 = arg0;
		this.anInt2871 = arg1;
		this.anInt2860 = arg4;
		this.anInt2864 = arg3;
		this.anInt2868 = arg2;
		this.anInt2858 = arg5;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!dk;B)V")
	public void method2671(@OriginalArg(0) Class77 arg0) {
		this.anInt2864 = arg0.anInt2864;
		this.anInt2858 = arg0.anInt2858;
		this.anInt2862 = arg0.anInt2862;
		this.anInt2871 = arg0.anInt2871;
		this.anInt2860 = arg0.anInt2860;
		this.anInt2868 = arg0.anInt2868;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Lclient!dk;")
	public Class77 method2672() {
		return new Class77(this.anInt2862, this.anInt2871, this.anInt2868, this.anInt2864, this.anInt2860, this.anInt2858);
	}
}
