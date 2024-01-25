import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!co", name = "k", descriptor = "Lclient!co;")
	public Class3_Sub3 aClass3_Sub3_9;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "Lclient!fu;")
	public Class3_Sub18 aClass3_Sub18_6;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "I")
	public int anInt5509;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "Z")
	public volatile boolean aBoolean399 = true;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([III)V")
	public abstract void method4677(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public abstract void method4678(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()Lclient!co;")
	public abstract Class3_Sub3 method4679();

	@OriginalMember(owner = "client!co", name = "b", descriptor = "()Lclient!co;")
	public abstract Class3_Sub3 method4680();

	@OriginalMember(owner = "client!co", name = "c", descriptor = "()I")
	public abstract int method4681();

	@OriginalMember(owner = "client!co", name = "b", descriptor = "([III)V")
	protected final void method4682(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean399) {
			this.method4677(arg0, arg1, arg2);
		} else {
			this.method4678(arg2);
		}
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "()I")
	public int method4683() {
		return 255;
	}
}
