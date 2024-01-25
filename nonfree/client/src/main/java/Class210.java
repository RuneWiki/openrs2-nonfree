import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class210 implements Interface3 {

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!gq;")
	private final Class116 aClass116_2 = new Class116(256);

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "Lclient!tf;")
	private final Class322 aClass322_104;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!tf;")
	private final Class322 aClass322_103;

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
	private final int anInt5612;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "[Lclient!co;")
	private final Class55[] aClass55Array1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;Lclient!tf;)V")
	public Class210(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_104 = arg2;
		this.aClass322_103 = arg1;
		@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(arg0.method6802(0, 0));
		this.anInt5612 = local24.method5198();
		this.aClass55Array1 = new Class55[this.anInt5612];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5612; local36++) {
			if (local24.method5175() == 1) {
				this.aClass55Array1[local36] = new Class55();
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt5612; local63++) {
			if (this.aClass55Array1[local63] != null) {
				this.aClass55Array1[local63].aBoolean144 = local24.method5175() == 0;
			}
		}
		for (@Pc(93) int local93 = 0; local93 < this.anInt5612; local93++) {
			if (this.aClass55Array1[local93] != null) {
				this.aClass55Array1[local93].aBoolean139 = local24.method5175() == 1;
			}
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt5612; local122++) {
			if (this.aClass55Array1[local122] != null) {
				this.aClass55Array1[local122].aBoolean141 = local24.method5175() == 1;
			}
		}
		for (@Pc(155) int local155 = 0; local155 < this.anInt5612; local155++) {
			if (this.aClass55Array1[local155] != null) {
				this.aClass55Array1[local155].aBoolean142 = local24.method5175() == 1;
			}
		}
		for (@Pc(186) int local186 = 0; local186 < this.anInt5612; local186++) {
			if (this.aClass55Array1[local186] != null) {
				this.aClass55Array1[local186].aByte15 = local24.method5212();
			}
		}
		for (@Pc(212) int local212 = 0; local212 < this.anInt5612; local212++) {
			if (this.aClass55Array1[local212] != null) {
				this.aClass55Array1[local212].aByte17 = local24.method5212();
			}
		}
		for (@Pc(238) int local238 = 0; local238 < this.anInt5612; local238++) {
			if (this.aClass55Array1[local238] != null) {
				this.aClass55Array1[local238].aByte16 = local24.method5212();
			}
		}
		for (@Pc(260) int local260 = 0; local260 < this.anInt5612; local260++) {
			if (this.aClass55Array1[local260] != null) {
				this.aClass55Array1[local260].aByte20 = local24.method5212();
			}
		}
		for (@Pc(282) int local282 = 0; local282 < this.anInt5612; local282++) {
			if (this.aClass55Array1[local282] != null) {
				this.aClass55Array1[local282].aShort21 = (short) local24.method5198();
			}
		}
		for (@Pc(309) int local309 = 0; local309 < this.anInt5612; local309++) {
			if (this.aClass55Array1[local309] != null) {
				this.aClass55Array1[local309].aByte18 = local24.method5212();
			}
		}
		for (@Pc(331) int local331 = 0; local331 < this.anInt5612; local331++) {
			if (this.aClass55Array1[local331] != null) {
				this.aClass55Array1[local331].aByte21 = local24.method5212();
			}
		}
		for (@Pc(357) int local357 = 0; local357 < this.anInt5612; local357++) {
			if (this.aClass55Array1[local357] != null) {
				this.aClass55Array1[local357].aBoolean147 = local24.method5175() == 1;
			}
		}
		for (@Pc(386) int local386 = 0; local386 < this.anInt5612; local386++) {
			if (this.aClass55Array1[local386] != null) {
				this.aClass55Array1[local386].aBoolean143 = local24.method5175() == 1;
			}
		}
		for (@Pc(413) int local413 = 0; local413 < this.anInt5612; local413++) {
			if (this.aClass55Array1[local413] != null) {
				this.aClass55Array1[local413].aByte19 = local24.method5212();
			}
		}
		for (@Pc(435) int local435 = 0; local435 < this.anInt5612; local435++) {
			if (this.aClass55Array1[local435] != null) {
				this.aClass55Array1[local435].aBoolean148 = local24.method5175() == 1;
			}
		}
		for (@Pc(462) int local462 = 0; local462 < this.anInt5612; local462++) {
			if (this.aClass55Array1[local462] != null) {
				this.aClass55Array1[local462].aBoolean145 = local24.method5175() == 1;
			}
		}
		for (@Pc(491) int local491 = 0; local491 < this.anInt5612; local491++) {
			if (this.aClass55Array1[local491] != null) {
				this.aClass55Array1[local491].aBoolean146 = local24.method5175() == 1;
			}
		}
		for (@Pc(520) int local520 = 0; local520 < this.anInt5612; local520++) {
			if (this.aClass55Array1[local520] != null) {
				this.aClass55Array1[local520].anInt1675 = local24.method5175();
			}
		}
		for (@Pc(542) int local542 = 0; local542 < this.anInt5612; local542++) {
			if (this.aClass55Array1[local542] != null) {
				this.aClass55Array1[local542].anInt1674 = local24.method5186();
			}
		}
		for (@Pc(568) int local568 = 0; local568 < this.anInt5612; local568++) {
			if (this.aClass55Array1[local568] != null) {
				this.aClass55Array1[local568].aBoolean140 = local24.method5175() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIFIZ)[F")
	@Override
	public float[] method4775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		return this.method4781(arg3).method2502(this, arg1, this.aClass322_104, this.aClass55Array1[arg3].aBoolean143, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Lclient!co;")
	@Override
	public Class55 method4776(@OriginalArg(0) int arg0) {
		return this.aClass55Array1[arg0];
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZIIFII)[I")
	@Override
	public int[] method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method4781(arg0).method2497(arg1, arg3, this.aClass322_104, this, this.aClass55Array1[arg0].aBoolean143, (double) arg2);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
	@Override
	public int method4778() {
		return this.anInt5612;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4774(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub5 local8 = this.method4781(arg0);
		return local8 != null && local8.method2501(this.aClass322_104, this);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZFIII)[I")
	@Override
	public int[] method4779(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method4781(arg4).method2499(arg1, (double) arg2, arg0, this.aClass55Array1[arg4].aBoolean143, this, arg3, this.aClass322_104);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)Lclient!eh;")
	private Class3_Sub7_Sub5 method4781(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7 local10 = this.aClass116_2.method3126((long) arg0);
		if (local10 != null) {
			return (Class3_Sub7_Sub5) local10;
		}
		@Pc(21) byte[] local21 = this.aClass322_103.method6807(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(39) Class3_Sub7_Sub5 local39 = new Class3_Sub7_Sub5(new Class3_Sub11(local21));
			this.aClass116_2.method3127(local39, (long) arg0);
			return local39;
		}
	}
}
