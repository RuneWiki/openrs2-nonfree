import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!hb", name = "mc", descriptor = "Lclient!kd;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!hb", name = "oc", descriptor = "I")
	private int anInt1282;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "(B)V")
	public void method730() {
		super.anInt1266 = (this.anInt1282 + 7) / 8;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(BI)V")
	public void method731(@OriginalArg(1) int arg0) {
		super.aByteArray6[super.anInt1266++] = (byte) (this.aClass33_1.method1045() + arg0);
	}

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "(I)V")
	public void method733() {
		this.anInt1282 = super.anInt1266 * 8;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[I)V")
	public void method734(@OriginalArg(1) int[] arg0) {
		this.aClass33_1 = new Class33(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "(B)I")
	public int method736() {
		return super.aByteArray6[super.anInt1266++] - this.aClass33_1.method1045() & 0xFF;
	}

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "(II)I")
	public int method739(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt1282 >> 3;
		@Pc(16) int local16 = 8 - (this.anInt1282 & 0x7);
		@Pc(18) int local18 = 0;
		this.anInt1282 += arg0;
		while (arg0 > local16) {
			local18 += (Static3.anIntArray15[local16] & super.aByteArray6[local8++]) << arg0 - local16;
			arg0 -= local16;
			local16 = 8;
		}
		if (arg0 == local16) {
			local18 += Static3.anIntArray15[local16] & super.aByteArray6[local8];
		} else {
			local18 += Static3.anIntArray15[arg0] & super.aByteArray6[local8] >> local16 - arg0;
		}
		return local18;
	}

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "(II)I")
	public int method741(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1282;
	}
}
