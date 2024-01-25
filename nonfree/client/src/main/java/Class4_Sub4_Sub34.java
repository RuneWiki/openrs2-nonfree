import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class4_Sub4_Sub34 extends Class4_Sub4 {

	@OriginalMember(owner = "client!rga", name = "G", descriptor = "I")
	private int anInt7799 = 16;

	@OriginalMember(owner = "client!rga", name = "I", descriptor = "I")
	private int anInt7801 = 4096;

	@OriginalMember(owner = "client!rga", name = "N", descriptor = "I")
	private int anInt7805 = 2000;

	@OriginalMember(owner = "client!rga", name = "M", descriptor = "I")
	private int anInt7804 = 0;

	@OriginalMember(owner = "client!rga", name = "O", descriptor = "I")
	private int anInt7806 = 0;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7806 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt7805 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt7799 = arg1.method6015();
		} else if (arg0 == 3) {
			this.anInt7804 = arg1.method5982();
		} else if (arg0 == 4) {
			this.anInt7801 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(30) int local30 = this.anInt7801 >> 1;
			@Pc(35) int[][] local35 = super.aClass343_41.method7592();
			@Pc(42) Random local42 = new Random((long) this.anInt7806);
			for (@Pc(44) int local44 = 0; local44 < this.anInt7805; local44++) {
				@Pc(69) int local69 = this.anInt7801 > 0 ? this.anInt7804 + Static87.method2047(this.anInt7801, local42) - local30 : this.anInt7804;
				@Pc(75) int local75 = local69 >> 4 & 0xFF;
				@Pc(80) int local80 = Static87.method2047(Static560.anInt9394, local42);
				@Pc(85) int local85 = Static87.method2047(Static278.anInt5214, local42);
				@Pc(96) int local96 = (Static488.anIntArray645[local75] * this.anInt7799 >> 12) + local80;
				@Pc(107) int local107 = local85 + (Static427.anIntArray604[local75] * this.anInt7799 >> 12);
				@Pc(112) int local112 = local107 - local85;
				@Pc(117) int local117 = local96 - local80;
				if (local117 != 0 || local112 != 0) {
					if (local117 < 0) {
						local117 = -local117;
					}
					if (local112 < 0) {
						local112 = -local112;
					}
					@Pc(144) boolean local144 = local112 > local117;
					@Pc(148) int local148;
					@Pc(152) int local152;
					if (local144) {
						local148 = local80;
						local80 = local85;
						local152 = local96;
						local96 = local107;
						local85 = local148;
						local107 = local152;
					}
					if (local96 < local80) {
						local148 = local80;
						local152 = local85;
						local80 = local96;
						local96 = local148;
						local85 = local107;
						local107 = local152;
					}
					local148 = local85;
					local152 = local96 - local80;
					@Pc(188) int local188 = local107 - local85;
					@Pc(193) int local193 = -local152 / 2;
					@Pc(197) int local197 = 2048 / local152;
					@Pc(207) int local207 = 1024 - (Static87.method2047(4096, local42) >> 2);
					@Pc(218) int local218 = local107 <= local85 ? -1 : 1;
					if (local188 < 0) {
						local188 = -local188;
					}
					for (@Pc(228) int local228 = local80; local228 < local96; local228++) {
						@Pc(241) int local241 = local207 + local197 * (local228 - local80) + 1024;
						@Pc(245) int local245 = Static571.anInt9405 & local228;
						@Pc(249) int local249 = local148 & Static360.anInt6375;
						if (local144) {
							local35[local249][local245] = local241;
						} else {
							local35[local245][local249] = local241;
						}
						local193 += local188;
						if (local193 > 0) {
							local193 -= local152;
							local148 += local218;
						}
					}
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		Static61.method1040();
	}
}
