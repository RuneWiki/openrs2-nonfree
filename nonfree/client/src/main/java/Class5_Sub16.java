import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public int anInt6479;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!rb;")
	public Class5_Sub16 aClass5_Sub16_8;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!ua;")
	public Class5_Sub10 aClass5_Sub10_5;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Z")
	public volatile boolean aBoolean550 = true;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([III)V")
	public abstract void method5787(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
	public int method5788() {
		return 255;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "([III)V")
	protected final void method5789(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean550) {
			this.method5787(arg0, arg1, arg2);
		} else {
			this.method5793(arg2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()Lclient!rb;")
	public abstract Class5_Sub16 method5790();

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "()Lclient!rb;")
	public abstract Class5_Sub16 method5791();

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "()I")
	public abstract int method5792();

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public abstract void method5793(@OriginalArg(0) int arg0);
}
