import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
	private int anInt5116 = 3072;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
	private int anInt5117 = 2048;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
	private int anInt5115 = 1024;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(27) int[] local27 = this.method5510(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static158.anInt2658; local29++) {
				local11[local29] = this.anInt5115 + (this.anInt5117 * local27[local29] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		this.anInt5117 = this.anInt5116 - this.anInt5115;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt5115 = arg1.method5177();
		} else if (arg0 == 1) {
			this.anInt5116 = arg1.method5177();
		} else if (arg0 == 2) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(28) int[][] local28 = this.method5514(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local13[0];
			@Pc(48) int[] local48 = local13[1];
			@Pc(52) int[] local52 = local13[2];
			for (@Pc(54) int local54 = 0; local54 < Static158.anInt2658; local54++) {
				local44[local54] = (this.anInt5117 * local32[local54] >> 12) + this.anInt5115;
				local48[local54] = this.anInt5115 + (this.anInt5117 * local36[local54] >> 12);
				local52[local54] = (this.anInt5117 * local40[local54] >> 12) + this.anInt5115;
			}
		}
		return local13;
	}
}
