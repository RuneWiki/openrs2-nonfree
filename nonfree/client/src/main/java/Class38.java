import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class38 {

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "Lclient!jp;")
	private Class1 aClass1_29;

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "Lclient!jp;")
	private Class1 aClass1_30;

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
	private int anInt1050 = 0;

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
	public final int anInt1044;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "[Lclient!jp;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I)V")
	public Class38(@OriginalArg(0) int arg0) {
		this.anInt1044 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_263 = local23;
			local23.aClass1_264 = local23;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(JI)Lclient!jp;")
	public Class1 method765(@OriginalArg(0) long arg0) {
		this.aLong30 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt1044 - 1))];
		for (this.aClass1_29 = local18.aClass1_264; this.aClass1_29 != local18; this.aClass1_29 = this.aClass1_29.aClass1_264) {
			if (arg0 == this.aClass1_29.aLong228) {
				@Pc(36) Class1 local36 = this.aClass1_29;
				this.aClass1_29 = this.aClass1_29.aClass1_264;
				return local36;
			}
		}
		this.aClass1_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!jp;JB)V")
	public void method766(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_263 != null) {
			arg0.method6178();
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) ((long) (this.anInt1044 - 1) & arg1)];
		arg0.aClass1_264 = local29;
		arg0.aClass1_263 = local29.aClass1_263;
		arg0.aClass1_263.aClass1_264 = arg0;
		arg0.aLong228 = arg1;
		arg0.aClass1_264.aClass1_263 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Lclient!jp;")
	public Class1 method767() {
		this.anInt1050 = 0;
		return this.method773();
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)I")
	public int method768() {
		return this.anInt1044;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)I")
	public int method770() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1044; local15++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local15];
			@Pc(24) Class1 local24 = local21.aClass1_264;
			while (local21 != local24) {
				local24 = local24.aClass1_264;
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[Lclient!jp;)I")
	public int method772(@OriginalArg(1) Class1[] arg0) {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1044; local12++) {
			@Pc(18) Class1 local18 = this.aClass1Array1[local12];
			for (@Pc(21) Class1 local21 = local18.aClass1_264; local21 != local18; local21 = local21.aClass1_264) {
				arg0[local10++] = local21;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)Lclient!jp;")
	public Class1 method773() {
		@Pc(20) Class1 local20;
		if (this.anInt1050 > 0 && this.aClass1_30 != this.aClass1Array1[this.anInt1050 - 1]) {
			local20 = this.aClass1_30;
			this.aClass1_30 = local20.aClass1_264;
			return local20;
		}
		while (this.anInt1050 < this.anInt1044) {
			local20 = this.aClass1Array1[this.anInt1050++].aClass1_264;
			if (this.aClass1Array1[this.anInt1050 - 1] != local20) {
				this.aClass1_30 = local20.aClass1_264;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)V")
	public void method774() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1044; local1++) {
			@Pc(7) Class1 local7 = this.aClass1Array1[local1];
			while (true) {
				@Pc(10) Class1 local10 = local7.aClass1_264;
				if (local10 == local7) {
					break;
				}
				local10.method6178();
			}
		}
		this.aClass1_29 = null;
		this.aClass1_30 = null;
	}

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)Lclient!jp;")
	public Class1 method775() {
		if (this.aClass1_29 == null) {
			return null;
		}
		@Pc(26) Class1 local26 = this.aClass1Array1[(int) (this.aLong30 & (long) (this.anInt1044 - 1))];
		while (local26 != this.aClass1_29) {
			if (this.aClass1_29.aLong228 == this.aLong30) {
				@Pc(37) Class1 local37 = this.aClass1_29;
				this.aClass1_29 = this.aClass1_29.aClass1_264;
				return local37;
			}
			this.aClass1_29 = this.aClass1_29.aClass1_264;
		}
		this.aClass1_29 = null;
		return null;
	}
}
