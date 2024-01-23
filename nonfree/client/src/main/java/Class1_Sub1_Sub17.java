import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jg", name = "ab", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!jg", name = "db", descriptor = "[I")
	private int[] anIntArray292;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
	private int anInt2407 = 0;

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
	private int anInt2414 = 10;

	@OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
	private int anInt2418 = 2048;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		this.method1945();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(28) int local28 = Static219.anIntArray515[arg0];
			@Pc(40) int local40;
			if (this.anInt2407 == 0) {
				@Pc(148) short local148 = 0;
				for (local40 = 0; local40 < this.anInt2414; local40++) {
					if (local28 >= this.anIntArray291[local40] && this.anIntArray291[local40 + 1] > local28) {
						if (this.anIntArray292[local40] > local28) {
							local148 = 4096;
						}
						break;
					}
				}
				Static300.method487(local20, 0, Static131.anInt2513, local148);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static131.anInt2513; local33++) {
					@Pc(38) short local38 = 0;
					local40 = 0;
					@Pc(44) int local44 = Static105.anIntArray261[local33];
					@Pc(47) int local47 = this.anInt2407;
					if (local47 == 1) {
						local40 = local44;
					} else if (local47 == 2) {
						local40 = (local44 + local28 - 4096 >> 1) + 2048;
					} else if (local47 == 3) {
						local40 = (local44 - local28 >> 1) + 2048;
					}
					for (local47 = 0; local47 < this.anInt2414; local47++) {
						if (this.anIntArray291[local47] <= local40 && local40 < this.anIntArray291[local47 + 1]) {
							if (this.anIntArray292[local47] > local40) {
								local38 = 4096;
							}
							break;
						}
					}
					local20[local33] = local38;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2414 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt2418 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt2407 = arg0.method3122();
		}
	}

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "(I)V")
	private void method1945() {
		this.anIntArray292 = new int[this.anInt2414 + 1];
		this.anIntArray291 = new int[this.anInt2414 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2414;
		@Pc(33) int local33 = local26 * this.anInt2418 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2414; local35++) {
			this.anIntArray291[local35] = local21;
			this.anIntArray292[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray291[this.anInt2414] = 4096;
		this.anIntArray292[this.anInt2414] = this.anIntArray292[0] + 4096;
	}
}
