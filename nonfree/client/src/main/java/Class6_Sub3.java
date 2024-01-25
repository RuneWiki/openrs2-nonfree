import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!qha;")
	public Class6_Sub37 aClass6_Sub37_6;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	public int anInt9133;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!ca;")
	public Class6_Sub3 aClass6_Sub3_9;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Z")
	public volatile boolean aBoolean614 = true;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([III)V")
	protected final void method7799(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean614) {
			this.method7805(arg0, arg1, arg2);
		} else {
			this.method7801(arg2);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()Lclient!ca;")
	public abstract Class6_Sub3 method7800();

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public abstract void method7801(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
	public int method7802() {
		return 255;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()Lclient!ca;")
	public abstract Class6_Sub3 method7803();

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()I")
	public abstract int method7804();

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "([III)V")
	public abstract void method7805(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
