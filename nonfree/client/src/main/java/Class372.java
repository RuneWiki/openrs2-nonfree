import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class372 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public int anInt10394;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public int anInt10395;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
	public int anInt10396;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
	private int anInt10397;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
	private int anInt10398;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	private int anInt10399;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	private int anInt10400;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	private int anInt10401;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	private int anInt10393 = 2;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "[I")
	private int[] anIntArray582 = new int[2];

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
	private int[] anIntArray581 = new int[2];

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class372() {
		this.anIntArray582[0] = 0;
		this.anIntArray582[1] = 65535;
		this.anIntArray581[0] = 0;
		this.anIntArray581[1] = 65535;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(Lclient!ib;)V")
	public void method8920(@OriginalArg(0) Class5_Sub23 arg0) {
		this.anInt10395 = arg0.method8529();
		this.anInt10394 = arg0.method8527();
		this.anInt10396 = arg0.method8527();
		this.method8922(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
	public int method8921(@OriginalArg(0) int arg0) {
		if (this.anInt10401 >= this.anInt10398) {
			this.anInt10397 = this.anIntArray581[this.anInt10399++] << 15;
			if (this.anInt10399 >= this.anInt10393) {
				this.anInt10399 = this.anInt10393 - 1;
			}
			this.anInt10398 = (int) ((double) this.anIntArray582[this.anInt10399] / 65536.0D * (double) arg0);
			if (this.anInt10398 > this.anInt10401) {
				this.anInt10400 = ((this.anIntArray581[this.anInt10399] << 15) - this.anInt10397) / (this.anInt10398 - this.anInt10401);
			}
		}
		this.anInt10397 += this.anInt10400;
		this.anInt10401++;
		return this.anInt10397 - this.anInt10400 >> 15;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!ib;)V")
	public void method8922(@OriginalArg(0) Class5_Sub23 arg0) {
		this.anInt10393 = arg0.method8529();
		this.anIntArray582 = new int[this.anInt10393];
		this.anIntArray581 = new int[this.anInt10393];
		for (@Pc(16) int local16 = 0; local16 < this.anInt10393; local16++) {
			this.anIntArray582[local16] = arg0.method8519();
			this.anIntArray581[local16] = arg0.method8519();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "()V")
	public void method8923() {
		this.anInt10398 = 0;
		this.anInt10399 = 0;
		this.anInt10400 = 0;
		this.anInt10397 = 0;
		this.anInt10401 = 0;
	}
}
