import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class42_Sub2 extends Class42 implements Interface5 {

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	private int anInt6672;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!pg;I[BIZ)V")
	public Class42_Sub2(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6672 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V")
	@Override
	protected void method5171() {
		super.aClass163_Sub2_40.method4141(this);
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I")
	@Override
	public int method5175() {
		return this.anInt6672;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)J")
	@Override
	public long method5174() {
		return 0L;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)I")
	@Override
	public int method5173() {
		return super.anInt6666;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5172(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method5168(arg0, arg1);
		this.anInt6672 = 5123;
	}
}
