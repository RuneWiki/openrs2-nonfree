import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class5_Sub3_Sub10 extends Class5_Sub3 {

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
	private int anInt2133;

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
	private int anInt2137;

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
	private int anInt2140;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V")
	private Class5_Sub3_Sub10(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2016(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub10() {
		this(0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2016(arg0.method5072());
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static7.anInt129; local29++) {
				local19[local29] = this.anInt2137;
				local23[local29] = this.anInt2133;
				local27[local29] = this.anInt2140;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
	private void method2016(@OriginalArg(0) int arg0) {
		this.anInt2140 = (arg0 & 0xFF) << 4;
		this.anInt2133 = arg0 >> 4 & 0xFF0;
		this.anInt2137 = arg0 >> 12 & 0xFF0;
	}
}
