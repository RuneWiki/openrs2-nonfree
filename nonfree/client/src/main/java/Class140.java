import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class140 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Lclient!ie;")
	private Class3 aClass3_170;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!ie;")
	private Class3 aClass3_171;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
	private int anInt4121 = 0;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public final int anInt4111;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "[Lclient!ie;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(I)V")
	public Class140(@OriginalArg(0) int arg0) {
		this.anInt4111 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_268 = local23;
			local23.aClass3_267 = local23;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[Lclient!ie;)I")
	public int method3484(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4111; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_268; local19 != local16; local19 = local19.aClass3_268) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Lclient!ie;")
	public Class3 method3485() {
		if (this.anInt4121 > 0 && this.aClass3Array1[this.anInt4121 - 1] != this.aClass3_171) {
			@Pc(21) Class3 local21 = this.aClass3_171;
			this.aClass3_171 = local21.aClass3_268;
			return local21;
		}
		while (this.anInt4121 < this.anInt4111) {
			@Pc(49) Class3 local49 = this.aClass3Array1[this.anInt4121++].aClass3_268;
			if (this.aClass3Array1[this.anInt4121 - 1] != local49) {
				this.aClass3_171 = local49.aClass3_268;
				return local49;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Lclient!ie;")
	public Class3 method3486() {
		this.anInt4121 = 0;
		return this.method3485();
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
	public int method3487() {
		return this.anInt4111;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
	public void method3488() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4111; local3++) {
			@Pc(10) Class3 local10 = this.aClass3Array1[local3];
			while (true) {
				@Pc(13) Class3 local13 = local10.aClass3_268;
				if (local10 == local13) {
					break;
				}
				local13.method6288();
			}
		}
		this.aClass3_171 = null;
		this.aClass3_170 = null;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(JZ)Lclient!ie;")
	public Class3 method3490(@OriginalArg(0) long arg0) {
		this.aLong145 = arg0;
		@Pc(20) Class3 local20 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt4111 - 1))];
		for (this.aClass3_170 = local20.aClass3_268; this.aClass3_170 != local20; this.aClass3_170 = this.aClass3_170.aClass3_268) {
			if (this.aClass3_170.aLong248 == arg0) {
				@Pc(39) Class3 local39 = this.aClass3_170;
				this.aClass3_170 = this.aClass3_170.aClass3_268;
				return local39;
			}
		}
		this.aClass3_170 = null;
		return null;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)Lclient!ie;")
	public Class3 method3491() {
		if (this.aClass3_170 == null) {
			return null;
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) ((long) (this.anInt4111 - 1) & this.aLong145)];
		while (local23 != this.aClass3_170) {
			if (this.aLong145 == this.aClass3_170.aLong248) {
				@Pc(39) Class3 local39 = this.aClass3_170;
				this.aClass3_170 = this.aClass3_170.aClass3_268;
				return local39;
			}
			this.aClass3_170 = this.aClass3_170.aClass3_268;
		}
		this.aClass3_170 = null;
		return null;
	}

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)I")
	public int method3492() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4111; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_268; local19 != local16; local19 = local19.aClass3_268) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(JILclient!ie;)V")
	public void method3494(@OriginalArg(0) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_267 != null) {
			arg1.method6288();
		}
		@Pc(27) Class3 local27 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt4111 - 1))];
		arg1.aClass3_268 = local27;
		arg1.aClass3_267 = local27.aClass3_267;
		arg1.aClass3_267.aClass3_268 = arg1;
		arg1.aLong248 = arg0;
		arg1.aClass3_268.aClass3_267 = arg1;
	}
}
