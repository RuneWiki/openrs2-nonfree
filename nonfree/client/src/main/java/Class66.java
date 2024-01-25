import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class66 {

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
	public int anInt2317;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
	public int anInt2319;

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
	public int anInt2313 = 128;

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
	public int anInt2314 = 128;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
	public int anInt2316;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.anInt2316 = arg0;
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(IIIIII)V")
	private Class66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2313 = arg1;
		this.anInt2321 = arg4;
		this.anInt2316 = arg0;
		this.anInt2314 = arg2;
		this.anInt2319 = arg3;
		this.anInt2317 = arg5;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILclient!dea;)V")
	public void method1968(@OriginalArg(1) Class66 arg0) {
		this.anInt2321 = arg0.anInt2321;
		this.anInt2317 = arg0.anInt2317;
		this.anInt2313 = arg0.anInt2313;
		this.anInt2316 = arg0.anInt2316;
		this.anInt2319 = arg0.anInt2319;
		this.anInt2314 = arg0.anInt2314;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)Lclient!dea;")
	public Class66 method1969() {
		return new Class66(this.anInt2316, this.anInt2313, this.anInt2314, this.anInt2319, this.anInt2321, this.anInt2317);
	}
}
