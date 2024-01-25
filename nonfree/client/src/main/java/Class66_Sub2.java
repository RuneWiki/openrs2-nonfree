import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class66_Sub2 extends Class66 implements Interface16 {

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	private int anInt8177;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!kfa;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class66_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8177 = arg1;
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!kfa;I[BIZ)V")
	public Class66_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8177 = arg1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
	@Override
	public int method6366() {
		return super.anInt8171;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)J")
	@Override
	public long method6368() {
		return 0L;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6365(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method6362(arg0, arg2);
		this.anInt8177 = arg1;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	@Override
	protected void method6360() {
		super.aClass7_Sub2_35.method4340(this);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
	@Override
	public int method6367() {
		return this.anInt8177;
	}
}
