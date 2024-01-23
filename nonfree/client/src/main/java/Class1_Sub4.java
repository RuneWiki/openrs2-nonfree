import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!vc;")
	public Class1_Sub4 aClass1_Sub4_8;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!ec;")
	public Class1_Sub7 aClass1_Sub7_5;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	public int anInt5372;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Z")
	public volatile boolean aBoolean385 = true;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()Lclient!vc;")
	public abstract Class1_Sub4 method4186();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([III)V")
	protected final void method4187(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean385) {
			this.method4190(arg0, arg1, arg2);
		} else {
			this.method4192(arg2);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
	public abstract int method4188();

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()Lclient!vc;")
	public abstract Class1_Sub4 method4189();

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "([III)V")
	public abstract void method4190(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()I")
	public int method4191() {
		return 255;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	public abstract void method4192(@OriginalArg(0) int arg0);
}
