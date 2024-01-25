import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class70 implements Interface6 {

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Lclient!cca;")
	private final Class47 aClass47_1 = new Class47(256);

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!wu;")
	private final Class380 aClass380_32;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!wu;")
	private final Class380 aClass380_33;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
	private final int anInt1821;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "[Lclient!jp;")
	private final Class175[] aClass175Array1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!wu;)V")
	public Class70(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_32 = arg2;
		this.aClass380_33 = arg1;
		@Pc(24) Class2_Sub22 local24 = new Class2_Sub22(arg0.method8620(0, 0));
		this.anInt1821 = local24.method8546();
		this.aClass175Array1 = new Class175[this.anInt1821];
		for (@Pc(36) int local36 = 0; local36 < this.anInt1821; local36++) {
			if (local24.method8547() == 1) {
				this.aClass175Array1[local36] = new Class175();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1821; local61++) {
			if (this.aClass175Array1[local61] != null) {
				this.aClass175Array1[local61].aBoolean308 = local24.method8547() == 0;
			}
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt1821; local91++) {
			if (this.aClass175Array1[local91] != null) {
				this.aClass175Array1[local91].aBoolean309 = local24.method8547() == 1;
			}
		}
		for (@Pc(124) int local124 = 0; local124 < this.anInt1821; local124++) {
			if (this.aClass175Array1[local124] != null) {
				this.aClass175Array1[local124].aBoolean305 = local24.method8547() == 1;
			}
		}
		for (@Pc(153) int local153 = 0; local153 < this.anInt1821; local153++) {
			if (this.aClass175Array1[local153] != null) {
				this.aClass175Array1[local153].aByte57 = local24.method8548();
			}
		}
		for (@Pc(179) int local179 = 0; local179 < this.anInt1821; local179++) {
			if (this.aClass175Array1[local179] != null) {
				this.aClass175Array1[local179].aByte51 = local24.method8548();
			}
		}
		for (@Pc(205) int local205 = 0; local205 < this.anInt1821; local205++) {
			if (this.aClass175Array1[local205] != null) {
				this.aClass175Array1[local205].aByte52 = local24.method8548();
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt1821; local227++) {
			if (this.aClass175Array1[local227] != null) {
				this.aClass175Array1[local227].aByte56 = local24.method8548();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.anInt1821; local249++) {
			if (this.aClass175Array1[local249] != null) {
				this.aClass175Array1[local249].aShort44 = (short) local24.method8546();
			}
		}
		for (@Pc(272) int local272 = 0; local272 < this.anInt1821; local272++) {
			if (this.aClass175Array1[local272] != null) {
				this.aClass175Array1[local272].aByte53 = local24.method8548();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < this.anInt1821; local298++) {
			if (this.aClass175Array1[local298] != null) {
				this.aClass175Array1[local298].aByte54 = local24.method8548();
			}
		}
		for (@Pc(320) int local320 = 0; local320 < this.anInt1821; local320++) {
			if (this.aClass175Array1[local320] != null) {
				this.aClass175Array1[local320].aBoolean306 = local24.method8547() == 1;
			}
		}
		for (@Pc(347) int local347 = 0; local347 < this.anInt1821; local347++) {
			if (this.aClass175Array1[local347] != null) {
				this.aClass175Array1[local347].aBoolean310 = local24.method8547() == 1;
			}
		}
		for (@Pc(374) int local374 = 0; local374 < this.anInt1821; local374++) {
			if (this.aClass175Array1[local374] != null) {
				this.aClass175Array1[local374].aByte55 = local24.method8548();
			}
		}
		for (@Pc(400) int local400 = 0; local400 < this.anInt1821; local400++) {
			if (this.aClass175Array1[local400] != null) {
				this.aClass175Array1[local400].aBoolean307 = local24.method8547() == 1;
			}
		}
		for (@Pc(433) int local433 = 0; local433 < this.anInt1821; local433++) {
			if (this.aClass175Array1[local433] != null) {
				this.aClass175Array1[local433].aBoolean304 = local24.method8547() == 1;
			}
		}
		for (@Pc(466) int local466 = 0; local466 < this.anInt1821; local466++) {
			if (this.aClass175Array1[local466] != null) {
				this.aClass175Array1[local466].aBoolean303 = local24.method8547() == 1;
			}
		}
		for (@Pc(493) int local493 = 0; local493 < this.anInt1821; local493++) {
			if (this.aClass175Array1[local493] != null) {
				this.aClass175Array1[local493].anInt4382 = local24.method8547();
			}
		}
		for (@Pc(515) int local515 = 0; local515 < this.anInt1821; local515++) {
			if (this.aClass175Array1[local515] != null) {
				this.aClass175Array1[local515].anInt4383 = local24.method8542();
			}
		}
		for (@Pc(537) int local537 = 0; local537 < this.anInt1821; local537++) {
			if (this.aClass175Array1[local537] != null) {
				this.aClass175Array1[local537].anInt4384 = local24.method8547();
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1493(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub2_Sub8 local13 = this.method1494(arg0);
		return local13 != null && local13.method2221(this.aClass380_32, this);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIFIZI)[I")
	@Override
	public int[] method1489(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method1494(arg4).method2220(arg0, (double) arg2, this, this.aClass175Array1[arg4].aBoolean310, arg1, arg3, this.aClass380_32);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
	@Override
	public int method1491() {
		return this.anInt1821;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(FZZIII)[I")
	@Override
	public int[] method1488(@OriginalArg(0) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method1494(arg2).method2225(this, this.aClass380_32, this.aClass175Array1[arg2].aBoolean310, arg1, arg3, (double) arg0);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Lclient!fca;")
	private Class2_Sub2_Sub8 method1494(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2 local10 = this.aClass47_1.method912((long) arg0);
		if (local10 != null) {
			return (Class2_Sub2_Sub8) local10;
		}
		@Pc(23) byte[] local23 = this.aClass380_33.method8616(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(42) Class2_Sub2_Sub8 local42 = new Class2_Sub2_Sub8(new Class2_Sub22(local23));
			this.aClass47_1.method915((long) arg0, local42);
			return local42;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lclient!jp;")
	@Override
	public Class175 method1492(@OriginalArg(0) int arg0) {
		return this.aClass175Array1[arg0];
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIFIB)[F")
	@Override
	public float[] method1490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		return this.method1494(arg1).method2223(this, this.aClass175Array1[arg1].aBoolean310, this.aClass380_32, arg3, arg0);
	}
}
