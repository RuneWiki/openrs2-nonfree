import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class66_Sub2 extends Class66 implements Interface6 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	private int anInt4813;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
	private int anInt4814;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ig;I[BI)V")
	public Class66_Sub2(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4813 = arg1;
		this.anInt4814 = this.aClass47_Sub2_29.method2831(this.anInt4813);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	@Override
	public void method4257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass47_Sub2_29.anOpengl2.glDrawElements(4, arg1, this.anInt4813, this.aByteBuffer6.position(arg0 * this.anInt4814));
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4258(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4255(arg0, arg1);
		this.anInt4813 = 5123;
		this.anInt4814 = this.aClass47_Sub2_29.method2831(this.anInt4813);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()I")
	@Override
	public int method4256() {
		return 0;
	}
}
