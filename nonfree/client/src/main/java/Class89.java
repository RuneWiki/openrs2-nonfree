import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class89 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
	public int anInt2081;

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
	public int anInt2082;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
	public int anInt2083;

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
	public int anInt2084;

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
	public int anInt2087;

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
	public int anInt2090;

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
	public int anInt2093 = 128;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
	public int anInt2094 = 128;

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
	public int anInt2088;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt2088 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIII)V")
	private Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2083 = arg4;
		this.anInt2093 = arg2;
		this.anInt2088 = arg0;
		this.anInt2090 = arg3;
		this.anInt2094 = arg1;
		this.anInt2087 = arg5;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!fw;I)V")
	public void method1973(@OriginalArg(0) Class89 arg0) {
		this.anInt2090 = arg0.anInt2090;
		this.anInt2083 = arg0.anInt2083;
		this.anInt2088 = arg0.anInt2088;
		this.anInt2093 = arg0.anInt2093;
		this.anInt2087 = arg0.anInt2087;
		this.anInt2094 = arg0.anInt2094;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)Lclient!fw;")
	public Class89 method1974() {
		return new Class89(this.anInt2088, this.anInt2094, this.anInt2093, this.anInt2090, this.anInt2083, this.anInt2087);
	}
}
