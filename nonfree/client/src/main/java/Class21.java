import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class21 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!la;")
	private Class3 aClass3_21;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!la;")
	private Class3 aClass3_22;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	private int anInt731 = 0;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private final int anInt727;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "[Lclient!la;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this.anInt727 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_101 = local23;
			local23.aClass3_102 = local23;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(JLclient!la;B)V")
	public void method452(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_101 != null) {
			arg1.method1966();
		}
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt727 - 1))];
		arg1.aClass3_101 = local25.aClass3_101;
		arg1.aClass3_102 = local25;
		arg1.aClass3_101.aClass3_102 = arg1;
		arg1.aClass3_102.aClass3_101 = arg1;
		arg1.aLong85 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Lclient!la;")
	public Class3 method453() {
		this.anInt731 = 0;
		return this.method455();
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lclient!la;")
	private Class3 method455() {
		@Pc(22) Class3 local22;
		if (this.anInt731 > 0 && this.aClass3Array1[this.anInt731 - 1] != this.aClass3_22) {
			local22 = this.aClass3_22;
			this.aClass3_22 = local22.aClass3_102;
			return local22;
		}
		while (this.anInt727 > this.anInt731) {
			local22 = this.aClass3Array1[this.anInt731++].aClass3_102;
			if (local22 != this.aClass3Array1[this.anInt731 - 1]) {
				this.aClass3_22 = local22.aClass3_102;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Lclient!la;")
	public Class3 method456() {
		if (this.aClass3_21 == null) {
			return null;
		}
		@Pc(26) Class3 local26 = this.aClass3Array1[(int) (this.aLong24 & (long) (this.anInt727 - 1))];
		while (local26 != this.aClass3_21) {
			if (this.aLong24 == this.aClass3_21.aLong85) {
				@Pc(37) Class3 local37 = this.aClass3_21;
				this.aClass3_21 = this.aClass3_21.aClass3_102;
				return local37;
			}
			this.aClass3_21 = this.aClass3_21.aClass3_102;
		}
		this.aClass3_21 = null;
		return null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BJ)Lclient!la;")
	public Class3 method459(@OriginalArg(1) long arg0) {
		this.aLong24 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt727 - 1))];
		for (this.aClass3_21 = local18.aClass3_102; this.aClass3_21 != local18; this.aClass3_21 = this.aClass3_21.aClass3_102) {
			if (arg0 == this.aClass3_21.aLong85) {
				@Pc(32) Class3 local32 = this.aClass3_21;
				this.aClass3_21 = this.aClass3_21.aClass3_102;
				return local32;
			}
		}
		this.aClass3_21 = null;
		return null;
	}
}
