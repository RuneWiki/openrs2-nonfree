import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Lclient!ag;")
	public Class4_Sub2 aClass4_Sub2_8;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public int anInt3661;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Lclient!ie;")
	public Class4_Sub12 aClass4_Sub12_5;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "Z")
	public volatile boolean aBoolean144 = true;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()Lclient!ag;")
	public abstract Class4_Sub2 method2768();

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([III)V")
	public abstract void method2769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()I")
	public int method2770() {
		return 255;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()I")
	public abstract int method2771();

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "([III)V")
	protected final void method2772(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean144) {
			this.method2769(arg0, arg1, arg2);
		} else {
			this.method2773(arg2);
		}
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
	public abstract void method2773(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()Lclient!ag;")
	public abstract Class4_Sub2 method2774();
}
