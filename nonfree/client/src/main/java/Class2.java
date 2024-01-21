import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public int anInt7;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public int anInt8;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	private int anInt10;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	private int anInt12;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	private int anInt13;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	private int anInt6 = 2;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	private int[] anIntArray17 = new int[2];

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
	private int[] anIntArray16 = new int[2];

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2() {
		this.anIntArray17[0] = 0;
		this.anIntArray17[1] = 65535;
		this.anIntArray16[0] = 0;
		this.anIntArray16[1] = 65535;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
	public int method2(@OriginalArg(0) int arg0) {
		if (this.anInt13 >= this.anInt11) {
			this.anInt9 = this.anIntArray16[this.anInt12++] << 15;
			if (this.anInt12 >= this.anInt6) {
				this.anInt12 = this.anInt6 - 1;
			}
			this.anInt11 = (int) ((double) this.anIntArray17[this.anInt12] / 65536.0D * (double) arg0);
			if (this.anInt11 > this.anInt13) {
				this.anInt10 = ((this.anIntArray16[this.anInt12] << 15) - this.anInt9) / (this.anInt11 - this.anInt13);
			}
		}
		this.anInt9 += this.anInt10;
		this.anInt13++;
		return this.anInt9 - this.anInt10 >> 15;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!la;)V")
	public void method3(@OriginalArg(0) Class3_Sub12 arg0) {
		this.anInt7 = arg0.method1936();
		this.anInt5 = arg0.method1920();
		this.anInt8 = arg0.method1920();
		this.method5(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
	public void method4() {
		this.anInt11 = 0;
		this.anInt12 = 0;
		this.anInt10 = 0;
		this.anInt9 = 0;
		this.anInt13 = 0;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Lclient!la;)V")
	public void method5(@OriginalArg(0) Class3_Sub12 arg0) {
		this.anInt6 = arg0.method1936();
		this.anIntArray17 = new int[this.anInt6];
		this.anIntArray16 = new int[this.anInt6];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6; local16++) {
			this.anIntArray17[local16] = arg0.method1963();
			this.anIntArray16[local16] = arg0.method1963();
		}
	}
}
