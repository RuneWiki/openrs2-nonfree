import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class38 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public int anInt1188;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
	public int anInt1189;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public int anInt1191;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	private int anInt1192;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	private int anInt1193;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	private int anInt1194;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	private int anInt1195;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	private int anInt1196;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	private int anInt1190 = 2;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
	private int[] anIntArray211 = new int[2];

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
	private int[] anIntArray210 = new int[2];

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class38() {
		this.anIntArray211[0] = 0;
		this.anIntArray211[1] = 65535;
		this.anIntArray210[0] = 0;
		this.anIntArray210[1] = 65535;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	public int method975(@OriginalArg(0) int arg0) {
		if (this.anInt1196 >= this.anInt1193) {
			this.anInt1195 = this.anIntArray210[this.anInt1194++] << 15;
			if (this.anInt1194 >= this.anInt1190) {
				this.anInt1194 = this.anInt1190 - 1;
			}
			this.anInt1193 = (int) ((double) this.anIntArray211[this.anInt1194] / 65536.0D * (double) arg0);
			if (this.anInt1193 > this.anInt1196) {
				this.anInt1192 = ((this.anIntArray210[this.anInt1194] << 15) - this.anInt1195) / (this.anInt1193 - this.anInt1196);
			}
		}
		this.anInt1195 += this.anInt1192;
		this.anInt1196++;
		return this.anInt1195 - this.anInt1192 >> 15;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!nh;)V")
	public void method976(@OriginalArg(0) Class2_Sub23 arg0) {
		this.anInt1190 = arg0.method2122();
		this.anIntArray211 = new int[this.anInt1190];
		this.anIntArray210 = new int[this.anInt1190];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1190; local16++) {
			this.anIntArray211[local16] = arg0.method2095();
			this.anIntArray210[local16] = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lclient!nh;)V")
	public void method977(@OriginalArg(0) Class2_Sub23 arg0) {
		this.anInt1191 = arg0.method2122();
		this.anInt1189 = arg0.method2133();
		this.anInt1188 = arg0.method2133();
		this.method976(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	public void method978() {
		this.anInt1193 = 0;
		this.anInt1194 = 0;
		this.anInt1192 = 0;
		this.anInt1195 = 0;
		this.anInt1196 = 0;
	}
}
