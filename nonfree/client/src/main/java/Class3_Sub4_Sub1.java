import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!e", name = "Wb", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!e", name = "jc", descriptor = "Lclient!fd;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!e", name = "l", descriptor = "(II)I")
	public int method461(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt675;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(BI)I")
	public int method462(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = 8 - (this.anInt675 & 0x7);
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = this.anInt675 >> 3;
		this.anInt675 += arg0;
		while (local9 < arg0) {
			local15 += (super.aByteArray4[local20++] & Static69.anIntArray285[local9]) << arg0 - local9;
			arg0 -= local9;
			local9 = 8;
		}
		if (local9 == arg0) {
			local15 += Static69.anIntArray285[local9] & super.aByteArray4[local20];
		} else {
			local15 += super.aByteArray4[local20] >> local9 - arg0 & Static69.anIntArray285[arg0];
		}
		return local15;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([IB)V")
	public void method463(@OriginalArg(0) int[] arg0) {
		this.aClass28_1 = new Class28(arg0);
	}

	@OriginalMember(owner = "client!e", name = "m", descriptor = "(II)V")
	public void method464(@OriginalArg(0) int arg0) {
		super.aByteArray4[super.anInt627++] = (byte) (this.aClass28_1.method628() + arg0);
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(Z)V")
	public void method467() {
		super.anInt627 = (this.anInt675 + 7) / 8;
	}

	@OriginalMember(owner = "client!e", name = "r", descriptor = "(I)V")
	public void method468() {
		this.anInt675 = super.anInt627 * 8;
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(Z)I")
	public int method470() {
		return super.aByteArray4[super.anInt627++] - this.aClass28_1.method628() & 0xFF;
	}
}
