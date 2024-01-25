import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class3_Sub8_Sub6 extends Class3_Sub8 {

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
	private int anInt3132 = 0;

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
	private int anInt3134 = 1;

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
	private int anInt3135 = 0;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3132 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt3135 = arg1.method7954();
		} else if (arg0 == 3) {
			this.anInt3134 = arg1.method7954();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(25) int local25 = Static510.anIntArray172[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static91.anInt1849; local33++) {
				@Pc(39) int local39 = Static13.anIntArray11[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(59) int local59;
				if (this.anInt3132 == 0) {
					local59 = this.anInt3134 * (local39 - local25);
				} else {
					@Pc(71) int local71 = local31 * local31 + local45 * local45 >> 12;
					local59 = (int) (Math.sqrt((double) ((float) local71 / 4096.0F)) * 4096.0D);
					local59 = (int) ((double) (local59 * this.anInt3134) * 3.141592653589793D);
				}
				local59 -= local59 & 0xFFFFF000;
				if (this.anInt3135 == 0) {
					local59 = Static235.anIntArray250[local59 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3135 == 2) {
					local59 -= 2048;
					if (local59 < 0) {
						local59 = -local59;
					}
					local59 = 2048 - local59 << 1;
				}
				local17[local33] = local59;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		Static427.method5897();
	}
}
