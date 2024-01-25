import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class149 {

	@OriginalMember(owner = "client!hba", name = "w", descriptor = "[I")
	public int[] anIntArray274;

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "I")
	public int anInt3737;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "[Z")
	public boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!hba", name = "B", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
	public int anInt3735 = -1;

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "I")
	public int anInt3739 = -1;

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
	public int anInt3742 = -1;

	@OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
	public int anInt3741 = 5;

	@OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
	public int anInt3743 = -1;

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "Z")
	public boolean aBoolean230 = false;

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
	public int anInt3736 = 2;

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "Z")
	public boolean aBoolean231 = false;

	@OriginalMember(owner = "client!hba", name = "A", descriptor = "I")
	public int anInt3745 = 99;

	@OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
	public int anInt3750 = -1;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "Z")
	public boolean aBoolean232 = false;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!ika;B)V")
	private void method3375(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		@Pc(100) int local100;
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(134) int local134;
		if (arg0 == 1) {
			local100 = arg1.method2028(-14795);
			this.anIntArray275 = new int[local100];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray275[local106] = arg1.method2028(-14795);
			}
			this.anIntArray274 = new int[local100];
			for (local112 = 0; local112 < local100; local112++) {
				this.anIntArray274[local112] = arg1.method2028(-14795);
			}
			for (local134 = 0; local134 < local100; local134++) {
				this.anIntArray274[local134] += arg1.method2028(-14795) << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3739 = arg1.method2028(-14795);
		} else if (arg0 == 3) {
			this.aBooleanArray7 = new boolean[256];
			local100 = arg1.method2048(255);
			for (local106 = 0; local106 < local100; local106++) {
				this.aBooleanArray7[arg1.method2048(255)] = true;
			}
		} else if (arg0 == 5) {
			this.anInt3741 = arg1.method2048(255);
		} else if (arg0 == 6) {
			this.anInt3735 = arg1.method2028(-14795);
		} else if (arg0 == 7) {
			this.anInt3743 = arg1.method2028(-14795);
		} else if (arg0 == 8) {
			this.anInt3745 = arg1.method2048(255);
		} else if (arg0 == 9) {
			this.anInt3742 = arg1.method2048(255);
		} else if (arg0 == 10) {
			this.anInt3750 = arg1.method2048(255);
		} else if (arg0 == 11) {
			this.anInt3736 = arg1.method2048(255);
		} else if (arg0 == 12) {
			local100 = arg1.method2048(255);
			this.anIntArray279 = new int[local100];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray279[local106] = arg1.method2028(-14795);
			}
			for (local112 = 0; local112 < local100; local112++) {
				this.anIntArray279[local112] += arg1.method2028(-14795) << 16;
			}
		} else if (arg0 == 13) {
			local100 = arg1.method2028(-14795);
			this.anIntArrayArray13 = new int[local100][];
			for (local106 = 0; local106 < local100; local106++) {
				local112 = arg1.method2048(255);
				if (local112 > 0) {
					this.anIntArrayArray13[local106] = new int[local112];
					this.anIntArrayArray13[local106][0] = arg1.method2061();
					for (local134 = 1; local134 < local112; local134++) {
						this.anIntArrayArray13[local106][local134] = arg1.method2028(-14795);
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean230 = true;
		} else if (arg0 == 15) {
			this.aBoolean232 = true;
		} else if (arg0 != 16) {
			if (arg0 == 18) {
				this.aBoolean231 = true;
			} else if (arg0 == 19) {
				if (this.anIntArray276 == null) {
					this.anIntArray276 = new int[this.anIntArrayArray13.length];
					for (local100 = 0; local100 < this.anIntArrayArray13.length; local100++) {
						this.anIntArray276[local100] = 255;
					}
				}
				this.anIntArray276[arg1.method2048(255)] = arg1.method2048(255);
			} else if (arg0 == 20) {
				if (this.anIntArray277 == null || this.anIntArray278 == null) {
					this.anIntArray277 = new int[this.anIntArrayArray13.length];
					this.anIntArray278 = new int[this.anIntArrayArray13.length];
					for (local100 = 0; local100 < this.anIntArrayArray13.length; local100++) {
						this.anIntArray277[local100] = 256;
						this.anIntArray278[local100] = 256;
					}
				}
				local100 = arg1.method2048(255);
				this.anIntArray277[local100] = arg1.method2028(-14795);
				this.anIntArray278[local100] = arg1.method2028(-14795);
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	public void method3376() {
		if (this.anInt3750 == -1) {
			if (this.aBooleanArray7 == null) {
				this.anInt3750 = 0;
			} else {
				this.anInt3750 = 2;
			}
		}
		if (this.anInt3742 != -1) {
			return;
		}
		if (this.aBooleanArray7 == null) {
			this.anInt3742 = 0;
		} else {
			this.anInt3742 = 2;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method3377(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2048(255);
			if (local11 == 0) {
				return;
			}
			this.method3375(local11, arg0);
		}
	}
}
