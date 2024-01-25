import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class45 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
	public int anInt1146;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public int anInt1147;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
	public int anInt1148;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	private int anInt1149;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
	private int anInt1150;

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
	private int anInt1151;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
	private int anInt1152;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
	private int anInt1153;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
	private int anInt1145 = 2;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "[I")
	private int[] anIntArray92 = new int[2];

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "[I")
	private int[] anIntArray93 = new int[2];

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class45() {
		this.anIntArray92[0] = 0;
		this.anIntArray92[1] = 65535;
		this.anIntArray93[0] = 0;
		this.anIntArray93[1] = 65535;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
	public int method1048(@OriginalArg(0) int arg0) {
		if (this.anInt1149 >= this.anInt1150) {
			this.anInt1151 = this.anIntArray93[this.anInt1153++] << 15;
			if (this.anInt1153 >= this.anInt1145) {
				this.anInt1153 = this.anInt1145 - 1;
			}
			this.anInt1150 = (int) ((double) this.anIntArray92[this.anInt1153] / 65536.0D * (double) arg0);
			if (this.anInt1150 > this.anInt1149) {
				this.anInt1152 = ((this.anIntArray93[this.anInt1153] << 15) - this.anInt1151) / (this.anInt1150 - this.anInt1149);
			}
		}
		this.anInt1151 += this.anInt1152;
		this.anInt1149++;
		return this.anInt1151 - this.anInt1152 >> 15;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!nn;)V")
	public void method1049(@OriginalArg(0) Class10_Sub8 arg0) {
		this.anInt1148 = arg0.method2502();
		this.anInt1146 = arg0.method2459();
		this.anInt1147 = arg0.method2459();
		this.method1051(arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
	public void method1050() {
		this.anInt1150 = 0;
		this.anInt1153 = 0;
		this.anInt1152 = 0;
		this.anInt1151 = 0;
		this.anInt1149 = 0;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Lclient!nn;)V")
	public void method1051(@OriginalArg(0) Class10_Sub8 arg0) {
		this.anInt1145 = arg0.method2502();
		this.anIntArray92 = new int[this.anInt1145];
		this.anIntArray93 = new int[this.anInt1145];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1145; local16++) {
			this.anIntArray92[local16] = arg0.method2485();
			this.anIntArray93[local16] = arg0.method2485();
		}
	}
}
