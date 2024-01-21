import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt141 = 9527;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;Z)V")
	public void method42(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt145 = arg0.method480();
			this.anInt143 = arg0.method485();
			this.anInt144 = arg0.method485();
			this.method43(arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("32700, " + arg0 + ", " + false + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!lb;)V")
	public void method43(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt142 = arg0.method480();
			this.anIntArray15 = new int[this.anInt142];
			this.anIntArray16 = new int[this.anInt142];
			for (@Pc(20) int local20 = 0; local20 < this.anInt142; local20++) {
				this.anIntArray15[local20] = arg0.method482();
				this.anIntArray16[local20] = arg0.method482();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("91103, " + 0 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method44(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt146 = 0;
			this.anInt147 = 0;
			this.anInt148 = 0;
			this.anInt149 = 0;
			this.anInt150 = 0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("35386, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method45(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt150 >= this.anInt146) {
				this.anInt149 = this.anIntArray16[this.anInt147++] << 15;
				if (this.anInt147 >= this.anInt142) {
					this.anInt147 = this.anInt142 - 1;
				}
				this.anInt146 = (int) ((double) this.anIntArray15[this.anInt147] / 65536.0D * (double) arg0);
				if (this.anInt146 > this.anInt150) {
					this.anInt148 = ((this.anIntArray16[this.anInt147] << 15) - this.anInt149) / (this.anInt146 - this.anInt150);
				}
			}
			this.anInt149 += this.anInt148;
			this.anInt150++;
			return this.anInt149 - this.anInt148 >> 15;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("9913, " + 8 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}
}
