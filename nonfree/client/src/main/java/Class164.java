import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class164 {

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	public int anInt4162;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
	public int anInt4163;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	public int anInt4164;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	private int anInt4165;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
	private int anInt4166;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	private int anInt4167;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
	private int anInt4168;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
	private int anInt4169;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	private int anInt4161 = 2;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
	private int[] anIntArray383 = new int[2];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
	private int[] anIntArray382 = new int[2];

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class164() {
		this.anIntArray383[0] = 0;
		this.anIntArray383[1] = 65535;
		this.anIntArray382[0] = 0;
		this.anIntArray382[1] = 65535;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
	public void method3377() {
		this.anInt4167 = 0;
		this.anInt4165 = 0;
		this.anInt4166 = 0;
		this.anInt4169 = 0;
		this.anInt4168 = 0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!hw;)V")
	public void method3378(@OriginalArg(0) Class2_Sub17 arg0) {
		this.anInt4161 = arg0.method6138();
		this.anIntArray383 = new int[this.anInt4161];
		this.anIntArray382 = new int[this.anInt4161];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4161; local16++) {
			this.anIntArray383[local16] = arg0.method6148();
			this.anIntArray382[local16] = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lclient!hw;)V")
	public void method3379(@OriginalArg(0) Class2_Sub17 arg0) {
		this.anInt4162 = arg0.method6138();
		this.anInt4164 = arg0.method6129();
		this.anInt4163 = arg0.method6129();
		this.method3378(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	public int method3380(@OriginalArg(0) int arg0) {
		if (this.anInt4168 >= this.anInt4167) {
			this.anInt4169 = this.anIntArray382[this.anInt4165++] << 15;
			if (this.anInt4165 >= this.anInt4161) {
				this.anInt4165 = this.anInt4161 - 1;
			}
			this.anInt4167 = (int) ((double) this.anIntArray383[this.anInt4165] / 65536.0D * (double) arg0);
			if (this.anInt4167 > this.anInt4168) {
				this.anInt4166 = ((this.anIntArray382[this.anInt4165] << 15) - this.anInt4169) / (this.anInt4167 - this.anInt4168);
			}
		}
		this.anInt4169 += this.anInt4166;
		this.anInt4168++;
		return this.anInt4169 - this.anInt4166 >> 15;
	}
}
