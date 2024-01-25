import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class104 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public int anInt2789;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
	public int anInt2791;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	public int anInt2792;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
	private int anInt2793;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
	private int anInt2794;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
	private int anInt2795;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
	private int anInt2796;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
	private int anInt2797;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
	private int anInt2790 = 2;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "[I")
	private int[] anIntArray127 = new int[2];

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "[I")
	private int[] anIntArray126 = new int[2];

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class104() {
		this.anIntArray127[0] = 0;
		this.anIntArray127[1] = 65535;
		this.anIntArray126[0] = 0;
		this.anIntArray126[1] = 65535;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ac;)V")
	public void method2450(@OriginalArg(0) Class1_Sub3 arg0) {
		this.anInt2789 = arg0.method7974();
		this.anInt2792 = arg0.method7940();
		this.anInt2791 = arg0.method7940();
		this.method2453(arg0);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "()V")
	public void method2451() {
		this.anInt2797 = 0;
		this.anInt2793 = 0;
		this.anInt2796 = 0;
		this.anInt2794 = 0;
		this.anInt2795 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
	public int method2452(@OriginalArg(0) int arg0) {
		if (this.anInt2795 >= this.anInt2797) {
			this.anInt2794 = this.anIntArray126[this.anInt2793++] << 15;
			if (this.anInt2793 >= this.anInt2790) {
				this.anInt2793 = this.anInt2790 - 1;
			}
			this.anInt2797 = (int) ((double) this.anIntArray127[this.anInt2793] / 65536.0D * (double) arg0);
			if (this.anInt2797 > this.anInt2795) {
				this.anInt2796 = ((this.anIntArray126[this.anInt2793] << 15) - this.anInt2794) / (this.anInt2797 - this.anInt2795);
			}
		}
		this.anInt2794 += this.anInt2796;
		this.anInt2795++;
		return this.anInt2794 - this.anInt2796 >> 15;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(Lclient!ac;)V")
	public void method2453(@OriginalArg(0) Class1_Sub3 arg0) {
		this.anInt2790 = arg0.method7974();
		this.anIntArray127 = new int[this.anInt2790];
		this.anIntArray126 = new int[this.anInt2790];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2790; local16++) {
			this.anIntArray127[local16] = arg0.method7945();
			this.anIntArray126[local16] = arg0.method7945();
		}
	}
}
