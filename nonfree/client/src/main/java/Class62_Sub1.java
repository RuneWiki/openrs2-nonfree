import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class62_Sub1 extends Class62 implements Interface1 {

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
	private int anInt1933;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!ag;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class62_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1933 = arg1;
	}

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!ag;I[BIZ)V")
	public Class62_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1933 = arg1;
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(B)V")
	@Override
	protected void method7761() {
		super.aClass12_Sub1_41.method408(this);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method1699(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7760(arg1, arg0);
		this.anInt1933 = arg2;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)I")
	@Override
	public int method1698() {
		return super.anInt9388;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)J")
	@Override
	public long method1696() {
		return 0L;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)I")
	@Override
	public int method1697() {
		return this.anInt1933;
	}
}
