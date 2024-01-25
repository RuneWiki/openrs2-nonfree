import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class251_Sub1 extends Class251 implements Interface26 {

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	private int anInt6697;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!ep;I[BIZ)V")
	public Class251_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6697 = arg1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)J")
	@Override
	public long method5672() {
		return 0L;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I")
	@Override
	public int method5673() {
		return this.anInt6697;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	@Override
	protected void method7596() {
		super.aClass95_Sub1_40.method2057(this);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5675(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method7599(arg1, arg0);
		this.anInt6697 = 5123;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I")
	@Override
	public int method5674() {
		return super.anInt9048;
	}
}
