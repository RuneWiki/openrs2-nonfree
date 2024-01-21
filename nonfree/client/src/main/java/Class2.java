import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;B)V")
	public void method42(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt146 = arg0.method474();
			this.anInt144 = arg0.method479();
			this.anInt145 = arg0.method479();
			this.method43(arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("93289, " + arg0 + ", " + 81 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!lb;)V")
	public void method43(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt143 = arg0.method474();
			this.anIntArray15 = new int[this.anInt143];
			this.anIntArray16 = new int[this.anInt143];
			for (@Pc(18) int local18 = 0; local18 < this.anInt143; local18++) {
				this.anIntArray15[local18] = arg0.method476();
				this.anIntArray16[local18] = arg0.method476();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("79973, " + 0 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public void method44() {
		try {
			this.anInt147 = 0;
			this.anInt148 = 0;
			this.anInt149 = 0;
			this.anInt150 = 0;
			this.anInt151 = 0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("13108, " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I")
	public int method45(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt151 >= this.anInt147) {
				this.anInt150 = this.anIntArray16[this.anInt148++] << 15;
				if (this.anInt148 >= this.anInt143) {
					this.anInt148 = this.anInt143 - 1;
				}
				this.anInt147 = (int) ((double) this.anIntArray15[this.anInt148] / 65536.0D * (double) arg0);
				if (this.anInt147 > this.anInt151) {
					this.anInt149 = ((this.anIntArray16[this.anInt148] << 15) - this.anInt150) / (this.anInt147 - this.anInt151);
				}
			}
			this.anInt150 += this.anInt149;
			this.anInt151++;
			return this.anInt150 - this.anInt149 >> 15;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("97178, " + 122 + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
