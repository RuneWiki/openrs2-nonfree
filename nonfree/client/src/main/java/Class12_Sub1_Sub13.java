import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class12_Sub1_Sub13 extends Class12_Sub1 {

	@OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
	private int anInt3742 = 2048;

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
	private int anInt3741 = 2048;

	@OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
	private int anInt3751 = 0;

	@OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
	private int anInt3749 = 12288;

	@OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
	private int anInt3753 = 0;

	@OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
	private int anInt3754 = 4096;

	@OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
	private int anInt3752 = 8192;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3741 = arg0.method5199();
		} else if (arg1 == 1) {
			this.anInt3751 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt3753 = arg0.method5199();
		} else if (arg1 == 3) {
			this.anInt3742 = arg0.method5199();
		} else if (arg1 == 4) {
			this.anInt3749 = arg0.method5199();
		} else if (arg1 == 5) {
			this.anInt3754 = arg0.method5199();
		} else if (arg1 == 6) {
			this.anInt3752 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(III)Z")
	private boolean method3296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt3749 >> 12;
		@Pc(23) int local23 = Static95.anIntArray196[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt3749;
		@Pc(37) int local37 = (local30 << 12) / this.anInt3752;
		@Pc(44) int local44 = this.anInt3754 * local37 >> 12;
		return arg1 + arg0 < local44 && arg0 + arg1 > -local44;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(26) int local26 = Static353.anIntArray458[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static357.anInt6670; local28++) {
				@Pc(36) int local36 = Static347.anIntArray455[local28] - 2048;
				@Pc(41) int local41 = this.anInt3741 + local36;
				@Pc(52) int local52 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(63) int local63 = local52 > 2048 ? local52 - 4096 : local52;
				@Pc(68) int local68 = this.anInt3751 + local26;
				@Pc(79) int local79 = local68 < -2048 ? local68 + 4096 : local68;
				@Pc(90) int local90 = local79 > 2048 ? local79 - 4096 : local79;
				@Pc(96) int local96 = local36 + this.anInt3753;
				@Pc(107) int local107 = local96 >= -2048 ? local96 : local96 + 4096;
				@Pc(116) int local116 = local107 <= 2048 ? local107 : local107 - 4096;
				@Pc(122) int local122 = local26 + this.anInt3742;
				@Pc(131) int local131 = local122 < -2048 ? local122 + 4096 : local122;
				@Pc(140) int local140 = local131 > 2048 ? local131 - 4096 : local131;
				local16[local28] = this.method3296(local90, local63) || this.method3300(local140, local116) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		Static431.method6596();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZ)Z")
	private boolean method3300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt3749 * (arg1 + arg0) >> 12;
		@Pc(27) int local27 = Static95.anIntArray196[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt3749;
		@Pc(41) int local41 = (local34 << 12) / this.anInt3752;
		@Pc(48) int local48 = local41 * this.anInt3754 >> 12;
		return arg0 - arg1 < local48 && -local48 < arg0 - arg1;
	}
}
