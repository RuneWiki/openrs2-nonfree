import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public final class Class83_Sub1 extends Class83 implements Interface21 {

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
	private int anInt2150;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!uca;I[BIZ)V")
	public Class83_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2150 = arg1;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method5344(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method2170(arg1, arg0);
		this.anInt2150 = 5123;
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)V")
	@Override
	protected void method2171() {
		super.aClass162_Sub3_18.method6934(this);
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)J")
	@Override
	public long method5346() {
		return 0L;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)I")
	@Override
	public int method5343() {
		return super.anInt2526;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)I")
	@Override
	public int method5345() {
		return this.anInt2150;
	}
}
