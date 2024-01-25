import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class4_Sub2 extends Class4 implements Interface4 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	private int anInt2775;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	private int anInt2774;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!h;I[BI)V")
	public Class4_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2775 = arg1;
		this.anInt2774 = this.aClass32_Sub2_19.method2292(this.anInt2775);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()I")
	@Override
	public int method2573() {
		return 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2574(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2572(arg0, arg1);
		this.anInt2775 = 5123;
		this.anInt2774 = this.aClass32_Sub2_19.method2292(this.anInt2775);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	@Override
	public void method2575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass32_Sub2_19.anOpengl2.glDrawElements(4, arg1, this.anInt2775, this.aByteBuffer5.position(arg0 * this.anInt2774));
	}
}
