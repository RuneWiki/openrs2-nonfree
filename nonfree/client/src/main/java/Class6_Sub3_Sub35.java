import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class6_Sub3_Sub35 extends Class6_Sub3 {

	@OriginalMember(owner = "client!wba", name = "G", descriptor = "I")
	private int anInt9334 = 32768;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub35() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(29) int[] local29 = this.method7824(1, arg0);
			@Pc(35) int[] local35 = this.method7824(2, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static447.anInt8568; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt9334 >> 12;
				@Pc(78) int local78 = Static205.anIntArray395[local61] * local70 >> 12;
				@Pc(86) int local86 = Static35.anIntArray47[local61] * local70 >> 12;
				@Pc(94) int local94 = Static392.anInt6966 & (local78 >> 12) + local49;
				@Pc(102) int local102 = Static252.anInt4135 & (local86 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method7823(0, local102);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt9334 = arg1.method6006() << 4;
		} else if (arg0 == 1) {
			super.aBoolean668 = arg1.method6041() == 1;
		}
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		Static369.method5426();
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(29) int[] local29 = this.method7824(1, arg0);
			@Pc(35) int[] local35 = this.method7824(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static447.anInt8568; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt9334 >> 12;
				@Pc(64) int local64 = local56 * Static205.anIntArray395[local47] >> 12;
				@Pc(72) int local72 = Static35.anIntArray47[local47] * local56 >> 12;
				@Pc(80) int local80 = (local64 >> 12) + local37 & Static392.anInt6966;
				@Pc(88) int local88 = Static252.anInt4135 & (local72 >> 12) + arg0;
				@Pc(94) int[] local94 = this.method7824(0, local88);
				local11[local37] = local94[local80];
			}
		}
		return local11;
	}
}
