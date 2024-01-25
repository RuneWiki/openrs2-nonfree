import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class148_Sub1 extends Class148 implements Interface26 {

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	private int anInt3774;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!pq;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class148_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3774 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!pq;I[BIZ)V")
	public Class148_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3774 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I")
	@Override
	public int method3631() {
		return super.anInt4519;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
	@Override
	protected void method3788() {
		super.aClass132_Sub3_25.method6748(this);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)J")
	@Override
	public long method3634() {
		return 0L;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
	@Override
	public int method3633() {
		return this.anInt3774;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method3632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method3790(arg2, arg0);
		this.anInt3774 = arg1;
	}
}
