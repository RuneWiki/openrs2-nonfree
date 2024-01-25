import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class17 {

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
	public int anInt371;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
	public int anInt372;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	public int anInt373;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
	private int anInt370 = 2;

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "[I")
	private int[] anIntArray25 = new int[2];

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "[I")
	private int[] anIntArray24 = new int[2];

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class17() {
		this.anIntArray25[0] = 0;
		this.anIntArray25[1] = 65535;
		this.anIntArray24[0] = 0;
		this.anIntArray24[1] = 65535;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "()V")
	public void method308() {
		this.anInt374 = 0;
		this.anInt378 = 0;
		this.anInt377 = 0;
		this.anInt376 = 0;
		this.anInt375 = 0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!wn;)V")
	public void method309(@OriginalArg(0) Class4_Sub20 arg0) {
		this.anInt370 = arg0.method4614();
		this.anIntArray25 = new int[this.anInt370];
		this.anIntArray24 = new int[this.anInt370];
		for (@Pc(16) int local16 = 0; local16 < this.anInt370; local16++) {
			this.anIntArray25[local16] = arg0.method4560();
			this.anIntArray24[local16] = arg0.method4560();
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(Lclient!wn;)V")
	public void method310(@OriginalArg(0) Class4_Sub20 arg0) {
		this.anInt372 = arg0.method4614();
		this.anInt371 = arg0.method4595();
		this.anInt373 = arg0.method4595();
		this.method309(arg0);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)I")
	public int method311(@OriginalArg(0) int arg0) {
		if (this.anInt375 >= this.anInt374) {
			this.anInt376 = this.anIntArray24[this.anInt378++] << 15;
			if (this.anInt378 >= this.anInt370) {
				this.anInt378 = this.anInt370 - 1;
			}
			this.anInt374 = (int) ((double) this.anIntArray25[this.anInt378] / 65536.0D * (double) arg0);
			if (this.anInt374 > this.anInt375) {
				this.anInt377 = ((this.anIntArray24[this.anInt378] << 15) - this.anInt376) / (this.anInt374 - this.anInt375);
			}
		}
		this.anInt376 += this.anInt377;
		this.anInt375++;
		return this.anInt376 - this.anInt377 >> 15;
	}
}
