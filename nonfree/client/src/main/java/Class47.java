import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VMVYFNTB")
public final class Class47 {

	@OriginalMember(owner = "client!VMVYFNTB", name = "d", descriptor = "I")
	private int anInt771;

	@OriginalMember(owner = "client!VMVYFNTB", name = "e", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!VMVYFNTB", name = "f", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!VMVYFNTB", name = "g", descriptor = "I")
	public int anInt772;

	@OriginalMember(owner = "client!VMVYFNTB", name = "h", descriptor = "I")
	public int anInt773;

	@OriginalMember(owner = "client!VMVYFNTB", name = "i", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!VMVYFNTB", name = "j", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!VMVYFNTB", name = "k", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!VMVYFNTB", name = "l", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!VMVYFNTB", name = "m", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!VMVYFNTB", name = "n", descriptor = "I")
	private int anInt779;

	@OriginalMember(owner = "client!VMVYFNTB", name = "a", descriptor = "B")
	private byte aByte38 = -27;

	@OriginalMember(owner = "client!VMVYFNTB", name = "b", descriptor = "Z")
	private boolean aBoolean167 = true;

	@OriginalMember(owner = "client!VMVYFNTB", name = "c", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!VMVYFNTB", name = "a", descriptor = "(BLclient!XJCNBMKS;)V")
	public void method475(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 != this.aByte38) {
				this.aBoolean168 = !this.aBoolean168;
			}
			this.anInt774 = arg1.method498();
			this.anInt772 = arg1.method503();
			this.anInt773 = arg1.method503();
			this.method476(arg1);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("14946, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMVYFNTB", name = "a", descriptor = "(Lclient!XJCNBMKS;B)V")
	public void method476(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt771 = arg0.method498();
			this.anIntArray201 = new int[this.anInt771];
			this.anIntArray202 = new int[this.anInt771];
			for (@Pc(26) int local26 = 0; local26 < this.anInt771; local26++) {
				this.anIntArray201[local26] = arg0.method500();
				this.anIntArray202[local26] = arg0.method500();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("53841, " + arg0 + ", " + -115 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMVYFNTB", name = "a", descriptor = "(B)V")
	public void method477() {
		try {
			this.anInt775 = 0;
			this.anInt776 = 0;
			this.anInt777 = 0;
			this.anInt778 = 0;
			this.anInt779 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("18481, " + 114 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMVYFNTB", name = "a", descriptor = "(II)I")
	public int method478(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt779 >= this.anInt775) {
				this.anInt778 = this.anIntArray202[this.anInt776++] << 15;
				if (this.anInt776 >= this.anInt771) {
					this.anInt776 = this.anInt771 - 1;
				}
				this.anInt775 = (int) ((double) this.anIntArray201[this.anInt776] / 65536.0D * (double) arg0);
				if (this.anInt775 > this.anInt779) {
					this.anInt777 = ((this.anIntArray202[this.anInt776] << 15) - this.anInt778) / (this.anInt775 - this.anInt779);
				}
			}
			this.anInt778 += this.anInt777;
			this.anInt779++;
			return this.anInt778 - this.anInt777 >> 15;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("82892, " + arg0 + ", " + 6 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
