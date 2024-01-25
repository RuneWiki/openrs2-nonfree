import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class165 implements Interface4 {

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "Lclient!ffa;")
	private final Class94 aClass94_4 = new Class94(256);

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_63;

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_64;

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
	private final int anInt4891;

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "[Lclient!tba;")
	private final Class313[] aClass313Array1;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;Lclient!pfa;)V")
	public Class165(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_63 = arg1;
		this.aClass251_64 = arg2;
		@Pc(24) Class6_Sub21 local24 = new Class6_Sub21(arg0.method5772(0, 0));
		this.anInt4891 = local24.method6003();
		this.aClass313Array1 = new Class313[this.anInt4891];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4891; local36++) {
			if (local24.method6069() == 1) {
				this.aClass313Array1[local36] = new Class313();
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anInt4891; local59++) {
			if (this.aClass313Array1[local59] != null) {
				this.aClass313Array1[local59].aBoolean593 = local24.method6069() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt4891; local92++) {
			if (this.aClass313Array1[local92] != null) {
				this.aClass313Array1[local92].aBoolean590 = local24.method6069() == 1;
			}
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt4891; local121++) {
			if (this.aClass313Array1[local121] != null) {
				this.aClass313Array1[local121].aBoolean595 = local24.method6069() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt4891; local152++) {
			if (this.aClass313Array1[local152] != null) {
				this.aClass313Array1[local152].aBoolean592 = local24.method6069() == 1;
			}
		}
		for (@Pc(179) int local179 = 0; local179 < this.anInt4891; local179++) {
			if (this.aClass313Array1[local179] != null) {
				this.aClass313Array1[local179].aByte100 = local24.method6055();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < this.anInt4891; local201++) {
			if (this.aClass313Array1[local201] != null) {
				this.aClass313Array1[local201].aByte101 = local24.method6055();
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt4891; local223++) {
			if (this.aClass313Array1[local223] != null) {
				this.aClass313Array1[local223].aByte98 = local24.method6055();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.anInt4891; local249++) {
			if (this.aClass313Array1[local249] != null) {
				this.aClass313Array1[local249].aByte99 = local24.method6055();
			}
		}
		for (@Pc(275) int local275 = 0; local275 < this.anInt4891; local275++) {
			if (this.aClass313Array1[local275] != null) {
				this.aClass313Array1[local275].aShort105 = (short) local24.method6003();
			}
		}
		for (@Pc(302) int local302 = 0; local302 < this.anInt4891; local302++) {
			if (this.aClass313Array1[local302] != null) {
				this.aClass313Array1[local302].aByte97 = local24.method6055();
			}
		}
		for (@Pc(324) int local324 = 0; local324 < this.anInt4891; local324++) {
			if (this.aClass313Array1[local324] != null) {
				this.aClass313Array1[local324].aByte102 = local24.method6055();
			}
		}
		for (@Pc(350) int local350 = 0; local350 < this.anInt4891; local350++) {
			if (this.aClass313Array1[local350] != null) {
				this.aClass313Array1[local350].aBoolean594 = local24.method6069() == 1;
			}
		}
		for (@Pc(377) int local377 = 0; local377 < this.anInt4891; local377++) {
			if (this.aClass313Array1[local377] != null) {
				this.aClass313Array1[local377].aBoolean587 = local24.method6069() == 1;
			}
		}
		for (@Pc(408) int local408 = 0; local408 < this.anInt4891; local408++) {
			if (this.aClass313Array1[local408] != null) {
				this.aClass313Array1[local408].aByte103 = local24.method6055();
			}
		}
		for (@Pc(430) int local430 = 0; local430 < this.anInt4891; local430++) {
			if (this.aClass313Array1[local430] != null) {
				this.aClass313Array1[local430].aBoolean589 = local24.method6069() == 1;
			}
		}
		for (@Pc(459) int local459 = 0; local459 < this.anInt4891; local459++) {
			if (this.aClass313Array1[local459] != null) {
				this.aClass313Array1[local459].aBoolean591 = local24.method6069() == 1;
			}
		}
		for (@Pc(488) int local488 = 0; local488 < this.anInt4891; local488++) {
			if (this.aClass313Array1[local488] != null) {
				this.aClass313Array1[local488].aBoolean588 = local24.method6069() == 1;
			}
		}
		for (@Pc(515) int local515 = 0; local515 < this.anInt4891; local515++) {
			if (this.aClass313Array1[local515] != null) {
				this.aClass313Array1[local515].anInt8310 = local24.method6069();
			}
		}
		for (@Pc(541) int local541 = 0; local541 < this.anInt4891; local541++) {
			if (this.aClass313Array1[local541] != null) {
				this.aClass313Array1[local541].anInt8313 = local24.method6036();
			}
		}
		for (@Pc(567) int local567 = 0; local567 < this.anInt4891; local567++) {
			if (this.aClass313Array1[local567] != null) {
				this.aClass313Array1[local567].aBoolean596 = local24.method6069() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IB)Lclient!tba;")
	@Override
	public Class313 method4234(@OriginalArg(0) int arg0) {
		return this.aClass313Array1[arg0];
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(FIIIZI)[I")
	@Override
	public int[] method4230(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method4238(arg1).method6442(arg3, arg2, this, (double) arg0, this.aClass251_64, arg4, this.aClass313Array1[arg1].aBoolean587);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method4233(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub2_Sub16 local16 = this.method4238(arg0);
		return local16 != null && local16.method6440(this.aClass251_64, this);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I")
	@Override
	public int method4235() {
		return this.anInt4891;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IFIIZI)[F")
	@Override
	public float[] method4232(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method4238(arg3).method6441(arg2, this.aClass251_64, arg0, this.aClass313Array1[arg3].aBoolean587, this);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIFZZ)[I")
	@Override
	public int[] method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		return this.method4238(arg2).method6438(this.aClass313Array1[arg2].aBoolean587, this.aClass251_64, this, (double) arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BI)Lclient!rm;")
	private Class6_Sub2_Sub16 method4238(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2 local10 = this.aClass94_4.method2647((long) arg0);
		if (local10 != null) {
			return (Class6_Sub2_Sub16) local10;
		}
		@Pc(21) byte[] local21 = this.aClass251_63.method5761(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(41) Class6_Sub2_Sub16 local41 = new Class6_Sub2_Sub16(new Class6_Sub21(local21));
			this.aClass94_4.method2643((long) arg0, local41);
			return local41;
		}
	}
}
