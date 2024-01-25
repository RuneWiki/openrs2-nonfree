import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class164_Sub2 extends Class164 implements Interface21 {

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
	private int anInt5870;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!rs;I[BI)V")
	public Class164_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5870 = arg1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)J")
	@Override
	public long method8972() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)I")
	@Override
	public int method8971() {
		return this.anInt5870;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([BIIZ)V")
	@Override
	public void method8974(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5215(arg0, arg1);
		this.anInt5870 = 5123;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I")
	@Override
	public int method8973() {
		return 0;
	}
}
