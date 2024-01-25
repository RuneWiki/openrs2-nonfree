import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class4_Sub6_Sub17 extends Class4_Sub6 {

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
	private int anInt3661 = 0;

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
	private int anInt3659 = 0;

	@OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
	private int anInt3666 = 1;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(24) int local24 = Static128.anIntArray265[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static31.anInt797; local32++) {
				@Pc(38) int local38 = Static339.anIntArray4[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt3659 == 0) {
					local55 = this.anInt3666 * (local38 - local24);
				} else {
					@Pc(67) int local67 = local30 * local30 + local44 * local44 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (this.anInt3666 * local55) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt3661 == 0) {
					local55 = Static7.anIntArray5[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3661 == 2) {
					local55 -= 2048;
					if (local55 < 0) {
						local55 = -local55;
					}
					local55 = 2048 - local55 << 1;
				}
				local16[local32] = local55;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3659 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt3661 = arg1.method3440();
		} else if (arg0 == 3) {
			this.anInt3666 = arg1.method3440();
		}
	}

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		Static147.method2993();
	}
}
