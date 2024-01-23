import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!ba;")
	public Class1_Sub3 aClass1_Sub3_7;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
	public int anInt3261;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!cm;")
	public Class1_Sub4 aClass1_Sub4_5;

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "Z")
	public volatile boolean aBoolean169 = true;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
	public int method2538() {
		return 255;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public abstract void method2539(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([III)V")
	public abstract void method2540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()I")
	public abstract int method2541();

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()Lclient!ba;")
	public abstract Class1_Sub3 method2542();

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()Lclient!ba;")
	public abstract Class1_Sub3 method2543();

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "([III)V")
	protected final void method2544(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean169) {
			this.method2540(arg0, arg1, arg2);
		} else {
			this.method2539(arg2);
		}
	}
}
