import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class40_Sub2 extends Class40 implements Interface12 {

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
	private int anInt6774;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!qfa;I[BI)V")
	public Class40_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6774 = arg1;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)J")
	@Override
	public long method5495() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method5494(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5492(arg0, arg1);
		this.anInt6774 = 5123;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)I")
	@Override
	public int method5493() {
		return this.anInt6774;
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)I")
	@Override
	public int method5496() {
		return 0;
	}
}
