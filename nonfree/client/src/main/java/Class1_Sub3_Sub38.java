import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class1_Sub3_Sub38 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "[I")
	private int[] anIntArray815;

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "[I")
	private int[] anIntArray816;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
	private int anInt9350 = 0;

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
	private int anInt9355 = 2048;

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
	private int anInt9354 = 10;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt9354 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt9355 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt9350 = arg1.method4487();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	private void method8083() {
		this.anIntArray816 = new int[this.anInt9354 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray815 = new int[this.anInt9354 + 1];
		@Pc(26) int local26 = 4096 / this.anInt9354;
		@Pc(33) int local33 = local26 * this.anInt9355 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt9354; local35++) {
			this.anIntArray816[local35] = local14;
			this.anIntArray815[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray816[this.anInt9354] = 4096;
		this.anIntArray815[this.anInt9354] = this.anIntArray815[0] + 4096;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		this.method8083();
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(25) int local25 = Static392.anIntArray673[arg0];
			@Pc(37) int local37;
			if (this.anInt9350 == 0) {
				@Pc(136) short local136 = 0;
				for (local37 = 0; local37 < this.anInt9354; local37++) {
					if (this.anIntArray816[local37] <= local25 && local25 < this.anIntArray816[local37 + 1]) {
						if (this.anIntArray815[local37] > local25) {
							local136 = 4096;
						}
						break;
					}
				}
				Static556.method7040(local17, 0, Static254.anInt4973, local136);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static254.anInt4973; local33++) {
					local37 = 0;
					@Pc(39) short local39 = 0;
					@Pc(43) int local43 = Static457.anIntArray732[local33];
					@Pc(46) int local46 = this.anInt9350;
					if (local46 == 1) {
						local37 = local43;
					} else if (local46 == 2) {
						local37 = (local43 + local25 - 4096 >> 1) + 2048;
					} else if (local46 == 3) {
						local37 = (local43 - local25 >> 1) + 2048;
					}
					for (local46 = 0; local46 < this.anInt9354; local46++) {
						if (local37 >= this.anIntArray816[local46] && local37 < this.anIntArray816[local46 + 1]) {
							if (local37 < this.anIntArray815[local46]) {
								local39 = 4096;
							}
							break;
						}
					}
					local17[local33] = local39;
				}
			}
		}
		return local17;
	}
}
