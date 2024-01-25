import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class220 {

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "J")
	private long aLong336;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "Lclient!wh;")
	private Class2 aClass2_223;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "Lclient!wh;")
	private Class2 aClass2_224;

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
	private int anInt6425 = 0;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
	public final int anInt6413;

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "[Lclient!wh;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(I)V")
	public Class220(@OriginalArg(0) int arg0) {
		this.anInt6413 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_267 = local23;
			local23.aClass2_268 = local23;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)Lclient!wh;")
	public Class2 method5096() {
		this.anInt6425 = 0;
		return this.method5098();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "([Lclient!wh;I)I")
	public int method5097(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6413; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_268; local19 != local16; local19 = local19.aClass2_268) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)Lclient!wh;")
	public Class2 method5098() {
		@Pc(30) Class2 local30;
		if (this.anInt6425 > 0 && this.aClass2_224 != this.aClass2Array1[this.anInt6425 - 1]) {
			local30 = this.aClass2_224;
			this.aClass2_224 = local30.aClass2_268;
			return local30;
		}
		while (this.anInt6413 > this.anInt6425) {
			local30 = this.aClass2Array1[this.anInt6425++].aClass2_268;
			if (local30 != this.aClass2Array1[this.anInt6425 - 1]) {
				this.aClass2_224 = local30.aClass2_268;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BJ)Lclient!wh;")
	public Class2 method5099(@OriginalArg(1) long arg0) {
		this.aLong336 = arg0;
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) ((long) (this.anInt6413 - 1) & arg0)];
		for (this.aClass2_223 = local25.aClass2_268; this.aClass2_223 != local25; this.aClass2_223 = this.aClass2_223.aClass2_268) {
			if (this.aClass2_223.aLong401 == arg0) {
				@Pc(43) Class2 local43 = this.aClass2_223;
				this.aClass2_223 = this.aClass2_223.aClass2_268;
				return local43;
			}
		}
		this.aClass2_223 = null;
		return null;
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)Lclient!wh;")
	public Class2 method5101() {
		if (this.aClass2_223 == null) {
			return null;
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) (this.aLong336 & (long) (this.anInt6413 - 1))];
		while (this.aClass2_223 != local28) {
			if (this.aLong336 == this.aClass2_223.aLong401) {
				@Pc(43) Class2 local43 = this.aClass2_223;
				this.aClass2_223 = this.aClass2_223.aClass2_268;
				return local43;
			}
			this.aClass2_223 = this.aClass2_223.aClass2_268;
		}
		this.aClass2_223 = null;
		return null;
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)I")
	public int method5103() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6413; local7++) {
			@Pc(22) Class2 local22 = this.aClass2Array1[local7];
			@Pc(25) Class2 local25 = local22.aClass2_268;
			while (local22 != local25) {
				local25 = local25.aClass2_268;
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!wh;BJ)V")
	public void method5104(@OriginalArg(0) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_267 != null) {
			arg0.method6260();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt6413 - 1))];
		arg0.aClass2_268 = local21;
		arg0.aClass2_267 = local21.aClass2_267;
		arg0.aClass2_267.aClass2_268 = arg0;
		arg0.aClass2_268.aClass2_267 = arg0;
		arg0.aLong401 = arg1;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
	public void method5105() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6413; local1++) {
			@Pc(14) Class2 local14 = this.aClass2Array1[local1];
			while (true) {
				@Pc(17) Class2 local17 = local14.aClass2_268;
				if (local14 == local17) {
					break;
				}
				local17.method6260();
			}
		}
		this.aClass2_223 = null;
		this.aClass2_224 = null;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I")
	public int method5106() {
		return this.anInt6413;
	}
}
