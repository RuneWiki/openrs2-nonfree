import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class41_Sub2 extends Class41 implements Interface10 {

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
	private int anInt2898;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ef;I[BI)V")
	public Class41_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2898 = arg1;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	@Override
	public int method2309() {
		return 0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method2308(arg1, arg0);
		this.anInt2898 = 5123;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)J")
	@Override
	public long method2311() {
		return super.aNativeBuffer3.c();
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)I")
	@Override
	public int method2310() {
		return this.anInt2898;
	}
}
