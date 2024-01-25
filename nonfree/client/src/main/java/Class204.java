import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class204 {

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
	public int anInt5974;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!er;")
	private final Class69 aClass69_55 = new Class69(64);

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Lclient!er;")
	public final Class69 aClass69_56 = new Class69(50);

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "Lclient!pb;")
	public final Class183 aClass183_1 = new Class183(250);

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Lclient!fr;")
	private final Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "Lclient!ns;")
	public final Class166 aClass166_236;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!ns;")
	private final Class166 aClass166_235;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	public final int anInt5962;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "Lclient!wh;")
	private final Class262 aClass262_2;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
	public final int anInt5967;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray38;

	static {
		new Class242("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!go;IZLclient!wh;Lclient!ns;Lclient!ns;)V")
	public Class204(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class262 arg3, @OriginalArg(4) Class166 arg4, @OriginalArg(5) Class166 arg5) {
		this.aClass166_236 = arg5;
		this.aClass166_235 = arg4;
		this.anInt5962 = arg1;
		this.aBoolean412 = arg2;
		this.aClass262_2 = arg3;
		if (this.aClass166_235 == null) {
			this.anInt5967 = 0;
		} else {
			@Pc(49) int local49 = this.aClass166_235.method3695() - 1;
			this.anInt5967 = local49 * 256 + this.aClass166_235.method3691(local49);
		}
		this.aStringArray39 = new String[] { null, null, Static429.aClass242_101.method5320(this.anInt5962), null, null };
		this.aStringArray38 = new String[] { null, null, null, null, Static102.aClass242_25.method5320(this.anInt5962) };
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public void method4621() {
		@Pc(8) Class69 local8 = this.aClass69_55;
		synchronized (this.aClass69_55) {
			this.aClass69_55.method1600();
		}
		local8 = this.aClass69_56;
		synchronized (this.aClass69_56) {
			this.aClass69_56.method1600();
		}
		@Pc(42) Class183 local42 = this.aClass183_1;
		synchronized (this.aClass183_1) {
			this.aClass183_1.method4112();
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public void method4622() {
		@Pc(2) Class69 local2 = this.aClass69_55;
		synchronized (this.aClass69_55) {
			this.aClass69_55.method1593();
		}
		local2 = this.aClass69_56;
		synchronized (this.aClass69_56) {
			this.aClass69_56.method1593();
		}
		@Pc(44) Class183 local44 = this.aClass183_1;
		synchronized (this.aClass183_1) {
			this.aClass183_1.method4103();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public void method4623(@OriginalArg(1) int arg0) {
		this.anInt5974 = arg0;
		@Pc(13) Class69 local13 = this.aClass69_56;
		synchronized (this.aClass69_56) {
			this.aClass69_56.method1593();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
	public void method4624(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean412 != arg0) {
			this.aBoolean412 = arg0;
			this.method4622();
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public void method4625() {
		@Pc(2) Class69 local2 = this.aClass69_56;
		synchronized (this.aClass69_56) {
			this.aClass69_56.method1593();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!qa;ZBLclient!oa;ZIILclient!qa;IIILclient!pt;)Lclient!f;")
	public Class3 method4626(@OriginalArg(0) Class30 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class105 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class30 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class188 arg10) {
		@Pc(21) Class3 local21 = this.method4627(arg10, arg6, arg7, arg5, arg4, arg9, arg8);
		if (local21 != null) {
			return local21;
		}
		@Pc(32) Class127 local32 = this.method4629(arg7);
		if (arg5 > 1 && local32.anIntArray293 != null) {
			@Pc(42) int local42 = -1;
			for (@Pc(44) int local44 = 0; local44 < 10; local44++) {
				if (arg5 >= local32.anIntArray291[local44] && local32.anIntArray291[local44] != 0) {
					local42 = local32.anIntArray293[local44];
				}
			}
			if (local42 != -1) {
				local32 = this.method4629(local42);
			}
		}
		@Pc(90) int[] local90 = local32.method2746(arg2, arg0, arg10, arg6, arg4, arg3, arg5, arg8, arg9);
		if (local90 == null) {
			return null;
		}
		@Pc(104) Class3 local104;
		if (arg1) {
			local104 = arg0.method4672(local90, 36, 36, 32);
		} else {
			local104 = arg6.method4672(local90, 36, 36, 32);
		}
		if (!arg1) {
			@Pc(120) Class83 local120 = new Class83();
			local120.aBoolean191 = arg10 != null;
			local120.anInt2521 = arg8;
			local120.anInt2517 = arg5;
			local120.anInt2515 = arg4;
			local120.anInt2522 = arg9;
			local120.anInt2519 = arg7;
			local120.anInt2520 = arg6.anInt5975;
			this.aClass183_1.method4100(local104, local120);
		}
		return local104;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!pt;Lclient!qa;IIIII)Lclient!f;")
	public Class3 method4627(@OriginalArg(1) Class188 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass83_1.anInt2521 = arg6;
		this.aClass83_1.anInt2519 = arg2;
		this.aClass83_1.anInt2520 = arg1.anInt5975;
		this.aClass83_1.anInt2515 = arg4;
		this.aClass83_1.aBoolean191 = arg0 != null;
		this.aClass83_1.anInt2522 = arg5;
		this.aClass83_1.anInt2517 = arg3;
		return (Class3) this.aClass183_1.method4111(this.aClass83_1);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public void method4628() {
		@Pc(10) Class69 local10 = this.aClass69_55;
		synchronized (this.aClass69_55) {
			this.aClass69_55.method1594(5);
		}
		local10 = this.aClass69_56;
		synchronized (this.aClass69_56) {
			this.aClass69_56.method1594(5);
		}
		@Pc(42) Class183 local42 = this.aClass183_1;
		synchronized (this.aClass183_1) {
			this.aClass183_1.method4105();
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lclient!je;")
	public Class127 method4629(@OriginalArg(1) int arg0) {
		@Pc(8) Class69 local8 = this.aClass69_55;
		@Pc(18) Class127 local18;
		synchronized (this.aClass69_55) {
			local18 = (Class127) this.aClass69_55.method1591((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass166_235.method3696(Static164.method2399(arg0), Static237.method3292(arg0));
		local18 = new Class127();
		local18.aClass204_1 = this;
		local18.anInt3572 = arg0;
		local18.aStringArray26 = new String[] { null, null, Static429.aClass242_101.method5320(this.anInt5962), null, null };
		local18.aStringArray25 = new String[] { null, null, null, null, Static102.aClass242_25.method5320(this.anInt5962) };
		if (local39 != null) {
			local18.method2733(new Class4_Sub30(local39));
		}
		local18.method2743();
		if (local18.anInt3547 != -1) {
			local18.method2740(this.method4629(local18.anInt3547), this.method4629(local18.anInt3540));
		}
		if (local18.anInt3525 != -1) {
			local18.method2745(this.method4629(local18.anInt3567), this.method4629(local18.anInt3525));
		}
		if (!this.aBoolean412 && local18.aBoolean266) {
			local18.aString43 = Static312.aClass242_70.method5320(this.anInt5962);
			local18.anIntArray292 = null;
			local18.aBoolean267 = false;
			local18.aStringArray26 = this.aStringArray39;
			local18.anInt3574 = 0;
			local18.aStringArray25 = this.aStringArray38;
			if (local18.aClass196_18 != null) {
				@Pc(187) boolean local187 = false;
				for (@Pc(192) Class4 local192 = local18.aClass196_18.method4482(); local192 != null; local192 = local18.aClass196_18.method4472()) {
					@Pc(202) Class247 local202 = this.aClass262_2.method5689((int) local192.aLong225);
					if (local202.aBoolean475) {
						local192.method5854();
					} else {
						local187 = true;
					}
				}
				if (!local187) {
					local18.aClass196_18 = null;
				}
			}
		}
		@Pc(227) Class69 local227 = this.aClass69_55;
		synchronized (this.aClass69_55) {
			this.aClass69_55.method1590((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	public void method4630() {
		@Pc(6) Class183 local6 = this.aClass183_1;
		synchronized (this.aClass183_1) {
			this.aClass183_1.method4103();
		}
	}
}
