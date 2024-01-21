import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class44 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public int anInt1975;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public int anInt1976;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt1977;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	private int anInt1978;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	private int anInt1979;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	private int anInt1980;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private int anInt1981;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt1982;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	private int anInt1974 = 2;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "[I")
	private int[] anIntArray312 = new int[2];

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
	private int[] anIntArray313 = new int[2];

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class44() {
		this.anIntArray312[0] = 0;
		this.anIntArray312[1] = 65535;
		this.anIntArray313[0] = 0;
		this.anIntArray313[1] = 65535;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mc;)V")
	public void method1373(@OriginalArg(0) Class1_Sub12 arg0) {
		this.anInt1974 = arg0.method1190();
		this.anIntArray312 = new int[this.anInt1974];
		this.anIntArray313 = new int[this.anInt1974];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1974; local16++) {
			this.anIntArray312[local16] = arg0.method1176();
			this.anIntArray313[local16] = arg0.method1176();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	public int method1374(@OriginalArg(0) int arg0) {
		if (this.anInt1980 >= this.anInt1981) {
			this.anInt1982 = this.anIntArray313[this.anInt1978++] << 15;
			if (this.anInt1978 >= this.anInt1974) {
				this.anInt1978 = this.anInt1974 - 1;
			}
			this.anInt1981 = (int) ((double) this.anIntArray312[this.anInt1978] / 65536.0D * (double) arg0);
			if (this.anInt1981 > this.anInt1980) {
				this.anInt1979 = ((this.anIntArray313[this.anInt1978] << 15) - this.anInt1982) / (this.anInt1981 - this.anInt1980);
			}
		}
		this.anInt1982 += this.anInt1979;
		this.anInt1980++;
		return this.anInt1982 - this.anInt1979 >> 15;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!mc;)V")
	public void method1375(@OriginalArg(0) Class1_Sub12 arg0) {
		this.anInt1977 = arg0.method1190();
		this.anInt1976 = arg0.method1210();
		this.anInt1975 = arg0.method1210();
		this.method1373(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public void method1376() {
		this.anInt1981 = 0;
		this.anInt1978 = 0;
		this.anInt1979 = 0;
		this.anInt1982 = 0;
		this.anInt1980 = 0;
	}
}
