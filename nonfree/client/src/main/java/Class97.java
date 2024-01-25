import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class97 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
	public int anInt2981;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	public int anInt2982;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	public int anInt2983;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	private int anInt2984;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	private int anInt2985;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	private int anInt2986;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	private int anInt2987;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	private int anInt2988;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	private int anInt2980 = 2;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
	private int[] anIntArray200 = new int[2];

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[I")
	private int[] anIntArray199 = new int[2];

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class97() {
		this.anIntArray200[0] = 0;
		this.anIntArray200[1] = 65535;
		this.anIntArray199[0] = 0;
		this.anIntArray199[1] = 65535;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!bk;)V")
	public void method2723(@OriginalArg(0) Class5_Sub1 arg0) {
		this.anInt2980 = arg0.method1832();
		this.anIntArray200 = new int[this.anInt2980];
		this.anIntArray199 = new int[this.anInt2980];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2980; local16++) {
			this.anIntArray200[local16] = arg0.method1845();
			this.anIntArray199[local16] = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
	public int method2724(@OriginalArg(0) int arg0) {
		if (this.anInt2988 >= this.anInt2986) {
			this.anInt2984 = this.anIntArray199[this.anInt2985++] << 15;
			if (this.anInt2985 >= this.anInt2980) {
				this.anInt2985 = this.anInt2980 - 1;
			}
			this.anInt2986 = (int) ((double) this.anIntArray200[this.anInt2985] / 65536.0D * (double) arg0);
			if (this.anInt2986 > this.anInt2988) {
				this.anInt2987 = ((this.anIntArray199[this.anInt2985] << 15) - this.anInt2984) / (this.anInt2986 - this.anInt2988);
			}
		}
		this.anInt2984 += this.anInt2987;
		this.anInt2988++;
		return this.anInt2984 - this.anInt2987 >> 15;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Lclient!bk;)V")
	public void method2725(@OriginalArg(0) Class5_Sub1 arg0) {
		this.anInt2982 = arg0.method1832();
		this.anInt2981 = arg0.method1826();
		this.anInt2983 = arg0.method1826();
		this.method2723(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
	public void method2726() {
		this.anInt2986 = 0;
		this.anInt2985 = 0;
		this.anInt2987 = 0;
		this.anInt2984 = 0;
		this.anInt2988 = 0;
	}
}
