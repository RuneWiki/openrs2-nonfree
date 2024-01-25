import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class226 {

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
	public int anInt5950;

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "Lclient!fc;")
	private final Class77 aClass77_48 = new Class77(64);

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "Lclient!fc;")
	public final Class77 aClass77_49 = new Class77(50);

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "Lclient!od;")
	public final Class181 aClass181_1 = new Class181(250);

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "Lclient!uc;")
	private final Class246 aClass246_1 = new Class246();

	@OriginalMember(owner = "client!rt", name = "x", descriptor = "Lclient!ka;")
	private final Class136 aClass136_2;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
	public final int anInt5937;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "Lclient!oi;")
	private final Class185 aClass185_94;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Lclient!oi;")
	public final Class185 aClass185_93;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	public final int anInt5944;

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray46;

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray45;

	static {
		new Class142("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
		new Class142(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!le;IZLclient!ka;Lclient!oi;Lclient!oi;)V")
	public Class226(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class136 arg3, @OriginalArg(4) Class185 arg4, @OriginalArg(5) Class185 arg5) {
		this.aClass136_2 = arg3;
		this.anInt5937 = arg1;
		this.aClass185_94 = arg4;
		this.aClass185_93 = arg5;
		this.aBoolean527 = arg2;
		if (this.aClass185_94 == null) {
			this.anInt5944 = 0;
		} else {
			@Pc(54) int local54 = this.aClass185_94.method4010() - 1;
			this.anInt5944 = local54 * 256 + this.aClass185_94.method4011(local54);
		}
		this.aStringArray46 = new String[] { null, null, Static164.aClass142_105.method3118(this.anInt5937), null, null };
		this.aStringArray45 = new String[] { null, null, null, null, Static312.aClass142_79.method3118(this.anInt5937) };
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public void method4780() {
		@Pc(2) Class77 local2 = this.aClass77_48;
		synchronized (this.aClass77_48) {
			this.aClass77_48.method1394();
		}
		local2 = this.aClass77_49;
		synchronized (this.aClass77_49) {
			this.aClass77_49.method1394();
		}
		@Pc(38) Class181 local38 = this.aClass181_1;
		synchronized (this.aClass181_1) {
			this.aClass181_1.method3927();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!za;ZILclient!za;IILclient!la;IZIILclient!jl;)Lclient!o;")
	public Class85 method4781(@OriginalArg(0) Class117 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class137 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class131 arg10) {
		@Pc(16) Class85 local16 = this.method4787(arg7, arg9, arg0, arg4, arg2, arg10, arg5);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class135 local25 = this.method4788(arg4);
		if (arg7 > 1 && local25.anIntArray275 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg7 >= local25.anIntArray276[local35] && local25.anIntArray276[local35] != 0) {
					local33 = local25.anIntArray275[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method4788(local33);
			}
		}
		@Pc(81) int[] local81 = local25.method3002(arg7, arg1, arg9, arg3, arg2, arg5, arg6, arg0, arg10);
		if (local81 == null) {
			return null;
		}
		@Pc(100) Class85 local100;
		if (arg8) {
			local100 = arg3.method5700(local81, 36, 36, 32);
		} else {
			local100 = arg0.method5700(local81, 36, 36, 32);
		}
		if (!arg8) {
			@Pc(116) Class246 local116 = new Class246();
			local116.aBoolean568 = arg10 != null;
			local116.anInt6524 = arg9;
			local116.anInt6523 = arg0.anInt7048;
			local116.anInt6521 = arg7;
			local116.anInt6519 = arg4;
			local116.anInt6518 = arg2;
			local116.anInt6522 = arg5;
			this.aClass181_1.method3931(local100, local116);
		}
		return local100;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public void method4782() {
		@Pc(6) Class181 local6 = this.aClass181_1;
		synchronized (this.aClass181_1) {
			this.aClass181_1.method3922();
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
	public void method4783() {
		@Pc(6) Class77 local6 = this.aClass77_48;
		synchronized (this.aClass77_48) {
			this.aClass77_48.method1395();
		}
		local6 = this.aClass77_49;
		synchronized (this.aClass77_49) {
			this.aClass77_49.method1395();
		}
		@Pc(40) Class181 local40 = this.aClass181_1;
		synchronized (this.aClass181_1) {
			this.aClass181_1.method3922();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)V")
	public void method4784(@OriginalArg(0) int arg0) {
		this.anInt5950 = arg0;
		@Pc(15) Class77 local15 = this.aClass77_49;
		synchronized (this.aClass77_49) {
			this.aClass77_49.method1395();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILclient!za;IIILclient!jl;I)Lclient!o;")
	public Class85 method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class131 arg5, @OriginalArg(7) int arg6) {
		this.aClass246_1.anInt6522 = arg6;
		this.aClass246_1.aBoolean568 = arg5 != null;
		this.aClass246_1.anInt6519 = arg3;
		this.aClass246_1.anInt6518 = arg4;
		this.aClass246_1.anInt6521 = arg0;
		this.aClass246_1.anInt6524 = arg1;
		this.aClass246_1.anInt6523 = arg2.anInt7048;
		return (Class85) this.aClass181_1.method3933(this.aClass246_1);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ)Lclient!jw;")
	public Class135 method4788(@OriginalArg(0) int arg0) {
		@Pc(8) Class77 local8 = this.aClass77_48;
		@Pc(18) Class135 local18;
		synchronized (this.aClass77_48) {
			local18 = (Class135) this.aClass77_48.method1387((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class185 local31 = this.aClass185_94;
		@Pc(44) byte[] local44;
		synchronized (this.aClass185_94) {
			local44 = this.aClass185_94.method4002(Static18.method3400(arg0), Static376.method4866(arg0));
		}
		local18 = new Class135();
		local18.anInt3870 = arg0;
		local18.aClass226_1 = this;
		local18.aStringArray28 = new String[] { null, null, Static164.aClass142_105.method3118(this.anInt5937), null, null };
		local18.aStringArray27 = new String[] { null, null, null, null, Static312.aClass142_79.method3118(this.anInt5937) };
		if (local44 != null) {
			local18.method2992(new Class1_Sub19(local44));
		}
		local18.method2999();
		if (local18.anInt3863 != -1) {
			local18.method2997(this.method4788(local18.anInt3846), this.method4788(local18.anInt3863));
		}
		if (local18.anInt3861 != -1) {
			local18.method3000(this.method4788(local18.anInt3861), this.method4788(local18.anInt3845));
		}
		if (!this.aBoolean527 && local18.aBoolean357) {
			local18.aString41 = Static174.aClass142_40.method3118(this.anInt5937);
			local18.aBoolean356 = false;
			local18.anInt3838 = 0;
			local18.anIntArray274 = null;
			local18.aStringArray28 = this.aStringArray46;
			local18.aStringArray27 = this.aStringArray45;
			if (local18.aClass208_23 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class1 local209 = local18.aClass208_23.method4414(); local209 != null; local209 = local18.aClass208_23.method4410()) {
					@Pc(219) Class45 local219 = this.aClass136_2.method3016((int) local209.aLong236);
					if (local219.aBoolean119) {
						local209.method5953();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local18.aClass208_23 = null;
				}
			}
		}
		@Pc(244) Class77 local244 = this.aClass77_48;
		synchronized (this.aClass77_48) {
			this.aClass77_48.method1396(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V")
	public void method4789() {
		@Pc(6) Class77 local6 = this.aClass77_48;
		synchronized (this.aClass77_48) {
			this.aClass77_48.method1386(5);
		}
		local6 = this.aClass77_49;
		synchronized (this.aClass77_49) {
			this.aClass77_49.method1386(5);
		}
		@Pc(38) Class181 local38 = this.aClass181_1;
		synchronized (this.aClass181_1) {
			this.aClass181_1.method3926();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BZ)V")
	public void method4791(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean527) {
			this.aBoolean527 = arg0;
			this.method4783();
		}
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
	public void method4792() {
		@Pc(6) Class77 local6 = this.aClass77_49;
		synchronized (this.aClass77_49) {
			this.aClass77_49.method1395();
		}
	}
}
