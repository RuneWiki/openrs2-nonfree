import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "Lclient!de;")
	public Class1_Sub4 aClass1_Sub4_3;

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "Lclient!mc;")
	public Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "Z")
	public volatile boolean aBoolean128 = true;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([III)V")
	public abstract void method1512(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()I")
	public abstract int method1513();

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "()Lclient!mc;")
	public abstract Class1_Sub2 method1514();

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
	public abstract void method1515(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([III)V")
	protected final void method1516(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean128) {
			this.method1512(arg0, arg1, arg2);
		} else {
			this.method1515(arg2);
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "()I")
	public int method1517() {
		return 255;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "()Lclient!mc;")
	public abstract Class1_Sub2 method1518();
}
