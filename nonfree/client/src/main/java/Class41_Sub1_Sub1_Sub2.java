import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class41_Sub1_Sub1_Sub2 extends Class41_Sub1_Sub1 {

	@OriginalMember(owner = "client!cga", name = "tb", descriptor = "Lclient!qo;")
	private Class41_Sub7 aClass41_Sub7_1;

	@OriginalMember(owner = "client!cga", name = "V", descriptor = "I")
	private int anInt1159 = 0;

	@OriginalMember(owner = "client!cga", name = "ib", descriptor = "I")
	private int anInt1170 = 0;

	@OriginalMember(owner = "client!cga", name = "gb", descriptor = "I")
	private int anInt1168 = 0;

	@OriginalMember(owner = "client!cga", name = "kb", descriptor = "I")
	private final int anInt1172 = -1;

	@OriginalMember(owner = "client!cga", name = "db", descriptor = "I")
	private int anInt1166 = 0;

	@OriginalMember(owner = "client!cga", name = "eb", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!cga", name = "fb", descriptor = "I")
	private int anInt1167 = 0;

	@OriginalMember(owner = "client!cga", name = "vb", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!cga", name = "pb", descriptor = "I")
	private final int anInt1176;

	@OriginalMember(owner = "client!cga", name = "wb", descriptor = "I")
	public final int anInt1180;

	@OriginalMember(owner = "client!cga", name = "R", descriptor = "Lclient!co;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class41_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1176 = arg0;
		this.anInt1180 = arg2 + arg1;
		this.anInt1167 = arg12;
		@Pc(53) Class385 local53 = Static312.aClass179_1.method3798(this.anInt1176);
		@Pc(56) int local56 = local53.anInt10218;
		if (local56 == -1) {
			this.aBoolean76 = true;
		} else {
			this.aClass65_1 = Static459.aClass128_2.method2686(local56);
			this.aBoolean76 = false;
		}
		if (this.anInt1180 == arg2) {
			Static119.method1899(this.anInt1170, this, this.aClass65_1);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
		@Pc(15) Class114 local15 = this.method1086(arg0, this.anInt1176, 0);
		if (local15 != null) {
			@Pc(20) Class56 local20 = arg0.method6212();
			local20.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			this.method1089(local20, local15, arg0);
		}
	}

	@OriginalMember(owner = "client!cga", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.anInt1159;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 >= -9) {
			this.method8652();
		}
		return this.anInt1168;
	}

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aBoolean75;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!ha;IIB)Lclient!ka;")
	private Class114 method1086(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class385 local10 = Static312.aClass179_1.method3798(arg1);
		@Pc(15) Class88 local15 = Static230.aClass88Array2[super.aByte149];
		@Pc(37) Class88 local37 = super.aByte150 < 3 ? Static230.aClass88Array2[super.aByte150 + 1] : null;
		return this.aBoolean76 ? local10.method8526(Static459.aClass128_2, local37, super.anInt10367, 0, -1, super.anInt10366, local15, -1, super.anInt10370, arg0, arg2) : local10.method8526(Static459.aClass128_2, local37, super.anInt10367, this.anInt1166, this.anInt1172, super.anInt10366, local15, this.anInt1170, super.anInt10370, arg0, arg2);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		@Pc(20) Class114 local20 = this.method1086(arg0, this.anInt1176, (this.anInt1167 == 0 ? 0 : 5) | 0x800);
		if (local20 == null) {
			return null;
		}
		if (this.anInt1167 != 0) {
			local20.a(this.anInt1167 * 2048);
		}
		@Pc(39) Class56 local39 = arg0.method6212();
		local39.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		this.method1089(local39, local20, arg0);
		@Pc(67) Class41_Sub3 local67 = Static578.method7877(1, false);
		if (Static426.aBoolean555) {
			local20.method8807(local39, local67.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			local20.method8801(local39, local67.aClass41_Sub9Array1[0], 0);
		}
		if (this.aClass41_Sub7_1 != null) {
			@Pc(95) Class149 local95 = this.aClass41_Sub7_1.method7086();
			if (Static426.aBoolean555) {
				arg0.method6233(local95, Static663.anInt10391);
			} else {
				arg0.method6215(local95);
			}
		}
		this.aBoolean75 = local20.F();
		this.anInt1159 = local20.fa();
		this.anInt1168 = local20.ma();
		return local67;
	}

	@OriginalMember(owner = "client!cga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub7_1 != null) {
			this.aClass41_Sub7_1.method7088();
		}
	}

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "(B)V")
	public void method1088() {
		if (this.aClass41_Sub7_1 != null) {
			this.aClass41_Sub7_1.method7088();
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!eh;Lclient!ka;Lclient!ha;B)V")
	private void method1089(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class143 arg2) {
		arg1.method8811(arg0);
		@Pc(13) Class244[] local13 = arg1.method8790();
		@Pc(16) Class303[] local16 = arg1.method8806();
		if ((this.aClass41_Sub7_1 == null || this.aClass41_Sub7_1.aBoolean596) && (local13 != null || local16 != null)) {
			this.aClass41_Sub7_1 = Static485.method7087(Static421.anInt7434, true);
		}
		if (this.aClass41_Sub7_1 != null) {
			this.aClass41_Sub7_1.method7092(arg2, (long) Static421.anInt7434, local13, local16);
			this.aClass41_Sub7_1.method7078(super.aByte149, super.aShort109, super.aShort107, super.aShort108, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)V")
	public void method1090(@OriginalArg(1) int arg0) {
		if (this.aBoolean76) {
			return;
		}
		this.anInt1166 += arg0;
		while (this.aClass65_1.anIntArray71[this.anInt1170] < this.anInt1166) {
			this.anInt1166 -= this.aClass65_1.anIntArray71[this.anInt1170];
			this.anInt1170++;
			if (this.anInt1170 >= this.aClass65_1.anIntArray75.length) {
				this.aBoolean76 = true;
				break;
			}
		}
		if (!this.aBoolean76) {
			Static119.method1899(this.anInt1170, this, this.aClass65_1);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return null;
	}
}
