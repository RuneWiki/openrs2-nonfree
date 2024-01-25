import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class15_Sub1 extends Class15 implements Interface5 {

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!tt;I[BI)V")
	public Class15_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt426 = arg1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
	@Override
	public int method1492() {
		return this.anInt426;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)J")
	@Override
	public long method1491() {
		return super.aNativeBuffer3.b();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "([BIII)V")
	@Override
	public void method1489(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method535(arg0, arg1);
		this.anInt426 = 5123;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
	@Override
	public int method1490() {
		return 0;
	}
}
