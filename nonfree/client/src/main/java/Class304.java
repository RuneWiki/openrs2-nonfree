import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class304 implements Interface8 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!kl;")
	private final Class189 aClass189_6 = new Class189(256);

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!om;")
	private final Class246 aClass246_225;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!om;")
	private final Class246 aClass246_226;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	private final int anInt7770;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "[Lclient!nca;")
	private final Class224[] aClass224Array1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!om;Lclient!om;Lclient!om;)V")
	public Class304(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_225 = arg2;
		this.aClass246_226 = arg1;
		@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(arg0.method5653(0, 0));
		this.anInt7770 = local24.method3109();
		this.aClass224Array1 = new Class224[this.anInt7770];
		for (@Pc(36) int local36 = 0; local36 < this.anInt7770; local36++) {
			if (local24.method3118() == 1) {
				this.aClass224Array1[local36] = new Class224();
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anInt7770; local59++) {
			if (this.aClass224Array1[local59] != null) {
				this.aClass224Array1[local59].aBoolean493 = local24.method3118() == 0;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt7770; local85++) {
			if (this.aClass224Array1[local85] != null) {
				this.aClass224Array1[local85].aBoolean494 = local24.method3118() == 1;
			}
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt7770; local112++) {
			if (this.aClass224Array1[local112] != null) {
				this.aClass224Array1[local112].aBoolean490 = local24.method3118() == 1;
			}
		}
		for (@Pc(143) int local143 = 0; local143 < this.anInt7770; local143++) {
			if (this.aClass224Array1[local143] != null) {
				this.aClass224Array1[local143].aBoolean491 = local24.method3118() == 1;
			}
		}
		for (@Pc(176) int local176 = 0; local176 < this.anInt7770; local176++) {
			if (this.aClass224Array1[local176] != null) {
				this.aClass224Array1[local176].aByte71 = local24.method3096();
			}
		}
		for (@Pc(198) int local198 = 0; local198 < this.anInt7770; local198++) {
			if (this.aClass224Array1[local198] != null) {
				this.aClass224Array1[local198].aByte73 = local24.method3096();
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.anInt7770; local224++) {
			if (this.aClass224Array1[local224] != null) {
				this.aClass224Array1[local224].aByte69 = local24.method3096();
			}
		}
		for (@Pc(250) int local250 = 0; local250 < this.anInt7770; local250++) {
			if (this.aClass224Array1[local250] != null) {
				this.aClass224Array1[local250].aByte74 = local24.method3096();
			}
		}
		for (@Pc(276) int local276 = 0; local276 < this.anInt7770; local276++) {
			if (this.aClass224Array1[local276] != null) {
				this.aClass224Array1[local276].aShort76 = (short) local24.method3109();
			}
		}
		for (@Pc(303) int local303 = 0; local303 < this.anInt7770; local303++) {
			if (this.aClass224Array1[local303] != null) {
				this.aClass224Array1[local303].aByte75 = local24.method3096();
			}
		}
		for (@Pc(325) int local325 = 0; local325 < this.anInt7770; local325++) {
			if (this.aClass224Array1[local325] != null) {
				this.aClass224Array1[local325].aByte70 = local24.method3096();
			}
		}
		for (@Pc(351) int local351 = 0; local351 < this.anInt7770; local351++) {
			if (this.aClass224Array1[local351] != null) {
				this.aClass224Array1[local351].aBoolean496 = local24.method3118() == 1;
			}
		}
		for (@Pc(378) int local378 = 0; local378 < this.anInt7770; local378++) {
			if (this.aClass224Array1[local378] != null) {
				this.aClass224Array1[local378].aBoolean497 = local24.method3118() == 1;
			}
		}
		for (@Pc(407) int local407 = 0; local407 < this.anInt7770; local407++) {
			if (this.aClass224Array1[local407] != null) {
				this.aClass224Array1[local407].aByte72 = local24.method3096();
			}
		}
		for (@Pc(433) int local433 = 0; local433 < this.anInt7770; local433++) {
			if (this.aClass224Array1[local433] != null) {
				this.aClass224Array1[local433].aBoolean495 = local24.method3118() == 1;
			}
		}
		for (@Pc(460) int local460 = 0; local460 < this.anInt7770; local460++) {
			if (this.aClass224Array1[local460] != null) {
				this.aClass224Array1[local460].aBoolean489 = local24.method3118() == 1;
			}
		}
		for (@Pc(493) int local493 = 0; local493 < this.anInt7770; local493++) {
			if (this.aClass224Array1[local493] != null) {
				this.aClass224Array1[local493].aBoolean488 = local24.method3118() == 1;
			}
		}
		for (@Pc(524) int local524 = 0; local524 < this.anInt7770; local524++) {
			if (this.aClass224Array1[local524] != null) {
				this.aClass224Array1[local524].anInt6094 = local24.method3118();
			}
		}
		for (@Pc(550) int local550 = 0; local550 < this.anInt7770; local550++) {
			if (this.aClass224Array1[local550] != null) {
				this.aClass224Array1[local550].anInt6091 = local24.method3116();
			}
		}
		for (@Pc(576) int local576 = 0; local576 < this.anInt7770; local576++) {
			if (this.aClass224Array1[local576] != null) {
				this.aClass224Array1[local576].aBoolean492 = local24.method3118() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lclient!nca;")
	@Override
	public Class224 method6560(@OriginalArg(0) int arg0) {
		return this.aClass224Array1[arg0];
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)Lclient!wba;")
	private Class3_Sub3_Sub18 method6561(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3 local10 = this.aClass189_6.method4445((long) arg0);
		if (local10 != null) {
			return (Class3_Sub3_Sub18) local10;
		}
		@Pc(21) byte[] local21 = this.aClass246_226.method5679(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class3_Sub3_Sub18 local38 = new Class3_Sub3_Sub18(new Class3_Sub11(local21));
			this.aClass189_6.method4442((long) arg0, local38);
			return local38;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZFIII)[I")
	@Override
	public int[] method6555(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method6561(arg0).method7637(this.aClass224Array1[arg0].aBoolean497, this.aClass246_225, arg3, arg4, arg1, (double) arg2, this);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZIFZ)[F")
	@Override
	public float[] method6558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method6561(arg0).method7634(arg2, this.aClass246_225, this, this.aClass224Array1[arg0].aBoolean497, arg1);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIFZII)[I")
	@Override
	public int[] method6556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		return this.method6561(arg0).method7638(this.aClass246_225, (double) arg2, arg1, arg3, this, this.aClass224Array1[arg0].aBoolean497);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6559(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub3_Sub18 local8 = this.method6561(arg0);
		return local8 != null && local8.method7639(this, this.aClass246_225);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)I")
	@Override
	public int method6557() {
		return this.anInt7770;
	}
}
