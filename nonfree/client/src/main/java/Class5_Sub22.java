import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class Class5_Sub22 extends Class5 {

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	public int anInt7393;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Lclient!ms;")
	public Class5_Sub22 aClass5_Sub22_8;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "Lclient!bv;")
	public Class5_Sub5 aClass5_Sub5_5;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "Z")
	public volatile boolean aBoolean497 = true;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "()Lclient!ms;")
	public abstract Class5_Sub22 method5928();

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "()Lclient!ms;")
	public abstract Class5_Sub22 method5929();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public abstract void method5930(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "()I")
	public abstract int method5931();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([III)V")
	protected final void method5932(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean497) {
			this.method5934(arg0, arg1, arg2);
		} else {
			this.method5930(arg2);
		}
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "()I")
	public int method5933() {
		return 255;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "([III)V")
	public abstract void method5934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
