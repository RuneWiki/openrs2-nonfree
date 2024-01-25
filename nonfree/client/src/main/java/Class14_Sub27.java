import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class14_Sub27 extends Class14 {

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub27(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (super.anInt10543 < 1 || super.anInt10543 > 3) {
			super.anInt10543 = this.method8573();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return super.aClass6_Sub33_31.method5000().method4945() ? 3 : 2;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)I")
	public int method8282() {
		return super.anInt10543;
	}
}
