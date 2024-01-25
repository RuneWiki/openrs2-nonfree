import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!uba;")
	public Class1_Sub13 aClass1_Sub13_5;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!jc;")
	public Class1_Sub6 aClass1_Sub6_8;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public int anInt8173;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Z")
	public volatile boolean aBoolean613 = true;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()I")
	public int method6575() {
		return 255;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([III)V")
	public abstract void method6576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()Lclient!jc;")
	public abstract Class1_Sub6 method6577();

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "()Lclient!jc;")
	public abstract Class1_Sub6 method6578();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public abstract void method6579(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "()I")
	public abstract int method6580();

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "([III)V")
	protected final void method6581(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean613) {
			this.method6576(arg0, arg1, arg2);
		} else {
			this.method6579(arg2);
		}
	}
}
