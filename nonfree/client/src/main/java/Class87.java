import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class87 {

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!mb;")
	private Class3 aClass3_209;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!mb;")
	private Class3 aClass3_210;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	private int anInt4271 = 0;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[Lclient!mb;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	private final int anInt4263;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
	public Class87(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt4263 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_207 = local23;
			local23.aClass3_208 = local23;
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)I")
	public int method3195() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4263; local7++) {
			@Pc(13) Class3 local13 = this.aClass3Array1[local7];
			for (@Pc(16) Class3 local16 = local13.aClass3_207; local16 != local13; local16 = local16.aClass3_207) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([Lclient!mb;B)I")
	public int method3198(@OriginalArg(0) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4263; local14++) {
			@Pc(21) Class3 local21 = this.aClass3Array1[local14];
			for (@Pc(24) Class3 local24 = local21.aClass3_207; local24 != local21; local24 = local24.aClass3_207) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Lclient!mb;")
	public Class3 method3199() {
		@Pc(24) Class3 local24;
		if (this.anInt4271 > 0 && this.aClass3_210 != this.aClass3Array1[this.anInt4271 - 1]) {
			local24 = this.aClass3_210;
			this.aClass3_210 = local24.aClass3_207;
			return local24;
		}
		while (this.anInt4263 > this.anInt4271) {
			local24 = this.aClass3Array1[this.anInt4271++].aClass3_207;
			if (this.aClass3Array1[this.anInt4271 - 1] != local24) {
				this.aClass3_210 = local24.aClass3_207;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJLclient!mb;)V")
	public void method3200(@OriginalArg(1) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_208 != null) {
			arg1.method3167();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt4263 - 1))];
		arg1.aLong144 = arg0;
		arg1.aClass3_207 = local21;
		arg1.aClass3_208 = local21.aClass3_208;
		arg1.aClass3_208.aClass3_207 = arg1;
		arg1.aClass3_207.aClass3_208 = arg1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(JB)Lclient!mb;")
	public Class3 method3201(@OriginalArg(0) long arg0) {
		this.aLong145 = arg0;
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt4263 - 1))];
		for (this.aClass3_209 = local23.aClass3_207; this.aClass3_209 != local23; this.aClass3_209 = this.aClass3_209.aClass3_207) {
			if (this.aClass3_209.aLong144 == arg0) {
				@Pc(41) Class3 local41 = this.aClass3_209;
				this.aClass3_209 = this.aClass3_209.aClass3_207;
				return local41;
			}
		}
		this.aClass3_209 = null;
		return null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lclient!mb;")
	public Class3 method3202() {
		if (this.aClass3_209 == null) {
			return null;
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt4263 - 1) & this.aLong145)];
		while (this.aClass3_209 != local21) {
			if (this.aLong145 == this.aClass3_209.aLong144) {
				@Pc(36) Class3 local36 = this.aClass3_209;
				this.aClass3_209 = this.aClass3_209.aClass3_207;
				return local36;
			}
			this.aClass3_209 = this.aClass3_209.aClass3_207;
		}
		this.aClass3_209 = null;
		return null;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)Lclient!mb;")
	public Class3 method3203() {
		this.anInt4271 = 0;
		return this.method3199();
	}
}
