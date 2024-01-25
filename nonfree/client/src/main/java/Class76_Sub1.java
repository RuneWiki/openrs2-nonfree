import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class76_Sub1 extends Class76 implements Interface9 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	private int anInt2330;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!kd;I[BI)V")
	public Class76_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2330 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)I")
	@Override
	public int method4693() {
		return 0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB[B)V")
	@Override
	public void method4692(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method2379(arg1, arg0);
		this.anInt2330 = 5123;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)I")
	@Override
	public int method4694() {
		return this.anInt2330;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)J")
	@Override
	public long method4691() {
		return super.aNativeBuffer3.b();
	}
}
