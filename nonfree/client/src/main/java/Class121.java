import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class121 implements Interface2 {

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!ik;")
	private final Class146 aClass146_1 = new Class146(256);

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "Lclient!pj;")
	private final Class248 aClass248_27;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!pj;")
	private final Class248 aClass248_26;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
	private final int anInt3609;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "[Lclient!gaa;")
	private final Class115[] aClass115Array1;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!pj;Lclient!pj;Lclient!pj;)V")
	public Class121(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_27 = arg2;
		this.aClass248_26 = arg1;
		@Pc(24) Class6_Sub12 local24 = new Class6_Sub12(arg0.method5797(0, 0));
		this.anInt3609 = local24.method6044();
		this.aClass115Array1 = new Class115[this.anInt3609];
		for (@Pc(36) int local36 = 0; local36 < this.anInt3609; local36++) {
			if (local24.method6019() == 1) {
				this.aClass115Array1[local36] = new Class115();
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt3609; local63++) {
			if (this.aClass115Array1[local63] != null) {
				this.aClass115Array1[local63].aBoolean231 = local24.method6019() == 0;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt3609; local89++) {
			if (this.aClass115Array1[local89] != null) {
				this.aClass115Array1[local89].aBoolean226 = local24.method6019() == 1;
			}
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt3609; local122++) {
			if (this.aClass115Array1[local122] != null) {
				this.aClass115Array1[local122].aBoolean233 = local24.method6019() == 1;
			}
		}
		for (@Pc(155) int local155 = 0; local155 < this.anInt3609; local155++) {
			if (this.aClass115Array1[local155] != null) {
				this.aClass115Array1[local155].aBoolean235 = local24.method6019() == 1;
			}
		}
		for (@Pc(184) int local184 = 0; local184 < this.anInt3609; local184++) {
			if (this.aClass115Array1[local184] != null) {
				this.aClass115Array1[local184].aByte38 = local24.method6049();
			}
		}
		for (@Pc(210) int local210 = 0; local210 < this.anInt3609; local210++) {
			if (this.aClass115Array1[local210] != null) {
				this.aClass115Array1[local210].aByte40 = local24.method6049();
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.anInt3609; local236++) {
			if (this.aClass115Array1[local236] != null) {
				this.aClass115Array1[local236].aByte34 = local24.method6049();
			}
		}
		for (@Pc(262) int local262 = 0; local262 < this.anInt3609; local262++) {
			if (this.aClass115Array1[local262] != null) {
				this.aClass115Array1[local262].aByte39 = local24.method6049();
			}
		}
		for (@Pc(284) int local284 = 0; local284 < this.anInt3609; local284++) {
			if (this.aClass115Array1[local284] != null) {
				this.aClass115Array1[local284].aShort55 = (short) local24.method6044();
			}
		}
		for (@Pc(307) int local307 = 0; local307 < this.anInt3609; local307++) {
			if (this.aClass115Array1[local307] != null) {
				this.aClass115Array1[local307].aByte36 = local24.method6049();
			}
		}
		for (@Pc(333) int local333 = 0; local333 < this.anInt3609; local333++) {
			if (this.aClass115Array1[local333] != null) {
				this.aClass115Array1[local333].aByte35 = local24.method6049();
			}
		}
		for (@Pc(359) int local359 = 0; local359 < this.anInt3609; local359++) {
			if (this.aClass115Array1[local359] != null) {
				this.aClass115Array1[local359].aBoolean230 = local24.method6019() == 1;
			}
		}
		for (@Pc(390) int local390 = 0; local390 < this.anInt3609; local390++) {
			if (this.aClass115Array1[local390] != null) {
				this.aClass115Array1[local390].aBoolean232 = local24.method6019() == 1;
			}
		}
		for (@Pc(417) int local417 = 0; local417 < this.anInt3609; local417++) {
			if (this.aClass115Array1[local417] != null) {
				this.aClass115Array1[local417].aByte37 = local24.method6049();
			}
		}
		for (@Pc(443) int local443 = 0; local443 < this.anInt3609; local443++) {
			if (this.aClass115Array1[local443] != null) {
				this.aClass115Array1[local443].aBoolean227 = local24.method6019() == 1;
			}
		}
		for (@Pc(474) int local474 = 0; local474 < this.anInt3609; local474++) {
			if (this.aClass115Array1[local474] != null) {
				this.aClass115Array1[local474].aBoolean234 = local24.method6019() == 1;
			}
		}
		for (@Pc(501) int local501 = 0; local501 < this.anInt3609; local501++) {
			if (this.aClass115Array1[local501] != null) {
				this.aClass115Array1[local501].aBoolean229 = local24.method6019() == 1;
			}
		}
		for (@Pc(528) int local528 = 0; local528 < this.anInt3609; local528++) {
			if (this.aClass115Array1[local528] != null) {
				this.aClass115Array1[local528].anInt2984 = local24.method6019();
			}
		}
		for (@Pc(550) int local550 = 0; local550 < this.anInt3609; local550++) {
			if (this.aClass115Array1[local550] != null) {
				this.aClass115Array1[local550].anInt2987 = local24.method6015();
			}
		}
		for (@Pc(572) int local572 = 0; local572 < this.anInt3609; local572++) {
			if (this.aClass115Array1[local572] != null) {
				this.aClass115Array1[local572].aBoolean228 = local24.method6019() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)I")
	@Override
	public int method3090() {
		return this.anInt3609;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIZIF)[I")
	@Override
	public int[] method3087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method3094(arg2).method2998(this, this.aClass115Array1[arg2].aBoolean232, arg1, this.aClass248_27, arg0, (double) arg3);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIFIIZ)[F")
	@Override
	public float[] method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		return this.method3094(arg1).method3000(arg0, this.aClass115Array1[arg1].aBoolean232, this, this.aClass248_27, arg3);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIFIZI)[I")
	@Override
	public int[] method3088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return this.method3094(arg0).method2996(arg4, (double) arg2, arg3, arg1, this.aClass248_27, this.aClass115Array1[arg0].aBoolean232, this);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Lclient!gaa;")
	@Override
	public Class115 method3085(@OriginalArg(1) int arg0) {
		return this.aClass115Array1[arg0];
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)Lclient!gp;")
	private Class6_Sub5_Sub6 method3094(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub5 local10 = this.aClass146_1.method3536((long) arg0);
		if (local10 != null) {
			return (Class6_Sub5_Sub6) local10;
		}
		@Pc(21) byte[] local21 = this.aClass248_26.method5795(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class6_Sub5_Sub6 local33 = new Class6_Sub5_Sub6(new Class6_Sub12(local21));
			this.aClass146_1.method3534((long) arg0, local33);
			return local33;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method3089(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub6 local8 = this.method3094(arg0);
		return local8 != null && local8.method2995(this.aClass248_27, this);
	}
}
