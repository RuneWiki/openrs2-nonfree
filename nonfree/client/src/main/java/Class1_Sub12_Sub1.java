import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!je", name = "gc", descriptor = "Lclient!jc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!je", name = "pc", descriptor = "I")
	private int anInt1748;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(I)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([II)V")
	public void method1224(@OriginalArg(0) int[] arg0) {
		this.aClass33_1 = new Class33(arg0);
	}

	@OriginalMember(owner = "client!je", name = "k", descriptor = "(B)I")
	public int method1225() {
		return super.aByteArray12[super.anInt1694++] - this.aClass33_1.method1087() & 0xFF;
	}

	@OriginalMember(owner = "client!je", name = "k", descriptor = "(II)V")
	public void method1227(@OriginalArg(1) int arg0) {
		super.aByteArray12[super.anInt1694++] = (byte) (this.aClass33_1.method1087() + arg0);
	}

	@OriginalMember(owner = "client!je", name = "v", descriptor = "(I)V")
	public void method1228() {
		this.anInt1748 = super.anInt1694 * 8;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)I")
	public int method1230(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1748;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	public void method1231() {
		super.anInt1694 = (this.anInt1748 + 7) / 8;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(IB)I")
	public int method1232(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 8 - (this.anInt1748 & 0x7);
		@Pc(18) int local18 = this.anInt1748 >> 3;
		this.anInt1748 += arg0;
		@Pc(26) int local26 = 0;
		while (local13 < arg0) {
			local26 += (super.aByteArray12[local18++] & Static25.anIntArray101[local13]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (arg0 == local13) {
			local26 += super.aByteArray12[local18] & Static25.anIntArray101[local13];
		} else {
			local26 += super.aByteArray12[local18] >> local13 - arg0 & Static25.anIntArray101[arg0];
		}
		return local26;
	}
}
