import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class2_Sub4_Sub36 extends Class2_Sub4 {

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "[I")
	private int[] anIntArray594;

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "[I")
	private int[] anIntArray595;

	@OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
	private int anInt9203 = 10;

	@OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
	private int anInt9204 = 0;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	private int anInt9201 = 2048;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt9203 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt9201 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt9204 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	private void method7349() {
		@Pc(7) int local7 = 0;
		this.anIntArray595 = new int[this.anInt9203 + 1];
		this.anIntArray594 = new int[this.anInt9203 + 1];
		@Pc(26) int local26 = 4096 / this.anInt9203;
		@Pc(33) int local33 = local26 * this.anInt9201 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt9203; local35++) {
			this.anIntArray594[local35] = local7;
			this.anIntArray595[local35] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray594[this.anInt9203] = 4096;
		this.anIntArray595[this.anInt9203] = this.anIntArray595[0] + 4096;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		this.method7349();
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(26) int local26 = Static13.anIntArray418[arg0];
			@Pc(38) int local38;
			if (this.anInt9204 == 0) {
				@Pc(140) short local140 = 0;
				for (local38 = 0; local38 < this.anInt9203; local38++) {
					if (this.anIntArray594[local38] <= local26 && local26 < this.anIntArray594[local38 + 1]) {
						if (this.anIntArray595[local38] > local26) {
							local140 = 4096;
						}
						break;
					}
				}
				Static598.method4260(local18, 0, Static143.anInt7434, local140);
			} else {
				for (@Pc(34) int local34 = 0; local34 < Static143.anInt7434; local34++) {
					local38 = 0;
					@Pc(40) short local40 = 0;
					@Pc(44) int local44 = Static519.anIntArray155[local34];
					@Pc(47) int local47 = this.anInt9204;
					if (local47 == 1) {
						local38 = local44;
					} else if (local47 == 2) {
						local38 = (local44 + local26 - 4096 >> 1) + 2048;
					} else if (local47 == 3) {
						local38 = (local44 - local26 >> 1) + 2048;
					}
					for (local47 = 0; local47 < this.anInt9203; local47++) {
						if (local38 >= this.anIntArray594[local47] && local38 < this.anIntArray594[local47 + 1]) {
							if (this.anIntArray595[local47] > local38) {
								local40 = 4096;
							}
							break;
						}
					}
					local18[local34] = local40;
				}
			}
		}
		return local18;
	}
}
