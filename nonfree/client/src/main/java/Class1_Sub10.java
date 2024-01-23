import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public int anInt5717;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "Lclient!jk;")
	public Class1_Sub10 aClass1_Sub10_8;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "Lclient!oc;")
	public Class1_Sub11 aClass1_Sub11_5;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "Z")
	public volatile boolean aBoolean360 = true;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "()Lclient!jk;")
	public abstract Class1_Sub10 method4339();

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([III)V")
	protected final void method4340(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean360) {
			this.method4345(arg0, arg1, arg2);
		} else {
			this.method4341(arg2);
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public abstract void method4341(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "()Lclient!jk;")
	public abstract Class1_Sub10 method4342();

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "()I")
	public abstract int method4343();

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "()I")
	public int method4344() {
		return 255;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "([III)V")
	public abstract void method4345(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
