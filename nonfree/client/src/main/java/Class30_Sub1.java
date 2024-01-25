import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public final class Class30_Sub1 extends Class30 implements Interface8 {

	@OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!kv;I[BIZ)V")
	public Class30_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt525 = arg1;
	}

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!kv;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class30_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt525 = arg1;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)I")
	@Override
	public int method8687() {
		return this.anInt525;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)I")
	@Override
	public int method8685() {
		return super.anInt9308;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([BIII)V")
	@Override
	public void method8688(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method7791(arg1, arg0);
		this.anInt525 = arg2;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)J")
	@Override
	public long method8686() {
		return 0L;
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
	@Override
	protected void method7792() {
		super.aClass143_Sub2_37.method4983(this);
	}
}
