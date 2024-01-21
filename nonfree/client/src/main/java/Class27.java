import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class27 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public int anInt938;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public int anInt939;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
	public int anInt940;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	private int anInt941 = 2;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
	private int[] anIntArray108 = new int[2];

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
	private int[] anIntArray109 = new int[2];

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class27() {
		this.anIntArray108[0] = 0;
		this.anIntArray108[1] = 65535;
		this.anIntArray109[0] = 0;
		this.anIntArray109[1] = 65535;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
	public void method657() {
		this.anInt945 = 0;
		this.anInt944 = 0;
		this.anInt942 = 0;
		this.anInt943 = 0;
		this.anInt946 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ic;)V")
	public void method658(@OriginalArg(0) Class2_Sub10 arg0) {
		this.anInt938 = arg0.method1514();
		this.anInt939 = arg0.method1532();
		this.anInt940 = arg0.method1532();
		this.method659(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!ic;)V")
	public void method659(@OriginalArg(0) Class2_Sub10 arg0) {
		this.anInt941 = arg0.method1514();
		this.anIntArray108 = new int[this.anInt941];
		this.anIntArray109 = new int[this.anInt941];
		for (@Pc(16) int local16 = 0; local16 < this.anInt941; local16++) {
			this.anIntArray108[local16] = arg0.method1517();
			this.anIntArray109[local16] = arg0.method1517();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	public int method660(@OriginalArg(0) int arg0) {
		if (this.anInt946 >= this.anInt945) {
			this.anInt943 = this.anIntArray109[this.anInt944++] << 15;
			if (this.anInt944 >= this.anInt941) {
				this.anInt944 = this.anInt941 - 1;
			}
			this.anInt945 = (int) ((double) this.anIntArray108[this.anInt944] / 65536.0D * (double) arg0);
			if (this.anInt945 > this.anInt946) {
				this.anInt942 = ((this.anIntArray109[this.anInt944] << 15) - this.anInt943) / (this.anInt945 - this.anInt946);
			}
		}
		this.anInt943 += this.anInt942;
		this.anInt946++;
		return this.anInt943 - this.anInt942 >> 15;
	}
}
