import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class273 {

	@OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
	public int anInt8079;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Lclient!mq;")
	private final Class223 aClass223_55 = new Class223(64);

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "Lclient!mq;")
	public final Class223 aClass223_56 = new Class223(50);

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "Lclient!qp;")
	public final Class275 aClass275_1 = new Class275(250);

	@OriginalMember(owner = "client!qk", name = "C", descriptor = "Lclient!hga;")
	private final Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "Z")
	private boolean aBoolean559;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	public final int anInt8065;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "Lclient!jn;")
	private final Class176 aClass176_107;

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "Lclient!td;")
	private final Class313 aClass313_1;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Lclient!jn;")
	public final Class176 aClass176_106;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
	public final int anInt8075;

	@OriginalMember(owner = "client!qk", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray58;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray59;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!er;IZLclient!td;Lclient!jn;Lclient!jn;)V")
	public Class273(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class313 arg3, @OriginalArg(4) Class176 arg4, @OriginalArg(5) Class176 arg5) {
		this.aBoolean559 = arg2;
		this.anInt8065 = arg1;
		this.aClass176_107 = arg4;
		this.aClass313_1 = arg3;
		this.aClass176_106 = arg5;
		if (this.aClass176_107 == null) {
			this.anInt8075 = 0;
		} else {
			@Pc(54) int local54 = this.aClass176_107.method3973() - 1;
			this.anInt8075 = this.aClass176_107.method3999(local54) + local54 * 256;
		}
		this.aStringArray58 = new String[] { null, null, Static590.aClass364_11.method8334(this.anInt8065), null, null };
		this.aStringArray59 = new String[] { null, null, null, null, Static590.aClass364_12.method8334(this.anInt8065) };
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public void method6711() {
		@Pc(14) Class223 local14 = this.aClass223_55;
		synchronized (this.aClass223_55) {
			this.aClass223_55.method5398();
		}
		local14 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method5398();
		}
		@Pc(44) Class275 local44 = this.aClass275_1;
		synchronized (this.aClass275_1) {
			this.aClass275_1.method6773();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)Lclient!oba;")
	public Class242 method6712(@OriginalArg(1) int arg0) {
		@Pc(8) Class223 local8 = this.aClass223_55;
		@Pc(18) Class242 local18;
		synchronized (this.aClass223_55) {
			local18 = (Class242) this.aClass223_55.method5388((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class176 local31 = this.aClass176_107;
		@Pc(44) byte[] local44;
		synchronized (this.aClass176_107) {
			local44 = this.aClass176_107.method3994(Static363.method5855(arg0), Static439.method6804(arg0));
		}
		local18 = new Class242();
		local18.anInt7116 = arg0;
		local18.aClass273_1 = this;
		local18.aStringArray43 = new String[] { null, null, Static590.aClass364_11.method8334(this.anInt8065), null, null };
		local18.aStringArray42 = new String[] { null, null, null, null, Static590.aClass364_12.method8334(this.anInt8065) };
		if (local44 != null) {
			local18.method5888(new Class4_Sub11(local44));
		}
		local18.method5904();
		if (local18.anInt7089 != -1) {
			local18.method5887(this.method6712(local18.anInt7089), this.method6712(local18.anInt7117));
		}
		if (local18.anInt7081 != -1) {
			local18.method5900(this.method6712(local18.anInt7095), this.method6712(local18.anInt7081));
		}
		if (!this.aBoolean559 && local18.aBoolean501) {
			local18.aString71 = Static590.aClass364_9.method8334(this.anInt8065);
			local18.anIntArray364 = null;
			local18.aBoolean502 = false;
			local18.aStringArray42 = this.aStringArray59;
			local18.anInt7110 = 0;
			local18.aStringArray43 = this.aStringArray58;
			if (local18.aClass350_29 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class4 local209 = local18.aClass350_29.method8198(); local209 != null; local209 = local18.aClass350_29.method8205()) {
					@Pc(219) Class106 local219 = this.aClass313_1.method7381((int) local209.aLong268);
					if (local219.aBoolean275) {
						local209.method8379();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local18.aClass350_29 = null;
				}
			}
		}
		@Pc(244) Class223 local244 = this.aClass223_55;
		synchronized (this.aClass223_55) {
			this.aClass223_55.method5394(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)V")
	public void method6714(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean559) {
			this.aBoolean559 = arg0;
			this.method6711();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public void method6715() {
		@Pc(6) Class275 local6 = this.aClass275_1;
		synchronized (this.aClass275_1) {
			this.aClass275_1.method6773();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	public void method6716() {
		@Pc(8) Class223 local8 = this.aClass223_55;
		synchronized (this.aClass223_55) {
			this.aClass223_55.method5400();
		}
		local8 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method5400();
		}
		@Pc(42) Class275 local42 = this.aClass275_1;
		synchronized (this.aClass275_1) {
			this.aClass275_1.method6770();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)V")
	public void method6718() {
		@Pc(2) Class223 local2 = this.aClass223_55;
		synchronized (this.aClass223_55) {
			this.aClass223_55.method5399(5);
		}
		local2 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method5399(5);
		}
		@Pc(42) Class275 local42 = this.aClass275_1;
		synchronized (this.aClass275_1) {
			this.aClass275_1.method6780();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!r;IIIIBIZLclient!jaa;Lclient!r;ZLclient!la;)Lclient!f;")
	public Class78 method6719(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class166 arg7, @OriginalArg(9) Class44 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class58 arg10) {
		@Pc(23) Class78 local23 = this.method6723(arg7, arg1, arg0, arg3, arg5, arg4, arg2);
		if (local23 != null) {
			return local23;
		}
		@Pc(32) Class242 local32 = this.method6712(arg2);
		if (arg1 > 1 && local32.anIntArray365 != null) {
			@Pc(42) int local42 = -1;
			for (@Pc(44) int local44 = 0; local44 < 10; local44++) {
				if (arg1 >= local32.lb[local44] && local32.lb[local44] != 0) {
					local42 = local32.anIntArray365[local44];
				}
			}
			if (local42 != -1) {
				local32 = this.method6712(local42);
			}
		}
		@Pc(87) int[] local87 = local32.method5897(arg6, arg3, arg7, arg8, arg1, arg4, arg10, arg5, arg0);
		if (local87 == null) {
			return null;
		}
		@Pc(101) Class78 local101;
		if (arg9) {
			local101 = arg8.method4969(local87, 36, 36, 32);
		} else {
			local101 = arg0.method4969(local87, 36, 36, 32);
		}
		if (!arg9) {
			@Pc(117) Class138 local117 = new Class138();
			local117.aBoolean291 = arg7 != null;
			local117.anInt3694 = arg4;
			local117.anInt3702 = arg1;
			local117.anInt3696 = arg0.anInt5872;
			local117.anInt3697 = arg5;
			local117.anInt3701 = arg3;
			local117.anInt3695 = arg2;
			this.aClass275_1.method6768(local117, local101);
		}
		return local101;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	public void method6722(@OriginalArg(0) int arg0) {
		this.anInt8079 = arg0;
		@Pc(27) Class223 local27 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method5398();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!jaa;ILclient!r;IIIII)Lclient!f;")
	public Class78 method6723(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		this.aClass138_1.anInt3697 = arg4;
		this.aClass138_1.anInt3694 = arg5;
		this.aClass138_1.aBoolean291 = arg0 != null;
		this.aClass138_1.anInt3701 = arg3;
		this.aClass138_1.anInt3696 = arg2.anInt5872;
		this.aClass138_1.anInt3695 = arg6;
		this.aClass138_1.anInt3702 = arg1;
		return (Class78) this.aClass275_1.method6772(this.aClass138_1);
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
	public void method6724() {
		@Pc(8) Class223 local8 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method5398();
		}
	}
}
