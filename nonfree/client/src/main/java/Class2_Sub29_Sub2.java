import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class2_Sub29_Sub2 extends Class2_Sub29 {

	@OriginalMember(owner = "client!no", name = "zb", descriptor = "I")
	private int anInt6142;

	@OriginalMember(owner = "client!no", name = "Hb", descriptor = "Lclient!cg;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V")
	public Class2_Sub29_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!no", name = "p", descriptor = "(II)V")
	public void method5237(@OriginalArg(1) int arg0) {
		super.aByteArray96[super.anInt6132++] = (byte) (arg0 + this.aClass36_1.method1147());
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI[BI)V")
	public void method5238(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (super.aByteArray96[super.anInt6132++] - this.aClass36_1.method1147());
		}
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "(I)V")
	public void method5241() {
		super.anInt6132 = (this.anInt6142 + 7) / 8;
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(Z)I")
	public int method5242() {
		@Pc(22) int local22 = super.aByteArray96[super.anInt6132++] - this.aClass36_1.method1147() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray96[super.anInt6132++] - this.aClass36_1.method1147() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B[I)V")
	public void method5243(@OriginalArg(1) int[] arg0) {
		this.aClass36_1 = new Class36(arg0);
	}

	@OriginalMember(owner = "client!no", name = "x", descriptor = "(I)V")
	public void method5244() {
		this.anInt6142 = super.anInt6132 * 8;
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(IB)I")
	public int method5245(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6142;
	}

	@OriginalMember(owner = "client!no", name = "y", descriptor = "(I)Z")
	public boolean method5247() {
		@Pc(24) int local24 = super.aByteArray96[super.anInt6132] - this.aClass36_1.method1146() & 0xFF;
		return local24 >= 128;
	}

	@OriginalMember(owner = "client!no", name = "r", descriptor = "(II)I")
	public int method5248(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt6142 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt6142 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt6142 += arg0;
		while (arg0 > local18) {
			local20 += (Static68.anIntArray118[local18] & super.aByteArray96[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += super.aByteArray96[local10] & Static68.anIntArray118[local18];
		} else {
			local20 += super.aByteArray96[local10] >> local18 - arg0 & Static68.anIntArray118[arg0];
		}
		return local20;
	}
}
