import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!li", name = "u", descriptor = "Lclient!li;")
	public Class1_Sub7 aClass1_Sub7_8;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "I")
	public int anInt4677;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "Lclient!nj;")
	public Class1_Sub19 aClass1_Sub19_5;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "Z")
	public volatile boolean aBoolean263 = true;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([III)V")
	public abstract void method3448(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!li", name = "b", descriptor = "([III)V")
	protected final void method3449(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean263) {
			this.method3448(arg0, arg1, arg2);
		} else {
			this.method3450(arg2);
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public abstract void method3450(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()I")
	public int method3451() {
		return 255;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()Lclient!li;")
	public abstract Class1_Sub7 method3452();

	@OriginalMember(owner = "client!li", name = "c", descriptor = "()I")
	public abstract int method3453();

	@OriginalMember(owner = "client!li", name = "d", descriptor = "()Lclient!li;")
	public abstract Class1_Sub7 method3454();
}
