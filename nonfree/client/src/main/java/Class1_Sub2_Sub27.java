import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub2_Sub27 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
	private int anInt5988;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub27(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5988 = 4096;
		this.anInt5988 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub27() {
		this(4096);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			Static471.method3064(local9, 0, Static218.anInt3990, this.anInt5988);
		}
		return local9;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5988 = (arg0.method2915() << 12) / 255;
		}
	}
}
