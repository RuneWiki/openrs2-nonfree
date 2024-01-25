import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class202 implements Interface3 {

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!ei;")
	private final Class44 aClass44_10 = new Class44(256);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!ct;")
	private final Class30 aClass30_91;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!ct;")
	private final Class30 aClass30_92;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "[Lclient!qr;")
	private final Class178[] aClass178Array1;

	static {
		new Class106(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!ct;Lclient!ct;Lclient!ct;)V")
	public Class202(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) Class30 arg2) {
		this.aClass30_91 = arg1;
		this.aClass30_92 = arg2;
		@Pc(24) Class1_Sub7 local24 = new Class1_Sub7(arg0.method1161(0, 0));
		@Pc(28) int local28 = local24.method2161();
		this.aClass178Array1 = new Class178[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method2132() == 1) {
				this.aClass178Array1[local34] = new Class178();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass178Array1[local58] != null) {
				this.aClass178Array1[local58].aBoolean390 = local24.method2132() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < local28; local87++) {
			if (this.aClass178Array1[local87] != null) {
				this.aClass178Array1[local87].aBoolean391 = local24.method2132() == 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < local28; local119++) {
			if (this.aClass178Array1[local119] != null) {
				this.aClass178Array1[local119].aBoolean395 = local24.method2132() == 1;
			}
		}
		for (@Pc(145) int local145 = 0; local145 < local28; local145++) {
			if (this.aClass178Array1[local145] != null) {
				this.aClass178Array1[local145].aBoolean396 = local24.method2132() == 1;
			}
		}
		for (@Pc(171) int local171 = 0; local171 < local28; local171++) {
			if (this.aClass178Array1[local171] != null) {
				this.aClass178Array1[local171].aByte49 = local24.method2122();
			}
		}
		for (@Pc(192) int local192 = 0; local192 < local28; local192++) {
			if (this.aClass178Array1[local192] != null) {
				this.aClass178Array1[local192].aByte52 = local24.method2122();
			}
		}
		for (@Pc(213) int local213 = 0; local213 < local28; local213++) {
			if (this.aClass178Array1[local213] != null) {
				this.aClass178Array1[local213].aByte54 = local24.method2122();
			}
		}
		for (@Pc(234) int local234 = 0; local234 < local28; local234++) {
			if (this.aClass178Array1[local234] != null) {
				this.aClass178Array1[local234].aByte51 = local24.method2122();
			}
		}
		for (@Pc(255) int local255 = 0; local255 < local28; local255++) {
			if (this.aClass178Array1[local255] != null) {
				this.aClass178Array1[local255].aShort72 = (short) local24.method2161();
			}
		}
		for (@Pc(277) int local277 = 0; local277 < local28; local277++) {
			if (this.aClass178Array1[local277] != null) {
				this.aClass178Array1[local277].aByte50 = local24.method2122();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < local28; local298++) {
			if (this.aClass178Array1[local298] != null) {
				this.aClass178Array1[local298].aByte48 = local24.method2122();
			}
		}
		for (@Pc(323) int local323 = 0; local323 < local28; local323++) {
			if (this.aClass178Array1[local323] != null) {
				this.aClass178Array1[local323].aBoolean393 = local24.method2132() == 1;
			}
		}
		for (@Pc(349) int local349 = 0; local349 < local28; local349++) {
			if (this.aClass178Array1[local349] != null) {
				this.aClass178Array1[local349].aBoolean398 = local24.method2132() == 1;
			}
		}
		for (@Pc(375) int local375 = 0; local375 < local28; local375++) {
			if (this.aClass178Array1[local375] != null) {
				this.aClass178Array1[local375].aByte53 = local24.method2122();
			}
		}
		for (@Pc(400) int local400 = 0; local400 < local28; local400++) {
			if (this.aClass178Array1[local400] != null) {
				this.aClass178Array1[local400].aBoolean394 = local24.method2132() == 1;
			}
		}
		for (@Pc(426) int local426 = 0; local426 < local28; local426++) {
			if (this.aClass178Array1[local426] != null) {
				this.aClass178Array1[local426].aBoolean392 = local24.method2132() == 1;
			}
		}
		for (@Pc(452) int local452 = 0; local452 < local28; local452++) {
			if (this.aClass178Array1[local452] != null) {
				this.aClass178Array1[local452].aBoolean397 = local24.method2132() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIIFI)[F")
	@Override
	public float[] method5484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method5491(arg1).method2627(arg3, this.aClass178Array1[arg1].aBoolean398, arg0, this.aClass30_92, this);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIIFB)[I")
	@Override
	public int[] method5488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method5491(arg0).method2625(this, arg1, this.aClass30_92, this.aClass178Array1[arg0].aBoolean398, arg2, (double) arg3);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5485(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub4_Sub13 local16 = this.method5491(arg0);
		return local16 != null && local16.method2620(this, this.aClass30_92);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIIIF)[I")
	@Override
	public int[] method5487(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4) {
		return this.method5491(arg3).method2626(this.aClass178Array1[arg3].aBoolean398, arg2, arg0, (double) arg4, this.aClass30_92, arg1, this);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)Lclient!hp;")
	private Class1_Sub4_Sub13 method5491(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub4 local10 = this.aClass44_10.method1612((long) arg0);
		if (local10 != null) {
			return (Class1_Sub4_Sub13) local10;
		}
		@Pc(28) byte[] local28 = this.aClass30_91.method1179(arg0);
		if (local28 == null) {
			return null;
		} else {
			@Pc(40) Class1_Sub4_Sub13 local40 = new Class1_Sub4_Sub13(new Class1_Sub7(local28));
			this.aClass44_10.method1616((long) arg0, local40);
			return local40;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lclient!qr;")
	@Override
	public Class178 method5486(@OriginalArg(1) int arg0) {
		return this.aClass178Array1[arg0];
	}
}
