import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class165_Sub2 extends Class165 implements Interface14 {

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
	private int anInt10143;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!pq;I[BI)V")
	public Class165_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt10143 = arg1;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)J")
	@Override
	public long method8574() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8575(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method8573(arg1, arg0);
		this.anInt10143 = 5123;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
	@Override
	public int method8577() {
		return this.anInt10143;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
	@Override
	public int method8576() {
		return 0;
	}
}
