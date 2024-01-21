import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!ie;")
	public Class2_Sub10 aClass2_Sub10_5;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public int anInt3727;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!nb;")
	public Class2_Sub5 aClass2_Sub5_8;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Z")
	public volatile boolean aBoolean165 = true;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([III)V")
	public abstract void method2651(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()Lclient!nb;")
	public abstract Class2_Sub5 method2652();

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public abstract void method2653(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "([III)V")
	protected final void method2654(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean165) {
			this.method2651(arg0, arg1, arg2);
		} else {
			this.method2653(arg2);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()Lclient!nb;")
	public abstract Class2_Sub5 method2655();

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()I")
	public int method2656() {
		return 255;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()I")
	public abstract int method2657();
}
