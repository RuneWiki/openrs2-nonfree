import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class28_Sub1_Sub5_Sub2 extends Class28_Sub1_Sub5 implements Interface1 {

	@OriginalMember(owner = "client!m", name = "lb", descriptor = "Lclient!id;")
	private Class160 lb;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "Z")
	private boolean aBoolean574;

	@OriginalMember(owner = "client!m", name = "db", descriptor = "Z")
	private final boolean aBoolean575;

	@OriginalMember(owner = "client!m", name = "ib", descriptor = "B")
	private final byte aByte98;

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "B")
	private final byte aByte97;

	@OriginalMember(owner = "client!m", name = "nb", descriptor = "Z")
	private final boolean aBoolean576;

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "S")
	private final short aShort61;

	@OriginalMember(owner = "client!m", name = "M", descriptor = "Z")
	private final boolean aBoolean573;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!r;")
	private Class5_Sub3_Sub7 aClass5_Sub3_Sub7_2;

	@OriginalMember(owner = "client!m", name = "ob", descriptor = "Lclient!ka;")
	public Class153 aClass153_3;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ha;Lclient!ih;IIIIIZIIZ)V")
	public Class28_Sub1_Sub5_Sub2(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static519.method7345(arg8, arg9));
		this.aBoolean574 = arg10;
		this.aBoolean575 = arg1.anInt4647 != 0 && !arg7;
		this.aByte98 = (byte) arg8;
		this.aByte97 = (byte) arg9;
		this.aBoolean576 = arg7;
		this.aShort61 = (short) arg1.anInt4670;
		super.anInt10781 = arg4;
		super.anInt10784 = arg6;
		this.aBoolean573 = arg0.method6917() && arg1.aBoolean383 && !this.aBoolean576 && Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990() != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean574) {
			local69 |= 0x10000;
		}
		@Pc(84) Class311 local84 = this.method5412(local69, this.aBoolean573, arg0);
		if (local84 != null) {
			this.aClass5_Sub3_Sub7_2 = local84.aClass5_Sub3_Sub7_3;
			this.aClass153_3 = local84.aClass153_4;
			if (this.aBoolean574) {
				this.aClass153_3 = this.aClass153_3.method8580((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		if (this.lb == null) {
			this.lb = Static224.method3501(super.anInt10779, super.anInt10784, this.method5411(arg0, 0), super.anInt10781);
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8988(@OriginalArg(1) Class65 arg0) {
		@Pc(14) Class5_Sub3_Sub7 local14;
		if (this.aClass5_Sub3_Sub7_2 == null && this.aBoolean573) {
			@Pc(25) Class311 local25 = this.method5412(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass5_Sub3_Sub7_3;
		} else {
			local14 = this.aClass5_Sub3_Sub7_2;
			this.aClass5_Sub3_Sub7_2 = null;
		}
		if (local14 != null) {
			Static548.method7637(local14, super.aByte144, super.anInt10781, super.anInt10784, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (this.aClass153_3 != null) {
			this.aClass153_3.method8584();
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		this.aBoolean574 = false;
		if (this.aClass153_3 != null) {
			this.aClass153_3.s(this.aClass153_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aClass153_3 == null ? false : this.aClass153_3.F();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8983() {
		return this.aBoolean573;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8985(@OriginalArg(1) Class65 arg0) {
		@Pc(24) Class5_Sub3_Sub7 local24;
		if (this.aClass5_Sub3_Sub7_2 == null && this.aBoolean573) {
			@Pc(35) Class311 local35 = this.method5412(262144, true, arg0);
			local24 = local35 == null ? null : local35.aClass5_Sub3_Sub7_3;
		} else {
			local24 = this.aClass5_Sub3_Sub7_2;
			this.aClass5_Sub3_Sub7_2 = null;
		}
		if (local24 != null) {
			Static491.method7050(local24, super.aByte144, super.anInt10781, super.anInt10784, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ha;IB)Lclient!ka;")
	private Class153 method5411(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass153_3 != null && arg0.method6885(this.aClass153_3.ua(), arg1) == 0) {
			return this.aClass153_3;
		} else {
			@Pc(23) Class311 local23 = this.method5412(arg1, false, arg0);
			return local23 == null ? null : local23.aClass153_4;
		}
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.aClass153_3 == null ? 0 : this.aClass153_3.fa();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(17) Class153 local17 = this.method5411(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class254 local22 = arg2.method6903();
			local22.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
			return Static632.aBoolean877 ? local17.method8590(arg0, arg1, local22, false, 0, Static483.anInt8094) : local17.method8593(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZLclient!ha;I)Lclient!sa;")
	private Class311 method5412(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(13) Class164 local13 = Static568.aClass315_5.method7511(this.aShort61 & 0xFFFF);
		@Pc(36) Class109 local36;
		@Pc(22) Class109 local22;
		if (this.aBoolean576) {
			local22 = Static605.aClass109Array5[0];
			local36 = Static111.aClass109Array3[super.aByte144];
		} else {
			if (super.aByte144 >= 3) {
				local22 = null;
			} else {
				local22 = Static605.aClass109Array5[super.aByte144 + 1];
			}
			local36 = Static605.aClass109Array5[super.aByte144];
		}
		return local13.method3905(arg0, this.aByte97, local36, arg2, super.anInt10784, this.aByte98, super.anInt10779, super.anInt10781, local22, (Class225) null, arg1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aShort61 & 0xFFFF;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class28_Sub1_Sub5_Sub2) {
			@Pc(36) Class28_Sub1_Sub5_Sub2 local36 = (Class28_Sub1_Sub5_Sub2) arg2;
			if (this.aClass153_3 == null || local36.aClass153_3 == null) {
				return;
			}
			this.aClass153_3.method8582(local36.aClass153_3, arg1, arg4, arg5, arg0);
		} else if (arg2 instanceof Class28_Sub1_Sub4_Sub5) {
			@Pc(17) Class28_Sub1_Sub4_Sub5 local17 = (Class28_Sub1_Sub4_Sub5) arg2;
			if (this.aClass153_3 != null && local17.aClass153_7 != null) {
				this.aClass153_3.method8582(local17.aClass153_7, arg1, arg4, arg5, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		if (this.aClass153_3 == null) {
			return null;
		}
		@Pc(11) Class254 local11 = arg0.method6903();
		local11.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
		@Pc(32) Class28_Sub7 local32 = Static375.method5607(this.aBoolean575, 1);
		if (Static632.aBoolean877) {
			this.aClass153_3.method8594(local11, local32.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			this.aClass153_3.method8585(local11, local32.aClass28_Sub9Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I")
	@Override
	public int method8984() {
		return this.aByte98;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		if (this.aClass153_3 == null) {
			return true;
		} else {
			return !this.aClass153_3.r();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return this.aBoolean574;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		if (arg0 >= -85) {
			this.method8987();
		}
		return this.aClass153_3 == null ? 0 : this.aClass153_3.ma();
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
	@Override
	public int method8987() {
		return this.aByte97;
	}
}
