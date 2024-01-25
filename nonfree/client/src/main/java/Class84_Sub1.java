import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class84_Sub1 extends Class84 implements Interface10 {

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
	private int anInt4101;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!os;I[BIZ)V")
	public Class84_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4101 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!os;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class84_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4101 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)I")
	@Override
	public int method3586() {
		return super.anInt7695;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method3585(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method6452(arg0, arg1);
		this.anInt4101 = arg2;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
	@Override
	public int method3588() {
		return this.anInt4101;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	@Override
	protected void method6454() {
		super.aClass39_Sub3_31.method5731(this);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)J")
	@Override
	public long method3587() {
		return 0L;
	}
}
