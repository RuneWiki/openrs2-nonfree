import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class56 implements Interface3 {

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Lclient!id;")
	private final Class105 aClass105_4 = new Class105(256);

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "Lclient!g;")
	private final Class83 aClass83_34;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Lclient!g;")
	private final Class83 aClass83_35;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "[Lclient!ns;")
	private final Class166[] aClass166Array1;

	static {
		new Class62("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!g;Lclient!g;Lclient!g;)V")
	public Class56(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_34 = arg1;
		this.aClass83_35 = arg2;
		@Pc(24) Class2_Sub24 local24 = new Class2_Sub24(arg0.method1968(0, 0));
		@Pc(28) int local28 = local24.method5753();
		this.aClass166Array1 = new Class166[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5732() == 1) {
				this.aClass166Array1[local34] = new Class166();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass166Array1[local58] != null) {
				this.aClass166Array1[local58].aBoolean339 = local24.method5732() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < local28; local90++) {
			if (this.aClass166Array1[local90] != null) {
				this.aClass166Array1[local90].aBoolean342 = local24.method5732() == 1;
			}
		}
		for (@Pc(122) int local122 = 0; local122 < local28; local122++) {
			if (this.aClass166Array1[local122] != null) {
				this.aClass166Array1[local122].aBoolean346 = local24.method5732() == 1;
			}
		}
		for (@Pc(148) int local148 = 0; local148 < local28; local148++) {
			if (this.aClass166Array1[local148] != null) {
				this.aClass166Array1[local148].aBoolean341 = local24.method5732() == 1;
			}
		}
		for (@Pc(180) int local180 = 0; local180 < local28; local180++) {
			if (this.aClass166Array1[local180] != null) {
				this.aClass166Array1[local180].aByte41 = local24.method5759();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < local28; local201++) {
			if (this.aClass166Array1[local201] != null) {
				this.aClass166Array1[local201].aByte39 = local24.method5759();
			}
		}
		for (@Pc(222) int local222 = 0; local222 < local28; local222++) {
			if (this.aClass166Array1[local222] != null) {
				this.aClass166Array1[local222].aByte37 = local24.method5759();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < local28; local247++) {
			if (this.aClass166Array1[local247] != null) {
				this.aClass166Array1[local247].aByte36 = local24.method5759();
			}
		}
		for (@Pc(268) int local268 = 0; local268 < local28; local268++) {
			if (this.aClass166Array1[local268] != null) {
				this.aClass166Array1[local268].aShort62 = (short) local24.method5753();
			}
		}
		for (@Pc(290) int local290 = 0; local290 < local28; local290++) {
			if (this.aClass166Array1[local290] != null) {
				this.aClass166Array1[local290].aByte35 = local24.method5759();
			}
		}
		for (@Pc(311) int local311 = 0; local311 < local28; local311++) {
			if (this.aClass166Array1[local311] != null) {
				this.aClass166Array1[local311].aByte40 = local24.method5759();
			}
		}
		for (@Pc(336) int local336 = 0; local336 < local28; local336++) {
			if (this.aClass166Array1[local336] != null) {
				this.aClass166Array1[local336].aBoolean345 = local24.method5732() == 1;
			}
		}
		for (@Pc(362) int local362 = 0; local362 < local28; local362++) {
			if (this.aClass166Array1[local362] != null) {
				this.aClass166Array1[local362].aBoolean343 = local24.method5732() == 1;
			}
		}
		for (@Pc(388) int local388 = 0; local388 < local28; local388++) {
			if (this.aClass166Array1[local388] != null) {
				this.aClass166Array1[local388].aByte38 = local24.method5759();
			}
		}
		for (@Pc(413) int local413 = 0; local413 < local28; local413++) {
			if (this.aClass166Array1[local413] != null) {
				this.aClass166Array1[local413].aBoolean344 = local24.method5732() == 1;
			}
		}
		for (@Pc(445) int local445 = 0; local445 < local28; local445++) {
			if (this.aClass166Array1[local445] != null) {
				this.aClass166Array1[local445].aBoolean338 = local24.method5732() == 1;
			}
		}
		for (@Pc(477) int local477 = 0; local477 < local28; local477++) {
			if (this.aClass166Array1[local477] != null) {
				this.aClass166Array1[local477].aBoolean340 = local24.method5732() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZIIFII)[I")
	@Override
	public int[] method1281(@OriginalArg(2) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method1282(arg0).method5011(this.aClass166Array1[arg0].aBoolean343, arg3, this, this.aClass83_35, (double) arg1, arg2);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)Lclient!rn;")
	private Class2_Sub7_Sub16 method1282(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub7 local10 = this.aClass105_4.method2632((long) arg0);
		if (local10 != null) {
			return (Class2_Sub7_Sub16) local10;
		}
		@Pc(21) byte[] local21 = this.aClass83_34.method1979(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(45) Class2_Sub7_Sub16 local45 = new Class2_Sub7_Sub16(new Class2_Sub24(local21));
			this.aClass105_4.method2630(local45, (long) arg0);
			return local45;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1277(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7_Sub16 local8 = this.method1282(arg0);
		return local8 != null && local8.method5013(this, this.aClass83_35);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lclient!ns;")
	@Override
	public Class166 method1278(@OriginalArg(0) int arg0) {
		return this.aClass166Array1[arg0];
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIIFII)[I")
	@Override
	public int[] method1279(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4) {
		return this.method1282(arg1).method5010(this.aClass166Array1[arg1].aBoolean343, this.aClass83_35, arg0, this, (double) arg3, arg2, arg4);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZFII)[F")
	@Override
	public float[] method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		return this.method1282(arg0).method5015(this, this.aClass166Array1[arg0].aBoolean343, arg3, this.aClass83_35, arg1);
	}
}
