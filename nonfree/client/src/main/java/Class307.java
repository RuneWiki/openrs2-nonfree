import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class307 {

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "[I")
	public int[] anIntArray580;

	@OriginalMember(owner = "client!qea", name = "o", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
	public int anInt8126;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "[I")
	public int[] anIntArray583;

	@OriginalMember(owner = "client!qea", name = "z", descriptor = "[Z")
	public boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!qea", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "[I")
	public int[] anIntArray584;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "[I")
	public int[] anIntArray585;

	@OriginalMember(owner = "client!qea", name = "w", descriptor = "I")
	public int anInt8121 = -1;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
	public int anInt8120 = 2;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
	public int anInt8129 = 99;

	@OriginalMember(owner = "client!qea", name = "C", descriptor = "I")
	public int anInt8130 = -1;

	@OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
	public int anInt8124 = 5;

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
	public int anInt8132 = -1;

	@OriginalMember(owner = "client!qea", name = "E", descriptor = "I")
	public int anInt8123 = -1;

	@OriginalMember(owner = "client!qea", name = "A", descriptor = "Z")
	public boolean aBoolean701 = false;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "Z")
	public boolean aBoolean702 = false;

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Z")
	public boolean aBoolean700 = false;

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "I")
	public int anInt8134 = -1;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
	public void method7244() {
		if (this.anInt8130 == -1) {
			if (this.aBooleanArray32 == null) {
				this.anInt8130 = 0;
			} else {
				this.anInt8130 = 2;
			}
		}
		if (this.anInt8123 != -1) {
			return;
		}
		if (this.aBooleanArray32 == null) {
			this.anInt8123 = 0;
		} else {
			this.anInt8123 = 2;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!et;IZ)V")
	private void method7245(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(37) int local37;
		@Pc(56) int local56;
		if (arg1 == 1) {
			local10 = arg0.method8575();
			this.anIntArray582 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray582[local16] = arg0.method8575();
			}
			this.anIntArray580 = new int[local10];
			for (local37 = 0; local37 < local10; local37++) {
				this.anIntArray580[local37] = arg0.method8575();
			}
			for (local56 = 0; local56 < local10; local56++) {
				this.anIntArray580[local56] += arg0.method8575() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt8132 = arg0.method8575();
		} else if (arg1 == 3) {
			this.aBooleanArray32 = new boolean[256];
			local10 = arg0.method8581(-17416);
			for (local16 = 0; local16 < local10; local16++) {
				this.aBooleanArray32[arg0.method8581(-17416)] = true;
			}
		} else if (arg1 == 5) {
			this.anInt8124 = arg0.method8581(-17416);
		} else if (arg1 == 6) {
			this.anInt8121 = arg0.method8575();
		} else if (arg1 == 7) {
			this.anInt8134 = arg0.method8575();
		} else if (arg1 == 8) {
			this.anInt8129 = arg0.method8581(-17416);
		} else if (arg1 == 9) {
			this.anInt8123 = arg0.method8581(-17416);
		} else if (arg1 == 10) {
			this.anInt8130 = arg0.method8581(-17416);
		} else if (arg1 == 11) {
			this.anInt8120 = arg0.method8581(-17416);
		} else if (arg1 == 12) {
			local10 = arg0.method8581(-17416);
			this.anIntArray581 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray581[local16] = arg0.method8575();
			}
			for (local37 = 0; local37 < local10; local37++) {
				this.anIntArray581[local37] = (arg0.method8575() << 16) + this.anIntArray581[local37];
			}
		} else if (arg1 == 13) {
			local10 = arg0.method8575();
			this.anIntArrayArray51 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				local37 = arg0.method8581(-17416);
				if (local37 > 0) {
					this.anIntArrayArray51[local16] = new int[local37];
					this.anIntArrayArray51[local16][0] = arg0.method8583();
					for (local56 = 1; local56 < local37; local56++) {
						this.anIntArrayArray51[local16][local56] = arg0.method8575();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean700 = true;
		} else if (arg1 == 15) {
			this.aBoolean701 = true;
		} else if (arg1 != 16) {
			if (arg1 == 18) {
				this.aBoolean702 = true;
			} else if (arg1 == 19) {
				if (this.anIntArray584 == null) {
					this.anIntArray584 = new int[this.anIntArrayArray51.length];
					for (local10 = 0; local10 < this.anIntArrayArray51.length; local10++) {
						this.anIntArray584[local10] = 255;
					}
				}
				this.anIntArray584[arg0.method8581(-17416)] = arg0.method8581(-17416);
			} else if (arg1 == 20) {
				if (this.anIntArray585 == null || this.anIntArray583 == null) {
					this.anIntArray585 = new int[this.anIntArrayArray51.length];
					this.anIntArray583 = new int[this.anIntArrayArray51.length];
					for (local10 = 0; local10 < this.anIntArrayArray51.length; local10++) {
						this.anIntArray585[local10] = 256;
						this.anIntArray583[local10] = 256;
					}
				}
				local10 = arg0.method8581(-17416);
				this.anIntArray585[local10] = arg0.method8575();
				this.anIntArray583[local10] = arg0.method8575();
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BLclient!et;)V")
	public void method7250(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8581(-17416);
			if (local5 == 0) {
				return;
			}
			this.method7245(arg0, local5);
		}
	}
}
