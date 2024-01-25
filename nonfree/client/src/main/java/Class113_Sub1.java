import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class113_Sub1 extends Class113 implements Interface19 {

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
	private int anInt2708;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!pea;I[BI)V")
	public Class113_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2708 = arg1;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6484(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method3376(arg0, arg1);
		this.anInt2708 = 5123;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)I")
	@Override
	public int method6485() {
		return 0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)J")
	@Override
	public long method6486() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)I")
	@Override
	public int method6483() {
		return this.anInt2708;
	}
}
