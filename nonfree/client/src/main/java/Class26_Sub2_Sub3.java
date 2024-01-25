import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class26_Sub2_Sub3 extends Class26_Sub2 {

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!vc;")
	private Class39_Sub8 aClass39_Sub8_3;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
	private int anInt3782 = 0;

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
	private int anInt3790 = 0;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
	private int anInt3787 = 0;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
	private int anInt3792 = -32768;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
	private final int anInt3785 = -1;

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
	private final int anInt3798;

	@OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
	private final int anInt3793;

	@OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
	public final int anInt3800;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "Lclient!qp;")
	private Class191 aClass191_2;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class26_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3787 = arg12;
		this.anInt3798 = arg0;
		this.anInt3793 = arg4;
		this.anInt3800 = arg2 + arg1;
		@Pc(50) Class45 local50 = Static168.aClass115_2.method2718(this.anInt3798);
		@Pc(53) int local53 = local50.anInt1316;
		if (local53 == -1) {
			this.aBoolean263 = true;
		} else {
			this.aClass191_2 = Static191.aClass28_1.method567(local53);
			this.aBoolean263 = false;
		}
		if (this.anInt3800 == arg2) {
			Static228.method3411(super.anInt7065, false, super.anInt7068, this.aClass191_2, this.anInt3790, super.aByte95);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public void method3158() {
		if (this.aClass39_Sub8_3 != null) {
			this.aClass39_Sub8_3.method5617();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)I")
	@Override
	public int method5522() {
		return this.anInt3792;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public void method3160(@OriginalArg(1) int arg0) {
		if (this.aBoolean263) {
			return;
		}
		this.anInt3782 += arg0;
		while (this.aClass191_2.anIntArray454[this.anInt3790] < this.anInt3782) {
			this.anInt3782 -= this.aClass191_2.anIntArray454[this.anInt3790];
			this.anInt3790++;
			if (this.aClass191_2.anIntArray452.length <= this.anInt3790) {
				this.aBoolean263 = true;
				break;
			}
		}
		if (!this.aBoolean263) {
			Static228.method3411(super.anInt7065, false, super.anInt7068, this.aClass191_2, this.anInt3790, super.aByte95);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lclient!qa;III)Lclient!c;")
	private Class37 method3161(@OriginalArg(0) Class109 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class45 local16 = Static168.aClass115_2.method2718(arg2);
		@Pc(21) Class136 local21 = Static328.aClass136Array3[super.aByte95];
		@Pc(36) Class136 local36 = this.anInt3793 < 3 ? Static328.aClass136Array3[this.anInt3793 + 1] : null;
		return this.aBoolean263 ? local16.method1102(-1, arg0, local21, local36, arg1, -1, super.anInt7065, 0, Static191.aClass28_1, super.anInt7063, super.anInt7068) : local16.method1102(this.anInt3785, arg0, local21, local36, arg1, this.anInt3790, super.anInt7065, this.anInt3782, Static191.aClass28_1, super.anInt7063, super.anInt7068);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!c;Lclient!qa;)V")
	private void method3162(@OriginalArg(1) Class37 arg0, @OriginalArg(2) Class109 arg1) {
		@Pc(6) Class252[] local6 = arg0.method4225();
		@Pc(9) Class122[] local9 = arg0.method4232();
		if ((this.aClass39_Sub8_3 == null || this.aClass39_Sub8_3.aBoolean470) && (local6 != null || local9 != null)) {
			this.aClass39_Sub8_3 = new Class39_Sub8(Static403.anInt6978);
		}
		if (this.aClass39_Sub8_3 != null) {
			this.aClass39_Sub8_3.method5618(arg1, (long) Static403.anInt6978, local6, local9);
			this.aClass39_Sub8_3.method5624(super.aByte95, super.aShort93, super.aShort92, super.aShort94, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ke", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass39_Sub8_3 != null) {
			this.aClass39_Sub8_3.method5617();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		@Pc(20) Class37 local20 = this.method3161(arg0, (this.anInt3787 == 0 ? 0 : 5) | 0x800, this.anInt3798);
		if (local20 == null) {
			return null;
		}
		if (this.anInt3787 != 0) {
			local20.k(this.anInt3787 * 2048);
		}
		@Pc(41) Class18 local41 = arg0.method4709();
		local41.R(super.anInt7068, super.anInt7063, super.anInt7065);
		if (this.aClass39_Sub8_3 == null) {
			local20.method4230(local41, null, 0);
		} else {
			@Pc(56) Class185 local56 = this.aClass39_Sub8_3.method5629();
			arg0.method4736(local20, local56, local41, null);
		}
		this.anInt3792 = local20.b();
		this.method3162(local20, arg0);
		return null;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
		@Pc(19) Class37 local19 = this.method3161(arg0, 0, this.anInt3798);
		if (local19 != null) {
			this.method3162(local19, arg0);
		}
	}
}
