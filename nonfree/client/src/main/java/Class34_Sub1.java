import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class34_Sub1 extends Class34 implements Interface11 {

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
	private int anInt5844;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!qo;I[BIZ)V")
	public Class34_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5844 = arg1;
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!qo;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class34_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5844 = arg1;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)I")
	@Override
	public int method5048() {
		return this.anInt5844;
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
	@Override
	protected void method5098() {
		super.aClass20_Sub3_22.method7337(this);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method5096(arg2, arg1);
		this.anInt5844 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)I")
	@Override
	public int method5045() {
		return super.anInt5915;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)J")
	@Override
	public long method5047() {
		return 0L;
	}
}
