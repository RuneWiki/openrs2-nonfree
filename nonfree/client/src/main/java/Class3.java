import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BJGBRRBX")
public final class Class3 {

	@OriginalMember(owner = "client!BJGBRRBX", name = "c", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!BJGBRRBX", name = "d", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!BJGBRRBX", name = "e", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!BJGBRRBX", name = "f", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!BJGBRRBX", name = "g", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!BJGBRRBX", name = "h", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!BJGBRRBX", name = "i", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!BJGBRRBX", name = "j", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!BJGBRRBX", name = "k", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!BJGBRRBX", name = "l", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!BJGBRRBX", name = "m", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!BJGBRRBX", name = "b", descriptor = "I")
	private int anInt128 = 16795;

	@OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	public void method116(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			this.anInt132 = arg0.method79();
			this.anInt130 = arg0.method84();
			this.anInt131 = arg0.method84();
			this.method117(arg0, this.anInt128);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("39212, " + -11 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "(Lclient!BFQIDHPO;I)V")
	public void method117(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6;
			if (arg1 != 16795) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			this.anInt129 = arg0.method79();
			this.anIntArray15 = new int[this.anInt129];
			this.anIntArray16 = new int[this.anInt129];
			for (local6 = 0; local6 < this.anInt129; local6++) {
				this.anIntArray15[local6] = arg0.method81();
				this.anIntArray16[local6] = arg0.method81();
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("3771, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "(B)V")
	public void method118(@OriginalArg(0) byte arg0) {
		try {
			this.anInt133 = 0;
			this.anInt134 = 0;
			this.anInt135 = 0;
			this.anInt136 = 0;
			@Pc(16) boolean local16 = false;
			this.anInt137 = 0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("96675, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "(ZI)I")
	public int method119(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt137 >= this.anInt133) {
				this.anInt136 = this.anIntArray16[this.anInt134++] << 15;
				if (this.anInt134 >= this.anInt129) {
					this.anInt134 = this.anInt129 - 1;
				}
				this.anInt133 = (int) ((double) this.anIntArray15[this.anInt134] / 65536.0D * (double) arg0);
				if (this.anInt133 > this.anInt137) {
					this.anInt135 = ((this.anIntArray16[this.anInt134] << 15) - this.anInt136) / (this.anInt133 - this.anInt137);
				}
			}
			this.anInt136 += this.anInt135;
			this.anInt137++;
			return this.anInt136 - this.anInt135 >> 15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("91985, " + true + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}
}
