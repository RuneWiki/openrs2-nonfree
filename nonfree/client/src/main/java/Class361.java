import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class361 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	public int anInt10228;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public int anInt10229;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public int anInt10230;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	private int anInt10231;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	private int anInt10232;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	private int anInt10233;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	private int anInt10234;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	private int anInt10235;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	private int anInt10227 = 2;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
	private int[] anIntArray582 = new int[2];

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "[I")
	private int[] anIntArray583 = new int[2];

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class361() {
		this.anIntArray582[0] = 0;
		this.anIntArray582[1] = 65535;
		this.anIntArray583[0] = 0;
		this.anIntArray583[1] = 65535;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	public void method8568() {
		this.anInt10234 = 0;
		this.anInt10233 = 0;
		this.anInt10235 = 0;
		this.anInt10231 = 0;
		this.anInt10232 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!rba;)V")
	public void method8569(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt10228 = arg0.method5322(-109);
		this.anInt10229 = arg0.method5312();
		this.anInt10230 = arg0.method5312();
		this.method8571(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
	public int method8570(@OriginalArg(0) int arg0) {
		if (this.anInt10232 >= this.anInt10234) {
			this.anInt10231 = this.anIntArray583[this.anInt10233++] << 15;
			if (this.anInt10233 >= this.anInt10227) {
				this.anInt10233 = this.anInt10227 - 1;
			}
			this.anInt10234 = (int) ((double) this.anIntArray582[this.anInt10233] / 65536.0D * (double) arg0);
			if (this.anInt10234 > this.anInt10232) {
				this.anInt10235 = ((this.anIntArray583[this.anInt10233] << 15) - this.anInt10231) / (this.anInt10234 - this.anInt10232);
			}
		}
		this.anInt10231 += this.anInt10235;
		this.anInt10232++;
		return this.anInt10231 - this.anInt10235 >> 15;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lclient!rba;)V")
	public void method8571(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt10227 = arg0.method5322(-51);
		this.anIntArray582 = new int[this.anInt10227];
		this.anIntArray583 = new int[this.anInt10227];
		for (@Pc(16) int local16 = 0; local16 < this.anInt10227; local16++) {
			this.anIntArray582[local16] = arg0.method5272();
			this.anIntArray583[local16] = arg0.method5272();
		}
	}
}
