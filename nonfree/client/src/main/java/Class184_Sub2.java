import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public final class Class184_Sub2 extends Class184 implements Interface16 {

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
	private int anInt8579;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!ji;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class184_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8579 = arg1;
	}

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!ji;I[BIZ)V")
	public Class184_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8579 = arg1;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7026(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7022(arg0, arg1);
		this.anInt8579 = arg2;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)I")
	@Override
	public int method7027() {
		return super.anInt8573;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)I")
	@Override
	public int method7025() {
		return this.anInt8579;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)J")
	@Override
	public long method7028() {
		return 0L;
	}

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)V")
	@Override
	protected void method7024() {
		super.aClass15_Sub3_30.method4452(this);
	}
}
