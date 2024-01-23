import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
	private int anInt2905;

	@OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
	private int anInt2906;

	@OriginalMember(owner = "client!mg", name = "hb", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub17() {
		this(0);
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub17(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2342(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2342(arg0.method2091());
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static54.anInt953; local35++) {
				local25[local35] = this.anInt2912;
				local29[local35] = this.anInt2906;
				local33[local35] = this.anInt2905;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
	private void method2342(@OriginalArg(1) int arg0) {
		this.anInt2905 = (arg0 & 0xFF) << 4;
		this.anInt2906 = arg0 >> 4 & 0xFF0;
		this.anInt2912 = arg0 >> 12 & 0xFF0;
	}
}
