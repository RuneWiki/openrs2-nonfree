import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class24 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	public int anInt1182;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
	public int anInt1183;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public int anInt1184;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	private int anInt1186;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	private int anInt1187;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	private int anInt1188;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	private int anInt1189;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	private int anInt1190;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	private int anInt1185 = 2;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
	private int[] anIntArray101 = new int[2];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
	private int[] anIntArray100 = new int[2];

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class24() {
		this.anIntArray101[0] = 0;
		this.anIntArray101[1] = 65535;
		this.anIntArray100[0] = 0;
		this.anIntArray100[1] = 65535;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	public void method895() {
		this.anInt1190 = 0;
		this.anInt1189 = 0;
		this.anInt1188 = 0;
		this.anInt1187 = 0;
		this.anInt1186 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	public int method896(@OriginalArg(0) int arg0) {
		if (this.anInt1186 >= this.anInt1190) {
			this.anInt1187 = this.anIntArray100[this.anInt1189++] << 15;
			if (this.anInt1189 >= this.anInt1185) {
				this.anInt1189 = this.anInt1185 - 1;
			}
			this.anInt1190 = (int) ((double) this.anIntArray101[this.anInt1189] / 65536.0D * (double) arg0);
			if (this.anInt1190 > this.anInt1186) {
				this.anInt1188 = ((this.anIntArray100[this.anInt1189] << 15) - this.anInt1187) / (this.anInt1190 - this.anInt1186);
			}
		}
		this.anInt1187 += this.anInt1188;
		this.anInt1186++;
		return this.anInt1187 - this.anInt1188 >> 15;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ka;)V")
	public void method897(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt1182 = arg0.method336();
		this.anInt1184 = arg0.method347();
		this.anInt1183 = arg0.method347();
		this.method898(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lclient!ka;)V")
	public void method898(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt1185 = arg0.method336();
		this.anIntArray101 = new int[this.anInt1185];
		this.anIntArray100 = new int[this.anInt1185];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1185; local16++) {
			this.anIntArray101[local16] = arg0.method359();
			this.anIntArray100[local16] = arg0.method359();
		}
	}
}
