import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class148_Sub2 extends Class148 implements Interface10 {

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
	private int anInt7873;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!uq;I[BIZ)V")
	public Class148_Sub2(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7873 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method6550(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method6542(arg0, arg1);
		this.anInt7873 = 5123;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)I")
	@Override
	public int method6548() {
		return this.anInt7873;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)J")
	@Override
	public long method6549() {
		return 0L;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)I")
	@Override
	public int method6547() {
		return super.anInt7868;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
	@Override
	protected void method6544() {
		super.aClass122_Sub3_37.method6914(this);
	}
}
