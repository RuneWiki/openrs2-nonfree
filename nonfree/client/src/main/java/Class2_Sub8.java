import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "Lclient!hf;")
	public Class2_Sub14 aClass2_Sub14_5;

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
	public int anInt6638;

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "Lclient!nu;")
	public Class2_Sub8 aClass2_Sub8_8;

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "Z")
	public volatile boolean aBoolean449 = true;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([III)V")
	public abstract void method5281(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "([III)V")
	protected final void method5282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean449) {
			this.method5281(arg0, arg1, arg2);
		} else {
			this.method5284(arg2);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "()I")
	public int method5283() {
		return 255;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	public abstract void method5284(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "()Lclient!nu;")
	public abstract Class2_Sub8 method5285();

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "()I")
	public abstract int method5286();

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "()Lclient!nu;")
	public abstract Class2_Sub8 method5287();
}
