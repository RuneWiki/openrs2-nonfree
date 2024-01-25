import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!gv;")
	public Class1_Sub16 aClass1_Sub16_6;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Lclient!pb;")
	public Class1_Sub37 aClass1_Sub37_5;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
	public int anInt6864;

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "Z")
	public volatile boolean aBoolean498 = true;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "()Lclient!gv;")
	public abstract Class1_Sub16 method5748();

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "()I")
	public abstract int method5749();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([III)V")
	protected final void method5750(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean498) {
			this.method5753(arg0, arg1, arg2);
		} else {
			this.method5754(arg2);
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "()I")
	public int method5751() {
		return 255;
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "()Lclient!gv;")
	public abstract Class1_Sub16 method5752();

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "([III)V")
	public abstract void method5753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	public abstract void method5754(@OriginalArg(0) int arg0);
}
