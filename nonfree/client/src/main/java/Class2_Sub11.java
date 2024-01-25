import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "Lclient!im;")
	public Class2_Sub20 aClass2_Sub20_5;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Lclient!rk;")
	public Class2_Sub11 aClass2_Sub11_6;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	public int anInt5555;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Z")
	public volatile boolean aBoolean410 = true;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "()Lclient!rk;")
	public abstract Class2_Sub11 method4871();

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "()Lclient!rk;")
	public abstract Class2_Sub11 method4872();

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "()I")
	public int method4873() {
		return 255;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([III)V")
	protected final void method4874(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean410) {
			this.method4877(arg0, arg1, arg2);
		} else {
			this.method4875(arg2);
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	public abstract void method4875(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "()I")
	public abstract int method4876();

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "([III)V")
	public abstract void method4877(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
