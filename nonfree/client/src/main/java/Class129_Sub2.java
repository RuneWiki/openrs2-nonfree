import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class129_Sub2 extends Class129 implements Interface11 {

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	private int anInt5149;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!bt;I[BI)V")
	public Class129_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5149 = arg1;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)I")
	@Override
	public int method4365() {
		return this.anInt5149;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4363(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4362(arg0, arg1);
		this.anInt5149 = 5123;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)I")
	@Override
	public int method4366() {
		return 0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)J")
	@Override
	public long method4364() {
		return super.aNativeBuffer3.a();
	}
}
