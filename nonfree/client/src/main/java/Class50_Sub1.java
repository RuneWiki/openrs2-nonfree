import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class50_Sub1 extends Class50 implements Interface1 {

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	private int anInt1432;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!jaa;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class50_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1432 = arg1;
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!jaa;I[BIZ)V")
	public Class50_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1432 = arg1;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)I")
	@Override
	public int method5394() {
		return this.anInt1432;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)J")
	@Override
	public long method5396() {
		return 0L;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	@Override
	protected void method5678() {
		super.aClass14_Sub3_33.method3970(this);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)I")
	@Override
	public int method5395() {
		return super.anInt6745;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method5679(arg2, arg1);
		this.anInt1432 = arg0;
	}
}
