import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
	private int anInt3542;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
	private int anInt3545;

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "I")
	private int anInt3554;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		this(0);
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub31(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2663(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2663(arg0.method3049());
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V")
	private void method2663(@OriginalArg(1) int arg0) {
		this.anInt3554 = (arg0 & 0xFF) << 4;
		this.anInt3545 = arg0 >> 12 & 0xFF0;
		this.anInt3542 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(24) int[] local24 = local11[1];
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static107.anInt2321; local34++) {
				local28[local34] = this.anInt3545;
				local24[local34] = this.anInt3542;
				local32[local34] = this.anInt3554;
			}
		}
		return local11;
	}
}
