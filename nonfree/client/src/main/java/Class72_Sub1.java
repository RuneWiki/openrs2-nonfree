import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class72_Sub1 extends Class72 implements Interface3 {

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	private int anInt1339;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ih;I[BI)V")
	public Class72_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1339 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I")
	@Override
	public int method5206() {
		return this.anInt1339;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)J")
	@Override
	public long method5208() {
		return super.aNativeBuffer4.b();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	@Override
	public int method5207() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method5205(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method3686(arg1, arg0);
		this.anInt1339 = 5123;
	}
}
