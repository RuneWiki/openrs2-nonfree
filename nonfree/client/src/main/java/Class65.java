import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class65 {

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
	public int anInt1643;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "Lclient!ng;")
	private final Class167 aClass167_25 = new Class167(64);

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Lclient!ng;")
	public final Class167 aClass167_26 = new Class167(50);

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "Lclient!ae;")
	public final Class4 aClass4_1 = new Class4(250);

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "Lclient!tp;")
	private final Class235 aClass235_1 = new Class235();

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "Lclient!ic;")
	private final Class113 aClass113_33;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "Z")
	private boolean aBoolean126;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "Lclient!kc;")
	private final Class132 aClass132_4;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!ic;")
	public final Class113 aClass113_32;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	public final int anInt1640;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	public final int anInt1635;

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray13;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray12;

	static {
		new Class151("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!ai;IZLclient!kc;Lclient!ic;Lclient!ic;)V")
	public Class65(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) Class113 arg4, @OriginalArg(5) Class113 arg5) {
		this.aClass113_33 = arg4;
		this.aBoolean126 = arg2;
		this.aClass132_4 = arg3;
		this.aClass113_32 = arg5;
		this.anInt1640 = arg1;
		if (this.aClass113_33 == null) {
			this.anInt1635 = 0;
		} else {
			@Pc(49) int local49 = this.aClass113_33.method2272() - 1;
			this.anInt1635 = local49 * 256 + this.aClass113_33.method2271(local49);
		}
		this.aStringArray13 = new String[] { null, null, Static115.aClass151_67.method3122(this.anInt1640), null, null };
		this.aStringArray12 = new String[] { null, null, null, null, Static302.aClass151_153.method3122(this.anInt1640) };
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lclient!ew;")
	public Class74 method1327(@OriginalArg(1) int arg0) {
		@Pc(8) Class167 local8 = this.aClass167_25;
		@Pc(20) Class74 local20;
		synchronized (this.aClass167_25) {
			local20 = (Class74) this.aClass167_25.method3386((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(41) byte[] local41 = this.aClass113_33.method2274(Static176.method2363(arg0), Static337.method1436(arg0));
		local20 = new Class74();
		local20.anInt1890 = arg0;
		local20.aClass65_1 = this;
		local20.aStringArray15 = new String[] { null, null, Static115.aClass151_67.method3122(this.anInt1640), null, null };
		local20.aStringArray16 = new String[] { null, null, null, null, Static302.aClass151_153.method3122(this.anInt1640) };
		if (local41 != null) {
			local20.method1487(new Class1_Sub11(local41));
		}
		local20.method1498();
		if (local20.anInt1848 != -1) {
			local20.method1491(this.method1327(local20.anInt1848), this.method1327(local20.anInt1857));
		}
		if (local20.anInt1868 != -1) {
			local20.method1497(this.method1327(local20.anInt1868), this.method1327(local20.anInt1889));
		}
		if (!this.aBoolean126 && local20.aBoolean138) {
			local20.aString14 = Static316.aClass151_163.method3122(this.anInt1640);
			local20.aBoolean137 = false;
			local20.anInt1844 = 0;
			local20.anIntArray87 = null;
			local20.aStringArray16 = this.aStringArray12;
			local20.aStringArray15 = this.aStringArray13;
			if (local20.aClass257_6 != null) {
				@Pc(192) boolean local192 = false;
				for (@Pc(197) Class1 local197 = local20.aClass257_6.method5506(); local197 != null; local197 = local20.aClass257_6.method5501()) {
					@Pc(207) Class78 local207 = this.aClass132_4.method2771((int) local197.aLong226);
					if (local207.aBoolean146) {
						local197.method5617();
					} else {
						local192 = true;
					}
				}
				if (!local192) {
					local20.aClass257_6 = null;
				}
			}
		}
		@Pc(234) Class167 local234 = this.aClass167_25;
		synchronized (this.aClass167_25) {
			this.aClass167_25.method3392(local20, (long) arg0);
			return local20;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
	public void method1328() {
		@Pc(12) Class167 local12 = this.aClass167_25;
		synchronized (this.aClass167_25) {
			this.aClass167_25.method3389();
		}
		local12 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3389();
		}
		@Pc(42) Class4 local42 = this.aClass4_1;
		synchronized (this.aClass4_1) {
			this.aClass4_1.method110();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
	public void method1329() {
		@Pc(10) Class167 local10 = this.aClass167_25;
		synchronized (this.aClass167_25) {
			this.aClass167_25.method3384(5);
		}
		local10 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3384(5);
		}
		@Pc(44) Class4 local44 = this.aClass4_1;
		synchronized (this.aClass4_1) {
			this.aClass4_1.method108();
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
	public void method1331() {
		@Pc(8) Class4 local8 = this.aClass4_1;
		synchronized (this.aClass4_1) {
			this.aClass4_1.method106();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	public void method1332() {
		@Pc(2) Class167 local2 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3390();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!da;IBLclient!qa;II)Lclient!f;")
	public Class49 method1333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class128 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass235_1.anInt6433 = arg0;
		this.aClass235_1.anInt6428 = arg1;
		this.aClass235_1.anInt6431 = arg3;
		this.aClass235_1.anInt6427 = arg6;
		this.aClass235_1.aBoolean528 = arg2 != null;
		this.aClass235_1.anInt6430 = arg5;
		this.aClass235_1.anInt6425 = arg4.anInt4410;
		return (Class49) this.aClass4_1.method109(this.aClass235_1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public void method1334() {
		@Pc(2) Class167 local2 = this.aClass167_25;
		synchronized (this.aClass167_25) {
			this.aClass167_25.method3390();
		}
		local2 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3390();
		}
		@Pc(42) Class4 local42 = this.aClass4_1;
		synchronized (this.aClass4_1) {
			this.aClass4_1.method106();
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(IB)V")
	public void method1335(@OriginalArg(0) int arg0) {
		this.anInt1643 = arg0;
		@Pc(9) Class167 local9 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3390();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)V")
	public void method1336(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean126) {
			this.aBoolean126 = arg0;
			this.method1334();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!da;IIBIILclient!oa;ZZLclient!qa;Lclient!qa;)Lclient!f;")
	public Class49 method1337(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class128 arg9, @OriginalArg(11) Class128 arg10) {
		@Pc(16) Class49 local16 = this.method1333(arg3, arg4, arg1, arg2, arg10, arg0, arg5);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class74 local25 = this.method1327(arg3);
		if (arg0 > 1 && local25.anIntArray86 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local25.anIntArray85[local35] <= arg0 && local25.anIntArray85[local35] != 0) {
					local33 = local25.anIntArray86[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method1327(local33);
			}
		}
		@Pc(80) int[] local80 = local25.method1500(arg1, arg8, arg2, arg4, arg6, arg9, arg0, arg5, arg10);
		if (local80 == null) {
			return null;
		}
		@Pc(100) Class49 local100;
		if (arg7) {
			local100 = arg9.method3572(local80, 36, 36, 32);
		} else {
			local100 = arg10.method3572(local80, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(116) Class235 local116 = new Class235();
			local116.anInt6433 = arg3;
			local116.anInt6428 = arg4;
			local116.anInt6427 = arg5;
			local116.aBoolean528 = arg1 != null;
			local116.anInt6425 = arg10.anInt4410;
			local116.anInt6431 = arg2;
			local116.anInt6430 = arg0;
			this.aClass4_1.method113(local116, local100);
		}
		return local100;
	}
}
