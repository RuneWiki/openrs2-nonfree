import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!md", name = "t", descriptor = "Lclient!el;")
	public Class2_Sub9 aClass2_Sub9_5;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public int anInt4367;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "Lclient!md;")
	public Class2_Sub5 aClass2_Sub5_8;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Z")
	public volatile boolean aBoolean357 = true;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
	public int method3545() {
		return 255;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	public abstract void method3546(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([III)V")
	protected final void method3547(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean357) {
			this.method3550(arg0, arg1, arg2);
		} else {
			this.method3546(arg2);
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()Lclient!md;")
	public abstract Class2_Sub5 method3548();

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()I")
	public abstract int method3549();

	@OriginalMember(owner = "client!md", name = "b", descriptor = "([III)V")
	public abstract void method3550(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!md", name = "e", descriptor = "()Lclient!md;")
	public abstract Class2_Sub5 method3551();
}
