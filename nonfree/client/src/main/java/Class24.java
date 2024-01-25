import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class24 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!ob;")
	private Class3 aClass3_33;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Lclient!ob;")
	private Class3 aClass3_34;

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
	private int anInt749 = 0;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "[Lclient!ob;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public final int anInt736;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt736 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_248 = local23;
			local23.aClass3_247 = local23;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B[Lclient!ob;)I")
	public int method594(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt736; local9++) {
			@Pc(19) Class3 local19 = this.aClass3Array1[local9];
			for (@Pc(22) Class3 local22 = local19.aClass3_248; local22 != local19; local22 = local22.aClass3_248) {
				arg0[local7++] = local22;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Lclient!ob;")
	public Class3 method595() {
		this.anInt749 = 0;
		return this.method602();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IJLclient!ob;)V")
	public void method598(@OriginalArg(1) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_247 != null) {
			arg1.method5717();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt736 - 1) & arg0)];
		arg1.aClass3_248 = local21;
		arg1.aClass3_247 = local21.aClass3_247;
		arg1.aClass3_247.aClass3_248 = arg1;
		arg1.aClass3_248.aClass3_247 = arg1;
		arg1.aLong211 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)Lclient!ob;")
	public Class3 method600() {
		if (this.aClass3_33 == null) {
			return null;
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) (this.aLong24 & (long) (this.anInt736 - 1))];
		while (local23 != this.aClass3_33) {
			if (this.aClass3_33.aLong211 == this.aLong24) {
				@Pc(39) Class3 local39 = this.aClass3_33;
				this.aClass3_33 = this.aClass3_33.aClass3_248;
				return local39;
			}
			this.aClass3_33 = this.aClass3_33.aClass3_248;
		}
		this.aClass3_33 = null;
		return null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Lclient!ob;")
	public Class3 method602() {
		@Pc(25) Class3 local25;
		if (this.anInt749 > 0 && this.aClass3_34 != this.aClass3Array1[this.anInt749 - 1]) {
			local25 = this.aClass3_34;
			this.aClass3_34 = local25.aClass3_248;
			return local25;
		}
		while (this.anInt736 > this.anInt749) {
			local25 = this.aClass3Array1[this.anInt749++].aClass3_248;
			if (local25 != this.aClass3Array1[this.anInt749 - 1]) {
				this.aClass3_34 = local25.aClass3_248;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)I")
	public int method605() {
		return this.anInt736;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)I")
	public int method607() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt736; local15++) {
			@Pc(22) Class3 local22 = this.aClass3Array1[local15];
			@Pc(25) Class3 local25 = local22.aClass3_248;
			while (local25 != local22) {
				local25 = local25.aClass3_248;
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V")
	public void method608() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt736; local7++) {
			@Pc(14) Class3 local14 = this.aClass3Array1[local7];
			while (true) {
				@Pc(17) Class3 local17 = local14.aClass3_248;
				if (local17 == local14) {
					break;
				}
				local17.method5717();
			}
		}
		this.aClass3_34 = null;
		this.aClass3_33 = null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZJ)Lclient!ob;")
	public Class3 method609(@OriginalArg(1) long arg0) {
		this.aLong24 = arg0;
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt736 - 1))];
		for (this.aClass3_33 = local25.aClass3_248; this.aClass3_33 != local25; this.aClass3_33 = this.aClass3_33.aClass3_248) {
			if (arg0 == this.aClass3_33.aLong211) {
				@Pc(40) Class3 local40 = this.aClass3_33;
				this.aClass3_33 = this.aClass3_33.aClass3_248;
				return local40;
			}
		}
		this.aClass3_33 = null;
		return null;
	}
}
