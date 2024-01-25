import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public abstract class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "Lclient!oea;")
	public Class3_Sub6 aClass3_Sub6_5;

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "Lclient!gd;")
	public Class3_Sub20 aClass3_Sub20_5;

	@OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
	public int anInt4212;

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "Z")
	public volatile boolean aBoolean323 = true;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "()I")
	public abstract int method3727();

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([III)V")
	public abstract void method3728(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "()I")
	public int method3729() {
		return 255;
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "()Lclient!oea;")
	public abstract Class3_Sub6 method3730();

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "()Lclient!oea;")
	public abstract Class3_Sub6 method3731();

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
	public abstract void method3732(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "([III)V")
	protected final void method3733(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean323) {
			this.method3728(arg0, arg1, arg2);
		} else {
			this.method3732(arg2);
		}
	}
}
