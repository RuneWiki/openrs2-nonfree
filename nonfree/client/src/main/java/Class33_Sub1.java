import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class33_Sub1 extends Class33 implements Interface2 {

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
	private int anInt2779;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!uq;I[BI)V")
	public Class33_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2779 = arg1;
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!uq;ILclient!jaclib/memory/Buffer;)V")
	public Class33_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt2779 = arg1;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)I")
	@Override
	public int method4389() {
		return this.anInt2779;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)J")
	@Override
	public long method4391() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method4390(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6072(arg0, arg2);
		this.anInt2779 = arg1;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)I")
	@Override
	public int method4392() {
		return 0;
	}
}
