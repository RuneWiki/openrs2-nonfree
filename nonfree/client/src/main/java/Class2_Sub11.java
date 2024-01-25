import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Lclient!wf;")
	public Class2_Sub11 aClass2_Sub11_8;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!bo;")
	public Class2_Sub5 aClass2_Sub5_5;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	public int anInt5877;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Z")
	public volatile boolean aBoolean521 = true;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()I")
	public int method4943() {
		return 255;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()I")
	public abstract int method4944();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([III)V")
	public abstract void method4945(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	public abstract void method4946(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()Lclient!wf;")
	public abstract Class2_Sub11 method4947();

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "()Lclient!wf;")
	public abstract Class2_Sub11 method4948();

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "([III)V")
	protected final void method4949(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean521) {
			this.method4945(arg0, arg1, arg2);
		} else {
			this.method4946(arg2);
		}
	}
}
