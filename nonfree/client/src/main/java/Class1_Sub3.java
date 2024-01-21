import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!ic;")
	public Class1_Sub9 aClass1_Sub9_5;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public int anInt3715;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!rd;")
	public Class1_Sub3 aClass1_Sub3_8;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Z")
	public volatile boolean aBoolean170 = true;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()Lclient!rd;")
	public abstract Class1_Sub3 method2854();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)V")
	public abstract void method2855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()I")
	public abstract int method2856();

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([III)V")
	protected final void method2857(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean170) {
			this.method2855(arg0, arg1, arg2);
		} else {
			this.method2858(arg2);
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	public abstract void method2858(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()I")
	public int method2859() {
		return 255;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()Lclient!rd;")
	public abstract Class1_Sub3 method2860();
}
