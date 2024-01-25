import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class67 {

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "Lclient!nd;")
	private Class4 aClass4_65;

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "Lclient!nd;")
	private Class4 aClass4_66;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	private int anInt1751 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public final int anInt1741;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "[Lclient!nd;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V")
	public Class67(@OriginalArg(0) int arg0) {
		this.anInt1741 = arg0;
		this.aClass4Array1 = new Class4[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_261 = local23;
			local23.aClass4_262 = local23;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[Lclient!nd;)I")
	public int method1423(@OriginalArg(1) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt1741; local16++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local16];
			for (@Pc(26) Class4 local26 = local23.aClass4_261; local26 != local23; local26 = local26.aClass4_261) {
				arg0[local7++] = local26;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lclient!nd;")
	public Class4 method1424() {
		@Pc(30) Class4 local30;
		if (this.anInt1751 > 0 && this.aClass4Array1[this.anInt1751 - 1] != this.aClass4_66) {
			local30 = this.aClass4_66;
			this.aClass4_66 = local30.aClass4_261;
			return local30;
		}
		while (this.anInt1741 > this.anInt1751) {
			local30 = this.aClass4Array1[this.anInt1751++].aClass4_261;
			if (local30 != this.aClass4Array1[this.anInt1751 - 1]) {
				this.aClass4_66 = local30.aClass4_261;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!nd;J)V")
	public void method1426(@OriginalArg(1) Class4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_262 != null) {
			arg0.method6059();
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) ((long) (this.anInt1741 - 1) & arg1)];
		arg0.aClass4_262 = local21.aClass4_262;
		arg0.aClass4_261 = local21;
		arg0.aClass4_262.aClass4_261 = arg0;
		arg0.aLong227 = arg1;
		arg0.aClass4_261.aClass4_262 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Lclient!nd;")
	public Class4 method1427() {
		if (this.aClass4_65 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) ((long) (this.anInt1741 - 1) & this.aLong60)];
		while (local23 != this.aClass4_65) {
			if (this.aLong60 == this.aClass4_65.aLong227) {
				@Pc(39) Class4 local39 = this.aClass4_65;
				this.aClass4_65 = this.aClass4_65.aClass4_261;
				return local39;
			}
			this.aClass4_65 = this.aClass4_65.aClass4_261;
		}
		this.aClass4_65 = null;
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Lclient!nd;")
	public Class4 method1428() {
		this.anInt1751 = 0;
		return this.method1424();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IJ)Lclient!nd;")
	public Class4 method1429(@OriginalArg(1) long arg0) {
		this.aLong60 = arg0;
		@Pc(20) Class4 local20 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt1741 - 1))];
		for (this.aClass4_65 = local20.aClass4_261; this.aClass4_65 != local20; this.aClass4_65 = this.aClass4_65.aClass4_261) {
			if (this.aClass4_65.aLong227 == arg0) {
				@Pc(35) Class4 local35 = this.aClass4_65;
				this.aClass4_65 = this.aClass4_65.aClass4_261;
				return local35;
			}
		}
		this.aClass4_65 = null;
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)I")
	public int method1430() {
		return this.anInt1741;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)V")
	public void method1431() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1741; local7++) {
			@Pc(14) Class4 local14 = this.aClass4Array1[local7];
			while (true) {
				@Pc(17) Class4 local17 = local14.aClass4_261;
				if (local17 == local14) {
					break;
				}
				local17.method6059();
			}
		}
		this.aClass4_65 = null;
		this.aClass4_66 = null;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)I")
	public int method1432() {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt1741; local16++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local16];
			@Pc(26) Class4 local26 = local23.aClass4_261;
			while (local23 != local26) {
				local26 = local26.aClass4_261;
				local14++;
			}
		}
		return local14;
	}
}
