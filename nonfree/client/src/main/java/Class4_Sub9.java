import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	public int anInt1887;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Lclient!gn;")
	public Class4_Sub15 aClass4_Sub15_5;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!fb;")
	public Class4_Sub9 aClass4_Sub9_6;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
	public volatile boolean aBoolean142 = true;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()Lclient!fb;")
	public abstract Class4_Sub9 method1463();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()I")
	public int method1464() {
		return 255;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public abstract void method1465(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V")
	protected final void method1466(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean142) {
			this.method1469(arg0, arg1, arg2);
		} else {
			this.method1465(arg2);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()I")
	public abstract int method1467();

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "()Lclient!fb;")
	public abstract Class4_Sub9 method1468();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "([III)V")
	public abstract void method1469(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
