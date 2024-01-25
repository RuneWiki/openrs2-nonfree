import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class109 {

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
	public int anInt2959;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
	public int anInt2960;

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
	public int anInt2961;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
	private int anInt2962;

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
	private int anInt2963;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
	private int anInt2964;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	private int anInt2965;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	private int anInt2966;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
	private int anInt2958 = 2;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "[I")
	private int[] anIntArray271 = new int[2];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "[I")
	private int[] anIntArray270 = new int[2];

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class109() {
		this.anIntArray271[0] = 0;
		this.anIntArray271[1] = 65535;
		this.anIntArray270[0] = 0;
		this.anIntArray270[1] = 65535;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)I")
	public int method2557(@OriginalArg(0) int arg0) {
		if (this.anInt2964 >= this.anInt2965) {
			this.anInt2963 = this.anIntArray270[this.anInt2966++] << 15;
			if (this.anInt2966 >= this.anInt2958) {
				this.anInt2966 = this.anInt2958 - 1;
			}
			this.anInt2965 = (int) ((double) this.anIntArray271[this.anInt2966] / 65536.0D * (double) arg0);
			if (this.anInt2965 > this.anInt2964) {
				this.anInt2962 = ((this.anIntArray270[this.anInt2966] << 15) - this.anInt2963) / (this.anInt2965 - this.anInt2964);
			}
		}
		this.anInt2963 += this.anInt2962;
		this.anInt2964++;
		return this.anInt2963 - this.anInt2962 >> 15;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!hp;)V")
	public void method2558(@OriginalArg(0) Class1_Sub5 arg0) {
		this.anInt2958 = arg0.method5366();
		this.anIntArray271 = new int[this.anInt2958];
		this.anIntArray270 = new int[this.anInt2958];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2958; local16++) {
			this.anIntArray271[local16] = arg0.method5362();
			this.anIntArray270[local16] = arg0.method5362();
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(Lclient!hp;)V")
	public void method2559(@OriginalArg(0) Class1_Sub5 arg0) {
		this.anInt2961 = arg0.method5366();
		this.anInt2960 = arg0.method5407();
		this.anInt2959 = arg0.method5407();
		this.method2558(arg0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "()V")
	public void method2560() {
		this.anInt2965 = 0;
		this.anInt2966 = 0;
		this.anInt2962 = 0;
		this.anInt2963 = 0;
		this.anInt2964 = 0;
	}
}
