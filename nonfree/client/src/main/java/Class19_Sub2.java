import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class19_Sub2 extends Class19 implements Interface9 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	private int anInt6701;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	private int anInt6702;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!hd;I[BI)V")
	public Class19_Sub2(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6701 = arg1;
		this.anInt6702 = this.aClass89_Sub1_42.method2469(this.anInt6701);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5712(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5709(arg0, arg1);
		this.anInt6701 = 5123;
		this.anInt6702 = this.aClass89_Sub1_42.method2469(this.anInt6701);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
	@Override
	public void method5711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass89_Sub1_42.anOpengl2.glDrawElements(4, arg1, this.anInt6701, this.aByteBuffer7.position(arg0 * this.anInt6702));
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "()I")
	@Override
	public int method5710() {
		return 0;
	}
}
