import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
	public int anInt2401;

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "Lclient!qf;")
	public Class1_Sub8 aClass1_Sub8_7;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Lclient!wd;")
	public Class1_Sub16 aClass1_Sub16_5;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "Z")
	public volatile boolean aBoolean196 = true;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
	public abstract int method1733();

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()Lclient!qf;")
	public abstract Class1_Sub8 method1734();

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()I")
	public int method1735() {
		return 255;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([III)V")
	public abstract void method1736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "([III)V")
	protected final void method1737(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean196) {
			this.method1736(arg0, arg1, arg2);
		} else {
			this.method1739(arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()Lclient!qf;")
	public abstract Class1_Sub8 method1738();

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public abstract void method1739(@OriginalArg(0) int arg0);
}
