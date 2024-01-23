import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "[B")
	public static byte[] aByteArray22 = new byte[32896];

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			for (@Pc(15) int local15 = 0; local15 <= local10; local15++) {
				aByteArray22[local8++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local10 * local10 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(30) int[][] local30 = this.method4575(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local30[2];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static299.anInt5670; local56++) {
				local42[local56] = 4096 - local34[local56];
				local46[local56] = 4096 - local38[local56];
				local54[local56] = 4096 - local50[local56];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(28) int[] local28 = this.method4570(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static299.anInt5670; local30++) {
				local17[local30] = 4096 - local28[local30];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}
}
