import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!mi;")
	public Class6_Sub18 aClass6_Sub18_8;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
	public int anInt7788;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!fp;")
	public Class6_Sub19 aClass6_Sub19_5;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
	public volatile boolean aBoolean549 = true;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()Lclient!mi;")
	public abstract Class6_Sub18 method6371();

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
	public abstract void method6372(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
	public int method6373() {
		return 255;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lclient!mi;")
	public abstract Class6_Sub18 method6374();

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "([III)V")
	protected final void method6375(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean549) {
			this.method6372(arg0, arg1, arg2);
		} else {
			this.method6377(arg2);
		}
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "()I")
	public abstract int method6376();

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public abstract void method6377(@OriginalArg(0) int arg0);
}
