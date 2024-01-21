import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LYKGAWTC")
public final class Class27 {

	@OriginalMember(owner = "client!LYKGAWTC", name = "b", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!LYKGAWTC", name = "c", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!LYKGAWTC", name = "d", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!LYKGAWTC", name = "e", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!LYKGAWTC", name = "f", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!LYKGAWTC", name = "g", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!LYKGAWTC", name = "h", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!LYKGAWTC", name = "i", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!LYKGAWTC", name = "j", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!LYKGAWTC", name = "k", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!LYKGAWTC", name = "l", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!LYKGAWTC", name = "a", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!LYKGAWTC", name = "a", descriptor = "(BLclient!GLMIQHJI;)V")
	public void method325(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			this.anInt386 = arg0.method165();
			this.anInt384 = arg0.method170();
			this.anInt385 = arg0.method170();
			this.method326(arg0);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("52468, " + 8 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LYKGAWTC", name = "a", descriptor = "(Lclient!GLMIQHJI;I)V")
	public void method326(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			this.anInt383 = arg0.method165();
			this.anIntArray62 = new int[this.anInt383];
			this.anIntArray63 = new int[this.anInt383];
			for (@Pc(18) int local18 = 0; local18 < this.anInt383; local18++) {
				this.anIntArray62[local18] = arg0.method167();
				this.anIntArray63[local18] = arg0.method167();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("87163, " + arg0 + ", " + -433 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LYKGAWTC", name = "a", descriptor = "(I)V")
	public void method327() {
		try {
			this.anInt387 = 0;
			this.anInt388 = 0;
			this.anInt389 = 0;
			this.anInt390 = 0;
			this.anInt391 = 0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("47754, " + -955 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LYKGAWTC", name = "a", descriptor = "(BI)I")
	public int method328(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt391 >= this.anInt387) {
				this.anInt390 = this.anIntArray63[this.anInt388++] << 15;
				if (this.anInt388 >= this.anInt383) {
					this.anInt388 = this.anInt383 - 1;
				}
				this.anInt387 = (int) ((double) this.anIntArray62[this.anInt388] / 65536.0D * (double) arg0);
				if (this.anInt387 > this.anInt391) {
					this.anInt389 = ((this.anIntArray63[this.anInt388] << 15) - this.anInt390) / (this.anInt387 - this.anInt391);
				}
			}
			this.anInt390 += this.anInt389;
			this.anInt391++;
			return this.anInt390 - this.anInt389 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("68339, " + 75 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
