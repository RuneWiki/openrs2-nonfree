import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bh", name = "lb", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!bh", name = "jb", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!bh", name = "rb", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!bh", name = "hb", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		this.method435();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(30) int[] local30 = this.method2980(0, Static78.anInt2044 & arg0 - 1);
			@Pc(38) int[] local38 = this.method2980(0, arg0);
			@Pc(48) int[] local48 = this.method2980(0, arg0 + 1 & Static78.anInt2044);
			for (@Pc(50) int local50 = 0; local50 < Static129.anInt3118; local50++) {
				@Pc(64) int local64 = (local48[local50] - local30[local50]) * this.anInt611;
				@Pc(84) int local84 = this.anInt611 * (local38[local50 + 1 & Static8.anInt230] - local38[Static8.anInt230 & local50 - 1]);
				@Pc(88) int local88 = local64 >> 12;
				@Pc(92) int local92 = local84 >> 12;
				@Pc(98) int local98 = local92 * local92 >> 12;
				@Pc(104) int local104 = local88 * local88 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((local104 + local98 + 4096) / 4096)) * 4096.0D);
				@Pc(126) int local126;
				@Pc(130) int local130;
				@Pc(134) int local134;
				if (local117 == 0) {
					local126 = 0;
					local130 = 0;
					local134 = 0;
				} else {
					local126 = local84 / local117;
					local130 = local64 / local117;
					local134 = 16777216 / local117;
				}
				local134 = local134 * this.anIntArray85[2] >> 12;
				local126 = local126 * this.anIntArray85[0] >> 12;
				local130 = this.anIntArray85[1] * local130 >> 12;
				local16[local50] = local126 + local130 + local134;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt611 = arg0.method2353();
		} else if (arg1 == 1) {
			this.anInt609 = arg0.method2353();
		} else if (arg1 == 2) {
			this.anInt615 = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	private void method435() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt615 / 4096));
		this.anIntArray85[0] = (int) (local10 * Math.sin((double) (this.anInt609 / 4096)) * 4096.0D);
		this.anIntArray85[1] = (int) (Math.cos((double) (this.anInt609 / 4096)) * 4096.0D * local10);
		this.anIntArray85[2] = (int) (Math.sin((double) (this.anInt615 / 4096)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray85[2] * this.anIntArray85[2] >> 12;
		@Pc(85) int local85 = this.anIntArray85[1] * this.anIntArray85[1] >> 12;
		@Pc(97) int local97 = this.anIntArray85[0] * this.anIntArray85[0] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local97 + local85 + local73 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray85[2] = (this.anIntArray85[2] << 12) / local111;
			this.anIntArray85[1] = (this.anIntArray85[1] << 12) / local111;
			this.anIntArray85[0] = (this.anIntArray85[0] << 12) / local111;
		}
	}
}
