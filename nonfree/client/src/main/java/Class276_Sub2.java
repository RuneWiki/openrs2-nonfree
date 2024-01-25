import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class276_Sub2 extends Class276 implements Interface6 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	private int anInt8924;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!vf;I[BI)V")
	public Class276_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt8924 = arg1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZ[B)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method7651(arg1, arg0);
		this.anInt8924 = 5123;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)J")
	@Override
	public long method7655() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
	@Override
	public int method7652() {
		return 0;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)I")
	@Override
	public int method7653() {
		return this.anInt8924;
	}
}
