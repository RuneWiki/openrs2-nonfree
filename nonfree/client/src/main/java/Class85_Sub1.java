import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class85_Sub1 extends Class85 implements Interface1 {

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	private int anInt2844;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!gk;I[BI)V")
	public Class85_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2844 = arg1;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)I")
	@Override
	public int method5472() {
		return 0;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I")
	@Override
	public int method5471() {
		return this.anInt2844;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)J")
	@Override
	public long method5469() {
		return super.aNativeBuffer3.a();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([BBII)V")
	@Override
	public void method5470(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4782(arg0, arg1);
		this.anInt2844 = 5123;
	}
}
