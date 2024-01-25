import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "Lclient!kq;")
	public Class1_Sub30 aClass1_Sub30_5;

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "Lclient!vv;")
	public Class1_Sub4 aClass1_Sub4_8;

	@OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
	public int anInt9235;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "Z")
	public volatile boolean aBoolean691 = true;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	public abstract void method7981(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "([III)V")
	protected final void method7982(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean691) {
			this.method7986(arg0, arg1, arg2);
		} else {
			this.method7981(arg2);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "()Lclient!vv;")
	public abstract Class1_Sub4 method7983();

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "()Lclient!vv;")
	public abstract Class1_Sub4 method7984();

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "()I")
	public int method7985() {
		return 255;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "([III)V")
	public abstract void method7986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "()I")
	public abstract int method7987();
}
