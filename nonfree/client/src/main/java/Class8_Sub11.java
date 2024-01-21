import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class Class8_Sub11 extends Class8 {

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!rf;")
	public Class8_Sub11 aClass8_Sub11_8;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "Lclient!ha;")
	public Class8_Sub9 aClass8_Sub9_5;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	public int anInt2904;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "Z")
	public volatile boolean aBoolean105 = true;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()I")
	public int method1915() {
		return 255;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([III)V")
	protected final void method1916(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean105) {
			this.method1921(arg0, arg1, arg2);
		} else {
			this.method1917(arg2);
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public abstract void method1917(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "()Lclient!rf;")
	public abstract Class8_Sub11 method1918();

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "()I")
	public abstract int method1919();

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "()Lclient!rf;")
	public abstract Class8_Sub11 method1920();

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "([III)V")
	public abstract void method1921(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
