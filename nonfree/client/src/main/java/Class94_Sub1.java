import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class94_Sub1 extends Class94 implements Interface11 {

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	private int anInt5120;

	static {
		new Class231("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!na;I[BIZ)V")
	public Class94_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5120 = arg1;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(B)V")
	@Override
	protected void method4454() {
		super.aClass75_Sub2_32.method3824(this);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)J")
	@Override
	public long method5884() {
		return 0L;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)I")
	@Override
	public int method5886() {
		return super.anInt5609;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5887(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4453(arg1, arg0);
		this.anInt5120 = 5123;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	@Override
	public int method5885() {
		return this.anInt5120;
	}
}
