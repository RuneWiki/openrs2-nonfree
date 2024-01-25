import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class102 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public int anInt3124;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public int anInt3125;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	private int anInt3128;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	private int anInt3129;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	private int anInt3130;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	private int anInt3131;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
	private int anInt3132;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	private int anInt3126 = 2;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[I")
	private int[] anIntArray300 = new int[2];

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
	private int[] anIntArray299 = new int[2];

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class102() {
		this.anIntArray300[0] = 0;
		this.anIntArray300[1] = 65535;
		this.anIntArray299[0] = 0;
		this.anIntArray299[1] = 65535;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!eh;)V")
	public void method2825(@OriginalArg(0) Class4_Sub9 arg0) {
		this.anInt3127 = arg0.method6015();
		this.anInt3125 = arg0.method6026();
		this.anInt3124 = arg0.method6026();
		this.method2827(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public void method2826() {
		this.anInt3129 = 0;
		this.anInt3131 = 0;
		this.anInt3130 = 0;
		this.anInt3128 = 0;
		this.anInt3132 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lclient!eh;)V")
	public void method2827(@OriginalArg(0) Class4_Sub9 arg0) {
		this.anInt3126 = arg0.method6015();
		this.anIntArray300 = new int[this.anInt3126];
		this.anIntArray299 = new int[this.anInt3126];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3126; local16++) {
			this.anIntArray300[local16] = arg0.method5982();
			this.anIntArray299[local16] = arg0.method5982();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
	public int method2828(@OriginalArg(0) int arg0) {
		if (this.anInt3132 >= this.anInt3129) {
			this.anInt3128 = this.anIntArray299[this.anInt3131++] << 15;
			if (this.anInt3131 >= this.anInt3126) {
				this.anInt3131 = this.anInt3126 - 1;
			}
			this.anInt3129 = (int) ((double) this.anIntArray300[this.anInt3131] / 65536.0D * (double) arg0);
			if (this.anInt3129 > this.anInt3132) {
				this.anInt3130 = ((this.anIntArray299[this.anInt3131] << 15) - this.anInt3128) / (this.anInt3129 - this.anInt3132);
			}
		}
		this.anInt3128 += this.anInt3130;
		this.anInt3132++;
		return this.anInt3128 - this.anInt3130 >> 15;
	}
}
