import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class219 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
	public int anInt6158;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
	public int anInt6159;

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
	public int anInt6160;

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
	private int anInt6162;

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
	private int anInt6163;

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
	private int anInt6164;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
	private int anInt6165;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
	private int anInt6166;

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
	private int anInt6161 = 2;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "[I")
	private int[] anIntArray362 = new int[2];

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "[I")
	private int[] anIntArray363 = new int[2];

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
	public Class219() {
		this.anIntArray362[0] = 0;
		this.anIntArray362[1] = 65535;
		this.anIntArray363[0] = 0;
		this.anIntArray363[1] = 65535;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!gga;)V")
	public void method5206(@OriginalArg(0) Class6_Sub23 arg0) {
		this.anInt6160 = arg0.method8374();
		this.anInt6159 = arg0.method8369();
		this.anInt6158 = arg0.method8369();
		this.method5208(arg0);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "()V")
	public void method5207() {
		this.anInt6165 = 0;
		this.anInt6166 = 0;
		this.anInt6164 = 0;
		this.anInt6163 = 0;
		this.anInt6162 = 0;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(Lclient!gga;)V")
	public void method5208(@OriginalArg(0) Class6_Sub23 arg0) {
		this.anInt6161 = arg0.method8374();
		this.anIntArray362 = new int[this.anInt6161];
		this.anIntArray363 = new int[this.anInt6161];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6161; local16++) {
			this.anIntArray362[local16] = arg0.method8363();
			this.anIntArray363[local16] = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)I")
	public int method5209(@OriginalArg(0) int arg0) {
		if (this.anInt6162 >= this.anInt6165) {
			this.anInt6163 = this.anIntArray363[this.anInt6166++] << 15;
			if (this.anInt6166 >= this.anInt6161) {
				this.anInt6166 = this.anInt6161 - 1;
			}
			this.anInt6165 = (int) ((double) this.anIntArray362[this.anInt6166] / 65536.0D * (double) arg0);
			if (this.anInt6165 > this.anInt6162) {
				this.anInt6164 = ((this.anIntArray363[this.anInt6166] << 15) - this.anInt6163) / (this.anInt6165 - this.anInt6162);
			}
		}
		this.anInt6163 += this.anInt6164;
		this.anInt6162++;
		return this.anInt6163 - this.anInt6164 >> 15;
	}
}
