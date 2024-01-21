import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public int anInt4098;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!qe;")
	public Class2_Sub20 aClass2_Sub20_5;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "Lclient!af;")
	public Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Z")
	public volatile boolean aBoolean181 = true;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()Lclient!af;")
	public abstract Class2_Sub2 method2847();

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()Lclient!af;")
	public abstract Class2_Sub2 method2848();

	@OriginalMember(owner = "client!af", name = "c", descriptor = "()I")
	public abstract int method2849();

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
	public abstract void method2850(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([III)V")
	protected final void method2851(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean181) {
			this.method2853(arg0, arg1, arg2);
		} else {
			this.method2850(arg2);
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "()I")
	public int method2852() {
		return 255;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "([III)V")
	public abstract void method2853(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
