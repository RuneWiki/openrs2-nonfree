import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class41_Sub1_Sub4_Sub2 extends Class41_Sub1_Sub4 implements Interface10 {

	@OriginalMember(owner = "client!ns", name = "lb", descriptor = "Lclient!wq;")
	public static Class394 lb = null;

	@OriginalMember(owner = "client!ns", name = "fb", descriptor = "Lclient!pw;")
	private Class280 aClass280_5;

	@OriginalMember(owner = "client!ns", name = "Q", descriptor = "Z")
	private boolean aBoolean503;

	@OriginalMember(owner = "client!ns", name = "X", descriptor = "Z")
	private final boolean aBoolean504;

	@OriginalMember(owner = "client!ns", name = "qb", descriptor = "S")
	private final short aShort87;

	@OriginalMember(owner = "client!ns", name = "pb", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!ns", name = "O", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "client!ns", name = "bb", descriptor = "Z")
	private final boolean aBoolean505;

	@OriginalMember(owner = "client!ns", name = "mb", descriptor = "Lclient!r;")
	private Class5_Sub2_Sub7 aClass5_Sub2_Sub7_4;

	@OriginalMember(owner = "client!ns", name = "L", descriptor = "Lclient!ka;")
	private Class114 aClass114_4;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIIIZIZ)V")
	public Class41_Sub1_Sub4_Sub2(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt1912);
		this.aBoolean503 = arg1.anInt1885 != 0 && !arg7;
		this.aBoolean504 = arg7;
		super.anInt10367 = arg6;
		this.aShort87 = (short) arg1.anInt1883;
		this.aByte91 = (byte) arg8;
		this.aBoolean502 = arg9;
		super.anInt10366 = arg4;
		this.aBoolean505 = arg0.method6206() && arg1.aBoolean140 && !this.aBoolean504 && Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean502) {
			local63 |= 0x10000;
		}
		@Pc(78) Class353 local78 = this.method5935(local63, this.aBoolean505, arg0);
		if (local78 != null) {
			this.aClass5_Sub2_Sub7_4 = local78.aClass5_Sub2_Sub7_5;
			this.aClass114_4 = local78.aClass114_6;
			if (this.aBoolean502) {
				this.aClass114_4 = this.aClass114_4.method8810((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		if (this.aClass280_5 == null) {
			this.aClass280_5 = Static273.method3807(super.anInt10366, super.anInt10367, super.anInt10370, this.method5936(arg0, 0));
		}
		return this.aClass280_5;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8666(@OriginalArg(1) Class143 arg0) {
		@Pc(29) Class5_Sub2_Sub7 local29;
		if (this.aClass5_Sub2_Sub7_4 == null && this.aBoolean505) {
			@Pc(22) Class353 local22 = this.method5935(262144, true, arg0);
			local29 = local22 == null ? null : local22.aClass5_Sub2_Sub7_5;
		} else {
			local29 = this.aClass5_Sub2_Sub7_4;
			this.aClass5_Sub2_Sub7_4 = null;
		}
		if (local29 != null) {
			Static92.method1426(local29, super.aByte150, super.anInt10366, super.anInt10367, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I")
	@Override
	public int method8671() {
		return this.aByte91;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZILclient!ha;)Lclient!uf;")
	private Class353 method5935(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class143 arg2) {
		@Pc(11) Class81 local11 = Static400.aClass140_4.method2839(this.aShort87 & 0xFFFF);
		@Pc(25) Class88 local25;
		@Pc(31) Class88 local31;
		if (this.aBoolean504) {
			local31 = Static230.aClass88Array2[0];
			local25 = Static176.aClass88Array1[super.aByte150];
		} else {
			local25 = Static230.aClass88Array2[super.aByte150];
			if (super.aByte150 >= 3) {
				local31 = null;
			} else {
				local31 = Static230.aClass88Array2[super.aByte150 + 1];
			}
		}
		return local11.method1752(super.anInt10366, 22, arg0, (Class272) null, super.anInt10367, arg1, this.aByte91, local31, local25, super.anInt10370, arg2);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (!(arg1 instanceof Class41_Sub1_Sub4_Sub2)) {
			return;
		}
		@Pc(12) Class41_Sub1_Sub4_Sub2 local12 = (Class41_Sub1_Sub4_Sub2) arg1;
		if (this.aClass114_4 != null && local12.aClass114_4 != null) {
			this.aClass114_4.method8791(local12.aClass114_4, arg3, arg4, arg0, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 > -9) {
			this.aBoolean503 = true;
		}
		return this.aClass114_4 == null ? 0 : this.aClass114_4.ma();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class114 local9 = this.method5936(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class56 local14 = arg1.method6212();
			local14.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			return Static426.aBoolean555 ? local9.method8798(arg2, arg0, local14, false, 0, Static663.anInt10391) : local9.method8795(arg2, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class114 method5936(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass114_4 != null && arg0.method6226(this.aClass114_4.ua(), arg1) == 0) {
			return this.aClass114_4;
		} else {
			@Pc(30) Class353 local30 = this.method5935(arg1, false, arg0);
			return local30 == null ? null : local30.aClass114_6;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aClass114_4 == null ? false : this.aClass114_4.F();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)I")
	@Override
	public int method8670() {
		return 22;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8669() {
		return this.aBoolean505;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
	@Override
	public void method8672() {
		if (this.aClass114_4 != null) {
			this.aClass114_4.method8799();
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		if (this.aClass114_4 == null) {
			return true;
		} else {
			return !this.aClass114_4.r();
		}
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.aClass114_4 == null ? 0 : this.aClass114_4.fa();
	}

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		this.aBoolean502 = false;
		if (this.aClass114_4 != null) {
			this.aClass114_4.s(this.aClass114_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return this.aBoolean502;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8667(@OriginalArg(1) Class143 arg0) {
		@Pc(22) Class5_Sub2_Sub7 local22;
		if (this.aClass5_Sub2_Sub7_4 == null && this.aBoolean505) {
			@Pc(33) Class353 local33 = this.method5935(262144, true, arg0);
			local22 = local33 == null ? null : local33.aClass5_Sub2_Sub7_5;
		} else {
			local22 = this.aClass5_Sub2_Sub7_4;
			this.aClass5_Sub2_Sub7_4 = null;
		}
		if (local22 != null) {
			Static465.method6890(local22, super.aByte150, super.anInt10366, super.anInt10367, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		if (this.aClass114_4 == null) {
			return null;
		}
		@Pc(11) Class56 local11 = arg0.method6212();
		local11.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		@Pc(27) Class41_Sub3 local27 = Static578.method7877(1, this.aBoolean503);
		if (Static426.aBoolean555) {
			this.aClass114_4.method8807(local11, local27.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			this.aClass114_4.method8801(local11, local27.aClass41_Sub9Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
	@Override
	public int method8668() {
		return this.aShort87 & 0xFFFF;
	}
}
