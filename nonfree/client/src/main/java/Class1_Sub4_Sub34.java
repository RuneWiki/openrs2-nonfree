import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class1_Sub4_Sub34 extends Class1_Sub4 {

	@OriginalMember(owner = "client!sn", name = "I", descriptor = "[I")
	private int[] anIntArray419;

	@OriginalMember(owner = "client!sn", name = "U", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!sn", name = "K", descriptor = "I")
	private int anInt4767 = 2048;

	@OriginalMember(owner = "client!sn", name = "P", descriptor = "I")
	private int anInt4770 = 0;

	@OriginalMember(owner = "client!sn", name = "O", descriptor = "I")
	private int anInt4769 = 10;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		this.method4143();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4769 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt4767 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anInt4770 = arg0.method1378();
		}
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(B)V")
	private void method4143() {
		this.anIntArray419 = new int[this.anInt4769 + 1];
		this.anIntArray420 = new int[this.anInt4769 + 1];
		@Pc(28) int local28 = 0;
		@Pc(33) int local33 = 4096 / this.anInt4769;
		@Pc(40) int local40 = this.anInt4767 * local33 >> 12;
		for (@Pc(42) int local42 = 0; local42 < this.anInt4769; local42++) {
			this.anIntArray419[local42] = local28;
			this.anIntArray420[local42] = local40 + local28;
			local28 += local33;
		}
		this.anIntArray419[this.anInt4769] = 4096;
		this.anIntArray420[this.anInt4769] = this.anIntArray420[0] + 4096;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(21) int local21 = Static250.anIntArray398[arg0];
			@Pc(29) int local29;
			if (this.anInt4770 == 0) {
				@Pc(27) short local27 = 0;
				for (local29 = 0; local29 < this.anInt4769; local29++) {
					if (local21 >= this.anIntArray419[local29] && local21 < this.anIntArray419[local29 + 1]) {
						if (local21 < this.anIntArray420[local29]) {
							local27 = 4096;
						}
						break;
					}
				}
				Static319.method1765(local13, 0, Static182.anInt3492, local27);
			} else {
				for (@Pc(83) int local83 = 0; local83 < Static182.anInt3492; local83++) {
					@Pc(94) int local94 = Static279.anIntArray454[local83];
					local29 = 0;
					@Pc(99) int local99 = this.anInt4770;
					if (local99 == 1) {
						local29 = local94;
					} else if (local99 == 2) {
						local29 = (local21 + local94 - 4096 >> 1) + 2048;
					} else if (local99 == 3) {
						local29 = (local94 - local21 >> 1) + 2048;
					}
					@Pc(144) short local144 = 0;
					for (local99 = 0; local99 < this.anInt4769; local99++) {
						if (this.anIntArray419[local99] <= local29 && local29 < this.anIntArray419[local99 + 1]) {
							if (local29 < this.anIntArray420[local99]) {
								local144 = 4096;
							}
							break;
						}
					}
					local13[local83] = local144;
				}
			}
		}
		return local13;
	}
}
