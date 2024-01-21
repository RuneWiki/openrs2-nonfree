import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class45 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public int anInt1799;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public int anInt1800;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public int anInt1801;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	private int anInt1803;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	private int anInt1804;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	private int anInt1805;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	private int anInt1806;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	private int anInt1807;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	private int anInt1802 = 2;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
	private int[] anIntArray153 = new int[2];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
	private int[] anIntArray152 = new int[2];

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class45() {
		this.anIntArray153[0] = 0;
		this.anIntArray153[1] = 65535;
		this.anIntArray152[0] = 0;
		this.anIntArray152[1] = 65535;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ka;)V")
	public void method1246(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt1800 = arg0.method3010();
		this.anInt1799 = arg0.method3058();
		this.anInt1801 = arg0.method3058();
		this.method1247(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lclient!ka;)V")
	public void method1247(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt1802 = arg0.method3010();
		this.anIntArray153 = new int[this.anInt1802];
		this.anIntArray152 = new int[this.anInt1802];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1802; local16++) {
			this.anIntArray153[local16] = arg0.method3023();
			this.anIntArray152[local16] = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	public void method1248() {
		this.anInt1805 = 0;
		this.anInt1803 = 0;
		this.anInt1806 = 0;
		this.anInt1807 = 0;
		this.anInt1804 = 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	public int method1249(@OriginalArg(0) int arg0) {
		if (this.anInt1804 >= this.anInt1805) {
			this.anInt1807 = this.anIntArray152[this.anInt1803++] << 15;
			if (this.anInt1803 >= this.anInt1802) {
				this.anInt1803 = this.anInt1802 - 1;
			}
			this.anInt1805 = (int) ((double) this.anIntArray153[this.anInt1803] / 65536.0D * (double) arg0);
			if (this.anInt1805 > this.anInt1804) {
				this.anInt1806 = ((this.anIntArray152[this.anInt1803] << 15) - this.anInt1807) / (this.anInt1805 - this.anInt1804);
			}
		}
		this.anInt1807 += this.anInt1806;
		this.anInt1804++;
		return this.anInt1807 - this.anInt1806 >> 15;
	}
}
