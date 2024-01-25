import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class28_Sub1_Sub2_Sub2 extends Class28_Sub1_Sub2 implements Interface1 {

	@OriginalMember(owner = "client!uv", name = "lb", descriptor = "Lclient!pf;")
	public static Class275 lb;

	@OriginalMember(owner = "client!uv", name = "W", descriptor = "Lclient!id;")
	private Class160 aClass160_5;

	@OriginalMember(owner = "client!uv", name = "P", descriptor = "Z")
	private final boolean aBoolean853;

	@OriginalMember(owner = "client!uv", name = "N", descriptor = "S")
	private final short aShort107;

	@OriginalMember(owner = "client!uv", name = "db", descriptor = "Z")
	private final boolean aBoolean856;

	@OriginalMember(owner = "client!uv", name = "U", descriptor = "Z")
	private boolean aBoolean855;

	@OriginalMember(owner = "client!uv", name = "kb", descriptor = "B")
	private byte aByte138;

	@OriginalMember(owner = "client!uv", name = "R", descriptor = "Z")
	private final boolean aBoolean854;

	@OriginalMember(owner = "client!uv", name = "bb", descriptor = "Lclient!r;")
	private Class5_Sub3_Sub7 aClass5_Sub3_Sub7_4;

	@OriginalMember(owner = "client!uv", name = "V", descriptor = "Lclient!ka;")
	private Class153 aClass153_5;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!ha;Lclient!ih;IIIIIZIZ)V")
	public Class28_Sub1_Sub2_Sub2(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4623);
		this.aBoolean853 = arg1.anInt4647 != 0 && !arg7;
		this.aShort107 = (short) arg1.anInt4670;
		this.aBoolean856 = arg7;
		super.anInt10784 = arg6;
		super.anInt10781 = arg4;
		this.aBoolean855 = arg9;
		this.aByte138 = (byte) arg8;
		this.aBoolean854 = arg0.method6917() && arg1.aBoolean383 && !this.aBoolean856 && Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean855) {
			local63 |= 0x10000;
		}
		@Pc(78) Class311 local78 = this.method8388(arg0, local63, this.aBoolean854);
		if (local78 != null) {
			this.aClass5_Sub3_Sub7_4 = local78.aClass5_Sub3_Sub7_3;
			this.aClass153_5 = local78.aClass153_4;
			if (this.aBoolean855) {
				this.aClass153_5 = this.aClass153_5.method8580((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aShort107 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(17) Class153 local17 = this.method8389(131072, arg2);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class254 local22 = arg2.method6903();
			local22.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
			return Static632.aBoolean877 ? local17.method8590(arg0, arg1, local22, false, 0, Static483.anInt8094) : local17.method8593(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		if (this.aClass153_5 == null) {
			return true;
		} else {
			return !this.aClass153_5.r();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)I")
	@Override
	public int method8987() {
		return this.aByte138;
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aClass153_5 == null ? false : this.aClass153_5.F();
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.aClass153_5 == null ? 0 : this.aClass153_5.fa();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8988(@OriginalArg(1) Class65 arg0) {
		@Pc(31) Class5_Sub3_Sub7 local31;
		if (this.aClass5_Sub3_Sub7_4 == null && this.aBoolean854) {
			@Pc(24) Class311 local24 = this.method8388(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass5_Sub3_Sub7_3;
		} else {
			local31 = this.aClass5_Sub3_Sub7_4;
			this.aClass5_Sub3_Sub7_4 = null;
		}
		if (local31 != null) {
			Static548.method7637(local31, super.aByte144, super.anInt10781, super.anInt10784, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class28_Sub1_Sub2_Sub2) {
			@Pc(5) Class28_Sub1_Sub2_Sub2 local5 = (Class28_Sub1_Sub2_Sub2) arg2;
			if (this.aClass153_5 != null && local5.aClass153_5 != null) {
				this.aClass153_5.method8582(local5.aClass153_5, arg1, arg4, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		this.aBoolean855 = false;
		if (this.aClass153_5 != null) {
			this.aClass153_5.s(this.aClass153_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		if (this.aClass160_5 == null) {
			this.aClass160_5 = Static224.method3501(super.anInt10779, super.anInt10784, this.method8389(0, arg0), super.anInt10781);
		}
		return this.aClass160_5;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8985(@OriginalArg(1) Class65 arg0) {
		@Pc(20) Class5_Sub3_Sub7 local20;
		if (this.aClass5_Sub3_Sub7_4 == null && this.aBoolean854) {
			@Pc(33) Class311 local33 = this.method8388(arg0, 262144, true);
			local20 = local33 == null ? null : local33.aClass5_Sub3_Sub7_3;
		} else {
			local20 = this.aClass5_Sub3_Sub7_4;
			this.aClass5_Sub3_Sub7_4 = null;
		}
		if (local20 != null) {
			Static491.method7050(local20, super.aByte144, super.anInt10781, super.anInt10784, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		if (arg0 >= -85) {
			this.aByte138 = 11;
		}
		return this.aClass153_5 == null ? 0 : this.aClass153_5.ma();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ha;IIZ)Lclient!sa;")
	private Class311 method8388(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class164 local19 = Static568.aClass315_5.method7511(this.aShort107 & 0xFFFF);
		@Pc(27) Class109 local27;
		@Pc(40) Class109 local40;
		if (this.aBoolean856) {
			local40 = Static605.aClass109Array5[0];
			local27 = Static111.aClass109Array3[super.aByte144];
		} else {
			local27 = Static605.aClass109Array5[super.aByte144];
			if (super.aByte144 < 3) {
				local40 = Static605.aClass109Array5[super.aByte144 + 1];
			} else {
				local40 = null;
			}
		}
		return local19.method3905(arg1, this.aByte138, local27, arg0, super.anInt10784, 22, super.anInt10779, super.anInt10781, local40, (Class225) null, arg2);
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		if (this.aClass153_5 == null) {
			return null;
		}
		@Pc(11) Class254 local11 = arg0.method6903();
		local11.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
		@Pc(25) Class28_Sub7 local25 = Static375.method5607(this.aBoolean853, 1);
		if (Static632.aBoolean877) {
			this.aClass153_5.method8594(local11, local25.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			this.aClass153_5.method8585(local11, local25.aClass28_Sub9Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class153 method8389(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1) {
		if (this.aClass153_5 != null && arg1.method6885(this.aClass153_5.ua(), arg0) == 0) {
			return this.aClass153_5;
		} else {
			@Pc(30) Class311 local30 = this.method8388(arg1, arg0, false);
			return local30 == null ? null : local30.aClass153_4;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8983() {
		return this.aBoolean854;
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (this.aClass153_5 != null) {
			this.aClass153_5.method8584();
		}
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return this.aBoolean855;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)I")
	@Override
	public int method8984() {
		return 22;
	}
}
