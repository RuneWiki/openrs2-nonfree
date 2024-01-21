import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class26 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	public int anInt1065;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
	public int anInt1066;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	public int anInt1067;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	private int anInt1068 = 2;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
	private int[] anIntArray113 = new int[2];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	private int[] anIntArray112 = new int[2];

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class26() {
		this.anIntArray113[0] = 0;
		this.anIntArray113[1] = 65535;
		this.anIntArray112[0] = 0;
		this.anIntArray112[1] = 65535;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
	public void method588() {
		this.anInt1069 = 0;
		this.anInt1070 = 0;
		this.anInt1073 = 0;
		this.anInt1072 = 0;
		this.anInt1071 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	public int method589(@OriginalArg(0) int arg0) {
		if (this.anInt1071 >= this.anInt1069) {
			this.anInt1072 = this.anIntArray112[this.anInt1070++] << 15;
			if (this.anInt1070 >= this.anInt1068) {
				this.anInt1070 = this.anInt1068 - 1;
			}
			this.anInt1069 = (int) ((double) this.anIntArray113[this.anInt1070] / 65536.0D * (double) arg0);
			if (this.anInt1069 > this.anInt1071) {
				this.anInt1073 = ((this.anIntArray112[this.anInt1070] << 15) - this.anInt1072) / (this.anInt1069 - this.anInt1071);
			}
		}
		this.anInt1072 += this.anInt1073;
		this.anInt1071++;
		return this.anInt1072 - this.anInt1073 >> 15;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!tf;)V")
	public void method590(@OriginalArg(0) Class4_Sub9 arg0) {
		this.anInt1066 = arg0.method773();
		this.anInt1067 = arg0.method780();
		this.anInt1065 = arg0.method780();
		this.method591(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!tf;)V")
	public void method591(@OriginalArg(0) Class4_Sub9 arg0) {
		this.anInt1068 = arg0.method773();
		this.anIntArray113 = new int[this.anInt1068];
		this.anIntArray112 = new int[this.anInt1068];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1068; local16++) {
			this.anIntArray113[local16] = arg0.method816();
			this.anIntArray112[local16] = arg0.method816();
		}
	}
}
