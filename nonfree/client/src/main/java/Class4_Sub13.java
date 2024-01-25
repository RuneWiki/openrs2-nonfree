import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	public int anInt6336;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!cd;")
	public Class4_Sub5 aClass4_Sub5_5;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!le;")
	public Class4_Sub13 aClass4_Sub13_8;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
	public volatile boolean aBoolean556 = true;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([III)V")
	public abstract void method5299(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	public abstract void method5300(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()Lclient!le;")
	public abstract Class4_Sub13 method5301();

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
	public int method5302() {
		return 255;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()Lclient!le;")
	public abstract Class4_Sub13 method5303();

	@OriginalMember(owner = "client!le", name = "b", descriptor = "([III)V")
	protected final void method5304(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean556) {
			this.method5299(arg0, arg1, arg2);
		} else {
			this.method5300(arg2);
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()I")
	public abstract int method5305();
}
