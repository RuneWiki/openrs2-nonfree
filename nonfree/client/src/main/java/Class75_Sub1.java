import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class75_Sub1 extends Class75 implements Interface27 {

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
	private int anInt1991;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!lf;I[BIZ)V")
	public Class75_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1991 = arg1;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
	@Override
	public int method7794() {
		return super.anInt10605;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I[BBI)V")
	@Override
	public void method7795(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method8693(arg1, arg0);
		this.anInt1991 = 5123;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)I")
	@Override
	public int method7796() {
		return this.anInt1991;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)J")
	@Override
	public long method7793() {
		return 0L;
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)V")
	@Override
	protected void method8692() {
		super.aClass95_Sub3_41.method4909(this);
	}
}
