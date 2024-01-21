import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VRTTZTTM")
public final class Class43 {

	@OriginalMember(owner = "client!VRTTZTTM", name = "d", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!VRTTZTTM", name = "e", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!VRTTZTTM", name = "f", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!VRTTZTTM", name = "g", descriptor = "I")
	public int anInt699;

	@OriginalMember(owner = "client!VRTTZTTM", name = "h", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!VRTTZTTM", name = "i", descriptor = "I")
	public int anInt701;

	@OriginalMember(owner = "client!VRTTZTTM", name = "j", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!VRTTZTTM", name = "k", descriptor = "I")
	private int anInt703;

	@OriginalMember(owner = "client!VRTTZTTM", name = "l", descriptor = "I")
	private int anInt704;

	@OriginalMember(owner = "client!VRTTZTTM", name = "m", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!VRTTZTTM", name = "n", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "I")
	private int anInt696 = 716;

	@OriginalMember(owner = "client!VRTTZTTM", name = "b", descriptor = "I")
	private int anInt697 = -76;

	@OriginalMember(owner = "client!VRTTZTTM", name = "c", descriptor = "Z")
	private boolean aBoolean185 = true;

	@OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "(Lclient!TKPFKOXP;B)V")
	public void method545(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			this.anInt701 = arg0.method492();
			this.anInt699 = arg0.method497();
			this.anInt700 = arg0.method497();
			this.method546(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("59815, " + arg0 + ", " + 4 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "(ZLclient!TKPFKOXP;)V")
	public void method546(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			this.anInt698 = arg0.method492();
			this.anIntArray197 = new int[this.anInt698];
			this.anIntArray198 = new int[this.anInt698];
			for (@Pc(15) int local15 = 0; local15 < this.anInt698; local15++) {
				this.anIntArray197[local15] = arg0.method494();
				this.anIntArray198[local15] = arg0.method494();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("42046, " + false + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "(I)V")
	public void method547(@OriginalArg(0) int arg0) {
		try {
			this.anInt702 = 0;
			this.anInt703 = 0;
			this.anInt704 = 0;
			@Pc(12) boolean local12 = false;
			this.anInt705 = 0;
			this.anInt706 = 0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("12275, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "(IZ)I")
	public int method548(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt706 >= this.anInt702) {
				this.anInt705 = this.anIntArray198[this.anInt703++] << 15;
				if (this.anInt703 >= this.anInt698) {
					this.anInt703 = this.anInt698 - 1;
				}
				this.anInt702 = (int) ((double) this.anIntArray197[this.anInt703] / 65536.0D * (double) arg0);
				if (this.anInt702 > this.anInt706) {
					this.anInt704 = ((this.anIntArray198[this.anInt703] << 15) - this.anInt705) / (this.anInt702 - this.anInt706);
				}
			}
			this.anInt705 += this.anInt704;
			this.anInt706++;
			return this.anInt705 - this.anInt704 >> 15;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("467, " + arg0 + ", " + true + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
