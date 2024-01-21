import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class33 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public int anInt1530;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public int anInt1532;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public int anInt1533;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	private int anInt1534;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	private int anInt1535;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	private int anInt1536;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	private int anInt1537;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	private int anInt1538;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	private int anInt1531 = 2;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "[I")
	private int[] anIntArray192 = new int[2];

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
	private int[] anIntArray193 = new int[2];

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class33() {
		this.anIntArray192[0] = 0;
		this.anIntArray192[1] = 65535;
		this.anIntArray193[0] = 0;
		this.anIntArray193[1] = 65535;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
	public void method888() {
		this.anInt1536 = 0;
		this.anInt1537 = 0;
		this.anInt1538 = 0;
		this.anInt1534 = 0;
		this.anInt1535 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wb;)V")
	public void method889(@OriginalArg(0) Class2_Sub17 arg0) {
		this.anInt1530 = arg0.method1780();
		this.anInt1532 = arg0.method1747();
		this.anInt1533 = arg0.method1747();
		this.method890(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lclient!wb;)V")
	public void method890(@OriginalArg(0) Class2_Sub17 arg0) {
		this.anInt1531 = arg0.method1780();
		this.anIntArray192 = new int[this.anInt1531];
		this.anIntArray193 = new int[this.anInt1531];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1531; local16++) {
			this.anIntArray192[local16] = arg0.method1783();
			this.anIntArray193[local16] = arg0.method1783();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
	public int method891(@OriginalArg(0) int arg0) {
		if (this.anInt1535 >= this.anInt1536) {
			this.anInt1534 = this.anIntArray193[this.anInt1537++] << 15;
			if (this.anInt1537 >= this.anInt1531) {
				this.anInt1537 = this.anInt1531 - 1;
			}
			this.anInt1536 = (int) ((double) this.anIntArray192[this.anInt1537] / 65536.0D * (double) arg0);
			if (this.anInt1536 > this.anInt1535) {
				this.anInt1538 = ((this.anIntArray193[this.anInt1537] << 15) - this.anInt1534) / (this.anInt1536 - this.anInt1535);
			}
		}
		this.anInt1534 += this.anInt1538;
		this.anInt1535++;
		return this.anInt1534 - this.anInt1538 >> 15;
	}
}
