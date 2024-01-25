import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class5_Sub12_Sub2 extends Class5_Sub12 {

	@OriginalMember(owner = "client!wd", name = "Ib", descriptor = "I")
	private int anInt10200;

	@OriginalMember(owner = "client!wd", name = "Qb", descriptor = "Lclient!lg;")
	private Class208 aClass208_3;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class5_Sub12_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[I)V")
	public void method8660(@OriginalArg(1) int[] arg0) {
		this.aClass208_3 = new Class208(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)I")
	public int method8661(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt10200;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(ZI)V")
	public void method8662(@OriginalArg(1) int arg0) {
		super.aByteArray104[super.anInt10154++] = (byte) (this.aClass208_3.method4981() + arg0);
	}

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "(I)I")
	public int method8663() {
		@Pc(22) int local22 = super.aByteArray104[super.anInt10154++] - this.aClass208_3.method4981() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray104[super.anInt10154++] - this.aClass208_3.method4981() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BBI)V")
	public void method8665(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray104[super.anInt10154++] - this.aClass208_3.method4981());
		}
	}

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "(I)V")
	public void method8666() {
		super.anInt10154 = (this.anInt10200 + 7) / 8;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(Z)V")
	public void method8667() {
		this.anInt10200 = super.anInt10154 * 8;
	}

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "(I)Z")
	public boolean method8668() {
		@Pc(21) int local21 = super.aByteArray104[super.anInt10154] - this.aClass208_3.method4982() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!lg;I)V")
	public void method8669(@OriginalArg(0) Class208 arg0) {
		this.aClass208_3 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "(II)I")
	public int method8670(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt10200 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt10200 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt10200 += arg0;
		while (local18 < arg0) {
			local20 += (Static261.anIntArray357[local18] & super.aByteArray104[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += super.aByteArray104[local10] & Static261.anIntArray357[local18];
		} else {
			local20 += super.aByteArray104[local10] >> local18 - arg0 & Static261.anIntArray357[arg0];
		}
		return local20;
	}
}
