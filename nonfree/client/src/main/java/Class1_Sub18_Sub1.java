import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub18_Sub1 extends Class1_Sub18 {

	@OriginalMember(owner = "client!wb", name = "Zb", descriptor = "I")
	private int anInt3134;

	@OriginalMember(owner = "client!wb", name = "nc", descriptor = "Lclient!lb;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub18_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "(II)I")
	public int method2191(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3134;
	}

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "(I)V")
	public void method2193() {
		this.anInt3134 = super.anInt3078 * 8;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[I)V")
	public void method2194(@OriginalArg(1) int[] arg0) {
		this.aClass43_1 = new Class43(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "(B)V")
	public void method2198() {
		super.anInt3078 = (this.anInt3134 + 7) / 8;
	}

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "(II)I")
	public int method2199(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt3134 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt3134 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt3134 += arg0;
		while (local18 < arg0) {
			local20 += (Static17.anIntArray98[local18] & super.aByteArray96[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += Static17.anIntArray98[local18] & super.aByteArray96[local10];
		} else {
			local20 += super.aByteArray96[local10] >> local18 - arg0 & Static17.anIntArray98[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "(I)I")
	public int method2201() {
		return super.aByteArray96[super.anInt3078++] - this.aClass43_1.method1224() & 0xFF;
	}

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "(II)V")
	public void method2203(@OriginalArg(1) int arg0) {
		super.aByteArray96[super.anInt3078++] = (byte) (this.aClass43_1.method1224() + arg0);
	}
}
