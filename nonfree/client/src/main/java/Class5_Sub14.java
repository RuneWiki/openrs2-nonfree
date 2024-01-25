import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public abstract class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!eha", name = "j", descriptor = "I")
	public int anInt10589;

	@OriginalMember(owner = "client!eha", name = "k", descriptor = "Lclient!eha;")
	public Class5_Sub14 aClass5_Sub14_9;

	@OriginalMember(owner = "client!eha", name = "l", descriptor = "Lclient!nr;")
	public Class5_Sub9 aClass5_Sub9_6;

	@OriginalMember(owner = "client!eha", name = "i", descriptor = "Z")
	public volatile boolean aBoolean787 = true;

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
	public abstract void method8778(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "()Lclient!eha;")
	public abstract Class5_Sub14 method8779();

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "()Lclient!eha;")
	public abstract Class5_Sub14 method8780();

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "([III)V")
	public abstract void method8781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "()I")
	public int method8782() {
		return 255;
	}

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "()I")
	public abstract int method8783();

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "([III)V")
	protected final void method8784(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean787) {
			this.method8781(arg0, arg1, arg2);
		} else {
			this.method8778(arg2);
		}
	}
}
