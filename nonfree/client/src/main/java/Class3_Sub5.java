import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!le;")
	public Class3_Sub5 aClass3_Sub5_8;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public int anInt3850;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!fh;")
	public Class3_Sub9 aClass3_Sub9_5;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Z")
	public volatile boolean aBoolean167 = true;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public abstract void method2769(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()I")
	public abstract int method2770();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([III)V")
	protected final void method2771(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean167) {
			this.method2773(arg0, arg1, arg2);
		} else {
			this.method2769(arg2);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
	public int method2772() {
		return 255;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "([III)V")
	public abstract void method2773(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()Lclient!le;")
	public abstract Class3_Sub5 method2774();

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()Lclient!le;")
	public abstract Class3_Sub5 method2775();
}
