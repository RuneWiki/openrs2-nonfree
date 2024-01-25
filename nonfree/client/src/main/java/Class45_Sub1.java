import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class45_Sub1 extends Class45 implements Interface4 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	private int anInt1511;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	private int anInt1512;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!ge;I[BIZ)V")
	public Class45_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1511 = arg1;
		this.anInt1512 = this.aClass81_Sub1_35.method1981(this.anInt1511);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	@Override
	public void method5117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass81_Sub1_35.anOpengl1.glDrawElements(4, arg1, this.anInt1511, (long) (arg0 * this.anInt1512));
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5115(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4998(arg0, arg1);
		this.anInt1511 = 5123;
		this.anInt1512 = this.aClass81_Sub1_35.method1981(this.anInt1511);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
	@Override
	protected void method4997() {
		this.aClass81_Sub1_35.method1968(this);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
	@Override
	public int method5116() {
		return super.method5116();
	}
}
