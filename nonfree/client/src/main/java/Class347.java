import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class347 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
	public int anInt8892;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
	public int anInt8894;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
	public int anInt8895;

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
	private int anInt8896;

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	private int anInt8897;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
	private int anInt8898;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
	private int anInt8899;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
	private int anInt8900;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
	private int anInt8893 = 2;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "[I")
	private int[] anIntArray653 = new int[2];

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "[I")
	private int[] anIntArray654 = new int[2];

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
	public Class347() {
		this.anIntArray653[0] = 0;
		this.anIntArray653[1] = 65535;
		this.anIntArray654[0] = 0;
		this.anIntArray654[1] = 65535;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!qh;)V")
	public void method7397(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt8892 = arg0.method3118();
		this.anInt8895 = arg0.method3116();
		this.anInt8894 = arg0.method3116();
		this.method7399(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)I")
	public int method7398(@OriginalArg(0) int arg0) {
		if (this.anInt8897 >= this.anInt8899) {
			this.anInt8896 = this.anIntArray654[this.anInt8900++] << 15;
			if (this.anInt8900 >= this.anInt8893) {
				this.anInt8900 = this.anInt8893 - 1;
			}
			this.anInt8899 = (int) ((double) this.anIntArray653[this.anInt8900] / 65536.0D * (double) arg0);
			if (this.anInt8899 > this.anInt8897) {
				this.anInt8898 = ((this.anIntArray654[this.anInt8900] << 15) - this.anInt8896) / (this.anInt8899 - this.anInt8897);
			}
		}
		this.anInt8896 += this.anInt8898;
		this.anInt8897++;
		return this.anInt8896 - this.anInt8898 >> 15;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(Lclient!qh;)V")
	public void method7399(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt8893 = arg0.method3118();
		this.anIntArray653 = new int[this.anInt8893];
		this.anIntArray654 = new int[this.anInt8893];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8893; local16++) {
			this.anIntArray653[local16] = arg0.method3109();
			this.anIntArray654[local16] = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "()V")
	public void method7400() {
		this.anInt8899 = 0;
		this.anInt8900 = 0;
		this.anInt8898 = 0;
		this.anInt8896 = 0;
		this.anInt8897 = 0;
	}
}
