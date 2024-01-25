import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class23 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
	public int anInt1041;

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
	private int anInt1042 = 2;

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "[I")
	private int[] anIntArray56 = new int[2];

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
	private int[] anIntArray57 = new int[2];

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class23() {
		this.anIntArray56[0] = 0;
		this.anIntArray56[1] = 65535;
		this.anIntArray57[0] = 0;
		this.anIntArray57[1] = 65535;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
	public int method971(@OriginalArg(0) int arg0) {
		if (this.anInt1045 >= this.anInt1049) {
			this.anInt1048 = this.anIntArray57[this.anInt1047++] << 15;
			if (this.anInt1047 >= this.anInt1042) {
				this.anInt1047 = this.anInt1042 - 1;
			}
			this.anInt1049 = (int) ((double) this.anIntArray56[this.anInt1047] / 65536.0D * (double) arg0);
			if (this.anInt1049 > this.anInt1045) {
				this.anInt1046 = ((this.anIntArray57[this.anInt1047] << 15) - this.anInt1048) / (this.anInt1049 - this.anInt1045);
			}
		}
		this.anInt1048 += this.anInt1046;
		this.anInt1045++;
		return this.anInt1048 - this.anInt1046 >> 15;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ika;)V")
	public void method972(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt1044 = arg0.method2048(255);
		this.anInt1041 = arg0.method2036();
		this.anInt1043 = arg0.method2036();
		this.method973(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(Lclient!ika;)V")
	public void method973(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt1042 = arg0.method2048(255);
		this.anIntArray56 = new int[this.anInt1042];
		this.anIntArray57 = new int[this.anInt1042];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1042; local16++) {
			this.anIntArray56[local16] = arg0.method2028(-14795);
			this.anIntArray57[local16] = arg0.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "()V")
	public void method974() {
		this.anInt1049 = 0;
		this.anInt1047 = 0;
		this.anInt1046 = 0;
		this.anInt1048 = 0;
		this.anInt1045 = 0;
	}
}
