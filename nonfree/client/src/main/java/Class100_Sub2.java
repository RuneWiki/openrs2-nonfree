import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class100_Sub2 extends Class100 implements Interface5 {

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	private int anInt5821;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	private int anInt5820;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!tb;I[BI)V")
	public Class100_Sub2(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5821 = arg1;
		this.anInt5820 = this.aClass129_Sub2_37.method5057(this.anInt5821);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4886(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4885(arg0, arg1);
		this.anInt5821 = 5123;
		this.anInt5820 = this.aClass129_Sub2_37.method5057(this.anInt5821);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	@Override
	public void method4887(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass129_Sub2_37.anOpengl2.glDrawElements(4, arg1, this.anInt5821, this.aByteBuffer7.position(arg0 * this.anInt5820));
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "()I")
	@Override
	public int method4888() {
		return 0;
	}
}
