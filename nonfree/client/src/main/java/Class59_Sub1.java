import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class59_Sub1 extends Class59 implements Interface4 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	private int anInt1139;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!ml;I[BI)V")
	public Class59_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1139 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5017(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method7556(arg1, arg0);
		this.anInt1139 = 5123;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	@Override
	public int method5015() {
		return 0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)J")
	@Override
	public long method5016() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
	@Override
	public int method5018() {
		return this.anInt1139;
	}
}
