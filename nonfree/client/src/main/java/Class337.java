import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class337 {

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
	public int anInt9007;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
	public int anInt9009;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
	public int anInt9010;

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
	private int anInt9011;

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
	private int anInt9012;

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "I")
	private int anInt9013;

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
	private int anInt9014;

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
	private int anInt9015;

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
	private int anInt9008 = 2;

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "[I")
	private int[] anIntArray605 = new int[2];

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "[I")
	private int[] anIntArray604 = new int[2];

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V")
	public Class337() {
		this.anIntArray605[0] = 0;
		this.anIntArray605[1] = 65535;
		this.anIntArray604[0] = 0;
		this.anIntArray604[1] = 65535;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!io;)V")
	public void method7460(@OriginalArg(0) Class1_Sub20 arg0) {
		this.anInt9008 = arg0.method4393();
		this.anIntArray605 = new int[this.anInt9008];
		this.anIntArray604 = new int[this.anInt9008];
		for (@Pc(16) int local16 = 0; local16 < this.anInt9008; local16++) {
			this.anIntArray605[local16] = arg0.method4426();
			this.anIntArray604[local16] = arg0.method4426();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)I")
	public int method7461(@OriginalArg(0) int arg0) {
		if (this.anInt9013 >= this.anInt9015) {
			this.anInt9014 = this.anIntArray604[this.anInt9011++] << 15;
			if (this.anInt9011 >= this.anInt9008) {
				this.anInt9011 = this.anInt9008 - 1;
			}
			this.anInt9015 = (int) ((double) this.anIntArray605[this.anInt9011] / 65536.0D * (double) arg0);
			if (this.anInt9015 > this.anInt9013) {
				this.anInt9012 = ((this.anIntArray604[this.anInt9011] << 15) - this.anInt9014) / (this.anInt9015 - this.anInt9013);
			}
		}
		this.anInt9014 += this.anInt9012;
		this.anInt9013++;
		return this.anInt9014 - this.anInt9012 >> 15;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "()V")
	public void method7462() {
		this.anInt9015 = 0;
		this.anInt9011 = 0;
		this.anInt9012 = 0;
		this.anInt9014 = 0;
		this.anInt9013 = 0;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Lclient!io;)V")
	public void method7463(@OriginalArg(0) Class1_Sub20 arg0) {
		this.anInt9010 = arg0.method4393();
		this.anInt9007 = arg0.method4371();
		this.anInt9009 = arg0.method4371();
		this.method7460(arg0);
	}
}
