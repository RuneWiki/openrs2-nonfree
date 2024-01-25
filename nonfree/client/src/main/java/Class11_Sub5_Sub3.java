import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class11_Sub5_Sub3 extends Class11_Sub5 {

	@OriginalMember(owner = "client!mq", name = "U", descriptor = "Lclient!uh;")
	private Class71_Sub6 aClass71_Sub6_3;

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
	private int anInt4865 = 0;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
	private int anInt4860 = 0;

	@OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
	private int anInt4867 = 0;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
	private final int anInt4858 = -1;

	@OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
	private int anInt4873 = -32768;

	@OriginalMember(owner = "client!mq", name = "R", descriptor = "Z")
	public boolean aBoolean337 = false;

	@OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
	public final int anInt4868;

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
	private final int anInt4862;

	@OriginalMember(owner = "client!mq", name = "Z", descriptor = "I")
	private final int anInt4880;

	@OriginalMember(owner = "client!mq", name = "Q", descriptor = "Lclient!kg;")
	private Class130 aClass130_1;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class11_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4868 = arg1 + arg2;
		this.anInt4867 = arg12;
		this.anInt4862 = arg0;
		this.anInt4880 = arg4;
		@Pc(49) Class149 local49 = Static193.aClass186_1.method4462(this.anInt4862);
		@Pc(52) int local52 = local49.anInt4573;
		if (local52 == -1) {
			this.aBoolean337 = true;
		} else {
			this.aClass130_1 = Static143.aClass85_1.method2406(local52);
			this.aBoolean337 = false;
		}
		if (this.anInt4868 == arg2) {
			Static125.method2339(super.anInt7514, this.anInt4865, super.anInt7515, false, this.aClass130_1, super.aByte100);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!ka;Lclient!qa;)V")
	private void method4137(@OriginalArg(1) Class57 arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(14) Class61[] local14 = arg0.method6076();
		@Pc(17) Class239[] local17 = arg0.method6083();
		if ((this.aClass71_Sub6_3 == null || this.aClass71_Sub6_3.aBoolean535) && (local14 != null || local17 != null)) {
			this.aClass71_Sub6_3 = Static415.method5785(Static277.anInt2834);
		}
		if (this.aClass71_Sub6_3 != null) {
			this.aClass71_Sub6_3.method5792(arg1, (long) Static277.anInt2834, local14, local17);
			this.aClass71_Sub6_3.method5789(super.aByte100, super.aShort95, super.aShort94, super.aShort93, super.aShort92);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		@Pc(21) Class57 local21 = this.method4143(this.anInt4862, arg0, (this.anInt4867 == 0 ? 0 : 5) | 0x800);
		if (local21 == null) {
			return null;
		}
		if (this.anInt4867 != 0) {
			local21.l(this.anInt4867 * 2048);
		}
		@Pc(38) Class72 local38 = arg0.method2092();
		local38.C(super.anInt7514, super.anInt7511, super.anInt7515);
		if (this.aClass71_Sub6_3 == null) {
			local21.method6073(local38, null, 0);
		} else {
			@Pc(60) Class270 local60 = this.aClass71_Sub6_3.method5794();
			arg0.method2041(local21, local60, local38, null);
		}
		this.anInt4873 = local21.ja();
		this.method4137(local21, arg0);
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public void method4139() {
		if (this.aClass71_Sub6_3 != null) {
			this.aClass71_Sub6_3.method5788();
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)I")
	@Override
	public int method6044() {
		return this.anInt4873;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
	public void method4141(@OriginalArg(1) int arg0) {
		if (this.aBoolean337) {
			return;
		}
		this.anInt4860 += arg0;
		while (this.anInt4860 > this.aClass130_1.anIntArray308[this.anInt4865]) {
			this.anInt4860 -= this.aClass130_1.anIntArray308[this.anInt4865];
			this.anInt4865++;
			if (this.anInt4865 >= this.aClass130_1.anIntArray306.length) {
				this.aBoolean337 = true;
				break;
			}
		}
		if (!this.aBoolean337) {
			Static125.method2339(super.anInt7514, this.anInt4865, super.anInt7515, false, this.aClass130_1, super.aByte100);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
		@Pc(11) Class57 local11 = this.method4143(this.anInt4862, arg0, 0);
		if (local11 != null) {
			this.method4137(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!mq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass71_Sub6_3 != null) {
			this.aClass71_Sub6_3.method5788();
		}
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!qa;IB)Lclient!ka;")
	private Class57 method4143(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class149 local8 = Static193.aClass186_1.method4462(arg0);
		@Pc(21) Class14 local21 = Static267.aClass14Array2[super.aByte100];
		@Pc(36) Class14 local36 = this.anInt4880 < 3 ? Static267.aClass14Array2[this.anInt4880 + 1] : null;
		return this.aBoolean337 ? local8.method3924(arg2, super.anInt7514, 0, super.anInt7511, arg1, local21, Static143.aClass85_1, local36, super.anInt7515, -1, -1) : local8.method3924(arg2, super.anInt7514, this.anInt4860, super.anInt7511, arg1, local21, Static143.aClass85_1, local36, super.anInt7515, this.anInt4865, this.anInt4858);
	}
}
