import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	public int anInt4083;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "Lclient!oo;")
	public Class2_Sub1 aClass2_Sub1_8;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "Lclient!lt;")
	public Class2_Sub22 aClass2_Sub22_5;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "Z")
	public volatile boolean aBoolean288 = true;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "()I")
	public abstract int method3223();

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "()Lclient!oo;")
	public abstract Class2_Sub1 method3224();

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "()I")
	public int method3225() {
		return 255;
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "()Lclient!oo;")
	public abstract Class2_Sub1 method3226();

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([III)V")
	protected final void method3227(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean288) {
			this.method3229(arg0, arg1, arg2);
		} else {
			this.method3228(arg2);
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public abstract void method3228(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "([III)V")
	public abstract void method3229(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
