import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class149_Sub2 extends Class149 implements Interface9 {

	@OriginalMember(owner = "client!no", name = "x", descriptor = "I")
	private int anInt7214;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!ac;I[BIZ)V")
	public Class149_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7214 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)J")
	@Override
	public long method7038() {
		return 0L;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)I")
	@Override
	public int method7035() {
		return super.anInt7207;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)I")
	@Override
	public int method7037() {
		return this.anInt7214;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method7036(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6030(arg1, arg0);
		this.anInt7214 = 5123;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
	@Override
	protected void method6025() {
		super.aClass5_Sub1_27.method319(this);
	}
}
