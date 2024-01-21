import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Lclient!hb;")
	public Class3_Sub10 aClass3_Sub10_8;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public int anInt2735;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!af;")
	public Class3_Sub2 aClass3_Sub2_5;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Z")
	public volatile boolean aBoolean124 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()I")
	public int method1864() {
		return 255;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public abstract void method1865(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()I")
	public abstract int method1866();

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "()Lclient!hb;")
	public abstract Class3_Sub10 method1867();

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([III)V")
	protected final void method1868(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean124) {
			this.method1870(arg0, arg1, arg2);
		} else {
			this.method1865(arg2);
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "()Lclient!hb;")
	public abstract Class3_Sub10 method1869();

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "([III)V")
	public abstract void method1870(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
