import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!og", name = "v", descriptor = "Lclient!vb;")
	public Class1_Sub9 aClass1_Sub9_5;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "Lclient!og;")
	public Class1_Sub11 aClass1_Sub11_8;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "I")
	public int anInt4164;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "Z")
	public volatile boolean aBoolean206 = true;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()I")
	public abstract int method2930();

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()I")
	public int method2931() {
		return 255;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "()Lclient!og;")
	public abstract Class1_Sub11 method2932();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([III)V")
	public abstract void method2933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!og", name = "b", descriptor = "([III)V")
	protected final void method2934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean206) {
			this.method2933(arg0, arg1, arg2);
		} else {
			this.method2935(arg2);
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	public abstract void method2935(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!og", name = "d", descriptor = "()Lclient!og;")
	public abstract Class1_Sub11 method2936();
}
