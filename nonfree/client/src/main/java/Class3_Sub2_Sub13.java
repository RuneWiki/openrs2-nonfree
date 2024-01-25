import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kfa", name = "z", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!kfa", name = "G", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!kfa", name = "B", descriptor = "I")
	private int anInt5550 = 10;

	@OriginalMember(owner = "client!kfa", name = "y", descriptor = "I")
	private int anInt5548 = 2048;

	@OriginalMember(owner = "client!kfa", name = "H", descriptor = "I")
	private int anInt5554 = 0;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5550 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt5548 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt5554 = arg0.method4888();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		this.method4691();
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(B)V")
	private void method4691() {
		@Pc(7) int local7 = 0;
		this.anIntArray360 = new int[this.anInt5550 + 1];
		this.anIntArray359 = new int[this.anInt5550 + 1];
		@Pc(26) int local26 = 4096 / this.anInt5550;
		@Pc(37) int local37 = local26 * this.anInt5548 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt5550; local39++) {
			this.anIntArray360[local39] = local7;
			this.anIntArray359[local39] = local7 + local37;
			local7 += local26;
		}
		this.anIntArray360[this.anInt5550] = 4096;
		this.anIntArray359[this.anInt5550] = this.anIntArray359[0] + 4096;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(25) int local25 = Static201.anIntArray251[arg0];
			@Pc(37) int local37;
			if (this.anInt5554 == 0) {
				@Pc(139) short local139 = 0;
				for (local37 = 0; local37 < this.anInt5550; local37++) {
					if (this.anIntArray360[local37] <= local25 && this.anIntArray360[local37 + 1] > local25) {
						if (local25 < this.anIntArray359[local37]) {
							local139 = 4096;
						}
						break;
					}
				}
				Static689.method8056(local17, 0, Static30.anInt908, local139);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static30.anInt908; local33++) {
					local37 = 0;
					@Pc(39) short local39 = 0;
					@Pc(43) int local43 = Static26.anIntArray20[local33];
					@Pc(46) int local46 = this.anInt5554;
					if (local46 == 1) {
						local37 = local43;
					} else if (local46 == 2) {
						local37 = (local43 + local25 - 4096 >> 1) + 2048;
					} else if (local46 == 3) {
						local37 = (local43 - local25 >> 1) + 2048;
					}
					for (local46 = 0; local46 < this.anInt5550; local46++) {
						if (local37 >= this.anIntArray360[local46] && this.anIntArray360[local46 + 1] > local37) {
							if (this.anIntArray359[local46] > local37) {
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
