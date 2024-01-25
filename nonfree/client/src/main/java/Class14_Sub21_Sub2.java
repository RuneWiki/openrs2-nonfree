import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class14_Sub21_Sub2 extends Class14_Sub21 {

	@OriginalMember(owner = "client!rea", name = "Mb", descriptor = "Lclient!k;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "client!rea", name = "Ub", descriptor = "I")
	private int anInt8999;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(I)V")
	public Class14_Sub21_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "([BIII)V")
	public void method7758(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			arg0[local8] = (byte) (super.aByteArray99[super.anInt8936++] - this.aClass197_1.method4900());
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!k;)V")
	public void method7759(@OriginalArg(1) Class197 arg0) {
		this.aClass197_1 = arg0;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "([II)V")
	public void method7760(@OriginalArg(0) int[] arg0) {
		this.aClass197_1 = new Class197(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "(II)V")
	public void method7761(@OriginalArg(1) int arg0) {
		super.aByteArray99[super.anInt8936++] = (byte) (arg0 + this.aClass197_1.method4900());
	}

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "(BI)I")
	public int method7764(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = this.anInt8999 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt8999 & 0x7);
		this.anInt8999 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local15) {
			local31 += (Static313.anIntArray308[local15] & super.aByteArray99[local8++]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local31 += super.aByteArray99[local8] & Static313.anIntArray308[local15];
		} else {
			local31 += super.aByteArray99[local8] >> local15 - arg0 & Static313.anIntArray308[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!rea", name = "o", descriptor = "(II)I")
	public int method7765(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt8999;
	}

	@OriginalMember(owner = "client!rea", name = "A", descriptor = "(I)V")
	public void method7766() {
		this.anInt8999 = super.anInt8936 * 8;
	}

	@OriginalMember(owner = "client!rea", name = "B", descriptor = "(I)Z")
	public boolean method7767() {
		@Pc(25) int local25 = super.aByteArray99[super.anInt8936] - this.aClass197_1.method4903() & 0xFF;
		return local25 >= 128;
	}

	@OriginalMember(owner = "client!rea", name = "C", descriptor = "(I)V")
	public void method7768() {
		super.anInt8936 = (this.anInt8999 + 7) / 8;
	}

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "(B)I")
	public int method7769() {
		@Pc(21) int local21 = super.aByteArray99[super.anInt8936++] - this.aClass197_1.method4900() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (super.aByteArray99[super.anInt8936++] - this.aClass197_1.method4900() & 0xFF);
	}
}
