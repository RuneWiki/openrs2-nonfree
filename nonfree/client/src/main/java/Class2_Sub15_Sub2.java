import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class2_Sub15_Sub2 extends Class2_Sub15 {

	@OriginalMember(owner = "client!ks", name = "Kb", descriptor = "I")
	private int anInt5280;

	@OriginalMember(owner = "client!ks", name = "Sb", descriptor = "Lclient!hr;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V")
	public Class2_Sub15_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "(II)V")
	public void method4352(@OriginalArg(1) int arg0) {
		super.aByteArray62[super.anInt5241++] = (byte) (arg0 + this.aClass145_1.method3320());
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLclient!hr;)V")
	public void method4353(@OriginalArg(1) Class145 arg0) {
		this.aClass145_1 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(Z)I")
	public int method4354() {
		@Pc(26) int local26 = super.aByteArray62[super.anInt5241++] - this.aClass145_1.method3320() & 0xFF;
		return local26 < 128 ? local26 : (super.aByteArray62[super.anInt5241++] - this.aClass145_1.method3320() & 0xFF) + (local26 - 128 << 8);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)I")
	public int method4355(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt5280 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt5280 & 0x7);
		this.anInt5280 += arg0;
		@Pc(25) int local25 = 0;
		while (local17 < arg0) {
			local25 += (super.aByteArray62[local10++] & Static432.anIntArray500[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local25 += Static432.anIntArray500[local17] & super.aByteArray62[local10];
		} else {
			local25 += super.aByteArray62[local10] >> local17 - arg0 & Static432.anIntArray500[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(ZI)I")
	public int method4356(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5280;
	}

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "(B)Z")
	public boolean method4359() {
		@Pc(17) int local17 = super.aByteArray62[super.anInt5241] - this.aClass145_1.method3324() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II[BI)V")
	public void method4360(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray62[super.anInt5241++] - this.aClass145_1.method3320());
		}
	}

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "(B)V")
	public void method4361() {
		super.anInt5241 = (this.anInt5280 + 7) / 8;
	}

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "(I)V")
	public void method4362() {
		this.anInt5280 = super.anInt5241 * 8;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B[I)V")
	public void method4363(@OriginalArg(1) int[] arg0) {
		this.aClass145_1 = new Class145(arg0);
	}
}
