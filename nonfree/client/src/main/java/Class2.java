import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt143 = 1;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!lb;)V")
	public void method42(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt147 = arg1.method473();
			@Pc(8) boolean local8 = false;
			this.anInt145 = arg1.method478();
			this.anInt146 = arg1.method478();
			this.method43(arg1);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("21998, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method43(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt144 = arg0.method473();
			this.anIntArray15 = new int[this.anInt144];
			this.anIntArray16 = new int[this.anInt144];
			for (@Pc(22) int local22 = 0; local22 < this.anInt144; local22++) {
				this.anIntArray15[local22] = arg0.method475();
				this.anIntArray16[local22] = arg0.method475();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("87412, " + arg0 + ", " + 9 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method44() {
		try {
			this.anInt148 = 0;
			this.anInt149 = 0;
			this.anInt150 = 0;
			this.anInt151 = 0;
			this.anInt152 = 0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("57406, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I")
	public int method45(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt152 >= this.anInt148) {
				this.anInt151 = this.anIntArray16[this.anInt149++] << 15;
				if (this.anInt149 >= this.anInt144) {
					this.anInt149 = this.anInt144 - 1;
				}
				this.anInt148 = (int) ((double) this.anIntArray15[this.anInt149] / 65536.0D * (double) arg0);
				if (this.anInt148 > this.anInt152) {
					this.anInt150 = ((this.anIntArray16[this.anInt149] << 15) - this.anInt151) / (this.anInt148 - this.anInt152);
				}
			}
			this.anInt151 += this.anInt150;
			this.anInt152++;
			return this.anInt151 - this.anInt150 >> 15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("30367, " + -7 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
