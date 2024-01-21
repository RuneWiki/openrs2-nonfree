import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class33 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public int anInt1132;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public int anInt1133;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
	public int anInt1134;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
	private int anInt1135;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
	private int anInt1136;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
	private int anInt1137;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	private int anInt1139;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	private int anInt1131 = 2;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	private int[] anIntArray121 = new int[2];

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
	private int[] anIntArray120 = new int[2];

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class33() {
		this.anIntArray121[0] = 0;
		this.anIntArray121[1] = 65535;
		this.anIntArray120[0] = 0;
		this.anIntArray120[1] = 65535;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!s;)V")
	public void method742(@OriginalArg(0) Class4_Sub16 arg0) {
		this.anInt1131 = arg0.method1474();
		this.anIntArray121 = new int[this.anInt1131];
		this.anIntArray120 = new int[this.anInt1131];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1131; local16++) {
			this.anIntArray121[local16] = arg0.method1490();
			this.anIntArray120[local16] = arg0.method1490();
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lclient!s;)V")
	public void method743(@OriginalArg(0) Class4_Sub16 arg0) {
		this.anInt1134 = arg0.method1474();
		this.anInt1133 = arg0.method1486();
		this.anInt1132 = arg0.method1486();
		this.method742(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)I")
	public int method744(@OriginalArg(0) int arg0) {
		if (this.anInt1137 >= this.anInt1138) {
			this.anInt1136 = this.anIntArray120[this.anInt1135++] << 15;
			if (this.anInt1135 >= this.anInt1131) {
				this.anInt1135 = this.anInt1131 - 1;
			}
			this.anInt1138 = (int) ((double) this.anIntArray121[this.anInt1135] / 65536.0D * (double) arg0);
			if (this.anInt1138 > this.anInt1137) {
				this.anInt1139 = ((this.anIntArray120[this.anInt1135] << 15) - this.anInt1136) / (this.anInt1138 - this.anInt1137);
			}
		}
		this.anInt1136 += this.anInt1139;
		this.anInt1137++;
		return this.anInt1136 - this.anInt1139 >> 15;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	public void method745() {
		this.anInt1138 = 0;
		this.anInt1135 = 0;
		this.anInt1139 = 0;
		this.anInt1136 = 0;
		this.anInt1137 = 0;
	}
}
