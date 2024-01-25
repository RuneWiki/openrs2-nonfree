import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class86 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
	public int anInt2203;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public int anInt2205;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
	public int anInt2206;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
	public int anInt2210;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
	public int anInt2211;

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
	public int anInt2212;

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
	public int anInt2213;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
	public int anInt2217 = 128;

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
	public int anInt2216 = 128;

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
	public int anInt2209;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(I)V")
	public Class86(@OriginalArg(0) int arg0) {
		this.anInt2209 = arg0;
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIII)V")
	private Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2216 = arg1;
		this.anInt2217 = arg2;
		this.anInt2209 = arg0;
		this.anInt2210 = arg3;
		this.anInt2211 = arg4;
		this.anInt2206 = arg5;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!fu;B)V")
	public void method1750(@OriginalArg(0) Class86 arg0) {
		this.anInt2211 = arg0.anInt2211;
		this.anInt2216 = arg0.anInt2216;
		this.anInt2217 = arg0.anInt2217;
		this.anInt2210 = arg0.anInt2210;
		this.anInt2209 = arg0.anInt2209;
		this.anInt2206 = arg0.anInt2206;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)Lclient!fu;")
	public Class86 method1751() {
		return new Class86(this.anInt2209, this.anInt2216, this.anInt2217, this.anInt2210, this.anInt2211, this.anInt2206);
	}
}
