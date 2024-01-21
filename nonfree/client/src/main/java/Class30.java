import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PFANSVWX")
public final class Class30 {

	@OriginalMember(owner = "client!PFANSVWX", name = "b", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!PFANSVWX", name = "c", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!PFANSVWX", name = "d", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!PFANSVWX", name = "e", descriptor = "I")
	public int anInt475;

	@OriginalMember(owner = "client!PFANSVWX", name = "f", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!PFANSVWX", name = "g", descriptor = "I")
	public int anInt477;

	@OriginalMember(owner = "client!PFANSVWX", name = "h", descriptor = "I")
	private int anInt478;

	@OriginalMember(owner = "client!PFANSVWX", name = "i", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!PFANSVWX", name = "j", descriptor = "I")
	private int anInt480;

	@OriginalMember(owner = "client!PFANSVWX", name = "k", descriptor = "I")
	private int anInt481;

	@OriginalMember(owner = "client!PFANSVWX", name = "l", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "Z")
	private boolean aBoolean123 = true;

	@OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "(BLclient!MFMVIYHT;)V")
	public void method359(@OriginalArg(0) byte arg0, @OriginalArg(1) Class10_Sub1_Sub3 arg1) {
		try {
			this.anInt477 = arg1.method311();
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			@Pc(8) boolean local8 = false;
			this.anInt475 = arg1.method316();
			this.anInt476 = arg1.method316();
			this.method360(arg1);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("33975, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "(Lclient!MFMVIYHT;I)V")
	public void method360(@OriginalArg(0) Class10_Sub1_Sub3 arg0) {
		try {
			this.anInt474 = arg0.method311();
			this.anIntArray155 = new int[this.anInt474];
			this.anIntArray156 = new int[this.anInt474];
			for (@Pc(18) int local18 = 0; local18 < this.anInt474; local18++) {
				this.anIntArray155[local18] = arg0.method313();
				this.anIntArray156[local18] = arg0.method313();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("28975, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "(Z)V")
	public void method361() {
		try {
			this.anInt478 = 0;
			this.anInt479 = 0;
			this.anInt480 = 0;
			this.anInt481 = 0;
			this.anInt482 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("11493, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "(II)I")
	public int method362(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt482 >= this.anInt478) {
				this.anInt481 = this.anIntArray156[this.anInt479++] << 15;
				if (this.anInt479 >= this.anInt474) {
					this.anInt479 = this.anInt474 - 1;
				}
				this.anInt478 = (int) ((double) this.anIntArray155[this.anInt479] / 65536.0D * (double) arg0);
				if (this.anInt478 > this.anInt482) {
					this.anInt480 = ((this.anIntArray156[this.anInt479] << 15) - this.anInt481) / (this.anInt478 - this.anInt482);
				}
			}
			this.anInt481 += this.anInt480;
			this.anInt482++;
			return this.anInt481 - this.anInt480 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("72068, " + 0 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
