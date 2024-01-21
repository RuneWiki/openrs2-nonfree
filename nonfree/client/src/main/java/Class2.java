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
	private int anInt142 = 344;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt143 = 309;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method42(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt147 = arg0.method480();
			this.anInt145 = arg0.method485();
			@Pc(11) boolean local11 = false;
			this.anInt146 = arg0.method485();
			this.method43(arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("8875, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;Z)V")
	public void method43(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt144 = arg0.method480();
			this.anIntArray15 = new int[this.anInt144];
			this.anIntArray16 = new int[this.anInt144];
			for (@Pc(20) int local20 = 0; local20 < this.anInt144; local20++) {
				this.anIntArray15[local20] = arg0.method482();
				this.anIntArray16[local20] = arg0.method482();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("37437, " + arg0 + ", " + true + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public void method44(@OriginalArg(0) byte arg0) {
		try {
			this.anInt148 = 0;
			this.anInt149 = 0;
			this.anInt150 = 0;
			this.anInt151 = 0;
			if (arg0 == 7) {
				@Pc(18) boolean local18 = false;
			} else {
				for (@Pc(22) int local22 = 1; local22 > 0; local22++) {
				}
			}
			this.anInt152 = 0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("64704, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			@Pc(79) boolean local79 = false;
			this.anInt152++;
			return this.anInt151 - this.anInt150 >> 15;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("1088, " + arg0 + ", " + arg1 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
