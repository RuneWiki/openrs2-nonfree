import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class154_Sub2 extends Class154 implements Interface2 {

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
	private int anInt6406;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!od;I[BI)V")
	public Class154_Sub2(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6406 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)I")
	@Override
	public int method4931() {
		return 0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)J")
	@Override
	public long method4930() {
		return super.aNativeBuffer4.a();
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I")
	@Override
	public int method4933() {
		return this.anInt6406;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method4932(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4929(arg1, arg0);
		this.anInt6406 = 5123;
	}
}
