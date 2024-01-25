import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class90_Sub2 extends Class90 implements Interface4 {

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	private int anInt5495;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!rl;I[BI)V")
	public Class90_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5495 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method4586(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4585(arg0, arg1);
		this.anInt5495 = 5123;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
	@Override
	public int method4588() {
		return 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
	@Override
	public int method4587() {
		return this.anInt5495;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)J")
	@Override
	public long method4589() {
		return super.aNativeBuffer4.b();
	}
}
