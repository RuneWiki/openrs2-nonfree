import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Lclient!ta;")
	public Class1_Sub4 aClass1_Sub4_7;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "Lclient!jk;")
	public Class1_Sub7 aClass1_Sub7_5;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
	public int anInt4102;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Z")
	public volatile boolean aBoolean201 = true;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)V")
	protected final void method3070(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean201) {
			this.method3072(arg0, arg1, arg2);
		} else {
			this.method3074(arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()I")
	public int method3071() {
		return 255;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "([III)V")
	public abstract void method3072(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()Lclient!ta;")
	public abstract Class1_Sub4 method3073();

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
	public abstract void method3074(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()Lclient!ta;")
	public abstract Class1_Sub4 method3075();

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()I")
	public abstract int method3076();
}
