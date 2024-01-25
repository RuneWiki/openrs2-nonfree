import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class127 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
	public int anInt3167;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
	public int anInt3170;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
	private int anInt3171;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
	private int anInt3172;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	private int anInt3173;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
	private int anInt3169 = 2;

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
	private int[] anIntArray171 = new int[2];

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "[I")
	private int[] anIntArray172 = new int[2];

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class127() {
		this.anIntArray171[0] = 0;
		this.anIntArray171[1] = 65535;
		this.anIntArray172[0] = 0;
		this.anIntArray172[1] = 65535;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "()V")
	public void method2619() {
		this.anInt3172 = 0;
		this.anInt3175 = 0;
		this.anInt3173 = 0;
		this.anInt3174 = 0;
		this.anInt3171 = 0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!dh;)V")
	public void method2620(@OriginalArg(0) Class1_Sub11 arg0) {
		this.anInt3169 = arg0.method4463();
		this.anIntArray171 = new int[this.anInt3169];
		this.anIntArray172 = new int[this.anInt3169];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3169; local16++) {
			this.anIntArray171[local16] = arg0.method4485();
			this.anIntArray172[local16] = arg0.method4485();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)I")
	public int method2621(@OriginalArg(0) int arg0) {
		if (this.anInt3171 >= this.anInt3172) {
			this.anInt3174 = this.anIntArray172[this.anInt3175++] << 15;
			if (this.anInt3175 >= this.anInt3169) {
				this.anInt3175 = this.anInt3169 - 1;
			}
			this.anInt3172 = (int) ((double) this.anIntArray171[this.anInt3175] / 65536.0D * (double) arg0);
			if (this.anInt3172 > this.anInt3171) {
				this.anInt3173 = ((this.anIntArray172[this.anInt3175] << 15) - this.anInt3174) / (this.anInt3172 - this.anInt3171);
			}
		}
		this.anInt3174 += this.anInt3173;
		this.anInt3171++;
		return this.anInt3174 - this.anInt3173 >> 15;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Lclient!dh;)V")
	public void method2622(@OriginalArg(0) Class1_Sub11 arg0) {
		this.anInt3168 = arg0.method4463();
		this.anInt3167 = arg0.method4487();
		this.anInt3170 = arg0.method4487();
		this.method2620(arg0);
	}
}
