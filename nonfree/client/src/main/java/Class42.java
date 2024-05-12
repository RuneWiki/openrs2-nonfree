import sign.signlink;

public class Class42 {

	private int anInt826;

	private int[] anIntArray227;

	private int[] anIntArray228;

	int anInt827;

	int anInt828;

	int anInt829;

	private int anInt830;

	private int anInt831;

	private int anInt832;

	private int anInt833;

	private int anInt834;

	public final void method552(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			this.anInt829 = arg1.method391();
			this.anInt827 = arg1.method396();
			this.anInt828 = arg1.method396();
			this.anInt826 = arg1.method391();
			this.anIntArray227 = new int[this.anInt826];
			this.anIntArray228 = new int[this.anInt826];
			int var3;
			if (arg0) {
				for (var3 = 1; var3 > 0; ++var3) {
				}
			}
			for (var3 = 0; var3 < this.anInt826; ++var3) {
				this.anIntArray227[var3] = arg1.method393();
				this.anIntArray228[var3] = arg1.method393();
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("83915, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	final void method553(int arg0) {
		try {
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			this.anInt833 = 0;
			if (arg0 >= 8 && arg0 <= 8) {
				this.anInt834 = 0;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("47965, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	final int method554(boolean arg0, int arg1) {
		try {
			if (!arg0) {
				for (int var3 = 1; var3 > 0; ++var3) {
				}
			}
			if (this.anInt834 >= this.anInt830) {
				this.anInt833 = this.anIntArray228[this.anInt831++] << 15;
				if (this.anInt831 >= this.anInt826) {
					this.anInt831 = this.anInt826 - 1;
				}
				this.anInt830 = (int) ((double) this.anIntArray227[this.anInt831] / 65536.0D * (double) arg1);
				if (this.anInt830 > this.anInt834) {
					this.anInt832 = ((this.anIntArray228[this.anInt831] << 15) - this.anInt833) / (this.anInt830 - this.anInt834);
				}
			}
			this.anInt833 += this.anInt832;
			++this.anInt834;
			return this.anInt833 - this.anInt832 >> 15;
		} catch (RuntimeException var4) {
			signlink.reporterror("65731, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}
}
