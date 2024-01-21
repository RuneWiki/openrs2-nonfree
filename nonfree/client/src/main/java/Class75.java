import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class75 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public int anInt2992;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public int anInt2994;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	private int anInt2996;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int anInt2997;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	private int anInt2998;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	private int anInt2999;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private int anInt3000;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt2993 = 2;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	private int[] anIntArray439 = new int[2];

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	private int[] anIntArray438 = new int[2];

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class75() {
		this.anIntArray439[0] = 0;
		this.anIntArray439[1] = 65535;
		this.anIntArray438[0] = 0;
		this.anIntArray438[1] = 65535;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!rd;)V")
	public void method2123(@OriginalArg(0) Class1_Sub20 arg0) {
		this.anInt2992 = arg0.method2053();
		this.anInt2994 = arg0.method2094();
		this.anInt2995 = arg0.method2094();
		this.method2125(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method2124() {
		this.anInt2998 = 0;
		this.anInt3000 = 0;
		this.anInt2997 = 0;
		this.anInt2996 = 0;
		this.anInt2999 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!rd;)V")
	public void method2125(@OriginalArg(0) Class1_Sub20 arg0) {
		this.anInt2993 = arg0.method2053();
		this.anIntArray439 = new int[this.anInt2993];
		this.anIntArray438 = new int[this.anInt2993];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2993; local16++) {
			this.anIntArray439[local16] = arg0.method2087();
			this.anIntArray438[local16] = arg0.method2087();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method2126(@OriginalArg(0) int arg0) {
		if (this.anInt2999 >= this.anInt2998) {
			this.anInt2996 = this.anIntArray438[this.anInt3000++] << 15;
			if (this.anInt3000 >= this.anInt2993) {
				this.anInt3000 = this.anInt2993 - 1;
			}
			this.anInt2998 = (int) ((double) this.anIntArray439[this.anInt3000] / 65536.0D * (double) arg0);
			if (this.anInt2998 > this.anInt2999) {
				this.anInt2997 = ((this.anIntArray438[this.anInt3000] << 15) - this.anInt2996) / (this.anInt2998 - this.anInt2999);
			}
		}
		this.anInt2996 += this.anInt2997;
		this.anInt2999++;
		return this.anInt2996 - this.anInt2997 >> 15;
	}
}
