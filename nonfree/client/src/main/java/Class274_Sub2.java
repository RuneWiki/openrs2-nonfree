import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public final class Class274_Sub2 extends Class274 implements Interface23 {

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
	private int anInt10882;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!ck;I[BI)V")
	public Class274_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt10882 = arg1;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)I")
	@Override
	public int method9045() {
		return this.anInt10882;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)J")
	@Override
	public long method9042() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZ[B)V")
	@Override
	public void method9043(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method9041(arg1, arg0);
		this.anInt10882 = 5123;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)I")
	@Override
	public int method9044() {
		return 0;
	}
}
