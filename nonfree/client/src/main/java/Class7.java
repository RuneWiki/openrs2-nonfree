import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class7 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!q;")
	private Class2 aClass2_15;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Lclient!q;")
	private Class2 aClass2_16;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	private int anInt322 = 0;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	private final int anInt317;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "[Lclient!q;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
	public Class7(@OriginalArg(0) int arg0) {
		this.anInt317 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_95 = local23;
			local23.aClass2_96 = local23;
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lclient!q;")
	public Class2 method162() {
		this.anInt322 = 0;
		return this.method163();
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Lclient!q;")
	private Class2 method163() {
		@Pc(26) Class2 local26;
		if (this.anInt322 > 0 && this.aClass2Array1[this.anInt322 - 1] != this.aClass2_16) {
			local26 = this.aClass2_16;
			this.aClass2_16 = local26.aClass2_96;
			return local26;
		}
		while (this.anInt322 < this.anInt317) {
			local26 = this.aClass2Array1[this.anInt322++].aClass2_96;
			if (this.aClass2Array1[this.anInt322 - 1] != local26) {
				this.aClass2_16 = local26.aClass2_96;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lclient!q;")
	public Class2 method164() {
		if (this.aClass2_15 == null) {
			return null;
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) (this.aLong18 & (long) (this.anInt317 - 1))];
		while (local28 != this.aClass2_15) {
			if (this.aClass2_15.aLong82 == this.aLong18) {
				@Pc(39) Class2 local39 = this.aClass2_15;
				this.aClass2_15 = this.aClass2_15.aClass2_96;
				return local39;
			}
			this.aClass2_15 = this.aClass2_15.aClass2_96;
		}
		this.aClass2_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BJ)Lclient!q;")
	public Class2 method165(@OriginalArg(1) long arg0) {
		this.aLong18 = arg0;
		@Pc(14) Class2 local14 = this.aClass2Array1[(int) ((long) (this.anInt317 - 1) & arg0)];
		for (this.aClass2_15 = local14.aClass2_96; this.aClass2_15 != local14; this.aClass2_15 = this.aClass2_15.aClass2_96) {
			if (arg0 == this.aClass2_15.aLong82) {
				@Pc(32) Class2 local32 = this.aClass2_15;
				this.aClass2_15 = this.aClass2_15.aClass2_96;
				return local32;
			}
		}
		this.aClass2_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(JLclient!q;I)V")
	public void method167(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_95 != null) {
			arg1.method1794();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt317 - 1))];
		arg1.aClass2_96 = local21;
		arg1.aLong82 = arg0;
		arg1.aClass2_95 = local21.aClass2_95;
		arg1.aClass2_95.aClass2_96 = arg1;
		arg1.aClass2_96.aClass2_95 = arg1;
	}
}
