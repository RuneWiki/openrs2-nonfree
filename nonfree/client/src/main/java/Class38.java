import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class38 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "Lclient!gk;")
	private Class1 aClass1_71;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "Lclient!gk;")
	private Class1 aClass1_72;

	@OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
	private int anInt1511 = 0;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
	public final int anInt1510;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "[Lclient!gk;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
	public Class38(@OriginalArg(0) int arg0) {
		this.anInt1510 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_251 = local23;
			local23.aClass1_252 = local23;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public void method1466() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt1510; local13++) {
			@Pc(20) Class1 local20 = this.aClass1Array1[local13];
			while (true) {
				@Pc(23) Class1 local23 = local20.aClass1_251;
				if (local20 == local23) {
					break;
				}
				local23.method6045();
			}
		}
		this.aClass1_71 = null;
		this.aClass1_72 = null;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)I")
	public int method1468() {
		return this.anInt1510;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([Lclient!gk;I)I")
	public int method1469(@OriginalArg(0) Class1[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1510; local15++) {
			@Pc(22) Class1 local22 = this.aClass1Array1[local15];
			for (@Pc(25) Class1 local25 = local22.aClass1_251; local25 != local22; local25 = local25.aClass1_251) {
				arg0[local13++] = local25;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)Lclient!gk;")
	public Class1 method1470() {
		@Pc(29) Class1 local29;
		if (this.anInt1511 > 0 && this.aClass1Array1[this.anInt1511 - 1] != this.aClass1_72) {
			local29 = this.aClass1_72;
			this.aClass1_72 = local29.aClass1_251;
			return local29;
		}
		while (this.anInt1511 < this.anInt1510) {
			local29 = this.aClass1Array1[this.anInt1511++].aClass1_251;
			if (this.aClass1Array1[this.anInt1511 - 1] != local29) {
				this.aClass1_72 = local29.aClass1_251;
				return local29;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!gk;J)V")
	public void method1472(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_252 != null) {
			arg0.method6045();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt1510 - 1) & arg1)];
		arg0.aClass1_251 = local21;
		arg0.aClass1_252 = local21.aClass1_252;
		arg0.aClass1_252.aClass1_251 = arg0;
		arg0.aClass1_251.aClass1_252 = arg0;
		arg0.aLong217 = arg1;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Lclient!gk;")
	public Class1 method1474() {
		this.anInt1511 = 0;
		return this.method1470();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(JI)Lclient!gk;")
	public Class1 method1475(@OriginalArg(0) long arg0) {
		this.aLong56 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt1510 - 1) & arg0)];
		for (this.aClass1_71 = local20.aClass1_251; this.aClass1_71 != local20; this.aClass1_71 = this.aClass1_71.aClass1_251) {
			if (arg0 == this.aClass1_71.aLong217) {
				@Pc(35) Class1 local35 = this.aClass1_71;
				this.aClass1_71 = this.aClass1_71.aClass1_251;
				return local35;
			}
		}
		this.aClass1_71 = null;
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)Lclient!gk;")
	public Class1 method1477() {
		if (this.aClass1_71 == null) {
			return null;
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) (this.aLong56 & (long) (this.anInt1510 - 1))];
		while (this.aClass1_71 != local23) {
			if (this.aLong56 == this.aClass1_71.aLong217) {
				@Pc(39) Class1 local39 = this.aClass1_71;
				this.aClass1_71 = this.aClass1_71.aClass1_251;
				return local39;
			}
			this.aClass1_71 = this.aClass1_71.aClass1_251;
		}
		this.aClass1_71 = null;
		return null;
	}

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)I")
	public int method1478() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1510; local9++) {
			@Pc(22) Class1 local22 = this.aClass1Array1[local9];
			@Pc(25) Class1 local25 = local22.aClass1_251;
			while (local22 != local25) {
				local25 = local25.aClass1_251;
				local7++;
			}
		}
		return local7;
	}
}
