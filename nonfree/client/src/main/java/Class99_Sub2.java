import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class99_Sub2 extends Class99 implements Interface6 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	private int anInt4069;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	private int anInt4070;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!ic;I[BI)V")
	public Class99_Sub2(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4069 = arg1;
		this.anInt4070 = this.aClass48_Sub2_19.method2610(this.anInt4069);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3554(arg0, arg1);
		this.anInt4069 = 5123;
		this.anInt4070 = this.aClass48_Sub2_19.method2610(this.anInt4069);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "()I")
	@Override
	public int method5135() {
		return 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
	@Override
	public void method5137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass48_Sub2_19.anOpengl2.glDrawElements(4, arg1, this.anInt4069, this.aByteBuffer6.position(arg0 * this.anInt4070));
	}
}
