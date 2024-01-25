import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class215_Sub2 extends Class215 implements Interface2 {

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
	private int anInt10010;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!rda;I[BI)V")
	public Class215_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt10010 = arg1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)J")
	@Override
	public long method8501() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)I")
	@Override
	public int method8503() {
		return this.anInt10010;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)I")
	@Override
	public int method8504() {
		return 0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8502(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method8500(arg1, arg0);
		this.anInt10010 = 5123;
	}
}
