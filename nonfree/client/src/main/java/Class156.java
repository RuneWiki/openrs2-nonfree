import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class156 {

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	public int anInt3294;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	public int anInt3295;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
	public int anInt3297;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	private int anInt3298;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	private int anInt3299;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
	private int anInt3300;

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
	private int anInt3301;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
	private int anInt3302;

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
	private int anInt3296 = 2;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "[I")
	private int[] anIntArray272 = new int[2];

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "[I")
	private int[] anIntArray273 = new int[2];

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "()V")
	public Class156() {
		this.anIntArray272[0] = 0;
		this.anIntArray272[1] = 65535;
		this.anIntArray273[0] = 0;
		this.anIntArray273[1] = 65535;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!gk;)V")
	public void method2749(@OriginalArg(0) Class2_Sub7 arg0) {
		this.anInt3295 = arg0.method4464();
		this.anInt3294 = arg0.method4509();
		this.anInt3297 = arg0.method4509();
		this.method2751(arg0);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)I")
	public int method2750(@OriginalArg(0) int arg0) {
		if (this.anInt3302 >= this.anInt3299) {
			this.anInt3301 = this.anIntArray273[this.anInt3298++] << 15;
			if (this.anInt3298 >= this.anInt3296) {
				this.anInt3298 = this.anInt3296 - 1;
			}
			this.anInt3299 = (int) ((double) this.anIntArray272[this.anInt3298] / 65536.0D * (double) arg0);
			if (this.anInt3299 > this.anInt3302) {
				this.anInt3300 = ((this.anIntArray273[this.anInt3298] << 15) - this.anInt3301) / (this.anInt3299 - this.anInt3302);
			}
		}
		this.anInt3301 += this.anInt3300;
		this.anInt3302++;
		return this.anInt3301 - this.anInt3300 >> 15;
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(Lclient!gk;)V")
	public void method2751(@OriginalArg(0) Class2_Sub7 arg0) {
		this.anInt3296 = arg0.method4464();
		this.anIntArray272 = new int[this.anInt3296];
		this.anIntArray273 = new int[this.anInt3296];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3296; local16++) {
			this.anIntArray272[local16] = arg0.method4518();
			this.anIntArray273[local16] = arg0.method4518();
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "()V")
	public void method2752() {
		this.anInt3299 = 0;
		this.anInt3298 = 0;
		this.anInt3300 = 0;
		this.anInt3301 = 0;
		this.anInt3302 = 0;
	}
}
