import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class4_Sub2_Sub6 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ur", name = "N", descriptor = "Lclient!lr;")
	private Class38_Sub6 aClass38_Sub6_7;

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "Z")
	public boolean aBoolean604 = false;

	@OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
	private int anInt7120 = 0;

	@OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
	private int anInt7119 = 0;

	@OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
	private final int anInt7135 = -1;

	@OriginalMember(owner = "client!ur", name = "Z", descriptor = "I")
	private int anInt7139 = 0;

	@OriginalMember(owner = "client!ur", name = "W", descriptor = "I")
	private int anInt7136 = -32768;

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
	public final int anInt7128;

	@OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
	private final int anInt7129;

	@OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
	private final int anInt7124;

	@OriginalMember(owner = "client!ur", name = "B", descriptor = "Lclient!dc;")
	private Class46 aClass46_3;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class4_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7128 = arg2 + arg1;
		this.anInt7120 = arg12;
		this.anInt7129 = arg0;
		this.anInt7124 = arg4;
		@Pc(50) Class77 local50 = Static137.aClass16_2.method251(this.anInt7129);
		@Pc(53) int local53 = local50.anInt2238;
		if (local53 == -1) {
			this.aBoolean604 = true;
		} else {
			this.aClass46_3 = Static9.aClass194_1.method4371(local53);
			this.aBoolean604 = false;
		}
		if (this.anInt7128 == arg2) {
			Static4.method137(this.aClass46_3, this.anInt7119, super.anInt7111, super.aByte92, super.anInt7117, false);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass38_Sub6_7 != null) {
			this.aClass38_Sub6_7.method3548();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!qa;II)Lclient!c;")
	private Class32 method5569(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class77 local13 = Static137.aClass16_2.method251(arg0);
		@Pc(18) Class106 local18 = Static72.aClass106Array4[super.aByte92];
		@Pc(33) Class106 local33 = this.anInt7124 >= 3 ? null : Static72.aClass106Array4[this.anInt7124 + 1];
		return this.aBoolean604 ? local13.method1666(0, local33, super.anInt7109, -1, arg1, super.anInt7111, arg2, Static9.aClass194_1, local18, -1, super.anInt7117) : local13.method1666(this.anInt7139, local33, super.anInt7109, this.anInt7119, arg1, super.anInt7111, arg2, Static9.aClass194_1, local18, this.anInt7135, super.anInt7117);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		@Pc(18) Class32 local18 = this.method5569(this.anInt7129, arg0, (this.anInt7120 == 0 ? 0 : 5) | 0x800);
		if (local18 == null) {
			return null;
		}
		if (this.anInt7120 != 0) {
			local18.k(this.anInt7120 * 2048);
		}
		@Pc(42) Class102 local42 = arg0.method2223();
		local42.R(super.anInt7117, super.anInt7109, super.anInt7111);
		if (this.aClass38_Sub6_7 == null) {
			local18.method5675(local42, null, 0);
		} else {
			@Pc(64) Class192 local64 = this.aClass38_Sub6_7.method3549();
			arg0.method2218(local18, local64, local42, null);
		}
		this.anInt7136 = local18.b();
		this.method5571(local18, arg0);
		return null;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
	public void method5570(@OriginalArg(1) int arg0) {
		if (this.aBoolean604) {
			return;
		}
		this.anInt7139 += arg0;
		while (this.anInt7139 > this.aClass46_3.anIntArray89[this.anInt7119]) {
			this.anInt7139 -= this.aClass46_3.anIntArray89[this.anInt7119];
			this.anInt7119++;
			if (this.anInt7119 >= this.aClass46_3.anIntArray90.length) {
				this.aBoolean604 = true;
				break;
			}
		}
		if (!this.aBoolean604) {
			Static4.method137(this.aClass46_3, this.anInt7119, super.anInt7111, super.aByte92, super.anInt7117, false);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!c;Lclient!qa;)V")
	private void method5571(@OriginalArg(1) Class32 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(6) Class202[] local6 = arg0.method5673();
		@Pc(9) Class17[] local9 = arg0.method5667();
		if ((this.aClass38_Sub6_7 == null || this.aClass38_Sub6_7.aBoolean368) && (local6 != null || local9 != null)) {
			this.aClass38_Sub6_7 = new Class38_Sub6(Static164.anInt3206);
		}
		if (this.aClass38_Sub6_7 != null) {
			this.aClass38_Sub6_7.method3556(arg1, (long) Static164.anInt3206, local6, local9);
			this.aClass38_Sub6_7.method3555(super.aByte92, super.aShort88, super.aShort87, super.aShort89, super.aShort86);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)I")
	@Override
	public int method5562() {
		return this.anInt7136;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
	public void method5572() {
		if (this.aClass38_Sub6_7 != null) {
			this.aClass38_Sub6_7.method3548();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
		@Pc(17) Class32 local17 = this.method5569(this.anInt7129, arg0, 0);
		if (local17 != null) {
			this.method5571(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		throw new IllegalStateException();
	}
}
