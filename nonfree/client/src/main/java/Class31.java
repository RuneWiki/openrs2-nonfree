import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class31 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public int anInt1144;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt1145;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public int anInt1146;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	private int anInt1147;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	private int anInt1148;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	private int anInt1149;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	private int anInt1150;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "I")
	private int anInt1151;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "I")
	private int anInt1143 = 2;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
	private int[] anIntArray182 = new int[2];

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[I")
	private int[] anIntArray183 = new int[2];

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class31() {
		this.anIntArray182[0] = 0;
		this.anIntArray182[1] = 65535;
		this.anIntArray183[0] = 0;
		this.anIntArray183[1] = 65535;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
	public int method781(@OriginalArg(0) int arg0) {
		if (this.anInt1148 >= this.anInt1147) {
			this.anInt1150 = this.anIntArray183[this.anInt1151++] << 15;
			if (this.anInt1151 >= this.anInt1143) {
				this.anInt1151 = this.anInt1143 - 1;
			}
			this.anInt1147 = (int) ((double) this.anIntArray182[this.anInt1151] / 65536.0D * (double) arg0);
			if (this.anInt1147 > this.anInt1148) {
				this.anInt1149 = ((this.anIntArray183[this.anInt1151] << 15) - this.anInt1150) / (this.anInt1147 - this.anInt1148);
			}
		}
		this.anInt1150 += this.anInt1149;
		this.anInt1148++;
		return this.anInt1150 - this.anInt1149 >> 15;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!pa;)V")
	public void method782(@OriginalArg(0) Class5_Sub14 arg0) {
		this.anInt1143 = arg0.method1471();
		this.anIntArray182 = new int[this.anInt1143];
		this.anIntArray183 = new int[this.anInt1143];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1143; local16++) {
			this.anIntArray182[local16] = arg0.method1478();
			this.anIntArray183[local16] = arg0.method1478();
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Lclient!pa;)V")
	public void method783(@OriginalArg(0) Class5_Sub14 arg0) {
		this.anInt1145 = arg0.method1471();
		this.anInt1144 = arg0.method1461();
		this.anInt1146 = arg0.method1461();
		this.method782(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	public void method784() {
		this.anInt1147 = 0;
		this.anInt1151 = 0;
		this.anInt1149 = 0;
		this.anInt1150 = 0;
		this.anInt1148 = 0;
	}
}
