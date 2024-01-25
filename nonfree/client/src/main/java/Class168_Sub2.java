import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class168_Sub2 extends Class168 implements Interface2 {

	@OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
	private int anInt8824;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!gi;I[BI)V")
	public Class168_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt8824 = arg1;
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)I")
	@Override
	public int method7245() {
		return this.anInt8824;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method7247(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method7243(arg0, arg1);
		this.anInt8824 = 5123;
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(I)J")
	@Override
	public long method7246() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)I")
	@Override
	public int method7244() {
		return 0;
	}
}
