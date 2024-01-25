import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class138_Sub1 extends Class138 implements Interface15 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	private int anInt4051;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!mh;ILclient!jaclib/memory/Buffer;)V")
	public Class138_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4051 = arg1;
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!mh;I[BI)V")
	public Class138_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4051 = arg1;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)J")
	@Override
	public long method3791() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	@Override
	public int method3790() {
		return 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
	@Override
	public int method3793() {
		return this.anInt4051;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[BZI)V")
	@Override
	public void method3792(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method8127(arg1, arg0);
		this.anInt4051 = arg2;
	}
}
