import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class66_Sub1 extends Class66 implements Interface12 {

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
	private int anInt2600;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!eq;I[BI)V")
	public Class66_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2600 = arg1;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)J")
	@Override
	public long method3816() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I")
	@Override
	public int method3817() {
		return 0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method3814(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method2687(arg0, arg1);
		this.anInt2600 = 5123;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
	@Override
	public int method3815() {
		return this.anInt2600;
	}
}
