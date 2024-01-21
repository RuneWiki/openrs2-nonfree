import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	public int anInt2848;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!wc;")
	public Class2_Sub16 aClass2_Sub16_8;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Lclient!ra;")
	public Class2_Sub14 aClass2_Sub14_5;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Z")
	public volatile boolean aBoolean131 = true;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()I")
	public int method1910() {
		return 255;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()Lclient!wc;")
	public abstract Class2_Sub16 method1911();

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()Lclient!wc;")
	public abstract Class2_Sub16 method1912();

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([III)V")
	public abstract void method1913(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "()I")
	public abstract int method1914();

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "([III)V")
	protected final void method1915(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean131) {
			this.method1913(arg0, arg1, arg2);
		} else {
			this.method1916(arg2);
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	public abstract void method1916(@OriginalArg(0) int arg0);
}
