import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class67_Sub1 extends Class67 implements Interface11 {

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	private int anInt2577;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qo;I[BI)V")
	public Class67_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2577 = arg1;
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qo;ILclient!jaclib/memory/Buffer;)V")
	public Class67_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt2577 = arg1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)J")
	@Override
	public long method5047() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)I")
	@Override
	public int method5048() {
		return this.anInt2577;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method9224(arg2, arg1);
		this.anInt2577 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)I")
	@Override
	public int method5045() {
		return 0;
	}
}
