import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class6_Sub5_Sub25 extends Class6_Sub5 {

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	private int anInt5328 = 10;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
	private int anInt5329 = 0;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
	private int anInt5334 = 2048;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		this.method4448();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)V")
	private void method4448() {
		@Pc(7) int local7 = 0;
		this.anIntArray359 = new int[this.anInt5328 + 1];
		this.anIntArray360 = new int[this.anInt5328 + 1];
		@Pc(26) int local26 = 4096 / this.anInt5328;
		@Pc(33) int local33 = local26 * this.anInt5334 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt5328; local35++) {
			this.anIntArray359[local35] = local7;
			this.anIntArray360[local35] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray359[this.anInt5328] = 4096;
		this.anIntArray360[this.anInt5328] = this.anIntArray360[0] + 4096;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt5328 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt5334 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt5329 = arg1.method6433();
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(19) int local19 = Static247.anIntArray318[arg0];
			@Pc(31) int local31;
			if (this.anInt5329 == 0) {
				@Pc(134) short local134 = 0;
				for (local31 = 0; local31 < this.anInt5328; local31++) {
					if (this.anIntArray359[local31] <= local19 && this.anIntArray359[local31 + 1] > local19) {
						if (local19 < this.anIntArray360[local31]) {
							local134 = 4096;
						}
						break;
					}
				}
				Static459.method6344(local11, 0, Static240.anInt4386, local134);
			} else {
				for (@Pc(27) int local27 = 0; local27 < Static240.anInt4386; local27++) {
					local31 = 0;
					@Pc(33) short local33 = 0;
					@Pc(37) int local37 = Static80.anIntArray117[local27];
					@Pc(40) int local40 = this.anInt5329;
					if (local40 == 1) {
						local31 = local37;
					} else if (local40 == 2) {
						local31 = (local37 + local19 - 4096 >> 1) + 2048;
					} else if (local40 == 3) {
						local31 = (local37 - local19 >> 1) + 2048;
					}
					for (local40 = 0; local40 < this.anInt5328; local40++) {
						if (this.anIntArray359[local40] <= local31 && local31 < this.anIntArray359[local40 + 1]) {
							if (this.anIntArray360[local40] > local31) {
								local33 = 4096;
							}
							break;
						}
					}
					local11[local27] = local33;
				}
			}
		}
		return local11;
	}
}
