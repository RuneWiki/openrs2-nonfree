import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class41 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public int anInt1986;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	public int anInt1987;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "I")
	public int anInt1988;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	private int anInt1990;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "I")
	private int anInt1991;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	private int anInt1992;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	private int anInt1993;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "I")
	private int anInt1994;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "I")
	private int anInt1989 = 2;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "[I")
	private int[] anIntArray269 = new int[2];

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
	private int[] anIntArray268 = new int[2];

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class41() {
		this.anIntArray269[0] = 0;
		this.anIntArray269[1] = 65535;
		this.anIntArray268[0] = 0;
		this.anIntArray268[1] = 65535;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	public int method1192(@OriginalArg(0) int arg0) {
		if (this.anInt1993 >= this.anInt1992) {
			this.anInt1990 = this.anIntArray268[this.anInt1991++] << 15;
			if (this.anInt1991 >= this.anInt1989) {
				this.anInt1991 = this.anInt1989 - 1;
			}
			this.anInt1992 = (int) ((double) this.anIntArray269[this.anInt1991] / 65536.0D * (double) arg0);
			if (this.anInt1992 > this.anInt1993) {
				this.anInt1994 = ((this.anIntArray268[this.anInt1991] << 15) - this.anInt1990) / (this.anInt1992 - this.anInt1993);
			}
		}
		this.anInt1990 += this.anInt1994;
		this.anInt1993++;
		return this.anInt1990 - this.anInt1994 >> 15;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!fe;)V")
	public void method1193(@OriginalArg(0) Class2_Sub8 arg0) {
		this.anInt1989 = arg0.method1410();
		this.anIntArray269 = new int[this.anInt1989];
		this.anIntArray268 = new int[this.anInt1989];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1989; local16++) {
			this.anIntArray269[local16] = arg0.method1396();
			this.anIntArray268[local16] = arg0.method1396();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	public void method1194() {
		this.anInt1992 = 0;
		this.anInt1991 = 0;
		this.anInt1994 = 0;
		this.anInt1990 = 0;
		this.anInt1993 = 0;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!fe;)V")
	public void method1195(@OriginalArg(0) Class2_Sub8 arg0) {
		this.anInt1986 = arg0.method1410();
		this.anInt1987 = arg0.method1406();
		this.anInt1988 = arg0.method1406();
		this.method1193(arg0);
	}
}
