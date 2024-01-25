import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class183 implements Interface7 {

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Lclient!vca;")
	private final Class340 aClass340_2 = new Class340(256);

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "Lclient!vo;")
	private final Class348 aClass348_61;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!vo;")
	private final Class348 aClass348_60;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	private final int anInt5774;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "[Lclient!de;")
	private final Class69[] aClass69Array1;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;Lclient!vo;)V")
	public Class183(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_61 = arg1;
		this.aClass348_60 = arg2;
		@Pc(24) Class4_Sub13 local24 = new Class4_Sub13(arg0.method7964(0, 0));
		this.anInt5774 = local24.method7054();
		this.aClass69Array1 = new Class69[this.anInt5774];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5774; local36++) {
			if (local24.method7004() == 1) {
				this.aClass69Array1[local36] = new Class69();
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt5774; local63++) {
			if (this.aClass69Array1[local63] != null) {
				this.aClass69Array1[local63].aBoolean182 = local24.method7004() == 0;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt5774; local89++) {
			if (this.aClass69Array1[local89] != null) {
				this.aClass69Array1[local89].aBoolean177 = local24.method7004() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt5774; local120++) {
			if (this.aClass69Array1[local120] != null) {
				this.aClass69Array1[local120].aBoolean179 = local24.method7004() == 1;
			}
		}
		for (@Pc(151) int local151 = 0; local151 < this.anInt5774; local151++) {
			if (this.aClass69Array1[local151] != null) {
				this.aClass69Array1[local151].aBoolean176 = local24.method7004() == 1;
			}
		}
		for (@Pc(184) int local184 = 0; local184 < this.anInt5774; local184++) {
			if (this.aClass69Array1[local184] != null) {
				this.aClass69Array1[local184].aByte46 = local24.method7011();
			}
		}
		for (@Pc(210) int local210 = 0; local210 < this.anInt5774; local210++) {
			if (this.aClass69Array1[local210] != null) {
				this.aClass69Array1[local210].aByte43 = local24.method7011();
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.anInt5774; local236++) {
			if (this.aClass69Array1[local236] != null) {
				this.aClass69Array1[local236].aByte40 = local24.method7011();
			}
		}
		for (@Pc(262) int local262 = 0; local262 < this.anInt5774; local262++) {
			if (this.aClass69Array1[local262] != null) {
				this.aClass69Array1[local262].aByte44 = local24.method7011();
			}
		}
		for (@Pc(284) int local284 = 0; local284 < this.anInt5774; local284++) {
			if (this.aClass69Array1[local284] != null) {
				this.aClass69Array1[local284].aShort21 = (short) local24.method7054();
			}
		}
		for (@Pc(307) int local307 = 0; local307 < this.anInt5774; local307++) {
			if (this.aClass69Array1[local307] != null) {
				this.aClass69Array1[local307].aByte41 = local24.method7011();
			}
		}
		for (@Pc(329) int local329 = 0; local329 < this.anInt5774; local329++) {
			if (this.aClass69Array1[local329] != null) {
				this.aClass69Array1[local329].aByte42 = local24.method7011();
			}
		}
		for (@Pc(355) int local355 = 0; local355 < this.anInt5774; local355++) {
			if (this.aClass69Array1[local355] != null) {
				this.aClass69Array1[local355].aBoolean175 = local24.method7004() == 1;
			}
		}
		for (@Pc(388) int local388 = 0; local388 < this.anInt5774; local388++) {
			if (this.aClass69Array1[local388] != null) {
				this.aClass69Array1[local388].aBoolean181 = local24.method7004() == 1;
			}
		}
		for (@Pc(417) int local417 = 0; local417 < this.anInt5774; local417++) {
			if (this.aClass69Array1[local417] != null) {
				this.aClass69Array1[local417].aByte45 = local24.method7011();
			}
		}
		for (@Pc(443) int local443 = 0; local443 < this.anInt5774; local443++) {
			if (this.aClass69Array1[local443] != null) {
				this.aClass69Array1[local443].aBoolean183 = local24.method7004() == 1;
			}
		}
		for (@Pc(476) int local476 = 0; local476 < this.anInt5774; local476++) {
			if (this.aClass69Array1[local476] != null) {
				this.aClass69Array1[local476].aBoolean178 = local24.method7004() == 1;
			}
		}
		for (@Pc(505) int local505 = 0; local505 < this.anInt5774; local505++) {
			if (this.aClass69Array1[local505] != null) {
				this.aClass69Array1[local505].aBoolean184 = local24.method7004() == 1;
			}
		}
		for (@Pc(536) int local536 = 0; local536 < this.anInt5774; local536++) {
			if (this.aClass69Array1[local536] != null) {
				this.aClass69Array1[local536].anInt2293 = local24.method7004();
			}
		}
		for (@Pc(562) int local562 = 0; local562 < this.anInt5774; local562++) {
			if (this.aClass69Array1[local562] != null) {
				this.aClass69Array1[local562].anInt2292 = local24.method6990();
			}
		}
		for (@Pc(584) int local584 = 0; local584 < this.anInt5774; local584++) {
			if (this.aClass69Array1[local584] != null) {
				this.aClass69Array1[local584].aBoolean180 = local24.method7004() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Lclient!de;")
	@Override
	public Class69 method4460(@OriginalArg(1) int arg0) {
		return this.aClass69Array1[arg0];
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZIBFI)[I")
	@Override
	public int[] method4462(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method4468(arg2).method7594(this.aClass69Array1[arg2].aBoolean181, (double) arg3, arg1, this.aClass348_60, arg4, arg0, this);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZFBIII)[F")
	@Override
	public float[] method4459(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4468(arg3).method7590(arg1, arg2, this.aClass69Array1[arg3].aBoolean181, this, this.aClass348_60);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method4463(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub6_Sub18 local13 = this.method4468(arg0);
		return local13 != null && local13.method7591(this.aClass348_60, this);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I")
	@Override
	public int method4461() {
		return this.anInt5774;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZIFI)[I")
	@Override
	public int[] method4464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method4468(arg1).method7598(arg0, this.aClass348_60, this.aClass69Array1[arg1].aBoolean181, arg3, (double) arg2, this);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Lclient!ur;")
	private Class4_Sub6_Sub18 method4468(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub6 local10 = this.aClass340_2.method7723((long) arg0);
		if (local10 != null) {
			return (Class4_Sub6_Sub18) local10;
		}
		@Pc(21) byte[] local21 = this.aClass348_61.method7969(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class4_Sub6_Sub18 local33 = new Class4_Sub6_Sub18(new Class4_Sub13(local21));
			this.aClass340_2.method7724((long) arg0, local33);
			return local33;
		}
	}
}
