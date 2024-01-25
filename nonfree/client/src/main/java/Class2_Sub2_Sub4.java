import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt770 = 4096;
		this.anInt770 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub4() {
		this(4096);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt770 = (arg0.method3580() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			Static464.method1962(local9, 0, Static217.anInt3574, this.anInt770);
		}
		return local9;
	}
}
