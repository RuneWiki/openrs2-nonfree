import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!wg;")
	public Class3_Sub4 aClass3_Sub4_5;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!tb;")
	public Class3_Sub9 aClass3_Sub9_7;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
	public int anInt3072;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Z")
	public volatile boolean aBoolean208 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
	public abstract int method2214();

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	public abstract void method2215(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([III)V")
	protected final void method2216(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean208) {
			this.method2220(arg0, arg1, arg2);
		} else {
			this.method2215(arg2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()I")
	public int method2217() {
		return 255;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()Lclient!tb;")
	public abstract Class3_Sub9 method2218();

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "()Lclient!tb;")
	public abstract Class3_Sub9 method2219();

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "([III)V")
	public abstract void method2220(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
