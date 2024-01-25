import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class27 {

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
	public int anInt1185;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
	public int anInt1187;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
	public int anInt1188;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	private int anInt1189;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
	private int anInt1190;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	private int anInt1191;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
	private int anInt1192;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
	private int anInt1193;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
	private int anInt1186 = 2;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "[I")
	private int[] anIntArray76 = new int[2];

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "[I")
	private int[] anIntArray77 = new int[2];

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class27() {
		this.anIntArray76[0] = 0;
		this.anIntArray76[1] = 65535;
		this.anIntArray77[0] = 0;
		this.anIntArray77[1] = 65535;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
	public int method1124(@OriginalArg(0) int arg0) {
		if (this.anInt1193 >= this.anInt1191) {
			this.anInt1189 = this.anIntArray77[this.anInt1190++] << 15;
			if (this.anInt1190 >= this.anInt1186) {
				this.anInt1190 = this.anInt1186 - 1;
			}
			this.anInt1191 = (int) ((double) this.anIntArray76[this.anInt1190] / 65536.0D * (double) arg0);
			if (this.anInt1191 > this.anInt1193) {
				this.anInt1192 = ((this.anIntArray77[this.anInt1190] << 15) - this.anInt1189) / (this.anInt1191 - this.anInt1193);
			}
		}
		this.anInt1189 += this.anInt1192;
		this.anInt1193++;
		return this.anInt1189 - this.anInt1192 >> 15;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!at;)V")
	public void method1125(@OriginalArg(0) Class1_Sub7 arg0) {
		this.anInt1186 = arg0.method2132();
		this.anIntArray76 = new int[this.anInt1186];
		this.anIntArray77 = new int[this.anInt1186];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1186; local16++) {
			this.anIntArray76[local16] = arg0.method2161();
			this.anIntArray77[local16] = arg0.method2161();
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(Lclient!at;)V")
	public void method1126(@OriginalArg(0) Class1_Sub7 arg0) {
		this.anInt1187 = arg0.method2132();
		this.anInt1188 = arg0.method2140();
		this.anInt1185 = arg0.method2140();
		this.method1125(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "()V")
	public void method1127() {
		this.anInt1191 = 0;
		this.anInt1190 = 0;
		this.anInt1192 = 0;
		this.anInt1189 = 0;
		this.anInt1193 = 0;
	}
}
