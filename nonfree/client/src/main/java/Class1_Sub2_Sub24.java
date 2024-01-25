import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "[I")
	public static final int[] anIntArray462 = new int[4096];

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
	private int anInt3895 = 0;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
	private int anInt3901 = 1;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
	private int anInt3896 = 0;

	static {
		for (@Pc(25) int local25 = 0; local25 < 4096; local25++) {
			anIntArray462[local25] = Static7.method243(local25);
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		Static244.method4324();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3896 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt3895 = arg1.method3141();
		} else if (arg0 == 3) {
			this.anInt3901 = arg1.method3141();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(24) int local24 = Static66.anIntArray158[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static251.anInt6509; local32++) {
				@Pc(38) int local38 = Static7.anIntArray23[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(68) int local68;
				if (this.anInt3896 == 0) {
					local68 = (local38 - local24) * this.anInt3901;
				} else {
					@Pc(58) int local58 = local44 * local44 + local30 * local30 >> 12;
					local68 = (int) (Math.sqrt((double) ((float) local58 / 4096.0F)) * 4096.0D);
					local68 = (int) ((double) (this.anInt3901 * local68) * 3.141592653589793D);
				}
				local68 -= local68 & 0xFFFFF000;
				if (this.anInt3895 == 0) {
					local68 = Static119.anIntArray251[local68 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3895 == 2) {
					local68 -= 2048;
					if (local68 < 0) {
						local68 = -local68;
					}
					local68 = 2048 - local68 << 1;
				}
				local16[local32] = local68;
			}
		}
		return local16;
	}
}
