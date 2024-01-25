import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!me;")
	public Class3_Sub8 aClass3_Sub8_5;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!wc;")
	public Class3_Sub29 aClass3_Sub29_5;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Z")
	public volatile boolean aBoolean191 = true;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()I")
	public abstract int method2125();

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()Lclient!me;")
	public abstract Class3_Sub8 method2126();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([III)V")
	protected final void method2127(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean191) {
			this.method2129(arg0, arg1, arg2);
		} else {
			this.method2131(arg2);
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "()Lclient!me;")
	public abstract Class3_Sub8 method2128();

	@OriginalMember(owner = "client!me", name = "b", descriptor = "([III)V")
	public abstract void method2129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()I")
	public int method2130() {
		return 255;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public abstract void method2131(@OriginalArg(0) int arg0);
}
