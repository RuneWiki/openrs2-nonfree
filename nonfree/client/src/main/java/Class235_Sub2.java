import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class235_Sub2 extends Class235 implements Interface6 {

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
	private int anInt7005;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!pi;I[BIZ)V")
	public Class235_Sub2(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7005 = arg1;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)J")
	@Override
	public long method8719() {
		return 0L;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)I")
	@Override
	public int method8718() {
		return super.anInt6998;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BBI)V")
	@Override
	public void method8717(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method6108(arg0, arg1);
		this.anInt7005 = 5123;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)I")
	@Override
	public int method8716() {
		return this.anInt7005;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	@Override
	protected void method6110() {
		super.aClass144_Sub3_28.method6993(this);
	}
}
