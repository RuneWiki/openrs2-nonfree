import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class63_Sub1 extends Class63 implements Interface2 {

	@OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
	private int anInt1292;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!ml;I[BIZ)V")
	public Class63_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1292 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!ml;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class63_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1292 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)J")
	@Override
	public long method7557() {
		return 0L;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method7558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method5011(arg0, arg2);
		this.anInt1292 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I")
	@Override
	public int method7560() {
		return this.anInt1292;
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
	@Override
	protected void method5014() {
		super.aClass75_Sub3_23.method5832(this);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
	@Override
	public int method7559() {
		return super.anInt5499;
	}
}
