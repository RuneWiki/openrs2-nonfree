import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class14_Sub2 extends Class14 implements Interface23 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	private int anInt3749;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!ag;I[BI)V")
	public Class14_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3749 = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI[B)V")
	@Override
	public void method7764(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method3244(arg1, arg0);
		this.anInt3749 = 5123;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
	@Override
	public int method7763() {
		return this.anInt3749;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)J")
	@Override
	public long method7766() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)I")
	@Override
	public int method7765() {
		return 0;
	}
}
