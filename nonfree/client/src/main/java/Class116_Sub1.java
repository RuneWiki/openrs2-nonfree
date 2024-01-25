import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public final class Class116_Sub1 extends Class116 implements Interface13 {

	@OriginalMember(owner = "client!fha", name = "m", descriptor = "I")
	private int anInt3100;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lclient!aq;I[BIZ)V")
	public Class116_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3100 = arg1;
	}

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lclient!aq;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class116_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3100 = arg1;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Z)I")
	@Override
	public int method4052() {
		return super.anInt10667;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)V")
	@Override
	protected void method9066() {
		super.aClass22_Sub1_40.method888(this);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "([BIIZ)V")
	@Override
	public void method4053(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method9065(arg2, arg0);
		this.anInt3100 = arg1;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)J")
	@Override
	public long method4054() {
		return 0L;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)I")
	@Override
	public int method4051() {
		return this.anInt3100;
	}
}
