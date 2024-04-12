import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class26 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public int anInt1085;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	private int anInt1087;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	private int anInt1088;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	private int anInt1089;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	private int anInt1090;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	private int anInt1083 = 2;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
	private int[] anIntArray223 = new int[2];

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
	private int[] anIntArray224 = new int[2];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 3)
	public void method797() {
		this.anInt1088 = 0;
		this.anInt1087 = 0;
		this.anInt1089 = 0;
		this.anInt1090 = 0;
		this.anInt1091 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!eb;)V", line = 13)
	public void method798(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt1083 = arg0.method1708();
		this.anIntArray223 = new int[this.anInt1083];
		this.anIntArray224 = new int[this.anInt1083];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1083; local16++) {
			this.anIntArray223[local16] = arg0.method1704();
			this.anIntArray224[local16] = arg0.method1704();
		}
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 33)
	public Class26() {
		this.anIntArray223[0] = 0;
		this.anIntArray223[1] = 65535;
		this.anIntArray224[0] = 0;
		this.anIntArray224[1] = 65535;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!eb;)V", line = 44)
	public void method799(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt1085 = arg0.method1708();
		this.anInt1086 = arg0.method1728();
		this.anInt1084 = arg0.method1728();
		this.method798(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I", line = 51)
	public int method800(@OriginalArg(0) int arg0) {
		if (this.anInt1091 >= this.anInt1088) {
			this.anInt1090 = this.anIntArray224[this.anInt1087++] << 15;
			if (this.anInt1087 >= this.anInt1083) {
				this.anInt1087 = this.anInt1083 - 1;
			}
			this.anInt1088 = (int) ((double) this.anIntArray223[this.anInt1087] / 65536.0D * (double) arg0);
			if (this.anInt1088 > this.anInt1091) {
				this.anInt1089 = ((this.anIntArray224[this.anInt1087] << 15) - this.anInt1090) / (this.anInt1088 - this.anInt1091);
			}
		}
		this.anInt1090 += this.anInt1089;
		this.anInt1091++;
		return this.anInt1090 - this.anInt1089 >> 15;
	}
}
