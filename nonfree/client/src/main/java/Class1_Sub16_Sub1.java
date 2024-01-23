import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class1_Sub16_Sub1 extends Class1_Sub16 {

	@OriginalMember(owner = "client!kn", name = "Mb", descriptor = "I")
	private int anInt3366;

	@OriginalMember(owner = "client!kn", name = "Xb", descriptor = "Lclient!cg;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "(B)V")
	public void method2666() {
		this.anInt3328 = (this.anInt3366 + 7) / 8;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(BI)I")
	public int method2668(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3366;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([BIBI)V")
	public void method2669(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray39[this.anInt3328++] - this.aClass29_1.method667());
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(BI)I")
	public int method2670(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt3366 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt3366 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt3366 += arg0;
		while (local17 < arg0) {
			local19 += (Static189.anIntArray379[local17] & this.aByteArray39[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local19 += Static189.anIntArray379[local17] & this.aByteArray39[local10];
		} else {
			local19 += this.aByteArray39[local10] >> local17 - arg0 & Static189.anIntArray379[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "(I)V")
	public void method2671() {
		this.anInt3366 = this.anInt3328 * 8;
	}

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "(I)I")
	public int method2672() {
		return this.aByteArray39[this.anInt3328++] - this.aClass29_1.method667() & 0xFF;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([IZ)V")
	public void method2673(@OriginalArg(0) int[] arg0) {
		this.aClass29_1 = new Class29(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "(II)V")
	public void method2676(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 + this.aClass29_1.method667());
	}
}
