import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XJHYQMBH")
public final class Class50 {

	@OriginalMember(owner = "client!XJHYQMBH", name = "b", descriptor = "I")
	private int anInt761;

	@OriginalMember(owner = "client!XJHYQMBH", name = "c", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!XJHYQMBH", name = "d", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!XJHYQMBH", name = "e", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!XJHYQMBH", name = "f", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!XJHYQMBH", name = "g", descriptor = "I")
	public int anInt764;

	@OriginalMember(owner = "client!XJHYQMBH", name = "h", descriptor = "I")
	private int anInt765;

	@OriginalMember(owner = "client!XJHYQMBH", name = "i", descriptor = "I")
	private int anInt766;

	@OriginalMember(owner = "client!XJHYQMBH", name = "j", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!XJHYQMBH", name = "k", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!XJHYQMBH", name = "l", descriptor = "I")
	private int anInt769;

	@OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	public void method546(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			this.anInt764 = arg0.method405();
			this.anInt762 = arg0.method410();
			this.anInt763 = arg0.method410();
			this.method547(arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("48359, " + -13096 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "(Lclient!SVWJKJVI;Z)V")
	public void method547(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			this.anInt761 = arg0.method405();
			this.anIntArray205 = new int[this.anInt761];
			this.anIntArray206 = new int[this.anInt761];
			for (@Pc(17) int local17 = 0; local17 < this.anInt761; local17++) {
				this.anIntArray205[local17] = arg0.method407();
				this.anIntArray206[local17] = arg0.method407();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("49582, " + arg0 + ", " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "(I)V")
	public void method548() {
		try {
			this.anInt765 = 0;
			this.anInt766 = 0;
			this.anInt767 = 0;
			this.anInt768 = 0;
			this.anInt769 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("40119, " + 823 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "(BI)I")
	public int method549(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 52) {
				this.aBoolean178 = !this.aBoolean178;
			}
			if (this.anInt769 >= this.anInt765) {
				this.anInt768 = this.anIntArray206[this.anInt766++] << 15;
				if (this.anInt766 >= this.anInt761) {
					this.anInt766 = this.anInt761 - 1;
				}
				this.anInt765 = (int) ((double) this.anIntArray205[this.anInt766] / 65536.0D * (double) arg1);
				if (this.anInt765 > this.anInt769) {
					this.anInt767 = ((this.anIntArray206[this.anInt766] << 15) - this.anInt768) / (this.anInt765 - this.anInt769);
				}
			}
			this.anInt768 += this.anInt767;
			this.anInt769++;
			return this.anInt768 - this.anInt767 >> 15;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("73785, " + arg0 + ", " + arg1 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}
}
