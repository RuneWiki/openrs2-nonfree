import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class39_Sub2 extends Class39 implements Interface4 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	private int anInt5643;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	private int anInt5642;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ge;I[BI)V")
	public Class39_Sub2(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5643 = arg1;
		this.anInt5642 = this.aClass81_Sub1_36.method1981(this.anInt5643);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	@Override
	public void method5117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass81_Sub1_36.anOpengl1.glDrawElements(4, arg1, this.anInt5643, this.aByteBuffer7.position(arg0 * this.anInt5642));
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
	@Override
	public int method5116() {
		return 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5115(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5114(arg0, arg1);
		this.anInt5643 = 5123;
		this.anInt5642 = this.aClass81_Sub1_36.method1981(this.anInt5643);
	}
}
