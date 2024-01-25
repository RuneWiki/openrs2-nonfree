import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class106_Sub2 extends Class106 implements Interface5 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	private int anInt5828;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	private int anInt5827;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!cg;I[BI)V")
	public Class106_Sub2(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5828 = arg1;
		this.anInt5827 = this.aClass37_Sub1_37.method792(this.anInt5828);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	@Override
	public void method4904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass37_Sub1_37.anOpengl1.glDrawElements(4, arg1, this.anInt5828, this.aByteBuffer7.position(arg0 * this.anInt5827));
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4905(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4902(arg0, arg1);
		this.anInt5828 = 5123;
		this.anInt5827 = this.aClass37_Sub1_37.method792(this.anInt5828);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
	@Override
	public int method5582() {
		return 0;
	}
}
