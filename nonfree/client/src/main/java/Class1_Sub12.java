import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!jc;")
	public Class1_Sub12 aClass1_Sub12_8;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!qa;")
	public Class1_Sub22 aClass1_Sub22_5;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	public int anInt3708;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Z")
	public volatile boolean aBoolean206 = true;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([III)V")
	protected final void method2752(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean206) {
			this.method2753(arg0, arg1, arg2);
		} else {
			this.method2757(arg2);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "([III)V")
	public abstract void method2753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()Lclient!jc;")
	public abstract Class1_Sub12 method2754();

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()Lclient!jc;")
	public abstract Class1_Sub12 method2755();

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "()I")
	public abstract int method2756();

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public abstract void method2757(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "()I")
	public int method2758() {
		return 255;
	}
}
