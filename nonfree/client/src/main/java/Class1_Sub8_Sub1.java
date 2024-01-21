import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!bg", name = "Mb", descriptor = "[I")
	public static int[] anIntArray16 = new int[32];

	@OriginalMember(owner = "client!bg", name = "Ab", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!bg", name = "Lb", descriptor = "Lclient!gd;")
	private Class26 aClass26_1;

	static {
		@Pc(9) int local9 = 2;
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			anIntArray16[local11] = local9 - 1;
			local9 += local9;
		}
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)I")
	public int method364(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt450;
	}

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "(II)V")
	public void method366(@OriginalArg(0) int arg0) {
		super.aByteArray3[super.anInt446++] = (byte) (arg0 + this.aClass26_1.method1014());
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(B)V")
	public void method367() {
		super.anInt446 = (this.anInt450 + 7) / 8;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([IB)V")
	public void method368(@OriginalArg(0) int[] arg0) {
		this.aClass26_1 = new Class26(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "(B)V")
	public void method371() {
		this.anInt450 = super.anInt446 * 8;
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(Z)I")
	public int method372() {
		return super.aByteArray3[super.anInt446++] - this.aClass26_1.method1014() & 0xFF;
	}

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "(II)I")
	public int method375(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt450 >> 3;
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = 8 - (this.anInt450 & 0x7);
		this.anInt450 += arg0;
		while (local24 < arg0) {
			local17 += (super.aByteArray3[local15++] & Static75.anIntArray174[local24]) << arg0 - local24;
			arg0 -= local24;
			local24 = 8;
		}
		if (local24 == arg0) {
			local17 += Static75.anIntArray174[local24] & super.aByteArray3[local15];
		} else {
			local17 += super.aByteArray3[local15] >> local24 - arg0 & Static75.anIntArray174[arg0];
		}
		return local17;
	}
}
