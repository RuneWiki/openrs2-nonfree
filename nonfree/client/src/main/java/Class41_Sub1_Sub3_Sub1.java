import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class41_Sub1_Sub3_Sub1 extends Class41_Sub1_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!ul", name = "lb", descriptor = "[I")
	public static final int[] lb = new int[256];

	@OriginalMember(owner = "client!ul", name = "ab", descriptor = "Lclient!pw;")
	private Class280 aClass280_7;

	@OriginalMember(owner = "client!ul", name = "ib", descriptor = "B")
	private byte aByte142;

	@OriginalMember(owner = "client!ul", name = "mb", descriptor = "S")
	private final short aShort112;

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "Z")
	private boolean aBoolean723;

	@OriginalMember(owner = "client!ul", name = "T", descriptor = "Z")
	private final boolean aBoolean725;

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "Z")
	private final boolean aBoolean722;

	@OriginalMember(owner = "client!ul", name = "X", descriptor = "B")
	private final byte aByte141;

	@OriginalMember(owner = "client!ul", name = "P", descriptor = "Z")
	private final boolean aBoolean724;

	@OriginalMember(owner = "client!ul", name = "U", descriptor = "Lclient!ka;")
	public Class114 aClass114_7;

	@OriginalMember(owner = "client!ul", name = "jb", descriptor = "Lclient!r;")
	private Class5_Sub2_Sub7 aClass5_Sub2_Sub7_6;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIIIZIIZ)V")
	public Class41_Sub1_Sub3_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static657.method8596(arg8, arg9));
		this.aByte142 = (byte) arg9;
		this.aShort112 = (short) arg1.anInt1883;
		this.aBoolean723 = arg10;
		this.aBoolean725 = arg7;
		super.anInt10366 = arg4;
		super.anInt10367 = arg6;
		this.aBoolean722 = arg1.anInt1885 != 0 && !arg7;
		this.aByte141 = (byte) arg8;
		this.aBoolean724 = arg0.method6206() && arg1.aBoolean140 && !this.aBoolean725 && Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269() != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean723) {
			local69 |= 0x10000;
		}
		@Pc(84) Class353 local84 = this.method8163(arg0, this.aBoolean724, local69);
		if (local84 != null) {
			this.aClass114_7 = local84.aClass114_6;
			this.aClass5_Sub2_Sub7_6 = local84.aClass5_Sub2_Sub7_5;
			if (this.aBoolean723) {
				this.aClass114_7 = this.aClass114_7.method8810((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aClass114_7 == null ? false : this.aClass114_7.F();
	}

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 > -9) {
			this.aByte142 = -83;
		}
		return this.aClass114_7 == null ? 0 : this.aClass114_7.ma();
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8669() {
		return this.aBoolean724;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ha;ZII)Lclient!uf;")
	private Class353 method8163(@OriginalArg(0) Class143 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class81 local11 = Static400.aClass140_4.method2839(this.aShort112 & 0xFFFF);
		@Pc(19) Class88 local19;
		@Pc(27) Class88 local27;
		if (this.aBoolean725) {
			local27 = Static230.aClass88Array2[0];
			local19 = Static176.aClass88Array1[super.aByte150];
		} else {
			local19 = Static230.aClass88Array2[super.aByte150];
			if (super.aByte150 >= 3) {
				local27 = null;
			} else {
				local27 = Static230.aClass88Array2[super.aByte150 + 1];
			}
		}
		return local11.method1752(super.anInt10366, this.aByte141, arg2, (Class272) null, super.anInt10367, arg1, this.aByte142, local27, local19, super.anInt10370, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		if (this.aClass280_7 == null) {
			this.aClass280_7 = Static273.method3807(super.anInt10366, super.anInt10367, super.anInt10370, this.method8164(arg0, 0));
		}
		return this.aClass280_7;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		if (this.aClass114_7 == null) {
			return null;
		}
		@Pc(16) Class56 local16 = arg0.method6212();
		local16.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		@Pc(30) Class41_Sub3 local30 = Static578.method7877(1, this.aBoolean722);
		if (Static426.aBoolean555) {
			this.aClass114_7.method8807(local16, local30.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			this.aClass114_7.method8801(local16, local30.aClass41_Sub9Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	@Override
	public void method8672() {
		if (this.aClass114_7 != null) {
			this.aClass114_7.method8799();
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8667(@OriginalArg(1) Class143 arg0) {
		@Pc(33) Class5_Sub2_Sub7 local33;
		if (this.aClass5_Sub2_Sub7_6 == null && this.aBoolean724) {
			@Pc(26) Class353 local26 = this.method8163(arg0, true, 262144);
			local33 = local26 == null ? null : local26.aClass5_Sub2_Sub7_5;
		} else {
			local33 = this.aClass5_Sub2_Sub7_6;
			this.aClass5_Sub2_Sub7_6 = null;
		}
		if (local33 != null) {
			Static465.method6890(local33, super.aByte150, super.anInt10366, super.anInt10367, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
	@Override
	public int method8670() {
		return this.aByte141;
	}

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return this.aBoolean723;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)I")
	@Override
	public int method8671() {
		return this.aByte142;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class114 method8164(@OriginalArg(1) Class143 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass114_7 != null && arg0.method6226(this.aClass114_7.ua(), arg1) == 0) {
			return this.aClass114_7;
		} else {
			@Pc(34) Class353 local34 = this.method8163(arg0, false, arg1);
			return local34 == null ? null : local34.aClass114_6;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class41_Sub1_Sub3_Sub1) {
			@Pc(28) Class41_Sub1_Sub3_Sub1 local28 = (Class41_Sub1_Sub3_Sub1) arg1;
			if (this.aClass114_7 != null && local28.aClass114_7 != null) {
				this.aClass114_7.method8791(local28.aClass114_7, arg3, arg4, arg0, arg5);
			}
		} else if (arg1 instanceof Class41_Sub1_Sub1_Sub1) {
			@Pc(8) Class41_Sub1_Sub1_Sub1 local8 = (Class41_Sub1_Sub1_Sub1) arg1;
			if (this.aClass114_7 != null && local8.aClass114_1 != null) {
				this.aClass114_7.method8791(local8.aClass114_1, arg3, arg4, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8666(@OriginalArg(1) Class143 arg0) {
		@Pc(27) Class5_Sub2_Sub7 local27;
		if (this.aClass5_Sub2_Sub7_6 == null && this.aBoolean724) {
			@Pc(20) Class353 local20 = this.method8163(arg0, true, 262144);
			local27 = local20 == null ? null : local20.aClass5_Sub2_Sub7_5;
		} else {
			local27 = this.aClass5_Sub2_Sub7_6;
			this.aClass5_Sub2_Sub7_6 = null;
		}
		if (local27 != null) {
			Static92.method1426(local27, super.aByte150, super.anInt10366, super.anInt10367, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class114 local14 = this.method8164(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class56 local19 = arg1.method6212();
			local19.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			return Static426.aBoolean555 ? local14.method8798(arg2, arg0, local19, false, 0, Static663.anInt10391) : local14.method8795(arg2, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.aClass114_7 == null ? 0 : this.aClass114_7.fa();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
	@Override
	public int method8668() {
		return this.aShort112 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		if (this.aClass114_7 == null) {
			return true;
		} else {
			return !this.aClass114_7.r();
		}
	}

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		this.aBoolean723 = false;
		if (this.aClass114_7 != null) {
			this.aClass114_7.s(this.aClass114_7.ua() & 0xFFFEFFFF);
		}
	}
}
