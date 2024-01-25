import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class109_Sub1 extends Class109 implements Interface4 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	private int anInt2735;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	private int anInt2736;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!mi;I[BI)V")
	public Class109_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2735 = arg1;
		this.anInt2736 = this.aClass155_Sub1_29.method3617(this.anInt2735);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	@Override
	public void method2310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass155_Sub1_29.anOpengl1.glDrawElements(4, arg1, this.anInt2735, this.aByteBuffer6.position(arg0 * this.anInt2736));
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2311(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3930(arg0, arg1);
		this.anInt2735 = 5123;
		this.anInt2736 = this.aClass155_Sub1_29.method3617(this.anInt2735);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
	@Override
	public int method3932() {
		return 0;
	}
}
