import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class14 {

	@OriginalMember(owner = "client!db", name = "h", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!w;")
	private Class3 aClass3_15;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Lclient!w;")
	private Class3 aClass3_16;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt429 = 0;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "[Lclient!w;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	private final int anInt423;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
	public Class14(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt423 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_95 = local23;
			local23.aClass3_96 = local23;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!w;")
	public Class3 method315() {
		if (this.aClass3_15 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) (this.aLong18 & (long) (this.anInt423 - 1))];
		while (local28 != this.aClass3_15) {
			if (this.aClass3_15.aLong83 == this.aLong18) {
				@Pc(39) Class3 local39 = this.aClass3_15;
				this.aClass3_15 = this.aClass3_15.aClass3_95;
				return local39;
			}
			this.aClass3_15 = this.aClass3_15.aClass3_95;
		}
		this.aClass3_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)Lclient!w;")
	public Class3 method316() {
		this.anInt429 = 0;
		return this.method318();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)Lclient!w;")
	public Class3 method317(@OriginalArg(1) long arg0) {
		this.aLong18 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) ((long) (this.anInt423 - 1) & arg0)];
		for (this.aClass3_15 = local18.aClass3_95; this.aClass3_15 != local18; this.aClass3_15 = this.aClass3_15.aClass3_95) {
			if (this.aClass3_15.aLong83 == arg0) {
				@Pc(32) Class3 local32 = this.aClass3_15;
				this.aClass3_15 = this.aClass3_15.aClass3_95;
				return local32;
			}
		}
		this.aClass3_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lclient!w;")
	private Class3 method318() {
		@Pc(20) Class3 local20;
		if (this.anInt429 > 0 && this.aClass3Array1[this.anInt429 - 1] != this.aClass3_16) {
			local20 = this.aClass3_16;
			this.aClass3_16 = local20.aClass3_95;
			return local20;
		}
		while (this.anInt423 > this.anInt429) {
			local20 = this.aClass3Array1[this.anInt429++].aClass3_95;
			if (this.aClass3Array1[this.anInt429 - 1] != local20) {
				this.aClass3_16 = local20.aClass3_95;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(JLclient!w;I)V")
	public void method321(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_96 != null) {
			arg1.method1883();
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt423 - 1))];
		arg1.aLong83 = arg0;
		arg1.aClass3_96 = local23.aClass3_96;
		arg1.aClass3_95 = local23;
		arg1.aClass3_96.aClass3_95 = arg1;
		arg1.aClass3_95.aClass3_96 = arg1;
	}
}
