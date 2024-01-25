import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class18_Sub1 extends Class18 implements Interface8 {

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!nf;I[BI)V")
	public Class18_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt386 = arg1;
		this.anInt385 = this.aClass105_Sub1_31.method3583(this.anInt386);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	@Override
	public void method1582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass105_Sub1_31.anOpengl1.glDrawElements(4, arg1, this.anInt386, this.aByteBuffer5.position(arg0 * this.anInt385));
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
	@Override
	public int method4193() {
		return 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1583(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4192(arg0, arg1);
		this.anInt386 = 5123;
		this.anInt385 = this.aClass105_Sub1_31.method3583(this.anInt386);
	}
}
