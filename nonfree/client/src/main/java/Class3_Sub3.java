import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "Lclient!qa;")
	public Class3_Sub13 aClass3_Sub13_5;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	public int anInt3726;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "Lclient!ch;")
	public Class3_Sub3 aClass3_Sub3_8;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
	public volatile boolean aBoolean175 = true;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([III)V")
	public abstract void method2838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public abstract void method2839(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "([III)V")
	protected final void method2840(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean175) {
			this.method2838(arg0, arg1, arg2);
		} else {
			this.method2839(arg2);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()I")
	public abstract int method2841();

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()I")
	public int method2842() {
		return 255;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "()Lclient!ch;")
	public abstract Class3_Sub3 method2843();

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "()Lclient!ch;")
	public abstract Class3_Sub3 method2844();
}
