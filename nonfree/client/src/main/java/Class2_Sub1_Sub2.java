import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ko", name = "V", descriptor = "Lclient!td;")
	private Class88_Sub6 aClass88_Sub6_3;

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
	private int anInt3684 = 0;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
	private int anInt3687 = 0;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "Z")
	public boolean aBoolean240 = false;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
	private int anInt3686 = 0;

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
	private int anInt3692 = -32768;

	@OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
	private final int anInt3695 = -1;

	@OriginalMember(owner = "client!ko", name = "ab", descriptor = "I")
	private final int anInt3698;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
	private final int anInt3690;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
	public final int anInt3677;

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "Lclient!kt;")
	private Class143 aClass143_3;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3698 = arg0;
		this.anInt3690 = arg4;
		this.anInt3677 = arg2 + arg1;
		this.anInt3684 = arg12;
		@Pc(50) Class63 local50 = Static3.aClass203_1.method4360(this.anInt3698);
		@Pc(53) int local53 = local50.anInt1705;
		if (local53 == -1) {
			this.aBoolean240 = true;
		} else {
			this.aClass143_3 = Static271.aClass219_4.method4752(local53);
			this.aBoolean240 = false;
		}
		if (this.anInt3677 == arg2) {
			Static340.method4406(false, this.aClass143_3, super.anInt7500, this.anInt3687, super.anInt7502, super.aByte105);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!za;II)Lclient!e;")
	private Class57 method2923(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class63 local16 = Static3.aClass203_1.method4360(arg0);
		@Pc(21) Class125 local21 = Static110.aClass125Array1[super.aByte105];
		@Pc(34) Class125 local34 = this.anInt3690 >= 3 ? null : Static110.aClass125Array1[this.anInt3690 + 1];
		return this.aBoolean240 ? local16.method1393(0, Static271.aClass219_4, -1, super.anInt7501, super.anInt7500, -1, arg1, local21, local34, arg2, super.anInt7502) : local16.method1393(this.anInt3686, Static271.aClass219_4, this.anInt3687, super.anInt7501, super.anInt7500, this.anInt3695, arg1, local21, local34, arg2, super.anInt7502);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)V")
	public void method2924(@OriginalArg(1) int arg0) {
		if (this.aBoolean240) {
			return;
		}
		this.anInt3686 += arg0;
		while (this.anInt3686 > this.aClass143_3.anIntArray239[this.anInt3687]) {
			this.anInt3686 -= this.aClass143_3.anIntArray239[this.anInt3687];
			this.anInt3687++;
			if (this.aClass143_3.anIntArray241.length <= this.anInt3687) {
				this.aBoolean240 = true;
				break;
			}
		}
		if (!this.aBoolean240) {
			Static340.method4406(false, this.aClass143_3, super.anInt7500, this.anInt3687, super.anInt7502, super.aByte105);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		@Pc(21) Class57 local21 = this.method2923(this.anInt3698, arg0, (this.anInt3684 == 0 ? 0 : 5) | 0x800);
		if (local21 == null) {
			return null;
		}
		if (this.anInt3684 != 0) {
			local21.ma(this.anInt3684 * 2048);
		}
		@Pc(45) Class29 local45 = arg0.method5866();
		local45.U(super.anInt7500, super.anInt7501, super.anInt7502);
		if (this.aClass88_Sub6_3 == null) {
			local21.method6060(local45, null, 0);
		} else {
			@Pc(60) Class255 local60 = this.aClass88_Sub6_3.method5045();
			arg0.method5869(local21, local60, local45, null);
		}
		this.anInt3692 = local21.B();
		this.method2926(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public void method2925() {
		if (this.aClass88_Sub6_3 != null) {
			this.aClass88_Sub6_3.method5051();
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!za;Lclient!e;)V")
	private void method2926(@OriginalArg(1) Class200 arg0, @OriginalArg(2) Class57 arg1) {
		@Pc(18) Class179[] local18 = arg1.method6073();
		@Pc(21) Class236[] local21 = arg1.method6064();
		if ((this.aClass88_Sub6_3 == null || this.aClass88_Sub6_3.aBoolean420) && (local18 != null || local21 != null)) {
			this.aClass88_Sub6_3 = new Class88_Sub6(Static85.anInt1536);
		}
		if (this.aClass88_Sub6_3 != null) {
			this.aClass88_Sub6_3.method5042(arg0, (long) Static85.anInt1536, local18, local21);
			this.aClass88_Sub6_3.method5052(super.aByte105, super.aShort107, super.aShort104, super.aShort106, super.aShort105);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
		@Pc(11) Class57 local11 = this.method2923(this.anInt3698, arg0, 0);
		if (local11 != null) {
			this.method2926(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)I")
	@Override
	public int method6031() {
		return this.anInt3692;
	}

	@OriginalMember(owner = "client!ko", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass88_Sub6_3 != null) {
			this.aClass88_Sub6_3.method5051();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
