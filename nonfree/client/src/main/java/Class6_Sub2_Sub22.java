import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class6_Sub2_Sub22 extends Class6_Sub2 {

	@OriginalMember(owner = "client!mk", name = "N", descriptor = "[I")
	public static final int[] anIntArray382;

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
	private int anInt4185 = 0;

	@OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
	private int anInt4183 = 1;

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
	private int anInt4188 = 0;

	static {
		new Class231("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
		anIntArray382 = new int[99];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 99; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) ((double) local17 + Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D);
			local10 += local30;
			anIntArray382[local12] = local10 / 4;
		}
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(19) int local19 = Static168.anIntArray278[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static185.anInt4925; local27++) {
				@Pc(33) int local33 = Static53.anIntArray95[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(62) int local62;
				if (this.anInt4185 == 0) {
					local62 = (local33 - local19) * this.anInt4183;
				} else {
					@Pc(52) int local52 = local39 * local39 + local25 * local25 >> 12;
					local62 = (int) (Math.sqrt((double) ((float) local52 / 4096.0F)) * 4096.0D);
					local62 = (int) ((double) (local62 * this.anInt4183) * 3.141592653589793D);
				}
				local62 -= local62 & 0xFFFFF000;
				if (this.anInt4188 == 0) {
					local62 = Static148.anIntArray260[local62 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4188 == 2) {
					local62 -= 2048;
					if (local62 < 0) {
						local62 = -local62;
					}
					local62 = 2048 - local62 << 1;
				}
				local11[local27] = local62;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		Static172.method2738();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4185 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt4188 = arg0.method3111();
		} else if (arg1 == 3) {
			this.anInt4183 = arg0.method3111();
		}
	}
}
