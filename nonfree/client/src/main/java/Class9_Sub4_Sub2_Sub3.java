import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class9_Sub4_Sub2_Sub3 extends Class9_Sub4_Sub2 {

	@OriginalMember(owner = "client!or", name = "S", descriptor = "Lclient!lba;")
	private Class9_Sub5 aClass9_Sub5_4;

	@OriginalMember(owner = "client!or", name = "R", descriptor = "I")
	private int anInt7678 = 0;

	@OriginalMember(owner = "client!or", name = "V", descriptor = "Z")
	private boolean aBoolean602 = true;

	@OriginalMember(owner = "client!or", name = "N", descriptor = "I")
	private int anInt7675 = 0;

	@OriginalMember(owner = "client!or", name = "ab", descriptor = "I")
	private final int anInt7683 = -1;

	@OriginalMember(owner = "client!or", name = "ob", descriptor = "I")
	private int anInt7696 = 0;

	@OriginalMember(owner = "client!or", name = "W", descriptor = "Z")
	public boolean aBoolean603 = false;

	@OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
	private int anInt7681 = 0;

	@OriginalMember(owner = "client!or", name = "Z", descriptor = "I")
	private int anInt7682 = 0;

	@OriginalMember(owner = "client!or", name = "P", descriptor = "I")
	public final int anInt7677;

	@OriginalMember(owner = "client!or", name = "fb", descriptor = "I")
	private final int anInt7688;

	@OriginalMember(owner = "client!or", name = "rb", descriptor = "Lclient!gaa;")
	private Class113 aClass113_1;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class9_Sub4_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7682 = arg12;
		this.anInt7677 = arg2 + arg1;
		this.anInt7688 = arg0;
		@Pc(54) Class124 local54 = Static360.aClass312_2.method7492(this.anInt7688);
		@Pc(57) int local57 = local54.anInt4155;
		if (local57 == -1) {
			this.aBoolean603 = true;
		} else {
			this.aClass113_1 = Static528.aClass198_2.method5706(local57);
			this.aBoolean603 = false;
		}
		if (arg2 == this.anInt7677) {
			Static598.method8288(this, this.anInt7696, this.aClass113_1);
		}
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public void method6484() {
		if (this.aClass9_Sub5_4 != null) {
			this.aClass9_Sub5_4.method5220();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ka;Lclient!ha;ILclient!hba;)V")
	private void method6485(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) Class115 arg2) {
		arg0.method7071(arg2);
		@Pc(9) Class103[] local9 = arg0.method7048();
		@Pc(12) Class49[] local12 = arg0.method7050();
		if ((this.aClass9_Sub5_4 == null || this.aClass9_Sub5_4.aBoolean486) && (local9 != null || local12 != null)) {
			this.aClass9_Sub5_4 = Static311.method5223(Static384.anInt7234, true);
		}
		if (this.aClass9_Sub5_4 != null) {
			this.aClass9_Sub5_4.method5226(arg1, (long) Static384.anInt7234, local9, local12);
			this.aClass9_Sub5_4.method5229(super.aByte135, super.aShort115, super.aShort117, super.aShort114, super.aShort116);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ha;III)Lclient!ka;")
	private Class92 method6486(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class124 local8 = Static360.aClass312_2.method7492(arg2);
		@Pc(13) Class245 local13 = Static150.aClass245Array2[super.aByte135];
		@Pc(26) Class245 local26 = super.aByte134 < 3 ? Static150.aClass245Array2[super.aByte134 + 1] : null;
		return this.aBoolean603 ? local8.method3523(arg0, Static528.aClass198_2, -1, arg1, super.anInt10360, local26, super.anInt10365, 0, local13, super.anInt10357, -1) : local8.method3523(arg0, Static528.aClass198_2, this.anInt7696, arg1, super.anInt10360, local26, super.anInt10365, this.anInt7681, local13, super.anInt10357, this.anInt7683);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!or", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub5_4 != null) {
			this.aClass9_Sub5_4.method5220();
		}
	}

	@OriginalMember(owner = "client!or", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.anInt7675;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		@Pc(23) Class92 local23 = this.method6486(arg0, (this.anInt7682 == 0 ? 0 : 5) | 0x800, this.anInt7688);
		if (local23 == null) {
			return null;
		}
		if (this.anInt7682 != 0) {
			local23.a(this.anInt7682 * 2048);
		}
		@Pc(48) Class115 local48 = arg0.method6156();
		local48.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
		this.method6485(local23, arg0, local48);
		@Pc(67) Class9_Sub2 local67 = Static167.method3172(1, false);
		if (Static423.aBoolean622) {
			local23.method7057(local48, local67.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			local23.method7053(local48, local67.aClass9_Sub6Array1[0], 0);
		}
		if (this.aClass9_Sub5_4 != null) {
			@Pc(95) Class257 local95 = this.aClass9_Sub5_4.method5222();
			if (Static423.aBoolean622) {
				arg0.method6148(local95, Static32.anInt849);
			} else {
				arg0.method6183(local95);
			}
		}
		this.aBoolean602 = local23.F();
		this.anInt7675 = local23.fa();
		this.anInt7678 = local23.ma();
		return local67;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anInt7678 = 45;
		}
		return this.anInt7678;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)V")
	public void method6490(@OriginalArg(1) int arg0) {
		if (this.aBoolean603) {
			return;
		}
		this.anInt7681 += arg0;
		while (this.anInt7681 > this.aClass113_1.anIntArray176[this.anInt7696]) {
			this.anInt7681 -= this.aClass113_1.anIntArray176[this.anInt7696];
			this.anInt7696++;
			if (this.anInt7696 >= this.aClass113_1.anIntArray178.length) {
				this.aBoolean603 = true;
				break;
			}
		}
		if (!this.aBoolean603) {
			Static598.method8288(this, this.anInt7696, this.aClass113_1);
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
		@Pc(11) Class92 local11 = this.method6486(arg0, 0, this.anInt7688);
		if (local11 != null) {
			@Pc(24) Class115 local24 = arg0.method6156();
			local24.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			this.method6485(local11, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		return false;
	}

	@OriginalMember(owner = "client!or", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!or", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aBoolean602;
	}
}
