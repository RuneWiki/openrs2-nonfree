import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!rh;")
	public Class1_Sub4 aClass1_Sub4_5;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public int anInt3637;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!ve;")
	public Class1_Sub12 aClass1_Sub12_7;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Z")
	public volatile boolean aBoolean281 = true;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()I")
	public abstract int method2628();

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()Lclient!ve;")
	public abstract Class1_Sub12 method2629();

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()Lclient!ve;")
	public abstract Class1_Sub12 method2630();

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()I")
	public int method2631() {
		return 255;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([III)V")
	public abstract void method2632(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public abstract void method2633(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "([III)V")
	protected final void method2634(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean281) {
			this.method2632(arg0, arg1, arg2);
		} else {
			this.method2633(arg2);
		}
	}
}
