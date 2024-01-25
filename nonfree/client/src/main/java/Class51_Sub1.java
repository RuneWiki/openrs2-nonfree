import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class51_Sub1 extends Class51 implements Interface10 {

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
	private int anInt6412;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!ad;I[BIZ)V")
	public Class51_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6412 = arg1;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I")
	@Override
	public int method5400() {
		return super.anInt8642;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)J")
	@Override
	public long method5401() {
		return 0L;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)V")
	@Override
	protected void method7110() {
		super.aClass5_Sub1_38.method386(this);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([BIIZ)V")
	@Override
	public void method5402(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method7108(arg0, arg1);
		this.anInt6412 = 5123;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)I")
	@Override
	public int method5403() {
		return this.anInt6412;
	}
}
