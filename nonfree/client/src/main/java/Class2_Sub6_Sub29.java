import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub6_Sub29 extends Class2_Sub6 {

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "[I")
	private int[] anIntArray599;

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "[I")
	private int[] anIntArray600;

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
	private int anInt8844 = 10;

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
	private int anInt8841 = 2048;

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
	private int anInt8845 = 0;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
	private void method7445() {
		this.anIntArray600 = new int[this.anInt8844 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray599 = new int[this.anInt8844 + 1];
		@Pc(26) int local26 = 4096 / this.anInt8844;
		@Pc(33) int local33 = this.anInt8841 * local26 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt8844; local39++) {
			this.anIntArray599[local39] = local14;
			this.anIntArray600[local39] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray599[this.anInt8844] = 4096;
		this.anIntArray600[this.anInt8844] = this.anIntArray600[0] + 4096;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		this.method7445();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(19) int local19 = Static564.anIntArray630[arg0];
			@Pc(29) int local29;
			if (this.anInt8845 == 0) {
				@Pc(27) short local27 = 0;
				for (local29 = 0; local29 < this.anInt8844; local29++) {
					if (local19 >= this.anIntArray599[local29] && this.anIntArray599[local29 + 1] > local19) {
						if (local19 < this.anIntArray600[local29]) {
							local27 = 4096;
						}
						break;
					}
				}
				Static653.method5393(local11, 0, Static51.anInt1085, local27);
			} else {
				for (@Pc(81) int local81 = 0; local81 < Static51.anInt1085; local81++) {
					local29 = 0;
					@Pc(87) short local87 = 0;
					@Pc(91) int local91 = Static586.anIntArray653[local81];
					@Pc(94) int local94 = this.anInt8845;
					if (local94 == 1) {
						local29 = local91;
					} else if (local94 == 2) {
						local29 = (local91 + local19 - 4096 >> 1) + 2048;
					} else if (local94 == 3) {
						local29 = (local91 - local19 >> 1) + 2048;
					}
					for (local94 = 0; local94 < this.anInt8844; local94++) {
						if (this.anIntArray599[local94] <= local29 && local29 < this.anIntArray599[local94 + 1]) {
							if (local29 < this.anIntArray600[local94]) {
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

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt8844 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt8841 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt8845 = arg1.method8547();
		}
	}
}
