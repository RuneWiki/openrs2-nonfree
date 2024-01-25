import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class76 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public int anInt2162;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public int anInt2163;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public int anInt2167;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public int anInt2164 = 128;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public int anInt2168 = 128;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public int anInt2165;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class76(@OriginalArg(0) int arg0) {
		this.anInt2165 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIII)V")
	private Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2164 = arg1;
		this.anInt2163 = arg5;
		this.anInt2168 = arg2;
		this.anInt2167 = arg4;
		this.anInt2165 = arg0;
		this.anInt2162 = arg3;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Lclient!dc;")
	public Class76 method1952() {
		return new Class76(this.anInt2165, this.anInt2164, this.anInt2168, this.anInt2162, this.anInt2167, this.anInt2163);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!dc;I)V")
	public void method1953(@OriginalArg(0) Class76 arg0) {
		this.anInt2168 = arg0.anInt2168;
		this.anInt2165 = arg0.anInt2165;
		this.anInt2167 = arg0.anInt2167;
		this.anInt2163 = arg0.anInt2163;
		this.anInt2162 = arg0.anInt2162;
		this.anInt2164 = arg0.anInt2164;
	}
}
