import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class24_Sub3_Sub1 extends Class24_Sub3 {

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "Lclient!oi;")
	private Class40_Sub6 aClass40_Sub6_1;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
	private int anInt3282 = 0;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
	private int anInt3280 = 0;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
	private int anInt3288 = 0;

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "Z")
	public boolean aBoolean223 = false;

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
	private final int anInt3302 = -1;

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
	private int anInt3295 = -32768;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
	private final int anInt3296;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
	private final int anInt3281;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
	public final int anInt3287;

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "Lclient!jv;")
	private Class137 aClass137_1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class24_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3296 = arg0;
		this.anInt3281 = arg4;
		this.anInt3288 = arg12;
		this.anInt3287 = arg2 + arg1;
		@Pc(50) Class156 local50 = Static147.aClass107_1.method2639(this.anInt3296);
		@Pc(53) int local53 = local50.anInt4316;
		if (local53 == -1) {
			this.aBoolean223 = true;
		} else {
			this.aClass137_1 = Static281.aClass98_3.method2405(local53);
			this.aBoolean223 = false;
		}
		if (this.anInt3287 == arg2) {
			Static302.method4200(this.aClass137_1, super.anInt7092, super.anInt7094, super.aByte98, this.anInt3282, false);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass40_Sub6_1 != null) {
			this.aClass40_Sub6_1.method4097();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public void method2766() {
		if (this.aClass40_Sub6_1 != null) {
			this.aClass40_Sub6_1.method4097();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
	public void method2769(@OriginalArg(0) int arg0) {
		if (this.aBoolean223) {
			return;
		}
		this.anInt3280 += arg0;
		while (this.aClass137_1.anIntArray404[this.anInt3282] < this.anInt3280) {
			this.anInt3280 -= this.aClass137_1.anIntArray404[this.anInt3282];
			this.anInt3282++;
			if (this.aClass137_1.anIntArray403.length <= this.anInt3282) {
				this.aBoolean223 = true;
				break;
			}
		}
		if (!this.aBoolean223) {
			Static302.method4200(this.aClass137_1, super.anInt7092, super.anInt7094, super.aByte98, this.anInt3282, false);
		}
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)I")
	@Override
	public int method5579() {
		return this.anInt3295;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		@Pc(18) Class63 local18 = this.method2770(this.anInt3296, (this.anInt3288 == 0 ? 0 : 5) | 0x800, arg0);
		if (local18 == null) {
			return null;
		}
		if (this.anInt3288 != 0) {
			local18.ma(this.anInt3288 * 2048);
		}
		@Pc(42) Class34 local42 = arg0.method5819();
		local42.U(super.anInt7092, super.anInt7096, super.anInt7094);
		if (this.aClass40_Sub6_1 == null) {
			local18.method6090(local42, null, 0);
		} else {
			@Pc(57) Class121 local57 = this.aClass40_Sub6_1.method4088();
			arg0.method5845(local18, local57, local42, null);
		}
		this.anInt3295 = local18.B();
		this.method2771(arg0, local18);
		return null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
		@Pc(18) Class63 local18 = this.method2770(this.anInt3296, 0, arg0);
		if (local18 != null) {
			this.method2771(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZILclient!za;)Lclient!e;")
	private Class63 method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class50 arg2) {
		@Pc(20) Class156 local20 = Static147.aClass107_1.method2639(arg0);
		@Pc(25) Class154 local25 = Static256.aClass154Array2[super.aByte98];
		@Pc(40) Class154 local40 = this.anInt3281 >= 3 ? null : Static256.aClass154Array2[this.anInt3281 + 1];
		return this.aBoolean223 ? local20.method3465(-1, arg1, local40, super.anInt7094, -1, 0, arg2, local25, Static281.aClass98_3, super.anInt7092, super.anInt7096) : local20.method3465(this.anInt3302, arg1, local40, super.anInt7094, this.anInt3282, this.anInt3280, arg2, local25, Static281.aClass98_3, super.anInt7092, super.anInt7096);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!za;ZLclient!e;)V")
	private void method2771(@OriginalArg(0) Class50 arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(6) Class78[] local6 = arg1.method6094();
		@Pc(13) Class141[] local13 = arg1.method6098();
		if ((this.aClass40_Sub6_1 == null || this.aClass40_Sub6_1.aBoolean346) && (local6 != null || local13 != null)) {
			this.aClass40_Sub6_1 = new Class40_Sub6(Static400.anInt6752);
		}
		if (this.aClass40_Sub6_1 != null) {
			this.aClass40_Sub6_1.method4099(arg0, (long) Static400.anInt6752, local6, local13);
			this.aClass40_Sub6_1.method4091(super.aByte98, super.aShort107, super.aShort106, super.aShort105, super.aShort104);
		}
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		throw new IllegalStateException();
	}
}
