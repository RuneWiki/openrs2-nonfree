import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class45_Sub1 extends Class45 implements Interface10 {

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	private int anInt3641;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!os;ILclient!jaclib/memory/Buffer;)V")
	public Class45_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt3641 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!os;I[BI)V")
	public Class45_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3641 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method3585(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method6820(arg1, arg0);
		this.anInt3641 = arg2;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	@Override
	public int method3586() {
		return 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)I")
	@Override
	public int method3588() {
		return this.anInt3641;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)J")
	@Override
	public long method3587() {
		return super.aBuffer3.getAddress();
	}
}
