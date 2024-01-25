import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class28_Sub1_Sub3_Sub2 extends Class28_Sub1_Sub3 implements Interface1 {

	@OriginalMember(owner = "client!wia", name = "ib", descriptor = "Lclient!id;")
	private Class160 aClass160_6;

	@OriginalMember(owner = "client!wia", name = "L", descriptor = "S")
	private final short aShort120;

	@OriginalMember(owner = "client!wia", name = "Y", descriptor = "B")
	private final byte aByte142;

	@OriginalMember(owner = "client!wia", name = "Q", descriptor = "Z")
	private final boolean aBoolean901;

	@OriginalMember(owner = "client!wia", name = "fb", descriptor = "B")
	private final byte aByte143;

	@OriginalMember(owner = "client!wia", name = "db", descriptor = "Z")
	private final boolean aBoolean903;

	@OriginalMember(owner = "client!wia", name = "T", descriptor = "Z")
	private final boolean aBoolean902;

	@OriginalMember(owner = "client!wia", name = "W", descriptor = "Lclient!r;")
	private Class5_Sub3_Sub7 aClass5_Sub3_Sub7_5;

	@OriginalMember(owner = "client!wia", name = "V", descriptor = "Lclient!ka;")
	private Class153 aClass153_6;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!ha;Lclient!ih;IIIIIZIIII)V")
	public Class28_Sub1_Sub3_Sub2(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10784 = arg6;
		this.aShort120 = (short) arg1.anInt4670;
		this.aByte142 = (byte) arg11;
		this.aBoolean901 = arg1.anInt4647 != 0 && !arg7;
		this.aByte143 = (byte) arg10;
		this.aBoolean903 = arg7;
		super.anInt10781 = arg4;
		this.aBoolean902 = arg0.method6917() && arg1.aBoolean383 && !this.aBoolean903 && Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990() != 0;
		@Pc(67) Class311 local67 = this.method8871(arg0, this.aBoolean902, 2048);
		if (local67 != null) {
			this.aClass5_Sub3_Sub7_5 = local67.aClass5_Sub3_Sub7_3;
			this.aClass153_6 = local67.aClass153_4;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!ha;ZII)Lclient!sa;")
	private Class311 method8871(@OriginalArg(0) Class65 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class164 local19 = Static568.aClass315_5.method7511(this.aShort120 & 0xFFFF);
		@Pc(27) Class109 local27;
		@Pc(31) Class109 local31;
		if (this.aBoolean903) {
			local27 = Static111.aClass109Array3[super.aByte144];
			local31 = Static605.aClass109Array5[0];
		} else {
			local27 = Static605.aClass109Array5[super.aByte144];
			if (super.aByte144 >= 3) {
				local31 = null;
			} else {
				local31 = Static605.aClass109Array5[super.aByte144 + 1];
			}
		}
		return local19.method3905(arg2, this.aByte142, local27, arg0, super.anInt10784, this.aByte143, super.anInt10779, super.anInt10781, local31, (Class225) null, arg1);
	}

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		if (this.aClass153_6 == null) {
			return true;
		} else {
			return !this.aClass153_6.r();
		}
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		if (this.aClass160_6 == null) {
			this.aClass160_6 = Static224.method3501(super.anInt10779, super.anInt10784, this.method8872(arg0, 0), super.anInt10781);
		}
		return this.aClass160_6;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(17) Class153 local17 = this.method8872(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class254 local22 = arg2.method6903();
			local22.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
			return Static632.aBoolean877 ? local17.method8590(arg0, arg1, local22, false, 0, Static483.anInt8094) : local17.method8593(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		if (this.aClass153_6 == null) {
			return null;
		}
		@Pc(16) Class254 local16 = arg0.method6903();
		local16.method7361(super.aShort118 + super.anInt10781, super.anInt10779, super.aShort119 + super.anInt10784);
		@Pc(36) Class28_Sub7 local36 = Static375.method5607(this.aBoolean901, 1);
		if (Static632.aBoolean877) {
			this.aClass153_6.method8594(local16, local36.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			this.aClass153_6.method8585(local16, local36.aClass28_Sub9Array1[0], 0);
		}
		return local36;
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (this.aClass153_6 != null) {
			this.aClass153_6.method8584();
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8983() {
		return this.aBoolean902;
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)I")
	@Override
	public int method8987() {
		return this.aByte142;
	}

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.aClass153_6 == null ? 0 : this.aClass153_6.fa();
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8985(@OriginalArg(1) Class65 arg0) {
		@Pc(14) Class5_Sub3_Sub7 local14;
		if (this.aClass5_Sub3_Sub7_5 == null && this.aBoolean902) {
			@Pc(27) Class311 local27 = this.method8871(arg0, true, 262144);
			local14 = local27 == null ? null : local27.aClass5_Sub3_Sub7_3;
		} else {
			local14 = this.aClass5_Sub3_Sub7_5;
			this.aClass5_Sub3_Sub7_5 = null;
		}
		if (local14 != null) {
			Static491.method7050(local14, super.aByte144, super.anInt10781, super.anInt10784, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aShort120 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aClass153_6 == null ? false : this.aClass153_6.F();
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class153 method8872(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass153_6 != null && arg0.method6885(this.aClass153_6.ua(), arg1) == 0) {
			return this.aClass153_6;
		} else {
			@Pc(28) Class311 local28 = this.method8871(arg0, false, arg1);
			return local28 == null ? null : local28.aClass153_4;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Z)I")
	@Override
	public int method8984() {
		return this.aByte143;
	}

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		if (arg0 >= -85) {
			this.aClass153_6 = null;
		}
		return this.aClass153_6 == null ? 0 : this.aClass153_6.ma();
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8988(@OriginalArg(1) Class65 arg0) {
		@Pc(25) Class5_Sub3_Sub7 local25;
		if (this.aClass5_Sub3_Sub7_5 == null && this.aBoolean902) {
			@Pc(18) Class311 local18 = this.method8871(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass5_Sub3_Sub7_3;
		} else {
			local25 = this.aClass5_Sub3_Sub7_5;
			this.aClass5_Sub3_Sub7_5 = null;
		}
		if (local25 != null) {
			Static548.method7637(local25, super.aByte144, super.anInt10781, super.anInt10784, (boolean[]) null);
		}
	}
}
