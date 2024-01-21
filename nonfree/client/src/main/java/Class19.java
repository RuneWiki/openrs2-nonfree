import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class19 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	private int anInt865 = 2;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
	private int[] anIntArray128 = new int[2];

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "[I")
	private int[] anIntArray129 = new int[2];

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	public Class19() {
		this.anIntArray128[0] = 0;
		this.anIntArray128[1] = 65535;
		this.anIntArray129[0] = 0;
		this.anIntArray129[1] = 65535;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!rc;)V")
	public void method444(@OriginalArg(0) Class1_Sub5 arg0) {
		this.anInt865 = arg0.method716();
		this.anIntArray128 = new int[this.anInt865];
		this.anIntArray129 = new int[this.anInt865];
		for (@Pc(16) int local16 = 0; local16 < this.anInt865; local16++) {
			this.anIntArray128[local16] = arg0.method715();
			this.anIntArray129[local16] = arg0.method715();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	public void method445() {
		this.anInt867 = 0;
		this.anInt870 = 0;
		this.anInt869 = 0;
		this.anInt871 = 0;
		this.anInt868 = 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	public int method446(@OriginalArg(0) int arg0) {
		if (this.anInt868 >= this.anInt867) {
			this.anInt871 = this.anIntArray129[this.anInt870++] << 15;
			if (this.anInt870 >= this.anInt865) {
				this.anInt870 = this.anInt865 - 1;
			}
			this.anInt867 = (int) ((double) this.anIntArray128[this.anInt870] / 65536.0D * (double) arg0);
			if (this.anInt867 > this.anInt868) {
				this.anInt869 = ((this.anIntArray129[this.anInt870] << 15) - this.anInt871) / (this.anInt867 - this.anInt868);
			}
		}
		this.anInt871 += this.anInt869;
		this.anInt868++;
		return this.anInt871 - this.anInt869 >> 15;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!rc;)V")
	public void method447(@OriginalArg(0) Class1_Sub5 arg0) {
		this.anInt863 = arg0.method716();
		this.anInt864 = arg0.method692();
		this.anInt866 = arg0.method692();
		this.method444(arg0);
	}
}
