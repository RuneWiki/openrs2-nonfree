import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class26_Sub1 extends Class26 implements Interface1 {

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!da;I[BI)V")
	public Class26_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt526 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([BIII)V")
	@Override
	public void method1769(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method3738(arg0, arg1);
		this.anInt526 = 5123;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)J")
	@Override
	public long method1768() {
		return super.aNativeBuffer4.a();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)I")
	@Override
	public int method1766() {
		return this.anInt526;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	@Override
	public int method1767() {
		return 0;
	}
}
