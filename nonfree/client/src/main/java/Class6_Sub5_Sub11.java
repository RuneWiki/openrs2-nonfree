import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class6_Sub5_Sub11 extends Class6_Sub5 {

	@OriginalMember(owner = "client!fq", name = "R", descriptor = "I")
	private int anInt2491 = 0;

	@OriginalMember(owner = "client!fq", name = "N", descriptor = "I")
	private int anInt2487 = 20;

	@OriginalMember(owner = "client!fq", name = "Q", descriptor = "I")
	private int anInt2490 = 1365;

	@OriginalMember(owner = "client!fq", name = "S", descriptor = "I")
	private int anInt2492 = 0;

	static {
		new Class267("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt2490 = arg1.method6485();
		} else if (arg0 == 1) {
			this.anInt2487 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt2491 = arg1.method6485();
		} else if (arg0 == 3) {
			this.anInt2492 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			for (@Pc(22) int local22 = 0; local22 < Static240.anInt4386; local22++) {
				@Pc(36) int local36 = this.anInt2491 + (Static80.anIntArray117[local22] << 12) / this.anInt2490;
				@Pc(48) int local48 = this.anInt2492 + (Static247.anIntArray318[arg0] << 12) / this.anInt2490;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && this.anInt2487 > local70) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local62 + local36 - local68;
					local70++;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local11[local22] = this.anInt2487 - 1 <= local70 ? 0 : (local70 << 12) / this.anInt2487;
			}
		}
		return local11;
	}
}
