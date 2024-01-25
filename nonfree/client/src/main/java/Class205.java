import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class205 implements Interface3 {

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "Lclient!mha;")
	private final Class232 aClass232_7 = new Class232(256);

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "Lclient!la;")
	private final Class207 aClass207_65;

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "Lclient!la;")
	private final Class207 aClass207_64;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
	private final int anInt5196;

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "[Lclient!hia;")
	private final Class145[] aClass145Array1;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!la;)V")
	public Class205(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_65 = arg2;
		this.aClass207_64 = arg1;
		@Pc(24) Class5_Sub22 local24 = new Class5_Sub22(arg0.method4681(0, 0));
		this.anInt5196 = local24.method5968();
		this.aClass145Array1 = new Class145[this.anInt5196];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5196; local36++) {
			if (local24.method5966() == 1) {
				this.aClass145Array1[local36] = new Class145();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt5196; local57++) {
			if (this.aClass145Array1[local57] != null) {
				this.aClass145Array1[local57].aBoolean291 = local24.method5966() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt5196; local87++) {
			if (this.aClass145Array1[local87] != null) {
				this.aClass145Array1[local87].aBoolean293 = local24.method5966() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt5196; local120++) {
			if (this.aClass145Array1[local120] != null) {
				this.aClass145Array1[local120].aBoolean294 = local24.method5966() == 1;
			}
		}
		for (@Pc(147) int local147 = 0; local147 < this.anInt5196; local147++) {
			if (this.aClass145Array1[local147] != null) {
				this.aClass145Array1[local147].aByte67 = local24.method5963();
			}
		}
		for (@Pc(173) int local173 = 0; local173 < this.anInt5196; local173++) {
			if (this.aClass145Array1[local173] != null) {
				this.aClass145Array1[local173].aByte66 = local24.method5963();
			}
		}
		for (@Pc(199) int local199 = 0; local199 < this.anInt5196; local199++) {
			if (this.aClass145Array1[local199] != null) {
				this.aClass145Array1[local199].aByte68 = local24.method5963();
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt5196; local225++) {
			if (this.aClass145Array1[local225] != null) {
				this.aClass145Array1[local225].aByte64 = local24.method5963();
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.anInt5196; local251++) {
			if (this.aClass145Array1[local251] != null) {
				this.aClass145Array1[local251].aShort61 = (short) local24.method5968();
			}
		}
		for (@Pc(274) int local274 = 0; local274 < this.anInt5196; local274++) {
			if (this.aClass145Array1[local274] != null) {
				this.aClass145Array1[local274].aByte62 = local24.method5963();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < this.anInt5196; local296++) {
			if (this.aClass145Array1[local296] != null) {
				this.aClass145Array1[local296].aByte65 = local24.method5963();
			}
		}
		for (@Pc(318) int local318 = 0; local318 < this.anInt5196; local318++) {
			if (this.aClass145Array1[local318] != null) {
				this.aClass145Array1[local318].aBoolean296 = local24.method5966() == 1;
			}
		}
		for (@Pc(347) int local347 = 0; local347 < this.anInt5196; local347++) {
			if (this.aClass145Array1[local347] != null) {
				this.aClass145Array1[local347].aBoolean290 = local24.method5966() == 1;
			}
		}
		for (@Pc(376) int local376 = 0; local376 < this.anInt5196; local376++) {
			if (this.aClass145Array1[local376] != null) {
				this.aClass145Array1[local376].aByte63 = local24.method5963();
			}
		}
		for (@Pc(402) int local402 = 0; local402 < this.anInt5196; local402++) {
			if (this.aClass145Array1[local402] != null) {
				this.aClass145Array1[local402].aBoolean292 = local24.method5966() == 1;
			}
		}
		for (@Pc(429) int local429 = 0; local429 < this.anInt5196; local429++) {
			if (this.aClass145Array1[local429] != null) {
				this.aClass145Array1[local429].aBoolean297 = local24.method5966() == 1;
			}
		}
		for (@Pc(456) int local456 = 0; local456 < this.anInt5196; local456++) {
			if (this.aClass145Array1[local456] != null) {
				this.aClass145Array1[local456].aBoolean295 = local24.method5966() == 1;
			}
		}
		for (@Pc(487) int local487 = 0; local487 < this.anInt5196; local487++) {
			if (this.aClass145Array1[local487] != null) {
				this.aClass145Array1[local487].anInt3990 = local24.method5966();
			}
		}
		for (@Pc(513) int local513 = 0; local513 < this.anInt5196; local513++) {
			if (this.aClass145Array1[local513] != null) {
				this.aClass145Array1[local513].anInt3991 = local24.method5913();
			}
		}
		for (@Pc(539) int local539 = 0; local539 < this.anInt5196; local539++) {
			if (this.aClass145Array1[local539] != null) {
				this.aClass145Array1[local539].anInt3988 = local24.method5966();
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZFIII)[F")
	@Override
	public float[] method4657(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method4661(arg3).method3704(this.aClass207_65, arg0, arg2, this.aClass145Array1[arg3].aBoolean290, this);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)Lclient!hia;")
	@Override
	public Class145 method4656(@OriginalArg(1) int arg0) {
		return this.aClass145Array1[arg0];
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZFIBII)[I")
	@Override
	public int[] method4658(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4661(arg3).method3699(arg2, this.aClass145Array1[arg3].aBoolean290, this.aClass207_65, arg1, (double) arg0, this);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4654(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub5_Sub10 local8 = this.method4661(arg0);
		return local8 != null && local8.method3705(this, this.aClass207_65);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)I")
	@Override
	public int method4655() {
		return this.anInt5196;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IB)Lclient!hv;")
	private Class5_Sub5_Sub10 method4661(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub5 local15 = this.aClass232_7.method5128((long) arg0);
		if (local15 != null) {
			return (Class5_Sub5_Sub10) local15;
		}
		@Pc(26) byte[] local26 = this.aClass207_64.method4690(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class5_Sub5_Sub10 local38 = new Class5_Sub5_Sub10(new Class5_Sub22(local26));
			this.aClass232_7.method5129(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(FIIIBZ)[I")
	@Override
	public int[] method4653(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method4661(arg2).method3701(arg1, this, this.aClass145Array1[arg2].aBoolean290, this.aClass207_65, arg4, (double) arg0, arg3);
	}
}
