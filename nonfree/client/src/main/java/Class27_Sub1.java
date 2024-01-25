import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class27_Sub1 extends Class27 implements Interface12 {

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
	private int anInt7956;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!uja;I[BIZ)V")
	public Class27_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7956 = arg1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method7099(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method7592(arg1, arg0);
		this.anInt7956 = 5123;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)J")
	@Override
	public long method7101() {
		return 0L;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
	@Override
	public int method7102() {
		return super.anInt8574;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
	@Override
	public int method7100() {
		return this.anInt7956;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)V")
	@Override
	protected void method7591() {
		super.aClass145_Sub3_37.method8866(this);
	}
}
