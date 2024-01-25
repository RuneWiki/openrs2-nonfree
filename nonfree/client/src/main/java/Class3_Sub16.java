import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
	public int anInt9861;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "Lclient!fh;")
	public Class3_Sub17 aClass3_Sub17_5;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Lclient!eq;")
	public Class3_Sub16 aClass3_Sub16_8;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "Z")
	public volatile boolean aBoolean650 = true;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "()Lclient!eq;")
	public abstract Class3_Sub16 method7748();

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "()I")
	public abstract int method7749();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([III)V")
	protected final void method7750(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean650) {
			this.method7754(arg0, arg1, arg2);
		} else {
			this.method7751(arg2);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public abstract void method7751(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "()Lclient!eq;")
	public abstract Class3_Sub16 method7752();

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "()I")
	public int method7753() {
		return 255;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "([III)V")
	public abstract void method7754(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
