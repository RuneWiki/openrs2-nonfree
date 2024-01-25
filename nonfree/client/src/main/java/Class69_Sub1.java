import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class69_Sub1 extends Class69 implements Interface5 {

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
	private int anInt1822;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!tt;I[BIZ)V")
	public Class69_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1822 = arg1;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)I")
	@Override
	public int method1492() {
		return this.anInt1822;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([BIII)V")
	@Override
	public void method1489(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5505(arg0, arg1);
		this.anInt1822 = 5123;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)I")
	@Override
	public int method1490() {
		return super.anInt6959;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)J")
	@Override
	public long method1491() {
		return 0L;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
	@Override
	protected void method5504() {
		super.aClass200_Sub2_40.method5326(this);
	}
}
