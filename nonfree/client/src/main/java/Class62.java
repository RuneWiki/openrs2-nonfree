import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cja")
public final class Class62 {

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "Lclient!wk;")
	private Class3 aClass3_61;

	@OriginalMember(owner = "client!cja", name = "e", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!cja", name = "r", descriptor = "Lclient!wk;")
	private Class3 aClass3_62;

	@OriginalMember(owner = "client!cja", name = "s", descriptor = "I")
	private int anInt1768 = 0;

	@OriginalMember(owner = "client!cja", name = "h", descriptor = "I")
	public final int anInt1761;

	@OriginalMember(owner = "client!cja", name = "n", descriptor = "[Lclient!wk;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(I)V")
	public Class62(@OriginalArg(0) int arg0) {
		this.anInt1761 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_338 = local23;
			local23.aClass3_337 = local23;
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)Lclient!wk;")
	public Class3 method1680() {
		this.anInt1768 = 0;
		return this.method1681();
	}

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)Lclient!wk;")
	public Class3 method1681() {
		@Pc(21) Class3 local21;
		if (this.anInt1768 > 0 && this.aClass3_62 != this.aClass3Array1[this.anInt1768 - 1]) {
			local21 = this.aClass3_62;
			this.aClass3_62 = local21.aClass3_337;
			return local21;
		}
		while (this.anInt1761 > this.anInt1768) {
			local21 = this.aClass3Array1[this.anInt1768++].aClass3_337;
			if (local21 != this.aClass3Array1[this.anInt1768 - 1]) {
				this.aClass3_62 = local21.aClass3_337;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(JI)Lclient!wk;")
	public Class3 method1682(@OriginalArg(0) long arg0) {
		this.aLong52 = arg0;
		@Pc(20) Class3 local20 = this.aClass3Array1[(int) ((long) (this.anInt1761 - 1) & arg0)];
		for (this.aClass3_61 = local20.aClass3_337; this.aClass3_61 != local20; this.aClass3_61 = this.aClass3_61.aClass3_337) {
			if (this.aClass3_61.aLong309 == arg0) {
				@Pc(39) Class3 local39 = this.aClass3_61;
				this.aClass3_61 = this.aClass3_61.aClass3_337;
				return local39;
			}
		}
		this.aClass3_61 = null;
		return null;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V")
	public void method1683() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1761; local7++) {
			@Pc(21) Class3 local21 = this.aClass3Array1[local7];
			while (true) {
				@Pc(24) Class3 local24 = local21.aClass3_337;
				if (local21 == local24) {
					break;
				}
				local24.method8770();
			}
		}
		this.aClass3_62 = null;
		this.aClass3_61 = null;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Z)I")
	public int method1684() {
		return this.anInt1761;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(JLclient!wk;B)V")
	public void method1686(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_338 != null) {
			arg1.method8770();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt1761 - 1))];
		arg1.aClass3_337 = local21;
		arg1.aClass3_338 = local21.aClass3_338;
		arg1.aClass3_338.aClass3_337 = arg1;
		arg1.aLong309 = arg0;
		arg1.aClass3_337.aClass3_338 = arg1;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "([Lclient!wk;I)I")
	public int method1687(@OriginalArg(0) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1761; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_337; local19 != local16; local19 = local19.aClass3_337) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cja", name = "d", descriptor = "(I)I")
	public int method1688() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1761; local17++) {
			@Pc(24) Class3 local24 = this.aClass3Array1[local17];
			@Pc(27) Class3 local27 = local24.aClass3_337;
			while (local27 != local24) {
				local27 = local27.aClass3_337;
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(B)Lclient!wk;")
	public Class3 method1689() {
		if (this.aClass3_61 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) ((long) (this.anInt1761 - 1) & this.aLong52)];
		while (this.aClass3_61 != local28) {
			if (this.aLong52 == this.aClass3_61.aLong309) {
				@Pc(40) Class3 local40 = this.aClass3_61;
				this.aClass3_61 = this.aClass3_61.aClass3_337;
				return local40;
			}
			this.aClass3_61 = this.aClass3_61.aClass3_337;
		}
		this.aClass3_61 = null;
		return null;
	}
}
