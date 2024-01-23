import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Lclient!mc;")
	public Class8_Sub20 aClass8_Sub20_5;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public int anInt4941;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "Lclient!kn;")
	public Class8_Sub8 aClass8_Sub8_7;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Z")
	public volatile boolean aBoolean397 = true;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([III)V")
	protected final void method3703(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean397) {
			this.method3707(arg0, arg1, arg2);
		} else {
			this.method3705(arg2);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()Lclient!kn;")
	public abstract Class8_Sub8 method3704();

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public abstract void method3705(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "()Lclient!kn;")
	public abstract Class8_Sub8 method3706();

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "([III)V")
	public abstract void method3707(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "()I")
	public int method3708() {
		return 255;
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "()I")
	public abstract int method3709();
}
