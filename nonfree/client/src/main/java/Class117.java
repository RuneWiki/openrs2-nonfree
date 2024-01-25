import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class117 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public int anInt3053;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public int anInt3055;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	public int anInt3056;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	private int anInt3057;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	private int anInt3058;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	private int anInt3059;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	private int anInt3060;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
	private int anInt3061;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	private int anInt3054 = 2;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
	private int[] anIntArray368 = new int[2];

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
	private int[] anIntArray369 = new int[2];

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class117() {
		this.anIntArray368[0] = 0;
		this.anIntArray368[1] = 65535;
		this.anIntArray369[0] = 0;
		this.anIntArray369[1] = 65535;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ec;)V")
	public void method3214(@OriginalArg(0) Class6_Sub10 arg0) {
		this.anInt3053 = arg0.method3972();
		this.anInt3056 = arg0.method3979();
		this.anInt3055 = arg0.method3979();
		this.method3215(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lclient!ec;)V")
	public void method3215(@OriginalArg(0) Class6_Sub10 arg0) {
		this.anInt3054 = arg0.method3972();
		this.anIntArray368 = new int[this.anInt3054];
		this.anIntArray369 = new int[this.anInt3054];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3054; local16++) {
			this.anIntArray368[local16] = arg0.method4021();
			this.anIntArray369[local16] = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)I")
	public int method3216(@OriginalArg(0) int arg0) {
		if (this.anInt3059 >= this.anInt3061) {
			this.anInt3057 = this.anIntArray369[this.anInt3060++] << 15;
			if (this.anInt3060 >= this.anInt3054) {
				this.anInt3060 = this.anInt3054 - 1;
			}
			this.anInt3061 = (int) ((double) this.anIntArray368[this.anInt3060] / 65536.0D * (double) arg0);
			if (this.anInt3061 > this.anInt3059) {
				this.anInt3058 = ((this.anIntArray369[this.anInt3060] << 15) - this.anInt3057) / (this.anInt3061 - this.anInt3059);
			}
		}
		this.anInt3057 += this.anInt3058;
		this.anInt3059++;
		return this.anInt3057 - this.anInt3058 >> 15;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
	public void method3217() {
		this.anInt3061 = 0;
		this.anInt3060 = 0;
		this.anInt3058 = 0;
		this.anInt3057 = 0;
		this.anInt3059 = 0;
	}
}
