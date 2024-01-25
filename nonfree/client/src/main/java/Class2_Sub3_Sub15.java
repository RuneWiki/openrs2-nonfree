import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	private int anInt2869;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	private int anInt2870;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	private int anInt2871;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub15() {
		this(0);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
	private Class2_Sub3_Sub15(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2606(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
	private void method2606(@OriginalArg(1) int arg0) {
		this.anInt2869 = arg0 >> 4 & 0xFF0;
		this.anInt2870 = (arg0 & 0xFF) << 4;
		this.anInt2871 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static263.anInt5504; local29++) {
				local19[local29] = this.anInt2871;
				local23[local29] = this.anInt2869;
				local27[local29] = this.anInt2870;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.method2606(arg1.method3163());
		}
	}
}
