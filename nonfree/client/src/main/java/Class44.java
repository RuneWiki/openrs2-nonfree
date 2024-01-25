import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class44 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	public int anInt1592;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public int anInt1593;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public int anInt1594;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
	private int anInt1596;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	private int anInt1597;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
	private int anInt1598;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	private int anInt1599;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	private int anInt1600;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	private int anInt1595 = 2;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "[I")
	private int[] anIntArray93 = new int[2];

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
	private int[] anIntArray94 = new int[2];

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class44() {
		this.anIntArray93[0] = 0;
		this.anIntArray93[1] = 65535;
		this.anIntArray94[0] = 0;
		this.anIntArray94[1] = 65535;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I")
	public int method1286(@OriginalArg(0) int arg0) {
		if (this.anInt1597 >= this.anInt1600) {
			this.anInt1599 = this.anIntArray94[this.anInt1596++] << 15;
			if (this.anInt1596 >= this.anInt1595) {
				this.anInt1596 = this.anInt1595 - 1;
			}
			this.anInt1600 = (int) ((double) this.anIntArray93[this.anInt1596] / 65536.0D * (double) arg0);
			if (this.anInt1600 > this.anInt1597) {
				this.anInt1598 = ((this.anIntArray94[this.anInt1596] << 15) - this.anInt1599) / (this.anInt1600 - this.anInt1597);
			}
		}
		this.anInt1599 += this.anInt1598;
		this.anInt1597++;
		return this.anInt1599 - this.anInt1598 >> 15;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!lf;)V")
	public void method1287(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt1592 = arg0.method3440();
		this.anInt1594 = arg0.method3418();
		this.anInt1593 = arg0.method3418();
		this.method1288(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(Lclient!lf;)V")
	public void method1288(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt1595 = arg0.method3440();
		this.anIntArray93 = new int[this.anInt1595];
		this.anIntArray94 = new int[this.anInt1595];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1595; local16++) {
			this.anIntArray93[local16] = arg0.method3401();
			this.anIntArray94[local16] = arg0.method3401();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
	public void method1289() {
		this.anInt1600 = 0;
		this.anInt1596 = 0;
		this.anInt1598 = 0;
		this.anInt1599 = 0;
		this.anInt1597 = 0;
	}
}
