import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class17 {

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Lclient!um;")
	private Class1 aClass1_37;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!um;")
	private Class1 aClass1_38;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	private int anInt719 = 0;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "[Lclient!um;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	public final int anInt715;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt715 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_284 = local23;
			local23.aClass1_283 = local23;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public void method734() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt715; local11++) {
			@Pc(18) Class1 local18 = this.aClass1Array1[local11];
			while (true) {
				@Pc(21) Class1 local21 = local18.aClass1_284;
				if (local21 == local18) {
					break;
				}
				local21.method7525();
			}
		}
		this.aClass1_37 = null;
		this.aClass1_38 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!um;")
	public Class1 method735() {
		this.anInt719 = 0;
		return this.method740();
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I")
	public int method736() {
		return this.anInt715;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!um;J)V")
	public void method737(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_283 != null) {
			arg0.method7525();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt715 - 1))];
		arg0.aClass1_284 = local21;
		arg0.aClass1_283 = local21.aClass1_283;
		arg0.aClass1_283.aClass1_284 = arg0;
		arg0.aClass1_284.aClass1_283 = arg0;
		arg0.aLong392 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(JB)Lclient!um;")
	public Class1 method738(@OriginalArg(0) long arg0) {
		this.aLong48 = arg0;
		@Pc(24) Class1 local24 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt715 - 1))];
		for (this.aClass1_37 = local24.aClass1_284; this.aClass1_37 != local24; this.aClass1_37 = this.aClass1_37.aClass1_284) {
			if (arg0 == this.aClass1_37.aLong392) {
				@Pc(38) Class1 local38 = this.aClass1_37;
				this.aClass1_37 = this.aClass1_37.aClass1_284;
				return local38;
			}
		}
		this.aClass1_37 = null;
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([Lclient!um;B)I")
	public int method739(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt715; local16++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local16];
			for (@Pc(26) Class1 local26 = local23.aClass1_284; local26 != local23; local26 = local26.aClass1_284) {
				arg0[local7++] = local26;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)Lclient!um;")
	public Class1 method740() {
		@Pc(24) Class1 local24;
		if (this.anInt719 > 0 && this.aClass1Array1[this.anInt719 - 1] != this.aClass1_38) {
			local24 = this.aClass1_38;
			this.aClass1_38 = local24.aClass1_284;
			return local24;
		}
		while (this.anInt719 < this.anInt715) {
			local24 = this.aClass1Array1[this.anInt719++].aClass1_284;
			if (this.aClass1Array1[this.anInt719 - 1] != local24) {
				this.aClass1_38 = local24.aClass1_284;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)I")
	public int method742() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt715; local14++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local14];
			@Pc(24) Class1 local24 = local21.aClass1_284;
			while (local24 != local21) {
				local24 = local24.aClass1_284;
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Lclient!um;")
	public Class1 method743() {
		if (this.aClass1_37 == null) {
			return null;
		}
		@Pc(28) Class1 local28 = this.aClass1Array1[(int) (this.aLong48 & (long) (this.anInt715 - 1))];
		while (this.aClass1_37 != local28) {
			if (this.aLong48 == this.aClass1_37.aLong392) {
				@Pc(40) Class1 local40 = this.aClass1_37;
				this.aClass1_37 = this.aClass1_37.aClass1_284;
				return local40;
			}
			this.aClass1_37 = this.aClass1_37.aClass1_284;
		}
		this.aClass1_37 = null;
		return null;
	}
}
