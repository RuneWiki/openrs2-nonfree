import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class287 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public int anInt8893;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int anInt8895;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	public int anInt8896;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	private int anInt8897;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	private int anInt8898;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	private int anInt8899;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	private int anInt8900;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	private int anInt8901;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	private int anInt8894 = 2;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
	private int[] anIntArray567 = new int[2];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
	private int[] anIntArray566 = new int[2];

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class287() {
		this.anIntArray567[0] = 0;
		this.anIntArray567[1] = 65535;
		this.anIntArray566[0] = 0;
		this.anIntArray566[1] = 65535;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	public int method7460(@OriginalArg(0) int arg0) {
		if (this.anInt8898 >= this.anInt8899) {
			this.anInt8901 = this.anIntArray566[this.anInt8900++] << 15;
			if (this.anInt8900 >= this.anInt8894) {
				this.anInt8900 = this.anInt8894 - 1;
			}
			this.anInt8899 = (int) ((double) this.anIntArray567[this.anInt8900] / 65536.0D * (double) arg0);
			if (this.anInt8899 > this.anInt8898) {
				this.anInt8897 = ((this.anIntArray566[this.anInt8900] << 15) - this.anInt8901) / (this.anInt8899 - this.anInt8898);
			}
		}
		this.anInt8901 += this.anInt8897;
		this.anInt8898++;
		return this.anInt8901 - this.anInt8897 >> 15;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!cea;)V")
	public void method7461(@OriginalArg(0) Class2_Sub11 arg0) {
		this.anInt8893 = arg0.method8383();
		this.anInt8896 = arg0.method8381();
		this.anInt8895 = arg0.method8381();
		this.method7463(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	public void method7462() {
		this.anInt8899 = 0;
		this.anInt8900 = 0;
		this.anInt8897 = 0;
		this.anInt8901 = 0;
		this.anInt8898 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lclient!cea;)V")
	public void method7463(@OriginalArg(0) Class2_Sub11 arg0) {
		this.anInt8894 = arg0.method8383();
		this.anIntArray567 = new int[this.anInt8894];
		this.anIntArray566 = new int[this.anInt8894];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8894; local16++) {
			this.anIntArray567[local16] = arg0.method8326();
			this.anIntArray566[local16] = arg0.method8326();
		}
	}
}
