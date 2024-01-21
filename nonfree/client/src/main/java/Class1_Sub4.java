import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!nb;")
	public Class1_Sub17 aClass1_Sub17_5;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public int anInt2851;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Lclient!kb;")
	public Class1_Sub4 aClass1_Sub4_8;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
	public volatile boolean aBoolean162 = true;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
	protected final void method1893(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean162) {
			this.method1897(arg0, arg1, arg2);
		} else {
			this.method1895(arg2);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()Lclient!kb;")
	public abstract Class1_Sub4 method1894();

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public abstract void method1895(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lclient!kb;")
	public abstract Class1_Sub4 method1896();

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
	public abstract void method1897(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public abstract int method1898();

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()I")
	public int method1899() {
		return 255;
	}
}
