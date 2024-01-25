import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class145 {

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
	public int anInt3791;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
	public int anInt3792;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
	public int anInt3793;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
	private int anInt3795;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
	private int anInt3796;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	private int anInt3797;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	private int anInt3798;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
	private int anInt3799;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	private int anInt3794 = 2;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "[I")
	private int[] anIntArray243 = new int[2];

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "[I")
	private int[] anIntArray244 = new int[2];

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
	public Class145() {
		this.anIntArray243[0] = 0;
		this.anIntArray243[1] = 65535;
		this.anIntArray244[0] = 0;
		this.anIntArray244[1] = 65535;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!fh;)V")
	public void method3001(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt3794 = arg0.method5539();
		this.anIntArray243 = new int[this.anInt3794];
		this.anIntArray244 = new int[this.anInt3794];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3794; local16++) {
			this.anIntArray243[local16] = arg0.method5598();
			this.anIntArray244[local16] = arg0.method5598();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I")
	public int method3002(@OriginalArg(0) int arg0) {
		if (this.anInt3798 >= this.anInt3799) {
			this.anInt3795 = this.anIntArray244[this.anInt3796++] << 15;
			if (this.anInt3796 >= this.anInt3794) {
				this.anInt3796 = this.anInt3794 - 1;
			}
			this.anInt3799 = (int) ((double) this.anIntArray243[this.anInt3796] / 65536.0D * (double) arg0);
			if (this.anInt3799 > this.anInt3798) {
				this.anInt3797 = ((this.anIntArray244[this.anInt3796] << 15) - this.anInt3795) / (this.anInt3799 - this.anInt3798);
			}
		}
		this.anInt3795 += this.anInt3797;
		this.anInt3798++;
		return this.anInt3795 - this.anInt3797 >> 15;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Lclient!fh;)V")
	public void method3003(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt3793 = arg0.method5539();
		this.anInt3792 = arg0.method5603();
		this.anInt3791 = arg0.method5603();
		this.method3001(arg0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
	public void method3004() {
		this.anInt3799 = 0;
		this.anInt3796 = 0;
		this.anInt3797 = 0;
		this.anInt3795 = 0;
		this.anInt3798 = 0;
	}
}
