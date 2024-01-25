import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class91 {

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "Lclient!rp;")
	private Class1 aClass1_84;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!faa", name = "t", descriptor = "Lclient!rp;")
	private Class1 aClass1_85;

	@OriginalMember(owner = "client!faa", name = "s", descriptor = "I")
	private int anInt2588 = 0;

	@OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
	public final int anInt2585;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "[Lclient!rp;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(I)V")
	public Class91(@OriginalArg(0) int arg0) {
		this.anInt2585 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_285 = local23;
			local23.aClass1_286 = local23;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(JLclient!rp;I)V")
	public void method2269(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_285 != null) {
			arg1.method7908();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt2585 - 1) & arg0)];
		arg1.aClass1_285 = local21.aClass1_285;
		arg1.aClass1_286 = local21;
		arg1.aClass1_285.aClass1_286 = arg1;
		arg1.aLong268 = arg0;
		arg1.aClass1_286.aClass1_285 = arg1;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)I")
	public int method2270() {
		return this.anInt2585;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BJ)Lclient!rp;")
	public Class1 method2271(@OriginalArg(1) long arg0) {
		this.aLong68 = arg0;
		@Pc(25) Class1 local25 = this.aClass1Array1[(int) ((long) (this.anInt2585 - 1) & arg0)];
		for (this.aClass1_84 = local25.aClass1_286; this.aClass1_84 != local25; this.aClass1_84 = this.aClass1_84.aClass1_286) {
			if (this.aClass1_84.aLong268 == arg0) {
				@Pc(44) Class1 local44 = this.aClass1_84;
				this.aClass1_84 = this.aClass1_84.aClass1_286;
				return local44;
			}
		}
		this.aClass1_84 = null;
		return null;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "([Lclient!rp;I)I")
	public int method2272(@OriginalArg(0) Class1[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2585; local15++) {
			@Pc(22) Class1 local22 = this.aClass1Array1[local15];
			for (@Pc(25) Class1 local25 = local22.aClass1_286; local25 != local22; local25 = local25.aClass1_286) {
				arg0[local13++] = local25;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)I")
	public int method2273() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2585; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			@Pc(19) Class1 local19 = local16.aClass1_286;
			while (local19 != local16) {
				local19 = local19.aClass1_286;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)V")
	public void method2275() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2585; local7++) {
			@Pc(14) Class1 local14 = this.aClass1Array1[local7];
			while (true) {
				@Pc(17) Class1 local17 = local14.aClass1_286;
				if (local17 == local14) {
					break;
				}
				local17.method7908();
			}
		}
		this.aClass1_84 = null;
		this.aClass1_85 = null;
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)Lclient!rp;")
	public Class1 method2276() {
		@Pc(22) Class1 local22;
		if (this.anInt2588 > 0 && this.aClass1Array1[this.anInt2588 - 1] != this.aClass1_85) {
			local22 = this.aClass1_85;
			this.aClass1_85 = local22.aClass1_286;
			return local22;
		}
		while (this.anInt2585 > this.anInt2588) {
			local22 = this.aClass1Array1[this.anInt2588++].aClass1_286;
			if (local22 != this.aClass1Array1[this.anInt2588 - 1]) {
				this.aClass1_85 = local22.aClass1_286;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)Lclient!rp;")
	public Class1 method2277() {
		if (this.aClass1_84 == null) {
			return null;
		}
		@Pc(28) Class1 local28 = this.aClass1Array1[(int) (this.aLong68 & (long) (this.anInt2585 - 1))];
		while (local28 != this.aClass1_84) {
			if (this.aLong68 == this.aClass1_84.aLong268) {
				@Pc(40) Class1 local40 = this.aClass1_84;
				this.aClass1_84 = this.aClass1_84.aClass1_286;
				return local40;
			}
			this.aClass1_84 = this.aClass1_84.aClass1_286;
		}
		this.aClass1_84 = null;
		return null;
	}

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)Lclient!rp;")
	public Class1 method2278() {
		this.anInt2588 = 0;
		return this.method2276();
	}
}
