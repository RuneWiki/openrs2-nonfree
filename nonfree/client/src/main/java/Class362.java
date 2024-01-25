import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class362 {

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public int anInt9247;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	public int anInt9248;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public int anInt9249;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	private int anInt9250;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private int anInt9251;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private int anInt9252;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	private int anInt9253;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private int anInt9254;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	private int anInt9246 = 2;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
	private int[] anIntArray649 = new int[2];

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "[I")
	private int[] anIntArray648 = new int[2];

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class362() {
		this.anIntArray649[0] = 0;
		this.anIntArray649[1] = 65535;
		this.anIntArray648[0] = 0;
		this.anIntArray648[1] = 65535;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!es;)V")
	public void method7903(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt9246 = arg0.method8865();
		this.anIntArray649 = new int[this.anInt9246];
		this.anIntArray648 = new int[this.anInt9246];
		for (@Pc(16) int local16 = 0; local16 < this.anInt9246; local16++) {
			this.anIntArray649[local16] = arg0.method8859();
			this.anIntArray648[local16] = arg0.method8859();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public void method7904() {
		this.anInt9254 = 0;
		this.anInt9252 = 0;
		this.anInt9251 = 0;
		this.anInt9250 = 0;
		this.anInt9253 = 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
	public int method7905(@OriginalArg(0) int arg0) {
		if (this.anInt9253 >= this.anInt9254) {
			this.anInt9250 = this.anIntArray648[this.anInt9252++] << 15;
			if (this.anInt9252 >= this.anInt9246) {
				this.anInt9252 = this.anInt9246 - 1;
			}
			this.anInt9254 = (int) ((double) this.anIntArray649[this.anInt9252] / 65536.0D * (double) arg0);
			if (this.anInt9254 > this.anInt9253) {
				this.anInt9251 = ((this.anIntArray648[this.anInt9252] << 15) - this.anInt9250) / (this.anInt9254 - this.anInt9253);
			}
		}
		this.anInt9250 += this.anInt9251;
		this.anInt9253++;
		return this.anInt9250 - this.anInt9251 >> 15;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lclient!es;)V")
	public void method7906(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt9247 = arg0.method8865();
		this.anInt9248 = arg0.method8850();
		this.anInt9249 = arg0.method8850();
		this.method7903(arg0);
	}
}
