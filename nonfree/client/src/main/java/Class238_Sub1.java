import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class238_Sub1 extends Class238 implements Interface11 {

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
	private int anInt8366;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!pc;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class238_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8366 = arg1;
	}

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!pc;I[BIZ)V")
	public Class238_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8366 = arg1;
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(B)V")
	@Override
	protected void method8456() {
		super.aClass33_Sub3_40.method6328(this);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)J")
	@Override
	public long method7228() {
		return 0L;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(III[B)V")
	@Override
	public void method7229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method8452(arg2, arg0);
		this.anInt8366 = arg1;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)I")
	@Override
	public int method7226() {
		return super.anInt9872;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)I")
	@Override
	public int method7227() {
		return this.anInt8366;
	}
}
