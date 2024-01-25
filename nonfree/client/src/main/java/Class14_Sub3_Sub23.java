import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class14_Sub3_Sub23 extends Class14_Sub3 {

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
	private int anInt3855;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub23() {
		this(4096);
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
	public Class14_Sub3_Sub23(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3855 = 4096;
		this.anInt3855 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			Static358.method768(local9, 0, Static294.anInt5657, this.anInt3855);
		}
		return local9;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3855 = (arg0.method2548() << 12) / 255;
		}
	}
}
