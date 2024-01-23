import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
	private int anInt1617 = 4096;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(33) int[] local33 = this.method4117(0, Static42.anInt1193 & arg0 - 1);
			@Pc(39) int[] local39 = this.method4117(0, arg0);
			@Pc(49) int[] local49 = this.method4117(0, Static42.anInt1193 & arg0 + 1);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static110.anInt2934; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt1617;
				@Pc(97) int local97 = this.anInt1617 * (local39[Static2.anInt38 & local63 + 1] - local39[Static2.anInt38 & local63 - 1]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(148) int local148;
				@Pc(144) int local144;
				@Pc(140) int local140;
				if (local131 == 0) {
					local148 = 0;
					local140 = 0;
					local144 = 0;
				} else {
					local140 = 16777216 / local131;
					local144 = local77 / local131;
					local148 = local97 / local131;
				}
				if (this.aBoolean91) {
					local148 = (local148 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local53[local63] = local148;
				local57[local63] = local144;
				local61[local63] = local140;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1617 = arg0.method1764();
		} else if (arg1 == 1) {
			this.aBoolean91 = arg0.method1772() == 1;
		}
	}
}
