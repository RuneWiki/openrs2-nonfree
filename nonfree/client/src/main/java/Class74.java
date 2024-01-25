import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class74 {

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
	public int anInt2276;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
	public int anInt2278;

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
	public int anInt2286;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
	public int anInt2282 = 128;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
	public int anInt2280 = 128;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
	public int anInt2285;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
	public Class74(@OriginalArg(0) int arg0) {
		this.anInt2285 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIII)V")
	private Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2282 = arg1;
		this.anInt2286 = arg3;
		this.anInt2276 = arg5;
		this.anInt2280 = arg2;
		this.anInt2285 = arg0;
		this.anInt2278 = arg4;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Lclient!dq;")
	public Class74 method2074() {
		return new Class74(this.anInt2285, this.anInt2282, this.anInt2280, this.anInt2286, this.anInt2278, this.anInt2276);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!dq;B)V")
	public void method2079(@OriginalArg(0) Class74 arg0) {
		this.anInt2280 = arg0.anInt2280;
		this.anInt2285 = arg0.anInt2285;
		this.anInt2282 = arg0.anInt2282;
		this.anInt2276 = arg0.anInt2276;
		this.anInt2278 = arg0.anInt2278;
		this.anInt2286 = arg0.anInt2286;
	}
}
