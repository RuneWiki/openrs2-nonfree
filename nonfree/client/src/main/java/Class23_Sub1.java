import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class23_Sub1 extends Class23 implements Interface3 {

	@OriginalMember(owner = "client!br", name = "c", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "I")
	private int anInt687;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!fu;I[BI)V")
	public Class23_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt686 = arg1;
		this.anInt687 = this.aClass63_Sub2_14.method2071(this.anInt686);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3592(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1837(arg0, arg1);
		this.anInt686 = 5123;
		this.anInt687 = this.aClass63_Sub2_14.method2071(this.anInt686);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "()I")
	@Override
	public int method3588() {
		return 0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
	@Override
	public void method3591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass63_Sub2_14.anOpengl2.glDrawElements(4, arg1, this.anInt686, this.aByteBuffer3.position(arg0 * this.anInt687));
	}
}
