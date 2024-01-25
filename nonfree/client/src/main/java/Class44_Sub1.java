import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class44_Sub1 extends Class44 implements Interface18 {

	@OriginalMember(owner = "client!in", name = "j", descriptor = "I")
	private int anInt4225;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!qj;ILclient!jaclib/memory/Buffer;)V")
	public Class44_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4225 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!qj;I[BI)V")
	public Class44_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4225 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)I")
	@Override
	public int method3533() {
		return 0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)J")
	@Override
	public long method3530() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method3532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method7923(arg0, arg1);
		this.anInt4225 = arg2;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)I")
	@Override
	public int method3531() {
		return this.anInt4225;
	}
}
