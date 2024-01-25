import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public final class Class14_Sub2 extends Class14 implements Interface3 {

	@OriginalMember(owner = "client!us", name = "j", descriptor = "I")
	private int anInt9121;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!ap;I[BI)V")
	public Class14_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9121 = arg1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I")
	@Override
	public int method7654() {
		return 0;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)I")
	@Override
	public int method7655() {
		return this.anInt9121;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method7657(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method7653(arg1, arg0);
		this.anInt9121 = 5123;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)J")
	@Override
	public long method7656() {
		return super.aBuffer3.getAddress();
	}
}
