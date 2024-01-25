import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class287 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
	public int anInt8401;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
	public int anInt8403;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
	public int anInt8404;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
	private int anInt8405;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
	private int anInt8406;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
	private int anInt8407;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	private int anInt8408;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
	private int anInt8409;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	private int anInt8402 = 2;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[I")
	private int[] anIntArray423 = new int[2];

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[I")
	private int[] anIntArray424 = new int[2];

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class287() {
		this.anIntArray423[0] = 0;
		this.anIntArray423[1] = 65535;
		this.anIntArray424[0] = 0;
		this.anIntArray424[1] = 65535;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()V")
	public void method7494() {
		this.anInt8405 = 0;
		this.anInt8407 = 0;
		this.anInt8409 = 0;
		this.anInt8408 = 0;
		this.anInt8406 = 0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!ol;)V")
	public void method7495(@OriginalArg(0) Class2_Sub8 arg0) {
		this.anInt8402 = arg0.method5203();
		this.anIntArray423 = new int[this.anInt8402];
		this.anIntArray424 = new int[this.anInt8402];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8402; local16++) {
			this.anIntArray423[local16] = arg0.method5211();
			this.anIntArray424[local16] = arg0.method5211();
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)I")
	public int method7496(@OriginalArg(0) int arg0) {
		if (this.anInt8406 >= this.anInt8405) {
			this.anInt8408 = this.anIntArray424[this.anInt8407++] << 15;
			if (this.anInt8407 >= this.anInt8402) {
				this.anInt8407 = this.anInt8402 - 1;
			}
			this.anInt8405 = (int) ((double) this.anIntArray423[this.anInt8407] / 65536.0D * (double) arg0);
			if (this.anInt8405 > this.anInt8406) {
				this.anInt8409 = ((this.anIntArray424[this.anInt8407] << 15) - this.anInt8408) / (this.anInt8405 - this.anInt8406);
			}
		}
		this.anInt8408 += this.anInt8409;
		this.anInt8406++;
		return this.anInt8408 - this.anInt8409 >> 15;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Lclient!ol;)V")
	public void method7497(@OriginalArg(0) Class2_Sub8 arg0) {
		this.anInt8403 = arg0.method5203();
		this.anInt8404 = arg0.method5172();
		this.anInt8401 = arg0.method5172();
		this.method7495(arg0);
	}
}
