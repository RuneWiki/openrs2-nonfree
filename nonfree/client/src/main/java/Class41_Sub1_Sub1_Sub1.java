import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class41_Sub1_Sub1_Sub1 extends Class41_Sub1_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!bka", name = "kb", descriptor = "Lclient!pw;")
	private Class280 aClass280_1;

	@OriginalMember(owner = "client!bka", name = "X", descriptor = "S")
	private final short aShort17;

	@OriginalMember(owner = "client!bka", name = "bb", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!bka", name = "vb", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!bka", name = "U", descriptor = "Z")
	private final boolean aBoolean43;

	@OriginalMember(owner = "client!bka", name = "W", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!bka", name = "cb", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!bka", name = "jb", descriptor = "Z")
	private final boolean aBoolean46;

	@OriginalMember(owner = "client!bka", name = "ab", descriptor = "Lclient!r;")
	private Class5_Sub2_Sub7 aClass5_Sub2_Sub7_1;

	@OriginalMember(owner = "client!bka", name = "gb", descriptor = "Lclient!ka;")
	public Class114 aClass114_1;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIIIZIIIIIIZ)V")
	public Class41_Sub1_Sub1_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1905 == 1, Static436.method6549(arg13, arg12));
		this.aShort17 = (short) arg1.anInt1883;
		this.aByte15 = (byte) arg13;
		super.aByte150 = (byte) arg3;
		this.aByte16 = (byte) arg12;
		this.aBoolean43 = arg1.anInt1885 != 0 && !arg7;
		this.aBoolean44 = arg14;
		this.aBoolean45 = arg7;
		this.aBoolean46 = arg0.method6206() && arg1.aBoolean140 && !this.aBoolean45 && Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269() != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean44) {
			local80 |= 0x10000;
		}
		@Pc(95) Class353 local95 = this.method725(this.aBoolean46, arg0, local80);
		if (local95 != null) {
			this.aClass5_Sub2_Sub7_1 = local95.aClass5_Sub2_Sub7_5;
			this.aClass114_1 = local95.aClass114_6;
			if (this.aBoolean44) {
				this.aClass114_1 = this.aClass114_1.method8810((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8669() {
		return this.aBoolean46;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class41_Sub1_Sub3_Sub1) {
			@Pc(14) Class41_Sub1_Sub3_Sub1 local14 = (Class41_Sub1_Sub3_Sub1) arg1;
			if (this.aClass114_1 != null && local14.aClass114_7 != null) {
				this.aClass114_1.method8791(local14.aClass114_7, arg3, arg4, arg0, arg5);
			}
		} else if (arg1 instanceof Class41_Sub1_Sub1_Sub1) {
			@Pc(37) Class41_Sub1_Sub1_Sub1 local37 = (Class41_Sub1_Sub1_Sub1) arg1;
			if (this.aClass114_1 != null && local37.aClass114_1 != null) {
				this.aClass114_1.method8791(local37.aClass114_1, arg3, arg4, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class114 local9 = this.method723(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class56 local19 = arg1.method6212();
			local19.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			return Static426.aBoolean555 ? local9.method8798(arg2, arg0, local19, false, 0, Static663.anInt10391) : local9.method8795(arg2, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class114 method723(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass114_1 != null && arg0.method6226(this.aClass114_1.ua(), arg1) == 0) {
			return this.aClass114_1;
		} else {
			@Pc(29) Class353 local29 = this.method725(false, arg0, arg1);
			return local29 == null ? null : local29.aClass114_6;
		}
	}

	@OriginalMember(owner = "client!bka", name = "e", descriptor = "(B)I")
	public int method724() {
		return this.aClass114_1 == null ? 15 : this.aClass114_1.na() / 4;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)I")
	@Override
	public int method8670() {
		return this.aByte16;
	}

	@OriginalMember(owner = "client!bka", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 >= -9) {
			this.method724();
		}
		return this.aClass114_1 == null ? 0 : this.aClass114_1.ma();
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		if (this.aClass114_1 == null) {
			return null;
		}
		@Pc(16) Class56 local16 = arg0.method6212();
		local16.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		@Pc(30) Class41_Sub3 local30 = Static578.method7877(1, this.aBoolean43);
		if (Static426.aBoolean555) {
			this.aClass114_1.method8807(local16, local30.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			this.aClass114_1.method8801(local16, local30.aClass41_Sub9Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(ZLclient!ha;II)Lclient!uf;")
	private Class353 method725(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class81 local11 = Static400.aClass140_4.method2839(this.aShort17 & 0xFFFF);
		@Pc(25) Class88 local25;
		@Pc(33) Class88 local33;
		if (this.aBoolean45) {
			local33 = Static230.aClass88Array2[0];
			local25 = Static176.aClass88Array1[super.aByte150];
		} else {
			local25 = Static230.aClass88Array2[super.aByte150];
			if (super.aByte150 >= 3) {
				local33 = null;
			} else {
				local33 = Static230.aClass88Array2[super.aByte150 + 1];
			}
		}
		return local11.method1752(super.anInt10366, this.aByte16 == 11 ? 10 : this.aByte16, arg2, (Class272) null, super.anInt10367, arg0, this.aByte16 == 11 ? this.aByte15 + 4 : this.aByte15, local33, local25, super.anInt10370, arg1);
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		if (this.aClass114_1 == null) {
			return true;
		} else {
			return !this.aClass114_1.r();
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8666(@OriginalArg(1) Class143 arg0) {
		@Pc(25) Class5_Sub2_Sub7 local25;
		if (this.aClass5_Sub2_Sub7_1 == null && this.aBoolean46) {
			@Pc(18) Class353 local18 = this.method725(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass5_Sub2_Sub7_5;
		} else {
			local25 = this.aClass5_Sub2_Sub7_1;
			this.aClass5_Sub2_Sub7_1 = null;
		}
		if (local25 != null) {
			Static92.method1426(local25, super.aByte150, super.anInt10366, super.anInt10367, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)I")
	@Override
	public int method8668() {
		return this.aShort17 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8667(@OriginalArg(1) Class143 arg0) {
		@Pc(22) Class5_Sub2_Sub7 local22;
		if (this.aClass5_Sub2_Sub7_1 == null && this.aBoolean46) {
			@Pc(33) Class353 local33 = this.method725(true, arg0, 262144);
			local22 = local33 == null ? null : local33.aClass5_Sub2_Sub7_5;
		} else {
			local22 = this.aClass5_Sub2_Sub7_1;
			this.aClass5_Sub2_Sub7_1 = null;
		}
		if (local22 != null) {
			Static465.method6890(local22, super.aByte150, super.anInt10366, super.anInt10367, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bka", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return this.aBoolean44;
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		if (this.aClass280_1 == null) {
			this.aClass280_1 = Static273.method3807(super.anInt10366, super.anInt10367, super.anInt10370, this.method723(arg0, 0));
		}
		return this.aClass280_1;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
	}

	@OriginalMember(owner = "client!bka", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.aClass114_1 == null ? 0 : this.aClass114_1.fa();
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Z)I")
	@Override
	public int method8671() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!bka", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		this.aBoolean44 = false;
		if (this.aClass114_1 != null) {
			this.aClass114_1.s(this.aClass114_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(I)V")
	@Override
	public void method8672() {
		if (this.aClass114_1 != null) {
			this.aClass114_1.method8799();
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aClass114_1 == null ? false : this.aClass114_1.F();
	}
}
