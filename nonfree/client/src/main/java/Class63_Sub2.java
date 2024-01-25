import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class63_Sub2 extends Class63 implements Interface8 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	private int anInt5790;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	private int anInt5789;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!se;I[BI)V")
	public Class63_Sub2(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5790 = arg1;
		this.anInt5789 = this.aClass122_Sub2_39.method4885(this.anInt5790);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "()I")
	@Override
	public int method5253() {
		return 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5257(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4939(arg0, arg1);
		this.anInt5790 = 5123;
		this.anInt5789 = this.aClass122_Sub2_39.method4885(this.anInt5790);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
	@Override
	public void method5256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass122_Sub2_39.anOpengl2.glDrawElements(4, arg1, this.anInt5790, this.aByteBuffer5.position(arg0 * this.anInt5789));
	}
}
