import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class Class5_Sub15 extends Class5 {

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "Lclient!ko;")
	public Class5_Sub5 aClass5_Sub5_5;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "Lclient!ps;")
	public Class5_Sub15 aClass5_Sub15_8;

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
	public int anInt8006;

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Z")
	public volatile boolean aBoolean572 = true;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public abstract void method6505(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "()Lclient!ps;")
	public abstract Class5_Sub15 method6506();

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([III)V")
	protected final void method6507(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean572) {
			this.method6510(arg0, arg1, arg2);
		} else {
			this.method6505(arg2);
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "()I")
	public abstract int method6508();

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "()I")
	public int method6509() {
		return 255;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "([III)V")
	public abstract void method6510(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "()Lclient!ps;")
	public abstract Class5_Sub15 method6511();
}
