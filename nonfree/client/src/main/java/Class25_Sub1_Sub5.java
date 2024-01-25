import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class25_Sub1_Sub5 extends Class25_Sub1 {

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "Lclient!pl;")
	private Class63_Sub5 aClass63_Sub5_5;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
	private int anInt5785 = 0;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
	private final int anInt5778 = -1;

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "Z")
	public boolean aBoolean429 = false;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
	private int anInt5792 = -32768;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
	private int anInt5783 = 0;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	private final int anInt5787;

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
	public final int anInt5791;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "Lclient!bb;")
	private Class17 aClass17_2;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class25_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt5787 = arg0;
		this.anInt5791 = arg2 + arg1;
		@Pc(40) int local40 = Static136.method2578(this.anInt5787).anInt3759;
		if (local40 == -1) {
			this.aBoolean429 = true;
		} else {
			this.aBoolean429 = false;
			this.aClass17_2 = Static261.method4492(local40);
		}
		if (this.anInt5791 == arg2) {
			Static207.method3696(this.anInt5783, super.anInt5769, this.aClass17_2, super.anInt5773, false);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!en;I)Lclient!mj;")
	private Class101 method5102(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class128 local14 = Static136.method2578(this.anInt5787);
		return this.aBoolean429 ? local14.method3470(arg1, arg0, 0, -1, -1) : local14.method3470(arg1, arg0, this.anInt5785, this.anInt5778, this.anInt5783);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)I")
	@Override
	public int method5096() {
		return this.anInt5792;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	public void method5103(@OriginalArg(0) int arg0) {
		if (this.aBoolean429) {
			return;
		}
		this.anInt5785 += arg0;
		while (this.aClass17_2.anIntArray26[this.anInt5783] < this.anInt5785) {
			this.anInt5785 -= this.aClass17_2.anIntArray26[this.anInt5783];
			this.anInt5783++;
			if (this.aClass17_2.anIntArray24.length <= this.anInt5783) {
				this.aBoolean429 = true;
				break;
			}
		}
		if (!this.aBoolean429) {
			Static207.method3696(this.anInt5783, super.anInt5769, this.aClass17_2, super.anInt5773, false);
		}
	}

	@OriginalMember(owner = "client!tb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass63_Sub5_5 != null) {
			this.aClass63_Sub5_5.method4124();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!en;Lclient!mj;B)V")
	private void method5104(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class101 arg1) {
		@Pc(14) Class140[] local14 = arg1.method5164();
		@Pc(17) Class151[] local17 = arg1.method5161();
		if ((this.aClass63_Sub5_5 == null || this.aClass63_Sub5_5.aBoolean343) && (local14 != null || local17 != null)) {
			this.aClass63_Sub5_5 = new Class63_Sub5(Static180.anInt3606);
		}
		if (this.aClass63_Sub5_5 != null) {
			this.aClass63_Sub5_5.method4118(arg0, (long) Static180.anInt3606, local14, local17);
			this.aClass63_Sub5_5.method4116(super.aByte62, super.aShort76, super.aShort73, super.aShort75, super.aShort74);
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public void method5105() {
		if (this.aClass63_Sub5_5 != null) {
			this.aClass63_Sub5_5.method4124();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
		@Pc(9) Class101 local9 = this.method5102(arg0, 0);
		if (local9 != null) {
			this.method5104(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		@Pc(21) Class101 local21 = this.method5102(arg0, 1024);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class112 local28 = arg0.method4798();
		local28.method3589(super.anInt5769, super.anInt5772, super.anInt5773);
		if (this.aClass63_Sub5_5 == null) {
			local21.method5172(local28, null, 0);
		} else {
			@Pc(50) Class21 local50 = this.aClass63_Sub5_5.method4125();
			arg0.method4811(local21, local50, local28, null);
		}
		this.anInt5792 = local21.method5147();
		this.method5104(arg0, local21);
		return null;
	}
}
