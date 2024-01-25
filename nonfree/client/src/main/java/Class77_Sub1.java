import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class77_Sub1 extends Class77 implements Interface24 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	private int anInt1968;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!jaa;I[BI)V")
	public Class77_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1968 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)J")
	@Override
	public long method5681() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
	@Override
	public int method5684() {
		return this.anInt1968;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
	@Override
	public int method5682() {
		return 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5683(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5392(arg0, arg1);
		this.anInt1968 = 5123;
	}
}
