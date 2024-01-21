import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class31 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public int anInt1087;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	private int anInt1088;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private int anInt1089;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private int anInt1090;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	private int anInt1092;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	private int anInt1085 = 2;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "[I")
	private int[] anIntArray127 = new int[2];

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "[I")
	private int[] anIntArray128 = new int[2];

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class31() {
		this.anIntArray127[0] = 0;
		this.anIntArray127[1] = 65535;
		this.anIntArray128[0] = 0;
		this.anIntArray128[1] = 65535;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!m;)V")
	public void method738(@OriginalArg(0) Class3_Sub6 arg0) {
		this.anInt1086 = arg0.method1587();
		this.anInt1084 = arg0.method1614();
		this.anInt1087 = arg0.method1614();
		this.method740(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	public void method739() {
		this.anInt1091 = 0;
		this.anInt1092 = 0;
		this.anInt1089 = 0;
		this.anInt1088 = 0;
		this.anInt1090 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lclient!m;)V")
	public void method740(@OriginalArg(0) Class3_Sub6 arg0) {
		this.anInt1085 = arg0.method1587();
		this.anIntArray127 = new int[this.anInt1085];
		this.anIntArray128 = new int[this.anInt1085];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1085; local16++) {
			this.anIntArray127[local16] = arg0.method1603();
			this.anIntArray128[local16] = arg0.method1603();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I")
	public int method741(@OriginalArg(0) int arg0) {
		if (this.anInt1090 >= this.anInt1091) {
			this.anInt1088 = this.anIntArray128[this.anInt1092++] << 15;
			if (this.anInt1092 >= this.anInt1085) {
				this.anInt1092 = this.anInt1085 - 1;
			}
			this.anInt1091 = (int) ((double) this.anIntArray127[this.anInt1092] / 65536.0D * (double) arg0);
			if (this.anInt1091 > this.anInt1090) {
				this.anInt1089 = ((this.anIntArray128[this.anInt1092] << 15) - this.anInt1088) / (this.anInt1091 - this.anInt1090);
			}
		}
		this.anInt1088 += this.anInt1089;
		this.anInt1090++;
		return this.anInt1088 - this.anInt1089 >> 15;
	}
}
