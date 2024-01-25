import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class315 implements Interface11 {

	@OriginalMember(owner = "client!tfa", name = "q", descriptor = "Lclient!oea;")
	private final Class245 aClass245_3 = new Class245(256);

	@OriginalMember(owner = "client!tfa", name = "p", descriptor = "Lclient!jn;")
	private final Class176 aClass176_124;

	@OriginalMember(owner = "client!tfa", name = "j", descriptor = "Lclient!jn;")
	private final Class176 aClass176_123;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
	private final int anInt9063;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "[Lclient!ah;")
	private final Class14[] aClass14Array1;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;Lclient!jn;)V")
	public Class315(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_124 = arg2;
		this.aClass176_123 = arg1;
		@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0.method3994(0, 0));
		this.anInt9063 = local24.method4936();
		this.aClass14Array1 = new Class14[this.anInt9063];
		for (@Pc(36) int local36 = 0; local36 < this.anInt9063; local36++) {
			if (local24.method4905() == 1) {
				this.aClass14Array1[local36] = new Class14();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt9063; local61++) {
			if (this.aClass14Array1[local61] != null) {
				this.aClass14Array1[local61].aBoolean11 = local24.method4905() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt9063; local87++) {
			if (this.aClass14Array1[local87] != null) {
				this.aClass14Array1[local87].aBoolean10 = local24.method4905() == 1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt9063; local116++) {
			if (this.aClass14Array1[local116] != null) {
				this.aClass14Array1[local116].aBoolean12 = local24.method4905() == 1;
			}
		}
		for (@Pc(149) int local149 = 0; local149 < this.anInt9063; local149++) {
			if (this.aClass14Array1[local149] != null) {
				this.aClass14Array1[local149].aBoolean14 = local24.method4905() == 1;
			}
		}
		for (@Pc(182) int local182 = 0; local182 < this.anInt9063; local182++) {
			if (this.aClass14Array1[local182] != null) {
				this.aClass14Array1[local182].aByte8 = local24.method4925();
			}
		}
		for (@Pc(208) int local208 = 0; local208 < this.anInt9063; local208++) {
			if (this.aClass14Array1[local208] != null) {
				this.aClass14Array1[local208].aByte7 = local24.method4925();
			}
		}
		for (@Pc(234) int local234 = 0; local234 < this.anInt9063; local234++) {
			if (this.aClass14Array1[local234] != null) {
				this.aClass14Array1[local234].aByte9 = local24.method4925();
			}
		}
		for (@Pc(260) int local260 = 0; local260 < this.anInt9063; local260++) {
			if (this.aClass14Array1[local260] != null) {
				this.aClass14Array1[local260].aByte5 = local24.method4925();
			}
		}
		for (@Pc(286) int local286 = 0; local286 < this.anInt9063; local286++) {
			if (this.aClass14Array1[local286] != null) {
				this.aClass14Array1[local286].aShort12 = (short) local24.method4936();
			}
		}
		for (@Pc(313) int local313 = 0; local313 < this.anInt9063; local313++) {
			if (this.aClass14Array1[local313] != null) {
				this.aClass14Array1[local313].aByte4 = local24.method4925();
			}
		}
		for (@Pc(339) int local339 = 0; local339 < this.anInt9063; local339++) {
			if (this.aClass14Array1[local339] != null) {
				this.aClass14Array1[local339].aByte6 = local24.method4925();
			}
		}
		for (@Pc(365) int local365 = 0; local365 < this.anInt9063; local365++) {
			if (this.aClass14Array1[local365] != null) {
				this.aClass14Array1[local365].aBoolean13 = local24.method4905() == 1;
			}
		}
		for (@Pc(398) int local398 = 0; local398 < this.anInt9063; local398++) {
			if (this.aClass14Array1[local398] != null) {
				this.aClass14Array1[local398].aBoolean6 = local24.method4905() == 1;
			}
		}
		for (@Pc(429) int local429 = 0; local429 < this.anInt9063; local429++) {
			if (this.aClass14Array1[local429] != null) {
				this.aClass14Array1[local429].aByte10 = local24.method4925();
			}
		}
		for (@Pc(451) int local451 = 0; local451 < this.anInt9063; local451++) {
			if (this.aClass14Array1[local451] != null) {
				this.aClass14Array1[local451].aBoolean8 = local24.method4905() == 1;
			}
		}
		for (@Pc(482) int local482 = 0; local482 < this.anInt9063; local482++) {
			if (this.aClass14Array1[local482] != null) {
				this.aClass14Array1[local482].aBoolean7 = local24.method4905() == 1;
			}
		}
		for (@Pc(511) int local511 = 0; local511 < this.anInt9063; local511++) {
			if (this.aClass14Array1[local511] != null) {
				this.aClass14Array1[local511].aBoolean9 = local24.method4905() == 1;
			}
		}
		for (@Pc(544) int local544 = 0; local544 < this.anInt9063; local544++) {
			if (this.aClass14Array1[local544] != null) {
				this.aClass14Array1[local544].anInt239 = local24.method4905();
			}
		}
		for (@Pc(566) int local566 = 0; local566 < this.anInt9063; local566++) {
			if (this.aClass14Array1[local566] != null) {
				this.aClass14Array1[local566].anInt238 = local24.method4931();
			}
		}
		for (@Pc(592) int local592 = 0; local592 < this.anInt9063; local592++) {
			if (this.aClass14Array1[local592] != null) {
				this.aClass14Array1[local592].aBoolean15 = local24.method4905() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZIIIIF)[I")
	@Override
	public int[] method7406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method7412(arg1).method8023((double) arg3, this, arg2, this.aClass176_124, this.aClass14Array1[arg1].aBoolean6, arg0);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZIFII)[F")
	@Override
	public float[] method7409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method7412(arg0).method8021(this, arg1, this.aClass176_124, arg3, this.aClass14Array1[arg0].aBoolean6);
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)Lclient!ve;")
	private Class4_Sub5_Sub19 method7412(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub5 local10 = this.aClass245_3.method5976((long) arg0);
		if (local10 != null) {
			return (Class4_Sub5_Sub19) local10;
		}
		@Pc(21) byte[] local21 = this.aClass176_123.method4005(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class4_Sub5_Sub19 local33 = new Class4_Sub5_Sub19(new Class4_Sub11(local21));
			this.aClass245_3.method5975(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7407(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub5_Sub19 local8 = this.method7412(arg0);
		return local8 != null && local8.method8018(this, this.aClass176_124);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IB)Lclient!ah;")
	@Override
	public Class14 method7405(@OriginalArg(0) int arg0) {
		return this.aClass14Array1[arg0];
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZIBIF)[I")
	@Override
	public int[] method7408(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4) {
		return this.method7412(arg3).method8024(this.aClass176_124, this.aClass14Array1[arg3].aBoolean6, (double) arg4, arg1, this, arg2, arg0);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7410() {
		return this.anInt9063;
	}
}
