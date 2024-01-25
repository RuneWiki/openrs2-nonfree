import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class360 implements Interface2 {

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Lclient!sja;")
	private final Class325 aClass325_4 = new Class325(256);

	@OriginalMember(owner = "client!un", name = "p", descriptor = "Lclient!uq;")
	private final Class362 aClass362_148;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Lclient!uq;")
	private final Class362 aClass362_146;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "I")
	private final int anInt10218;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "[Lclient!nl;")
	private final Class250[] aClass250Array1;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;Lclient!uq;)V")
	public Class360(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_148 = arg2;
		this.aClass362_146 = arg1;
		@Pc(24) Class3_Sub4 local24 = new Class3_Sub4(arg0.method8368(0, 0));
		this.anInt10218 = local24.method7951();
		this.aClass250Array1 = new Class250[this.anInt10218];
		for (@Pc(36) int local36 = 0; local36 < this.anInt10218; local36++) {
			if (local24.method7954() == 1) {
				this.aClass250Array1[local36] = new Class250();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt10218; local57++) {
			if (this.aClass250Array1[local57] != null) {
				this.aClass250Array1[local57].aBoolean466 = local24.method7954() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt10218; local87++) {
			if (this.aClass250Array1[local87] != null) {
				this.aClass250Array1[local87].aBoolean462 = local24.method7954() == 1;
			}
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt10218; local118++) {
			if (this.aClass250Array1[local118] != null) {
				this.aClass250Array1[local118].aBoolean465 = local24.method7954() == 1;
			}
		}
		for (@Pc(149) int local149 = 0; local149 < this.anInt10218; local149++) {
			if (this.aClass250Array1[local149] != null) {
				this.aClass250Array1[local149].aByte94 = local24.method7960();
			}
		}
		for (@Pc(175) int local175 = 0; local175 < this.anInt10218; local175++) {
			if (this.aClass250Array1[local175] != null) {
				this.aClass250Array1[local175].aByte96 = local24.method7960();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < this.anInt10218; local201++) {
			if (this.aClass250Array1[local201] != null) {
				this.aClass250Array1[local201].aByte93 = local24.method7960();
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt10218; local223++) {
			if (this.aClass250Array1[local223] != null) {
				this.aClass250Array1[local223].aByte97 = local24.method7960();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.anInt10218; local249++) {
			if (this.aClass250Array1[local249] != null) {
				this.aClass250Array1[local249].aShort56 = (short) local24.method7951();
			}
		}
		for (@Pc(272) int local272 = 0; local272 < this.anInt10218; local272++) {
			if (this.aClass250Array1[local272] != null) {
				this.aClass250Array1[local272].aByte95 = local24.method7960();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < this.anInt10218; local298++) {
			if (this.aClass250Array1[local298] != null) {
				this.aClass250Array1[local298].aByte92 = local24.method7960();
			}
		}
		for (@Pc(320) int local320 = 0; local320 < this.anInt10218; local320++) {
			if (this.aClass250Array1[local320] != null) {
				this.aClass250Array1[local320].aBoolean467 = local24.method7954() == 1;
			}
		}
		for (@Pc(351) int local351 = 0; local351 < this.anInt10218; local351++) {
			if (this.aClass250Array1[local351] != null) {
				this.aClass250Array1[local351].aBoolean464 = local24.method7954() == 1;
			}
		}
		for (@Pc(384) int local384 = 0; local384 < this.anInt10218; local384++) {
			if (this.aClass250Array1[local384] != null) {
				this.aClass250Array1[local384].aByte98 = local24.method7960();
			}
		}
		for (@Pc(410) int local410 = 0; local410 < this.anInt10218; local410++) {
			if (this.aClass250Array1[local410] != null) {
				this.aClass250Array1[local410].aBoolean469 = local24.method7954() == 1;
			}
		}
		for (@Pc(441) int local441 = 0; local441 < this.anInt10218; local441++) {
			if (this.aClass250Array1[local441] != null) {
				this.aClass250Array1[local441].aBoolean463 = local24.method7954() == 1;
			}
		}
		for (@Pc(472) int local472 = 0; local472 < this.anInt10218; local472++) {
			if (this.aClass250Array1[local472] != null) {
				this.aClass250Array1[local472].aBoolean468 = local24.method7954() == 1;
			}
		}
		for (@Pc(503) int local503 = 0; local503 < this.anInt10218; local503++) {
			if (this.aClass250Array1[local503] != null) {
				this.aClass250Array1[local503].anInt6669 = local24.method7954();
			}
		}
		for (@Pc(529) int local529 = 0; local529 < this.anInt10218; local529++) {
			if (this.aClass250Array1[local529] != null) {
				this.aClass250Array1[local529].anInt6670 = local24.method7895();
			}
		}
		for (@Pc(555) int local555 = 0; local555 < this.anInt10218; local555++) {
			if (this.aClass250Array1[local555] != null) {
				this.aClass250Array1[local555].anInt6666 = local24.method7954();
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method8328(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub5_Sub8 local13 = this.method8333(arg0);
		return local13 != null && local13.method2497(this, this.aClass362_148);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I")
	@Override
	public int method8325() {
		return this.anInt10218;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public int[] method8327(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method8333(arg2).method2496(arg3, this, this.aClass362_148, (double) arg0, this.aClass250Array1[arg2].aBoolean464, arg1);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(II)Lclient!fb;")
	private Class3_Sub5_Sub8 method8333(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub5 local10 = this.aClass325_4.method7319((long) arg0);
		if (local10 != null) {
			return (Class3_Sub5_Sub8) local10;
		}
		@Pc(21) byte[] local21 = this.aClass362_146.method8356(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class3_Sub5_Sub8 local33 = new Class3_Sub5_Sub8(new Class3_Sub4(local21));
			this.aClass325_4.method7322(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIZIF)[I")
	@Override
	public int[] method8329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4) {
		return this.method8333(arg3).method2498(arg0, arg2, this.aClass362_148, arg1, (double) arg4, this, this.aClass250Array1[arg3].aBoolean464);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZFIIII)[F")
	@Override
	public float[] method8326(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method8333(arg2).method2495(this.aClass250Array1[arg2].aBoolean464, arg1, arg3, this.aClass362_148, this);
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)Lclient!nl;")
	@Override
	public Class250 method8330(@OriginalArg(0) int arg0) {
		return this.aClass250Array1[arg0];
	}
}
