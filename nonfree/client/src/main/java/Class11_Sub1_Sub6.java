import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class11_Sub1_Sub6 extends Class11_Sub1 {

	@OriginalMember(owner = "client!tr", name = "N", descriptor = "Lclient!lm;")
	private Class111_Sub4 aClass111_Sub4_6;

	@OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
	private int anInt6447 = 0;

	@OriginalMember(owner = "client!tr", name = "T", descriptor = "I")
	private int anInt6458 = -32768;

	@OriginalMember(owner = "client!tr", name = "K", descriptor = "I")
	private int anInt6450 = 0;

	@OriginalMember(owner = "client!tr", name = "I", descriptor = "Z")
	public boolean aBoolean564 = false;

	@OriginalMember(owner = "client!tr", name = "R", descriptor = "I")
	private int anInt6456 = 0;

	@OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
	private final int anInt6453 = -1;

	@OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
	private final int anInt6443;

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
	private final int anInt6439;

	@OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
	public final int anInt6445;

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "Lclient!eb;")
	private Class64 aClass64_2;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class11_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt6443 = arg4;
		this.anInt6439 = arg0;
		this.anInt6445 = arg2 + arg1;
		this.anInt6456 = arg12;
		@Pc(49) Class121 local49 = Static46.aClass123_5.method2677(this.anInt6439);
		@Pc(52) int local52 = local49.anInt3204;
		if (local52 == -1) {
			this.aBoolean564 = true;
		} else {
			this.aClass64_2 = Static402.aClass37_2.method665(local52);
			this.aBoolean564 = false;
		}
		if (this.anInt6445 == arg2) {
			Static379.method131(this.anInt6447, super.anInt6428, this.aClass64_2, super.aByte90, false, super.anInt6430);
		}
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)I")
	@Override
	public int method5184() {
		return this.anInt6458;
	}

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
		@Pc(11) Class8 local11 = this.method5192(arg0, this.anInt6439, 0);
		if (local11 != null) {
			this.method5190(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)V")
	public void method5188(@OriginalArg(1) int arg0) {
		if (this.aBoolean564) {
			return;
		}
		this.anInt6450 += arg0;
		while (this.anInt6450 > this.aClass64_2.anIntArray126[this.anInt6447]) {
			this.anInt6450 -= this.aClass64_2.anIntArray126[this.anInt6447];
			this.anInt6447++;
			if (this.aClass64_2.anIntArray127.length <= this.anInt6447) {
				this.aBoolean564 = true;
				break;
			}
		}
		if (!this.aBoolean564) {
			Static379.method131(this.anInt6447, super.anInt6428, this.aClass64_2, super.aByte90, false, super.anInt6430);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return false;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!e;ZLclient!za;)V")
	private void method5190(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class117 arg1) {
		@Pc(6) Class40[] local6 = arg0.method5995();
		@Pc(9) Class230[] local9 = arg0.method5988();
		if ((this.aClass111_Sub4_6 == null || this.aClass111_Sub4_6.aBoolean398) && (local6 != null || local9 != null)) {
			this.aClass111_Sub4_6 = new Class111_Sub4(Static98.anInt1304);
		}
		if (this.aClass111_Sub4_6 != null) {
			this.aClass111_Sub4_6.method3414(arg1, (long) Static98.anInt1304, local6, local9);
			this.aClass111_Sub4_6.method3419(super.aByte90, super.aShort103, super.aShort100, super.aShort101, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!tr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass111_Sub4_6 != null) {
			this.aClass111_Sub4_6.method3423();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!za;III)Lclient!e;")
	private Class8 method5192(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class121 local8 = Static46.aClass123_5.method2677(arg1);
		@Pc(18) Class139 local18 = Static157.aClass139Array1[super.aByte90];
		@Pc(33) Class139 local33 = this.anInt6443 >= 3 ? null : Static157.aClass139Array1[this.anInt6443 + 1];
		return this.aBoolean564 ? local8.method2595(arg2, Static402.aClass37_2, local18, local33, -1, super.anInt6428, arg0, super.anInt6437, 0, -1, super.anInt6430) : local8.method2595(arg2, Static402.aClass37_2, local18, local33, this.anInt6447, super.anInt6428, arg0, super.anInt6437, this.anInt6450, this.anInt6453, super.anInt6430);
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		@Pc(21) Class8 local21 = this.method5192(arg0, this.anInt6439, (this.anInt6456 == 0 ? 0 : 5) | 0x800);
		if (local21 == null) {
			return null;
		}
		if (this.anInt6456 != 0) {
			local21.ma(this.anInt6456 * 2048);
		}
		@Pc(42) Class34 local42 = arg0.method5685();
		local42.U(super.anInt6428, super.anInt6437, super.anInt6430);
		if (this.aClass111_Sub4_6 == null) {
			local21.method5987(local42, null, 0);
		} else {
			@Pc(57) Class232 local57 = this.aClass111_Sub4_6.method3422();
			arg0.method5659(local21, local57, local42, null);
		}
		this.anInt6458 = local21.B();
		this.method5190(local21, arg0);
		return null;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public void method5194() {
		if (this.aClass111_Sub4_6 != null) {
			this.aClass111_Sub4_6.method3423();
		}
	}
}
