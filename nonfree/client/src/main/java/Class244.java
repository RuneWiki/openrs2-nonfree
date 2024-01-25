import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class244 {

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public int anInt6710;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!ui;")
	private final Class359 aClass359_47 = new Class359(64);

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!ui;")
	public final Class359 aClass359_48 = new Class359(50);

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!fia;")
	public final Class112 aClass112_1 = new Class112(250);

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!rba;")
	private final Class310 aClass310_1 = new Class310();

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public final int anInt6700;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!lga;")
	private final Class223 aClass223_82;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!fs;")
	private final Class121 aClass121_5;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!lga;")
	public final Class223 aClass223_81;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!am;")
	private final Class20 aClass20_16;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public final int anInt6698;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray28;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!fs;IZLclient!am;Lclient!lga;Lclient!lga;)V")
	public Class244(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class223 arg4, @OriginalArg(5) Class223 arg5) {
		this.anInt6700 = arg1;
		this.aClass223_82 = arg4;
		this.aClass121_5 = arg0;
		this.aClass223_81 = arg5;
		this.aBoolean502 = arg2;
		this.aClass20_16 = arg3;
		if (this.aClass223_82 == null) {
			this.anInt6698 = 0;
		} else {
			@Pc(59) int local59 = this.aClass223_82.method5290() - 1;
			this.anInt6698 = local59 * 256 + this.aClass223_82.method5264(local59);
		}
		if (this.aClass121_5 == Static517.aClass121_8) {
			this.aStringArray28 = new String[] { null, null, Static50.aClass43_8.method596(this.anInt6700), null, null, Static50.aClass43_22.method596(this.anInt6700) };
		} else {
			this.aStringArray28 = new String[] { null, null, Static50.aClass43_8.method596(this.anInt6700), null, null, null };
		}
		this.aStringArray29 = new String[] { null, null, null, null, Static50.aClass43_9.method596(this.anInt6700) };
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)V")
	public void method5957(@OriginalArg(1) int arg0) {
		this.anInt6710 = arg0;
		@Pc(9) Class359 local9 = this.aClass359_48;
		synchronized (this.aClass359_48) {
			this.aClass359_48.method8507();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lclient!pga;")
	public Class282 method5958(@OriginalArg(0) int arg0) {
		@Pc(8) Class359 local8 = this.aClass359_47;
		@Pc(18) Class282 local18;
		synchronized (this.aClass359_47) {
			local18 = (Class282) this.aClass359_47.method8517((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class223 local32 = this.aClass223_82;
		@Pc(45) byte[] local45;
		synchronized (this.aClass223_82) {
			local45 = this.aClass223_82.method5267(Static567.method7972(arg0), Static669.method8873(arg0));
		}
		local18 = new Class282();
		local18.aClass244_2 = this;
		local18.anInt7936 = arg0;
		local18.aStringArray33 = (String[]) this.aStringArray28.clone();
		local18.aStringArray32 = (String[]) this.aStringArray29.clone();
		if (local45 != null) {
			local18.method6987(new Class6_Sub15(local45));
		}
		local18.method6974();
		if (local18.anInt7895 != -1) {
			local18.method6981(this.method5958(local18.anInt7895), this.method5958(local18.anInt7898));
		}
		if (local18.anInt7929 != -1) {
			local18.method6972(this.method5958(local18.anInt7929), this.method5958(local18.anInt7897));
		}
		if (local18.anInt7880 != -1) {
			local18.method6983(this.method5958(local18.anInt7880), this.method5958(local18.anInt7881));
		}
		if (!this.aBoolean502 && local18.aBoolean600) {
			local18.aString87 = Static50.aClass43_5.method596(this.anInt6700);
			local18.anInt7906 = 0;
			local18.aStringArray33 = this.aStringArray28;
			local18.aStringArray32 = this.aStringArray29;
			local18.anIntArray500 = null;
			local18.aBoolean601 = false;
			if (local18.aClass74_51 != null) {
				@Pc(185) boolean local185 = false;
				for (@Pc(190) Class6 local190 = local18.aClass74_51.method1404(); local190 != null; local190 = local18.aClass74_51.method1405()) {
					@Pc(200) Class302 local200 = this.aClass20_16.method250((int) local190.aLong346);
					if (local200.aBoolean642) {
						local190.method9051();
					} else {
						local185 = true;
					}
				}
				if (!local185) {
					local18.aClass74_51 = null;
				}
			}
		}
		@Pc(231) Class359 local231 = this.aClass359_47;
		synchronized (this.aClass359_47) {
			this.aClass359_47.method8515((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIILclient!dea;ILclient!ha;)Lclient!tb;")
	public Class49 method5959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class73 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class75 arg6) {
		this.aClass310_1.anInt8478 = arg1;
		this.aClass310_1.anInt8481 = arg6.anInt7475;
		this.aClass310_1.anInt8484 = arg0;
		this.aClass310_1.anInt8480 = arg5;
		this.aClass310_1.aBoolean650 = arg4 != null;
		this.aClass310_1.anInt8485 = arg3;
		this.aClass310_1.anInt8486 = arg2;
		return (Class49) this.aClass112_1.method3214(this.aClass310_1);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	public void method5960() {
		@Pc(6) Class359 local6 = this.aClass359_47;
		synchronized (this.aClass359_47) {
			this.aClass359_47.method8502(5);
		}
		local6 = this.aClass359_48;
		synchronized (this.aClass359_48) {
			this.aClass359_48.method8502(5);
		}
		@Pc(48) Class112 local48 = this.aClass112_1;
		synchronized (this.aClass112_1) {
			this.aClass112_1.method3205();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public void method5961() {
		@Pc(2) Class359 local2 = this.aClass359_47;
		synchronized (this.aClass359_47) {
			this.aClass359_47.method8511();
		}
		local2 = this.aClass359_48;
		synchronized (this.aClass359_48) {
			this.aClass359_48.method8511();
		}
		@Pc(44) Class112 local44 = this.aClass112_1;
		synchronized (this.aClass112_1) {
			this.aClass112_1.method3209();
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	public void method5962() {
		@Pc(10) Class359 local10 = this.aClass359_47;
		synchronized (this.aClass359_47) {
			this.aClass359_47.method8507();
		}
		local10 = this.aClass359_48;
		synchronized (this.aClass359_48) {
			this.aClass359_48.method8507();
		}
		@Pc(44) Class112 local44 = this.aClass112_1;
		synchronized (this.aClass112_1) {
			this.aClass112_1.method3210();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!ha;BZZLclient!dea;Lclient!da;Lclient!ha;IIII)Lclient!tb;")
	public Class49 method5964(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class73 arg4, @OriginalArg(6) Class67 arg5, @OriginalArg(7) Class75 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class49 local16 = this.method5959(arg7, arg9, arg10, arg0, arg4, arg8, arg6);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) Class282 local28 = this.method5958(arg7);
		if (arg9 > 1 && local28.anIntArray498 != null) {
			@Pc(40) int local40 = -1;
			for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
				if (arg9 >= local28.anIntArray499[local42] && local28.anIntArray499[local42] != 0) {
					local40 = local28.anIntArray498[local42];
				}
			}
			if (local40 != -1) {
				local28 = this.method5958(local40);
			}
		}
		@Pc(107) int[] local107 = local28.method6973(arg10, arg1, arg5, arg8, arg9, arg3, arg0, arg6, arg4);
		if (local107 == null) {
			return null;
		}
		@Pc(123) Class49 local123;
		if (arg2) {
			local123 = arg1.method6692(32, 36, local107, 36);
		} else {
			local123 = arg6.method6692(32, 36, local107, 36);
		}
		if (!arg2) {
			@Pc(140) Class310 local140 = new Class310();
			local140.anInt8478 = arg9;
			local140.anInt8486 = arg10;
			local140.anInt8480 = arg8;
			local140.anInt8481 = arg6.anInt7475;
			local140.anInt8484 = arg7;
			local140.aBoolean650 = arg4 != null;
			local140.anInt8485 = arg0;
			this.aClass112_1.method3204(local140, local123);
		}
		return local123;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BZ)V")
	public void method5965(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean502) {
			this.aBoolean502 = arg0;
			this.method5962();
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public void method5966() {
		@Pc(2) Class359 local2 = this.aClass359_48;
		synchronized (this.aClass359_48) {
			this.aClass359_48.method8507();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void method5968() {
		@Pc(6) Class112 local6 = this.aClass112_1;
		synchronized (this.aClass112_1) {
			this.aClass112_1.method3210();
		}
	}
}
