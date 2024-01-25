import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class4_Sub12_Sub1 extends Class4_Sub12 {

	@OriginalMember(owner = "client!cw", name = "Cb", descriptor = "Lclient!dp;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!cw", name = "Nb", descriptor = "I")
	private int anInt1270;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V")
	public Class4_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[B)V")
	public void method1132(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray36[super.anInt2997++] - this.aClass52_1.method1362());
		}
	}

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "(II)V")
	public void method1133(@OriginalArg(0) int arg0) {
		super.aByteArray36[super.anInt2997++] = (byte) (arg0 + this.aClass52_1.method1362());
	}

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "(B)V")
	public void method1135() {
		super.anInt2997 = (this.anInt1270 + 7) / 8;
	}

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "(I)V")
	public void method1136() {
		this.anInt1270 = super.anInt2997 * 8;
	}

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "(II)I")
	public int method1137(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1270;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "([II)V")
	public void method1139(@OriginalArg(0) int[] arg0) {
		this.aClass52_1 = new Class52(arg0);
	}

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "(I)I")
	public int method1140() {
		@Pc(21) int local21 = super.aByteArray36[super.anInt2997++] - this.aClass52_1.method1362() & 0xFF;
		return local21 < 128 ? local21 : (super.aByteArray36[super.anInt2997++] - this.aClass52_1.method1362() & 0xFF) + (local21 - 128 << 8);
	}

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "(I)Z")
	public boolean method1141() {
		@Pc(23) int local23 = super.aByteArray36[super.anInt2997] - this.aClass52_1.method1364() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "(II)I")
	public int method1143(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt1270 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt1270 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt1270 += arg0;
		while (local18 < arg0) {
			local20 += (super.aByteArray36[local10++] & Static20.anIntArray14[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += super.aByteArray36[local10] & Static20.anIntArray14[local18];
		} else {
			local20 += super.aByteArray36[local10] >> local18 - arg0 & Static20.anIntArray14[arg0];
		}
		return local20;
	}
}
