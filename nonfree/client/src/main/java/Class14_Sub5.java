import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!fc;")
	public Class14_Sub14 aClass14_Sub14_6;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!sd;")
	public Class14_Sub5 aClass14_Sub5_9;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public int anInt10416;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Z")
	public volatile boolean aBoolean727 = true;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
	public abstract int method8687();

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public abstract void method8688(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()I")
	public int method8689() {
		return 255;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([III)V")
	protected final void method8690(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean727) {
			this.method8693(arg0, arg1, arg2);
		} else {
			this.method8688(arg2);
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()Lclient!sd;")
	public abstract Class14_Sub5 method8691();

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()Lclient!sd;")
	public abstract Class14_Sub5 method8692();

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "([III)V")
	public abstract void method8693(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
