import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class6_Sub1_Sub23 extends Class6_Sub1 {

	@OriginalMember(owner = "client!nu", name = "E", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!nu", name = "I", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
	private int anInt7280 = 0;

	@OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
	private int anInt7281 = 10;

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
	private int anInt7273 = 2048;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		this.method6080();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7281 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt7273 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt7280 = arg1.method8246();
		}
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(B)V")
	private void method6080() {
		this.anIntArray349 = new int[this.anInt7281 + 1];
		this.anIntArray350 = new int[this.anInt7281 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt7281;
		@Pc(33) int local33 = local26 * this.anInt7273 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt7281; local35++) {
			this.anIntArray350[local35] = local21;
			this.anIntArray349[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray350[this.anInt7281] = 4096;
		this.anIntArray349[this.anInt7281] = this.anIntArray349[0] + 4096;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(19) int local19 = Static603.anIntArray549[arg0];
			@Pc(29) int local29;
			if (this.anInt7280 == 0) {
				@Pc(27) short local27 = 0;
				for (local29 = 0; local29 < this.anInt7281; local29++) {
					if (local19 >= this.anIntArray350[local29] && this.anIntArray350[local29 + 1] > local19) {
						if (this.anIntArray349[local29] > local19) {
							local27 = 4096;
						}
						break;
					}
				}
				Static653.method6539(local11, 0, Static53.anInt1787, local27);
			} else {
				for (@Pc(81) int local81 = 0; local81 < Static53.anInt1787; local81++) {
					local29 = 0;
					@Pc(87) short local87 = 0;
					@Pc(91) int local91 = Static12.anIntArray15[local81];
					@Pc(94) int local94 = this.anInt7280;
					if (local94 == 1) {
						local29 = local91;
					} else if (local94 == 2) {
						local29 = (local91 + local19 - 4096 >> 1) + 2048;
					} else if (local94 == 3) {
						local29 = (local91 - local19 >> 1) + 2048;
					}
					for (local94 = 0; local94 < this.anInt7281; local94++) {
						if (this.anIntArray350[local94] <= local29 && this.anIntArray350[local94 + 1] > local29) {
							if (this.anIntArray349[local94] > local29) {
								local87 = 4096;
							}
							break;
						}
					}
					local11[local81] = local87;
				}
			}
		}
		return local11;
	}
}
