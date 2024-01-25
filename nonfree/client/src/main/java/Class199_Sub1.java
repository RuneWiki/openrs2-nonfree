import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public final class Class199_Sub1 extends Class199 implements Interface2 {

	@OriginalMember(owner = "client!mja", name = "l", descriptor = "I")
	private int anInt7114;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lclient!lea;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class199_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7114 = arg1;
	}

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lclient!lea;I[BIZ)V")
	public Class199_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7114 = arg1;
	}

	@OriginalMember(owner = "client!mja", name = "c", descriptor = "(I)V")
	@Override
	protected void method6703() {
		super.aClass101_Sub2_23.method5685(this);
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)I")
	@Override
	public int method6367() {
		return super.anInt7577;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6366(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method6702(arg1, arg0);
		this.anInt7114 = arg2;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)J")
	@Override
	public long method6368() {
		return 0L;
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(I)I")
	@Override
	public int method6369() {
		return this.anInt7114;
	}
}
