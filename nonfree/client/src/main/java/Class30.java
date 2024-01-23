import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class30 {

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!wk;")
	private Class3 aClass3_32;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "Lclient!wk;")
	private Class3 aClass3_33;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
	private int anInt825 = 0;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "[Lclient!wk;")
	public Class3[] aClass3Array1;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(I)V")
	public Class30(@OriginalArg(0) int arg0) {
		this.anInt818 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(25) Class3 local25 = this.aClass3Array1[local13] = new Class3();
			local25.aClass3_233 = local25;
			local25.aClass3_232 = local25;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BJ)Lclient!wk;")
	public Class3 method663(@OriginalArg(1) long arg0) {
		this.aLong28 = arg0;
		@Pc(27) Class3 local27 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt818 - 1))];
		for (this.aClass3_32 = local27.aClass3_232; this.aClass3_32 != local27; this.aClass3_32 = this.aClass3_32.aClass3_232) {
			if (this.aClass3_32.aLong243 == arg0) {
				@Pc(44) Class3 local44 = this.aClass3_32;
				this.aClass3_32 = this.aClass3_32.aClass3_232;
				return local44;
			}
		}
		this.aClass3_32 = null;
		return null;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Lclient!wk;")
	public Class3 method664() {
		this.anInt825 = 0;
		return this.method671();
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I")
	public int method665() {
		return this.anInt818;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	public void method667() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt818; local9++) {
			@Pc(18) Class3 local18 = this.aClass3Array1[local9];
			while (true) {
				@Pc(21) Class3 local21 = local18.aClass3_232;
				if (local18 == local21) {
					break;
				}
				local21.method5013();
			}
		}
		this.aClass3_32 = null;
		this.aClass3_33 = null;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!wk;JI)V")
	public void method668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_233 != null) {
			arg0.method5013();
		}
		@Pc(31) Class3 local31 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt818 - 1))];
		arg0.aLong243 = arg1;
		arg0.aClass3_233 = local31.aClass3_233;
		arg0.aClass3_232 = local31;
		arg0.aClass3_233.aClass3_232 = arg0;
		arg0.aClass3_232.aClass3_233 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)Lclient!wk;")
	public Class3 method670() {
		if (this.aClass3_32 == null) {
			return null;
		}
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) ((long) (this.anInt818 - 1) & this.aLong28)];
		while (this.aClass3_32 != local25) {
			if (this.aClass3_32.aLong243 == this.aLong28) {
				@Pc(43) Class3 local43 = this.aClass3_32;
				this.aClass3_32 = this.aClass3_32.aClass3_232;
				return local43;
			}
			this.aClass3_32 = this.aClass3_32.aClass3_232;
		}
		this.aClass3_32 = null;
		return null;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)Lclient!wk;")
	public Class3 method671() {
		@Pc(22) Class3 local22;
		if (this.anInt825 > 0 && this.aClass3Array1[this.anInt825 - 1] != this.aClass3_33) {
			local22 = this.aClass3_33;
			this.aClass3_33 = local22.aClass3_232;
			return local22;
		}
		do {
			if (this.anInt818 <= this.anInt825) {
				return null;
			}
			local22 = this.aClass3Array1[this.anInt825++].aClass3_232;
		} while (local22 == this.aClass3Array1[this.anInt825 - 1]);
		this.aClass3_33 = local22.aClass3_232;
		return local22;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([Lclient!wk;I)I")
	public int method672(@OriginalArg(0) Class3[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt818; local15++) {
			@Pc(24) Class3 local24 = this.aClass3Array1[local15];
			for (@Pc(27) Class3 local27 = local24.aClass3_232; local27 != local24; local27 = local27.aClass3_232) {
				arg0[local13++] = local27;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)I")
	public int method673() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt818; local9++) {
			@Pc(18) Class3 local18 = this.aClass3Array1[local9];
			@Pc(21) Class3 local21 = local18.aClass3_232;
			while (local21 != local18) {
				local21 = local21.aClass3_232;
				local7++;
			}
		}
		return local7;
	}
}
