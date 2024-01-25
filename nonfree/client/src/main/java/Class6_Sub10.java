import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	public int anInt6706;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!cp;")
	public Class6_Sub12 aClass6_Sub12_5;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!cd;")
	public Class6_Sub10 aClass6_Sub10_7;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Z")
	public volatile boolean aBoolean505 = true;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public abstract void method5651(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
	public abstract int method5652();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([III)V")
	protected final void method5653(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean505) {
			this.method5657(arg0, arg1, arg2);
		} else {
			this.method5651(arg2);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
	public int method5654() {
		return 255;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()Lclient!cd;")
	public abstract Class6_Sub10 method5655();

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()Lclient!cd;")
	public abstract Class6_Sub10 method5656();

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "([III)V")
	public abstract void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
