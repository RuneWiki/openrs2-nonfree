import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!m", name = "B", descriptor = "I")
	public int anInt2258;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "Lclient!le;")
	public Class1_Sub14 aClass1_Sub14_5;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "Lclient!m;")
	public Class1_Sub9 aClass1_Sub9_8;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "Z")
	public volatile boolean aBoolean94 = true;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([III)V")
	protected final void method1548(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean94) {
			this.method1554(arg0, arg1, arg2);
		} else {
			this.method1553(arg2);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()Lclient!m;")
	public abstract Class1_Sub9 method1549();

	@OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
	public int method1550() {
		return 255;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "()I")
	public abstract int method1551();

	@OriginalMember(owner = "client!m", name = "d", descriptor = "()Lclient!m;")
	public abstract Class1_Sub9 method1552();

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public abstract void method1553(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([III)V")
	public abstract void method1554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
