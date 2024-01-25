import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class259 {

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "[I")
	public int[] anIntArray370;

	@OriginalMember(owner = "client!nw", name = "y", descriptor = "[I")
	public int[] anIntArray371;

	@OriginalMember(owner = "client!nw", name = "m", descriptor = "[I")
	public int[] anIntArray372;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "[Z")
	public boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "I")
	public int anInt7197;

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!nw", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!nw", name = "v", descriptor = "I")
	public int anInt7192 = -1;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
	public int anInt7194 = 2;

	@OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
	public int anInt7191 = -1;

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "I")
	public int anInt7193 = -1;

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
	public int anInt7201 = 5;

	@OriginalMember(owner = "client!nw", name = "x", descriptor = "I")
	public int anInt7202 = -1;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "Z")
	public boolean aBoolean504 = false;

	@OriginalMember(owner = "client!nw", name = "A", descriptor = "Z")
	public boolean aBoolean503 = false;

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
	public int anInt7204 = 99;

	@OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
	public int anInt7195 = -1;

	@OriginalMember(owner = "client!nw", name = "p", descriptor = "Z")
	public boolean aBoolean505 = false;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!jc;)V")
	public void method6296(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7695(106);
			if (local15 == 0) {
				return;
			}
			this.method6297(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method6297(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		@Pc(30) int local30;
		@Pc(50) int local50;
		if (arg0 == 1) {
			local6 = arg1.method7717(-1978450544);
			this.anIntArray370 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray370[local12] = arg1.method7717(-1978450544);
			}
			this.anIntArray376 = new int[local6];
			for (local30 = 0; local30 < local6; local30++) {
				this.anIntArray376[local30] = arg1.method7717(-1978450544);
			}
			for (local50 = 0; local50 < local6; local50++) {
				this.anIntArray376[local50] += arg1.method7717(-1978450544) << 16;
			}
		} else if (arg0 == 2) {
			this.anInt7193 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.aBooleanArray18 = new boolean[256];
			local6 = arg1.method7695(117);
			for (local12 = 0; local12 < local6; local12++) {
				this.aBooleanArray18[arg1.method7695(96)] = true;
			}
		} else if (arg0 == 5) {
			this.anInt7201 = arg1.method7695(125);
		} else if (arg0 == 6) {
			this.anInt7195 = arg1.method7717(-1978450544);
		} else if (arg0 == 7) {
			this.anInt7202 = arg1.method7717(-1978450544);
		} else if (arg0 == 8) {
			this.anInt7204 = arg1.method7695(101);
		} else if (arg0 == 9) {
			this.anInt7192 = arg1.method7695(104);
		} else if (arg0 == 10) {
			this.anInt7191 = arg1.method7695(112);
		} else if (arg0 == 11) {
			this.anInt7194 = arg1.method7695(112);
		} else if (arg0 == 12) {
			local6 = arg1.method7695(95);
			this.anIntArray371 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray371[local12] = arg1.method7717(-1978450544);
			}
			for (local30 = 0; local30 < local6; local30++) {
				this.anIntArray371[local30] = (arg1.method7717(-1978450544) << 16) + this.anIntArray371[local30];
			}
		} else if (arg0 == 13) {
			local6 = arg1.method7717(-1978450544);
			this.anIntArrayArray51 = new int[local6][];
			for (local12 = 0; local12 < local6; local12++) {
				local30 = arg1.method7695(119);
				if (local30 > 0) {
					this.anIntArrayArray51[local12] = new int[local30];
					this.anIntArrayArray51[local12][0] = arg1.method7719();
					for (local50 = 1; local50 < local30; local50++) {
						this.anIntArrayArray51[local12][local50] = arg1.method7717(-1978450544);
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean504 = true;
		} else if (arg0 == 15) {
			this.aBoolean503 = true;
		} else if (arg0 != 16) {
			if (arg0 == 18) {
				this.aBoolean505 = true;
			} else if (arg0 == 19) {
				if (this.anIntArray372 == null) {
					this.anIntArray372 = new int[this.anIntArrayArray51.length];
					for (local6 = 0; local6 < this.anIntArrayArray51.length; local6++) {
						this.anIntArray372[local6] = 255;
					}
				}
				this.anIntArray372[arg1.method7695(109)] = arg1.method7695(101);
			} else if (arg0 == 20) {
				if (this.anIntArray375 == null || this.anIntArray374 == null) {
					this.anIntArray375 = new int[this.anIntArrayArray51.length];
					this.anIntArray374 = new int[this.anIntArrayArray51.length];
					for (local6 = 0; local6 < this.anIntArrayArray51.length; local6++) {
						this.anIntArray375[local6] = 256;
						this.anIntArray374[local6] = 256;
					}
				}
				local6 = arg1.method7695(99);
				this.anIntArray375[local6] = arg1.method7717(-1978450544);
				this.anIntArray374[local6] = arg1.method7717(-1978450544);
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
	public void method6298() {
		if (this.anInt7192 == -1) {
			if (this.aBooleanArray18 == null) {
				this.anInt7192 = 0;
			} else {
				this.anInt7192 = 2;
			}
		}
		if (this.anInt7191 != -1) {
			return;
		}
		if (this.aBooleanArray18 == null) {
			this.anInt7191 = 0;
		} else {
			this.anInt7191 = 2;
		}
	}
}
