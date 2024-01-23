import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
	private int anInt3698;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub29() {
		this(4096);
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub29(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3698 = 4096;
		this.anInt3698 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3698 = (arg0.method895() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			Static221.method34(local9, 0, Static105.anInt2391, this.anInt3698);
		}
		return local9;
	}
}
