import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class112_Sub1 extends Class112 implements Interface1 {

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	private int anInt4721;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	private int anInt4722;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!ao;I[BIZ)V")
	public Class112_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4721 = arg1;
		this.anInt4722 = this.aClass4_Sub1_33.method552(this.anInt4721);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "()V")
	@Override
	protected void method4971() {
		this.aClass4_Sub1_33.method576(this);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()I")
	@Override
	public int method4970() {
		return super.method4970();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
	@Override
	public void method4323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass4_Sub1_33.anOpengl1.glDrawElements(4, arg1, this.anInt4721, (long) (arg0 * this.anInt4722));
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4322(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4969(arg0, arg1);
		this.anInt4721 = 5123;
		this.anInt4722 = this.aClass4_Sub1_33.method552(this.anInt4721);
	}
}
