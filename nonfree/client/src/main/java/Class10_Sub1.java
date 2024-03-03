import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class10_Sub1 extends Class10 implements Interface4 {

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!bf;I[BIZ)V", line = 11)
	public Class10_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt278 = arg1;
		this.anInt277 = this.aClass19_Sub1_11.method798(this.anInt278);
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "()V", line = 3)
	@Override
	protected void method2317() {
		this.aClass19_Sub1_11.method801(this);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()I", line = 8)
	@Override
	public int method6067() {
		return super.method6067();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V", line = 16)
	@Override
	public void method6066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass19_Sub1_11.anOpengl1.glDrawElements(4, arg1, this.anInt278, (long) (arg0 * this.anInt277));
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[BI)V", line = 19)
	@Override
	public void method6068(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2316(arg0, arg1);
		this.anInt278 = 5123;
		this.anInt277 = this.aClass19_Sub1_11.method798(this.anInt278);
	}
}
