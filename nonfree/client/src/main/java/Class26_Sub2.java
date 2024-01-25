import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class26_Sub2 extends Class26 implements Interface11 {

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
	private int anInt7519;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!er;I[BIZ)V")
	public Class26_Sub2(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7519 = arg1;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
	@Override
	protected void method5866() {
		super.aClass31_Sub2_34.method2521(this);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I")
	@Override
	public int method5870() {
		return this.anInt7519;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)J")
	@Override
	public long method5867() {
		return 0L;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5865(arg1, arg0);
		this.anInt7519 = 5123;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I")
	@Override
	public int method5868() {
		return super.anInt7513;
	}
}
