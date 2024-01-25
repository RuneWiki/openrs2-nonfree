import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class254 {

	@OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
	public int anInt7625;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "Lclient!h;")
	private final Class125 aClass125_55 = new Class125(64);

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "Lclient!h;")
	public final Class125 aClass125_56 = new Class125(50);

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "Lclient!kc;")
	public final Class170 aClass170_1 = new Class170(250);

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "Lclient!ap;")
	private final Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public final int anInt7617;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "Lclient!an;")
	public final Class16 aClass16_100;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Z")
	private boolean aBoolean543;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "Lclient!an;")
	private final Class16 aClass16_99;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "Lclient!qt;")
	private final Class258 aClass258_1;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public final int anInt7610;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray48;

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray49;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!hu;IZLclient!qt;Lclient!an;Lclient!an;)V")
	public Class254(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class258 arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) Class16 arg5) {
		this.anInt7617 = arg1;
		this.aClass16_100 = arg5;
		this.aBoolean543 = arg2;
		this.aClass16_99 = arg4;
		this.aClass258_1 = arg3;
		if (this.aClass16_99 == null) {
			this.anInt7610 = 0;
		} else {
			@Pc(54) int local54 = this.aClass16_99.method407() - 1;
			this.anInt7610 = this.aClass16_99.method399(local54) + local54 * 256;
		}
		this.aStringArray48 = new String[] { null, null, Static354.aClass88_191.method2391(this.anInt7617), null, null };
		this.aStringArray49 = new String[] { null, null, null, null, Static256.aClass88_144.method2391(this.anInt7617) };
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
	public void method6337(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean543) {
			this.aBoolean543 = arg0;
			this.method6339();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	public void method6338() {
		@Pc(6) Class125 local6 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3442();
		}
		local6 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3442();
		}
		@Pc(36) Class170 local36 = this.aClass170_1;
		synchronized (this.aClass170_1) {
			this.aClass170_1.method4281();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	public void method6339() {
		@Pc(6) Class125 local6 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3440();
		}
		local6 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3440();
		}
		@Pc(44) Class170 local44 = this.aClass170_1;
		synchronized (this.aClass170_1) {
			this.aClass170_1.method4286();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)Lclient!cm;")
	public Class56 method6340(@OriginalArg(0) int arg0) {
		@Pc(8) Class125 local8 = this.aClass125_55;
		@Pc(18) Class56 local18;
		synchronized (this.aClass125_55) {
			local18 = (Class56) this.aClass125_55.method3446((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class16 local31 = this.aClass16_99;
		@Pc(44) byte[] local44;
		synchronized (this.aClass16_99) {
			local44 = this.aClass16_99.method408(Static426.method5115(arg0), Static492.method6695(arg0));
		}
		local18 = new Class56();
		local18.anInt1630 = arg0;
		local18.aClass254_1 = this;
		local18.aStringArray6 = new String[] { null, null, Static354.aClass88_191.method2391(this.anInt7617), null, null };
		local18.aStringArray7 = new String[] { null, null, null, null, Static256.aClass88_144.method2391(this.anInt7617) };
		if (local44 != null) {
			local18.method1566(new Class12_Sub8(local44));
		}
		local18.method1564();
		if (local18.anInt1632 != -1) {
			local18.method1563(this.method6340(local18.anInt1644), this.method6340(local18.anInt1632));
		}
		if (local18.anInt1631 != -1) {
			local18.method1554(this.method6340(local18.anInt1623), this.method6340(local18.anInt1631));
		}
		if (!this.aBoolean543 && local18.aBoolean128) {
			local18.aString12 = Static468.aClass88_250.method2391(this.anInt7617);
			local18.aStringArray6 = this.aStringArray48;
			local18.anInt1624 = 0;
			local18.anIntArray174 = null;
			local18.aStringArray7 = this.aStringArray49;
			local18.aBoolean127 = false;
			if (local18.aClass68_11 != null) {
				@Pc(217) boolean local217 = false;
				for (@Pc(224) Class12 local224 = local18.aClass68_11.method1923(); local224 != null; local224 = local18.aClass68_11.method1920()) {
					@Pc(234) Class213 local234 = this.aClass258_1.method6426((int) local224.aLong248);
					if (local234.aBoolean461) {
						local224.method7967();
					} else {
						local217 = true;
					}
				}
				if (!local217) {
					local18.aClass68_11 = null;
				}
			}
		}
		@Pc(261) Class125 local261 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3437(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILclient!co;ILclient!qa;II)Lclient!ha;")
	public Class84 method6342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class42 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass18_1.anInt313 = arg4.anInt6927;
		this.aClass18_1.anInt314 = arg6;
		this.aClass18_1.anInt318 = arg5;
		this.aClass18_1.anInt316 = arg3;
		this.aClass18_1.aBoolean13 = arg2 != null;
		this.aClass18_1.anInt312 = arg1;
		this.aClass18_1.anInt317 = arg0;
		return (Class84) this.aClass170_1.method4290(this.aClass18_1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!qa;Lclient!co;IIIILclient!qa;IIZLclient!ra;Z)Lclient!ha;")
	public Class84 method6345(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class42 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class80 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class84 local16 = this.method6342(arg2, arg4, arg1, arg5, arg6, arg3, arg7);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) Class56 local31 = this.method6340(arg7);
		if (arg5 > 1 && local31.anIntArray176 != null) {
			@Pc(39) int local39 = -1;
			for (@Pc(41) int local41 = 0; local41 < 10; local41++) {
				if (arg5 >= local31.anIntArray175[local41] && local31.anIntArray175[local41] != 0) {
					local39 = local31.anIntArray176[local41];
				}
			}
			if (local39 != -1) {
				local31 = this.method6340(local39);
			}
		}
		@Pc(90) int[] local90 = local31.method1568(arg6, arg10, arg1, arg9, arg0, arg2, arg5, arg3, arg4);
		if (local90 == null) {
			return null;
		}
		@Pc(104) Class84 local104;
		if (arg8) {
			local104 = arg0.method5862(local90, 36, 36, 32);
		} else {
			local104 = arg6.method5862(local90, 36, 36, 32);
		}
		if (!arg8) {
			@Pc(120) Class18 local120 = new Class18();
			local120.anInt312 = arg4;
			local120.anInt313 = arg6.anInt6927;
			local120.anInt318 = arg3;
			local120.anInt314 = arg7;
			local120.anInt316 = arg5;
			local120.aBoolean13 = arg1 != null;
			local120.anInt317 = arg2;
			this.aClass170_1.method4289(local120, local104);
		}
		return local104;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
	public void method6346(@OriginalArg(1) int arg0) {
		this.anInt7625 = arg0;
		@Pc(13) Class125 local13 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3440();
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)V")
	public void method6347() {
		@Pc(6) Class125 local6 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3447(5);
		}
		local6 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3447(5);
		}
		@Pc(38) Class170 local38 = this.aClass170_1;
		synchronized (this.aClass170_1) {
			this.aClass170_1.method4287();
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public void method6348() {
		@Pc(6) Class125 local6 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3440();
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
	public void method6349() {
		@Pc(12) Class170 local12 = this.aClass170_1;
		synchronized (this.aClass170_1) {
			this.aClass170_1.method4286();
		}
	}
}
