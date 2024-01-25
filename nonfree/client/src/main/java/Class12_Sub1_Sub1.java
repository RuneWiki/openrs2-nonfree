import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class12_Sub1_Sub1 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
	private int anInt215 = 10;

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
	private int anInt222 = 0;

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
	private int anInt220 = 2048;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt215 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt220 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt222 = arg0.method5216();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(25) int local25 = Static353.anIntArray458[arg0];
			@Pc(37) int local37;
			if (this.anInt222 == 0) {
				@Pc(143) short local143 = 0;
				for (local37 = 0; local37 < this.anInt215; local37++) {
					if (this.anIntArray17[local37] <= local25 && this.anIntArray17[local37 + 1] > local25) {
						if (this.anIntArray18[local37] > local25) {
							local143 = 4096;
						}
						break;
					}
				}
				Static554.method3495(local13, 0, Static357.anInt6670, local143);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static357.anInt6670; local33++) {
					local37 = 0;
					@Pc(39) short local39 = 0;
					@Pc(43) int local43 = Static347.anIntArray455[local33];
					@Pc(46) int local46 = this.anInt222;
					if (local46 == 1) {
						local37 = local43;
					} else if (local46 == 2) {
						local37 = (local43 + local25 - 4096 >> 1) + 2048;
					} else if (local46 == 3) {
						local37 = (local43 - local25 >> 1) + 2048;
					}
					for (local46 = 0; local46 < this.anInt215; local46++) {
						if (local37 >= this.anIntArray17[local46] && this.anIntArray17[local46 + 1] > local37) {
							if (this.anIntArray18[local46] > local37) {
								local39 = 4096;
							}
							break;
						}
					}
					local13[local33] = local39;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
	private void method350() {
		this.anIntArray17 = new int[this.anInt215 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray18 = new int[this.anInt215 + 1];
		@Pc(26) int local26 = 4096 / this.anInt215;
		@Pc(33) int local33 = this.anInt220 * local26 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt215; local41++) {
			this.anIntArray17[local41] = local14;
			this.anIntArray18[local41] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray17[this.anInt215] = 4096;
		this.anIntArray18[this.anInt215] = this.anIntArray18[0] + 4096;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		this.method350();
	}
}
