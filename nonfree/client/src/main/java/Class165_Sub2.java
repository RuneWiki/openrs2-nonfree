import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class165_Sub2 extends Class165 implements Interface23 {

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
	private int anInt8213;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!ck;I[BIZ)V")
	public Class165_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt8213 = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIZ[B)V")
	@Override
	public void method9043(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method7022(arg1, arg0);
		this.anInt8213 = 5123;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
	@Override
	public int method9045() {
		return this.anInt8213;
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V")
	@Override
	protected void method7023() {
		super.aClass65_Sub1_31.method1230(this);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)J")
	@Override
	public long method9042() {
		return 0L;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	@Override
	public int method9044() {
		return super.anInt8208;
	}
}
