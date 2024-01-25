import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public abstract class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "Lclient!sl;")
	public Class3_Sub33 aClass3_Sub33_6;

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "Lclient!fga;")
	public Class3_Sub22 aClass3_Sub22_9;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "I")
	public int anInt11137;

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "Z")
	public volatile boolean aBoolean804 = true;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "([III)V")
	protected final void method9301(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean804) {
			this.method9302(arg0, arg1, arg2);
		} else {
			this.method9304(arg2);
		}
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "([III)V")
	public abstract void method9302(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "()Lclient!fga;")
	public abstract Class3_Sub22 method9303();

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
	public abstract void method9304(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "()Lclient!fga;")
	public abstract Class3_Sub22 method9305();

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "()I")
	public int method9306() {
		return 255;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "()I")
	public abstract int method9307();
}
