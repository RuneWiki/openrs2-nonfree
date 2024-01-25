import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class94_Sub2 extends Class94 implements Interface21 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	private int anInt9738;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!ji;I[BI)V")
	public Class94_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9738 = arg1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)J")
	@Override
	public long method7919() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I")
	@Override
	public int method7917() {
		return 0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)I")
	@Override
	public int method7916() {
		return this.anInt9738;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7918(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method7915(arg0, arg1);
		this.anInt9738 = 5123;
	}
}
