import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!sia", name = "n", descriptor = "Lclient!us;")
	public Class3_Sub35 aClass3_Sub35_6;

	@OriginalMember(owner = "client!sia", name = "p", descriptor = "Lclient!sia;")
	public Class3_Sub1 aClass3_Sub1_8;

	@OriginalMember(owner = "client!sia", name = "q", descriptor = "I")
	public int anInt6480;

	@OriginalMember(owner = "client!sia", name = "o", descriptor = "Z")
	public volatile boolean aBoolean455 = true;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "()Lclient!sia;")
	public abstract Class3_Sub1 method5778();

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
	public abstract void method5779(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "()I")
	public abstract int method5780();

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "()I")
	public int method5781() {
		return 255;
	}

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "()Lclient!sia;")
	public abstract Class3_Sub1 method5782();

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "([III)V")
	public abstract void method5783(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "([III)V")
	protected final void method5784(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean455) {
			this.method5783(arg0, arg1, arg2);
		} else {
			this.method5779(arg2);
		}
	}
}
