import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!eq;")
	public Class2_Sub15 aClass2_Sub15_5;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
	public int anInt6057;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!oe;")
	public Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Z")
	public volatile boolean aBoolean436 = true;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()I")
	public int method5265() {
		return 255;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()Lclient!oe;")
	public abstract Class2_Sub2 method5266();

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()I")
	public abstract int method5267();

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "()Lclient!oe;")
	public abstract Class2_Sub2 method5268();

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([III)V")
	public abstract void method5269(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "([III)V")
	protected final void method5270(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean436) {
			this.method5269(arg0, arg1, arg2);
		} else {
			this.method5271(arg2);
		}
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
	public abstract void method5271(@OriginalArg(0) int arg0);
}
