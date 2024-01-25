import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "Lclient!nn;")
	public Class3_Sub13 aClass3_Sub13_5;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "Lclient!ar;")
	public Class3_Sub5 aClass3_Sub5_8;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
	public int anInt6619;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "Z")
	public volatile boolean aBoolean457 = true;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "()I")
	public abstract int method5185();

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "()I")
	public int method5186() {
		return 255;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "()Lclient!ar;")
	public abstract Class3_Sub5 method5187();

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "()Lclient!ar;")
	public abstract Class3_Sub5 method5188();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V")
	public abstract void method5189(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public abstract void method5190(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "([III)V")
	protected final void method5191(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean457) {
			this.method5189(arg0, arg1, arg2);
		} else {
			this.method5190(arg2);
		}
	}
}
