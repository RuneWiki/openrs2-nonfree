import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class8_Sub1 extends Class8 implements Interface2 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	private int anInt2779;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	private int anInt2778;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!po;I[BI)V")
	public Class8_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2779 = arg1;
		this.anInt2778 = this.aClass59_Sub1_25.method4339(this.anInt2779);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	@Override
	public void method2595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass59_Sub1_25.anOpengl2.glDrawElements(4, arg1, this.anInt2779, this.aByteBuffer7.position(arg0 * this.anInt2778));
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2597(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3086(arg0, arg1);
		this.anInt2779 = 5123;
		this.anInt2778 = this.aClass59_Sub1_25.method4339(this.anInt2779);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
	@Override
	public int method5698() {
		return 0;
	}
}
