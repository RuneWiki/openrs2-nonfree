import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class158 implements Interface2 {

	@OriginalMember(owner = "client!or", name = "l", descriptor = "Lclient!ih;")
	private final Class92 aClass92_7 = new Class92(256);

	@OriginalMember(owner = "client!or", name = "q", descriptor = "Lclient!wo;")
	private final Class216 aClass216_79;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "Lclient!wo;")
	private final Class216 aClass216_80;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "[Lclient!oj;")
	private final Class154[] aClass154Array1;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!wo;Lclient!wo;Lclient!wo;)V")
	public Class158(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) Class216 arg2) {
		this.aClass216_79 = arg1;
		this.aClass216_80 = arg2;
		@Pc(24) Class1_Sub8 local24 = new Class1_Sub8(arg0.method5648(0, 0));
		@Pc(28) int local28 = local24.method4556();
		this.aClass154Array1 = new Class154[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method4532() == 1) {
				this.aClass154Array1[local34] = new Class154();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass154Array1[local56] != null) {
				this.aClass154Array1[local56].aBoolean443 = local24.method4532() == 0;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < local28; local88++) {
			if (this.aClass154Array1[local88] != null) {
				this.aClass154Array1[local88].aBoolean439 = local24.method4532() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < local28; local120++) {
			if (this.aClass154Array1[local120] != null) {
				this.aClass154Array1[local120].aBoolean440 = local24.method4532() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < local28; local152++) {
			if (this.aClass154Array1[local152] != null) {
				this.aClass154Array1[local152].aBoolean442 = local24.method4532() == 1;
			}
		}
		for (@Pc(178) int local178 = 0; local178 < local28; local178++) {
			if (this.aClass154Array1[local178] != null) {
				this.aClass154Array1[local178].aByte37 = local24.method4558();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < local28; local203++) {
			if (this.aClass154Array1[local203] != null) {
				this.aClass154Array1[local203].aByte35 = local24.method4558();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < local28; local228++) {
			if (this.aClass154Array1[local228] != null) {
				this.aClass154Array1[local228].aByte34 = local24.method4558();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < local28; local249++) {
			if (this.aClass154Array1[local249] != null) {
				this.aClass154Array1[local249].aByte32 = local24.method4558();
			}
		}
		for (@Pc(274) int local274 = 0; local274 < local28; local274++) {
			if (this.aClass154Array1[local274] != null) {
				this.aClass154Array1[local274].aShort54 = (short) local24.method4556();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < local28; local296++) {
			if (this.aClass154Array1[local296] != null) {
				this.aClass154Array1[local296].aByte33 = local24.method4558();
			}
		}
		for (@Pc(321) int local321 = 0; local321 < local28; local321++) {
			if (this.aClass154Array1[local321] != null) {
				this.aClass154Array1[local321].aByte31 = local24.method4558();
			}
		}
		for (@Pc(346) int local346 = 0; local346 < local28; local346++) {
			if (this.aClass154Array1[local346] != null) {
				this.aClass154Array1[local346].aBoolean436 = local24.method4532() == 1;
			}
		}
		for (@Pc(374) int local374 = 0; local374 < local28; local374++) {
			if (this.aClass154Array1[local374] != null) {
				this.aClass154Array1[local374].aBoolean437 = local24.method4532() == 1;
			}
		}
		for (@Pc(404) int local404 = 0; local404 < local28; local404++) {
			if (this.aClass154Array1[local404] != null) {
				this.aClass154Array1[local404].aByte36 = local24.method4558();
			}
		}
		for (@Pc(425) int local425 = 0; local425 < local28; local425++) {
			if (this.aClass154Array1[local425] != null) {
				this.aClass154Array1[local425].aBoolean444 = local24.method4532() == 1;
			}
		}
		for (@Pc(457) int local457 = 0; local457 < local28; local457++) {
			if (this.aClass154Array1[local457] != null) {
				this.aClass154Array1[local457].aBoolean441 = local24.method4532() == 1;
			}
		}
		for (@Pc(483) int local483 = 0; local483 < local28; local483++) {
			if (this.aClass154Array1[local483] != null) {
				this.aClass154Array1[local483].aBoolean438 = local24.method4532() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)Lclient!oj;")
	@Override
	public Class154 method4244(@OriginalArg(0) int arg0) {
		return this.aClass154Array1[arg0];
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method4241(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub4_Sub17 local13 = this.method4252(arg0);
		return local13 != null && local13.method4101(this, this.aClass216_80);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIFIZ)[I")
	@Override
	public int[] method4242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		return this.method4252(arg0).method4107((double) arg2, arg3, this, this.aClass216_80, arg1, this.aClass154Array1[arg0].aBoolean437);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(IIIFIZ)[I")
	@Override
	public int[] method4243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method4252(arg1).method4106((double) arg2, arg3, arg0, this.aClass154Array1[arg1].aBoolean437, this.aClass216_80, this, arg4);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)Lclient!oa;")
	private Class1_Sub4_Sub17 method4252(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub4 local10 = this.aClass92_7.method2606((long) arg0);
		if (local10 != null) {
			return (Class1_Sub4_Sub17) local10;
		}
		@Pc(21) byte[] local21 = this.aClass216_79.method5659(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class1_Sub4_Sub17 local38 = new Class1_Sub4_Sub17(new Class1_Sub8(local21));
			this.aClass92_7.method2601((long) arg0, local38);
			return local38;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(FZIIIZ)[F")
	@Override
	public float[] method4240(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method4252(arg1).method4103(this.aClass154Array1[arg1].aBoolean437, arg3, this.aClass216_80, arg2, this);
	}
}
