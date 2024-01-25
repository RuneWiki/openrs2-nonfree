import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class43_Sub2 extends Class43 implements Interface3 {

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
	private int anInt6529;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!qj;I[BIZ)V")
	public Class43_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6529 = arg1;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
	@Override
	protected void method5469() {
		super.aClass100_Sub3_32.method6335(this);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)I")
	@Override
	public int method7925() {
		return this.anInt6529;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)J")
	@Override
	public long method7924() {
		return 0L;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III[B)V")
	@Override
	public void method7927(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method5468(arg1, arg0);
		this.anInt6529 = 5123;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I")
	@Override
	public int method7926() {
		return super.anInt6522;
	}
}
