import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class228 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public int anInt5804;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public int anInt5806;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public int anInt5807;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	private int anInt5808;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int anInt5809;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	private int anInt5810;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	private int anInt5811;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private int anInt5812;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt5805 = 2;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	private int[] anIntArray632 = new int[2];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
	private int[] anIntArray631 = new int[2];

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class228() {
		this.anIntArray632[0] = 0;
		this.anIntArray632[1] = 65535;
		this.anIntArray631[0] = 0;
		this.anIntArray631[1] = 65535;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!rp;)V")
	public void method5213(@OriginalArg(0) Class3_Sub5 arg0) {
		this.anInt5806 = arg0.method2739();
		this.anInt5807 = arg0.method2726();
		this.anInt5804 = arg0.method2726();
		this.method5216(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method5214(@OriginalArg(0) int arg0) {
		if (this.anInt5809 >= this.anInt5812) {
			this.anInt5808 = this.anIntArray631[this.anInt5810++] << 15;
			if (this.anInt5810 >= this.anInt5805) {
				this.anInt5810 = this.anInt5805 - 1;
			}
			this.anInt5812 = (int) ((double) this.anIntArray632[this.anInt5810] / 65536.0D * (double) arg0);
			if (this.anInt5812 > this.anInt5809) {
				this.anInt5811 = ((this.anIntArray631[this.anInt5810] << 15) - this.anInt5808) / (this.anInt5812 - this.anInt5809);
			}
		}
		this.anInt5808 += this.anInt5811;
		this.anInt5809++;
		return this.anInt5808 - this.anInt5811 >> 15;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method5215() {
		this.anInt5812 = 0;
		this.anInt5810 = 0;
		this.anInt5811 = 0;
		this.anInt5808 = 0;
		this.anInt5809 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!rp;)V")
	public void method5216(@OriginalArg(0) Class3_Sub5 arg0) {
		this.anInt5805 = arg0.method2739();
		this.anIntArray632 = new int[this.anInt5805];
		this.anIntArray631 = new int[this.anInt5805];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5805; local16++) {
			this.anIntArray632[local16] = arg0.method2767();
			this.anIntArray631[local16] = arg0.method2767();
		}
	}
}
