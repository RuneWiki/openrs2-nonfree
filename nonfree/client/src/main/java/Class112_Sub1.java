import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class112_Sub1 extends Class112 implements Interface4 {

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	private int anInt3285;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!rl;I[BIZ)V")
	public Class112_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt3285 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
	@Override
	protected void method6161() {
		super.aClass66_Sub2_42.method5101(this);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
	@Override
	public int method4587() {
		return this.anInt3285;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
	@Override
	public int method4588() {
		return super.anInt7507;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)J")
	@Override
	public long method4589() {
		return 0L;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method4586(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method6164(arg0, arg1);
		this.anInt3285 = 5123;
	}
}
