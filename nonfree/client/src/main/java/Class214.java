import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class214 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Lclient!ag;")
	private Class2 aClass2_201;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "Lclient!ag;")
	private Class2 aClass2_202;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	private int anInt5789 = 0;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public final int anInt5786;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "[Lclient!ag;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V")
	public Class214(@OriginalArg(0) int arg0) {
		this.anInt5786 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_243 = local23;
			local23.aClass2_244 = local23;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(JI)Lclient!ag;")
	public Class2 method5059(@OriginalArg(0) long arg0) {
		this.aLong179 = arg0;
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt5786 - 1))];
		for (this.aClass2_201 = local28.aClass2_244; this.aClass2_201 != local28; this.aClass2_201 = this.aClass2_201.aClass2_244) {
			if (arg0 == this.aClass2_201.aLong208) {
				@Pc(43) Class2 local43 = this.aClass2_201;
				this.aClass2_201 = this.aClass2_201.aClass2_244;
				return local43;
			}
		}
		this.aClass2_201 = null;
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Lclient!ag;")
	public Class2 method5060() {
		this.anInt5789 = 0;
		return this.method5064();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)Lclient!ag;")
	public Class2 method5061() {
		if (this.aClass2_201 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt5786 - 1) & this.aLong179)];
		while (this.aClass2_201 != local21) {
			if (this.aClass2_201.aLong208 == this.aLong179) {
				@Pc(36) Class2 local36 = this.aClass2_201;
				this.aClass2_201 = this.aClass2_201.aClass2_244;
				return local36;
			}
			this.aClass2_201 = this.aClass2_201.aClass2_244;
		}
		this.aClass2_201 = null;
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
	public int method5062() {
		return this.anInt5786;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lclient!ag;I)I")
	public int method5063(@OriginalArg(0) Class2[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5786; local17++) {
			@Pc(24) Class2 local24 = this.aClass2Array1[local17];
			for (@Pc(27) Class2 local27 = local24.aClass2_244; local27 != local24; local27 = local27.aClass2_244) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Lclient!ag;")
	public Class2 method5064() {
		@Pc(19) Class2 local19;
		if (this.anInt5789 > 0 && this.aClass2_202 != this.aClass2Array1[this.anInt5789 - 1]) {
			local19 = this.aClass2_202;
			this.aClass2_202 = local19.aClass2_244;
			return local19;
		}
		while (this.anInt5786 > this.anInt5789) {
			local19 = this.aClass2Array1[this.anInt5789++].aClass2_244;
			if (this.aClass2Array1[this.anInt5789 - 1] != local19) {
				this.aClass2_202 = local19.aClass2_244;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(JLclient!ag;Z)V")
	public void method5065(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_243 != null) {
			arg1.method5745();
		}
		@Pc(29) Class2 local29 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt5786 - 1))];
		arg1.aClass2_243 = local29.aClass2_243;
		arg1.aClass2_244 = local29;
		arg1.aClass2_243.aClass2_244 = arg1;
		arg1.aClass2_244.aClass2_243 = arg1;
		arg1.aLong208 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)I")
	public int method5066() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt5786; local16++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local16];
			@Pc(26) Class2 local26 = local23.aClass2_244;
			while (local23 != local26) {
				local26 = local26.aClass2_244;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
	public void method5068() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5786; local15++) {
			@Pc(22) Class2 local22 = this.aClass2Array1[local15];
			while (true) {
				@Pc(25) Class2 local25 = local22.aClass2_244;
				if (local25 == local22) {
					break;
				}
				local25.method5745();
			}
		}
		this.aClass2_202 = null;
		this.aClass2_201 = null;
	}
}
