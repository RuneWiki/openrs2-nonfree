import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class26 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "[I")
	public int[] anIntArray47;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "[Z")
	public boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
	public int[] anIntArray50;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public int anInt768 = 5;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
	public int anInt769 = -1;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
	public int anInt770 = -1;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Z")
	public boolean aBoolean59 = false;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	public int anInt771 = 99;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	public int anInt767 = 2;

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
	public int anInt775 = -1;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
	public int anInt776 = -1;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
	public int anInt778 = -1;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!rba;I)V")
	private void method608(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42;
		@Pc(44) int local44;
		@Pc(158) int local158;
		@Pc(380) int local380;
		if (arg1 == 1) {
			local42 = arg0.method5272();
			this.anIntArray52 = new int[local42];
			for (local44 = 0; local44 < local42; local44++) {
				this.anIntArray52[local44] = arg0.method5272();
			}
			this.anIntArray50 = new int[local42];
			for (local158 = 0; local158 < local42; local158++) {
				this.anIntArray50[local158] = arg0.method5272();
			}
			for (local380 = 0; local380 < local42; local380++) {
				this.anIntArray50[local380] = (arg0.method5272() << 16) + this.anIntArray50[local380];
			}
		} else if (arg1 == 2) {
			this.anInt776 = arg0.method5272();
		} else if (arg1 == 3) {
			this.aBooleanArray1 = new boolean[256];
			local42 = arg0.method5322(-15);
			for (local44 = 0; local44 < local42; local44++) {
				this.aBooleanArray1[arg0.method5322(-120)] = true;
			}
		} else if (arg1 == 5) {
			this.anInt768 = arg0.method5322(-67);
		} else if (arg1 == 6) {
			this.anInt775 = arg0.method5272();
		} else if (arg1 == 7) {
			this.anInt769 = arg0.method5272();
		} else if (arg1 == 8) {
			this.anInt771 = arg0.method5322(-43);
		} else if (arg1 == 9) {
			this.anInt778 = arg0.method5322(-56);
		} else if (arg1 == 10) {
			this.anInt770 = arg0.method5322(-13);
		} else if (arg1 == 11) {
			this.anInt767 = arg0.method5322(-78);
		} else if (arg1 == 12) {
			local42 = arg0.method5322(-100);
			this.anIntArray51 = new int[local42];
			for (local44 = 0; local44 < local42; local44++) {
				this.anIntArray51[local44] = arg0.method5272();
			}
			for (local158 = 0; local158 < local42; local158++) {
				this.anIntArray51[local158] += arg0.method5272() << 16;
			}
		} else if (arg1 == 13) {
			local42 = arg0.method5272();
			this.anIntArrayArray4 = new int[local42][];
			for (local44 = 0; local44 < local42; local44++) {
				local158 = arg0.method5322(-13);
				if (local158 > 0) {
					this.anIntArrayArray4[local44] = new int[local158];
					this.anIntArrayArray4[local44][0] = arg0.method5307();
					for (local380 = 1; local380 < local158; local380++) {
						this.anIntArrayArray4[local44][local380] = arg0.method5272();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean61 = true;
		} else if (arg1 == 15) {
			this.aBoolean60 = true;
		} else if (arg1 != 16) {
			if (arg1 == 18) {
				this.aBoolean59 = true;
				return;
			}
			if (arg1 == 19) {
				if (this.anIntArray48 == null) {
					this.anIntArray48 = new int[this.anIntArrayArray4.length];
					for (local42 = 0; local42 < this.anIntArrayArray4.length; local42++) {
						this.anIntArray48[local42] = 255;
					}
				}
				this.anIntArray48[arg0.method5322(-39)] = arg0.method5322(-56);
				return;
			}
			if (arg1 == 20) {
				if (this.anIntArray49 == null || this.anIntArray47 == null) {
					this.anIntArray49 = new int[this.anIntArrayArray4.length];
					this.anIntArray47 = new int[this.anIntArrayArray4.length];
					for (local42 = 0; local42 < this.anIntArrayArray4.length; local42++) {
						this.anIntArray49[local42] = 256;
						this.anIntArray47[local42] = 256;
					}
				}
				local42 = arg0.method5322(-126);
				this.anIntArray49[local42] = arg0.method5272();
				this.anIntArray47[local42] = arg0.method5272();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public void method609() {
		if (this.anInt770 == -1) {
			if (this.aBooleanArray1 == null) {
				this.anInt770 = 0;
			} else {
				this.anInt770 = 2;
			}
		}
		if (this.anInt778 != -1) {
			return;
		}
		if (this.aBooleanArray1 == null) {
			this.anInt778 = 0;
		} else {
			this.anInt778 = 2;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method611(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-54);
			if (local5 == 0) {
				return;
			}
			this.method608(arg0, local5);
		}
	}
}
