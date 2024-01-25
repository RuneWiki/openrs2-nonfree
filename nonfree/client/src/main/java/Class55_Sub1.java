import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class55_Sub1 extends Class55 implements Interface2 {

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
	private int anInt1451;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!lea;ILclient!jaclib/memory/Buffer;)V")
	public Class55_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt1451 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!lea;I[BI)V")
	public Class55_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1451 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)I")
	@Override
	public int method6367() {
		return 0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6366(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4951(arg0, arg1);
		this.anInt1451 = arg2;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)J")
	@Override
	public long method6368() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)I")
	@Override
	public int method6369() {
		return this.anInt1451;
	}
}
