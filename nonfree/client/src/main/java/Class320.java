import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class320 implements Interface3 {

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!gga;")
	private final Class122 aClass122_3 = new Class122(256);

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Lclient!bi;")
	private final Class31 aClass31_109;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "Lclient!bi;")
	private final Class31 aClass31_108;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
	private final int anInt8812;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "[Lclient!pp;")
	private final Class271[] aClass271Array1;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;Lclient!bi;)V")
	public Class320(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_109 = arg1;
		this.aClass31_108 = arg2;
		@Pc(24) Class4_Sub9 local24 = new Class4_Sub9(arg0.method667(0, 0));
		this.anInt8812 = local24.method5982();
		this.aClass271Array1 = new Class271[this.anInt8812];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8812; local36++) {
			if (local24.method6015() == 1) {
				this.aClass271Array1[local36] = new Class271();
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt8812; local63++) {
			if (this.aClass271Array1[local63] != null) {
				this.aClass271Array1[local63].aBoolean514 = local24.method6015() == 0;
			}
		}
		for (@Pc(93) int local93 = 0; local93 < this.anInt8812; local93++) {
			if (this.aClass271Array1[local93] != null) {
				this.aClass271Array1[local93].aBoolean513 = local24.method6015() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt8812; local120++) {
			if (this.aClass271Array1[local120] != null) {
				this.aClass271Array1[local120].aBoolean516 = local24.method6015() == 1;
			}
		}
		for (@Pc(153) int local153 = 0; local153 < this.anInt8812; local153++) {
			if (this.aClass271Array1[local153] != null) {
				this.aClass271Array1[local153].aBoolean512 = local24.method6015() == 1;
			}
		}
		for (@Pc(182) int local182 = 0; local182 < this.anInt8812; local182++) {
			if (this.aClass271Array1[local182] != null) {
				this.aClass271Array1[local182].aByte80 = local24.method6021();
			}
		}
		for (@Pc(204) int local204 = 0; local204 < this.anInt8812; local204++) {
			if (this.aClass271Array1[local204] != null) {
				this.aClass271Array1[local204].aByte82 = local24.method6021();
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt8812; local226++) {
			if (this.aClass271Array1[local226] != null) {
				this.aClass271Array1[local226].aByte84 = local24.method6021();
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt8812; local248++) {
			if (this.aClass271Array1[local248] != null) {
				this.aClass271Array1[local248].aByte81 = local24.method6021();
			}
		}
		for (@Pc(270) int local270 = 0; local270 < this.anInt8812; local270++) {
			if (this.aClass271Array1[local270] != null) {
				this.aClass271Array1[local270].aShort94 = (short) local24.method5982();
			}
		}
		for (@Pc(297) int local297 = 0; local297 < this.anInt8812; local297++) {
			if (this.aClass271Array1[local297] != null) {
				this.aClass271Array1[local297].aByte79 = local24.method6021();
			}
		}
		for (@Pc(323) int local323 = 0; local323 < this.anInt8812; local323++) {
			if (this.aClass271Array1[local323] != null) {
				this.aClass271Array1[local323].aByte83 = local24.method6021();
			}
		}
		for (@Pc(345) int local345 = 0; local345 < this.anInt8812; local345++) {
			if (this.aClass271Array1[local345] != null) {
				this.aClass271Array1[local345].aBoolean521 = local24.method6015() == 1;
			}
		}
		for (@Pc(374) int local374 = 0; local374 < this.anInt8812; local374++) {
			if (this.aClass271Array1[local374] != null) {
				this.aClass271Array1[local374].aBoolean520 = local24.method6015() == 1;
			}
		}
		for (@Pc(405) int local405 = 0; local405 < this.anInt8812; local405++) {
			if (this.aClass271Array1[local405] != null) {
				this.aClass271Array1[local405].aByte85 = local24.method6021();
			}
		}
		for (@Pc(431) int local431 = 0; local431 < this.anInt8812; local431++) {
			if (this.aClass271Array1[local431] != null) {
				this.aClass271Array1[local431].aBoolean517 = local24.method6015() == 1;
			}
		}
		for (@Pc(462) int local462 = 0; local462 < this.anInt8812; local462++) {
			if (this.aClass271Array1[local462] != null) {
				this.aClass271Array1[local462].aBoolean518 = local24.method6015() == 1;
			}
		}
		for (@Pc(495) int local495 = 0; local495 < this.anInt8812; local495++) {
			if (this.aClass271Array1[local495] != null) {
				this.aClass271Array1[local495].aBoolean519 = local24.method6015() == 1;
			}
		}
		for (@Pc(526) int local526 = 0; local526 < this.anInt8812; local526++) {
			if (this.aClass271Array1[local526] != null) {
				this.aClass271Array1[local526].anInt7177 = local24.method6015();
			}
		}
		for (@Pc(552) int local552 = 0; local552 < this.anInt8812; local552++) {
			if (this.aClass271Array1[local552] != null) {
				this.aClass271Array1[local552].anInt7171 = local24.method6026();
			}
		}
		for (@Pc(574) int local574 = 0; local574 < this.anInt8812; local574++) {
			if (this.aClass271Array1[local574] != null) {
				this.aClass271Array1[local574].aBoolean515 = local24.method6015() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BIZIFI)[I")
	@Override
	public int[] method7250(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method7255(arg2).method2149(this, this.aClass271Array1[arg2].aBoolean520, (double) arg3, arg4, arg0, this.aClass31_108, arg1);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7248(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub7_Sub4 local16 = this.method7255(arg0);
		return local16 != null && local16.method2147(this.aClass31_108, this);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)I")
	@Override
	public int method7252() {
		return this.anInt8812;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(FIZIII)[I")
	@Override
	public int[] method7251(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method7255(arg2).method2150(this.aClass31_108, (double) arg0, this.aClass271Array1[arg2].aBoolean520, this, arg1, arg3);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)Lclient!pp;")
	@Override
	public Class271 method7249(@OriginalArg(0) int arg0) {
		return this.aClass271Array1[arg0];
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIFZB)[F")
	@Override
	public float[] method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		return this.method7255(arg1).method2151(this.aClass271Array1[arg1].aBoolean520, arg2, arg0, this, this.aClass31_108);
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(II)Lclient!dga;")
	private Class4_Sub7_Sub4 method7255(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub7 local10 = this.aClass122_3.method3206((long) arg0);
		if (local10 != null) {
			return (Class4_Sub7_Sub4) local10;
		}
		@Pc(21) byte[] local21 = this.aClass31_109.method661(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(40) Class4_Sub7_Sub4 local40 = new Class4_Sub7_Sub4(new Class4_Sub9(local21));
			this.aClass122_3.method3207(local40, (long) arg0);
			return local40;
		}
	}
}
