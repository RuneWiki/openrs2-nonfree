import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
	private int anInt3152 = 20;

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
	private int anInt3154 = 0;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	private int anInt3153 = 0;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
	private int anInt3151 = 1365;

	static {
		new Class169("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt3151 = arg1.method5177();
		} else if (arg0 == 1) {
			this.anInt3152 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt3154 = arg1.method5177();
		} else if (arg0 == 3) {
			this.anInt3153 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			for (@Pc(22) int local22 = 0; local22 < Static158.anInt2658; local22++) {
				@Pc(36) int local36 = (Static87.anIntArray211[local22] << 12) / this.anInt3151 + this.anInt3154;
				@Pc(48) int local48 = this.anInt3153 + (Static394.anIntArray751[arg0] << 12) / this.anInt3151;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && local70 < this.anInt3152) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local70++;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local11[local22] = this.anInt3152 - 1 <= local70 ? 0 : (local70 << 12) / this.anInt3152;
			}
		}
		return local11;
	}
}
