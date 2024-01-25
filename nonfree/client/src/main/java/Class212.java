import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class212 {

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
	public int anInt6017;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
	public int anInt6018;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
	public int anInt6020;

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
	private int anInt6021;

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
	private int anInt6022;

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
	private int anInt6023;

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
	private int anInt6024;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
	private int anInt6025;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
	private int anInt6019 = 2;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "[I")
	private int[] anIntArray608 = new int[2];

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "[I")
	private int[] anIntArray607 = new int[2];

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	public Class212() {
		this.anIntArray608[0] = 0;
		this.anIntArray608[1] = 65535;
		this.anIntArray607[0] = 0;
		this.anIntArray607[1] = 65535;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!ge;)V")
	public void method5097(@OriginalArg(0) Class1_Sub6 arg0) {
		this.anInt6019 = arg0.method3922();
		this.anIntArray608 = new int[this.anInt6019];
		this.anIntArray607 = new int[this.anInt6019];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6019; local16++) {
			this.anIntArray608[local16] = arg0.method3967();
			this.anIntArray607[local16] = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Lclient!ge;)V")
	public void method5098(@OriginalArg(0) Class1_Sub6 arg0) {
		this.anInt6020 = arg0.method3922();
		this.anInt6017 = arg0.method3925();
		this.anInt6018 = arg0.method3925();
		this.method5097(arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)I")
	public int method5099(@OriginalArg(0) int arg0) {
		if (this.anInt6022 >= this.anInt6021) {
			this.anInt6025 = this.anIntArray607[this.anInt6023++] << 15;
			if (this.anInt6023 >= this.anInt6019) {
				this.anInt6023 = this.anInt6019 - 1;
			}
			this.anInt6021 = (int) ((double) this.anIntArray608[this.anInt6023] / 65536.0D * (double) arg0);
			if (this.anInt6021 > this.anInt6022) {
				this.anInt6024 = ((this.anIntArray607[this.anInt6023] << 15) - this.anInt6025) / (this.anInt6021 - this.anInt6022);
			}
		}
		this.anInt6025 += this.anInt6024;
		this.anInt6022++;
		return this.anInt6025 - this.anInt6024 >> 15;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "()V")
	public void method5100() {
		this.anInt6021 = 0;
		this.anInt6023 = 0;
		this.anInt6024 = 0;
		this.anInt6025 = 0;
		this.anInt6022 = 0;
	}
}
