import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Lclient!pf;")
	public Class1_Sub6 aClass1_Sub6_7;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "Lclient!m;")
	public Class1_Sub7 aClass1_Sub7_5;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	public int anInt2848;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "Z")
	public volatile boolean aBoolean241 = true;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()I")
	public int method2181() {
		return 255;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "()Lclient!pf;")
	public abstract Class1_Sub6 method2182();

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([III)V")
	public abstract void method2183(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "()I")
	public abstract int method2184();

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "()Lclient!pf;")
	public abstract Class1_Sub6 method2185();

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "([III)V")
	protected final void method2186(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean241) {
			this.method2183(arg0, arg1, arg2);
		} else {
			this.method2187(arg2);
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public abstract void method2187(@OriginalArg(0) int arg0);
}
