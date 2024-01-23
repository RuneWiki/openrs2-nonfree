import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "Lclient!lc;")
	public Class2_Sub21 aClass2_Sub21_8;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	public int anInt4780;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!tj;")
	public Class2_Sub22 aClass2_Sub22_5;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Z")
	public volatile boolean aBoolean206 = true;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)V")
	protected final void method3839(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean206) {
			this.method3844(arg0, arg1, arg2);
		} else {
			this.method3845(arg2);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()Lclient!lc;")
	public abstract Class2_Sub21 method3840();

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "()I")
	public int method3841() {
		return 255;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()Lclient!lc;")
	public abstract Class2_Sub21 method3842();

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "()I")
	public abstract int method3843();

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "([III)V")
	public abstract void method3844(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public abstract void method3845(@OriginalArg(0) int arg0);
}
