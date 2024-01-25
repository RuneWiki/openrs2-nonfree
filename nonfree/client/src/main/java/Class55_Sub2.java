import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class55_Sub2 extends Class55 implements Interface20 {

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
	private int anInt5469;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!lea;I[BI)V")
	public Class55_Sub2(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5469 = arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)J")
	@Override
	public long method6707() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
	@Override
	public int method6706() {
		return 0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6705(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4951(arg0, arg1);
		this.anInt5469 = 5123;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)I")
	@Override
	public int method6708() {
		return this.anInt5469;
	}
}
