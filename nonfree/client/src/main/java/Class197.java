import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class197 {

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!pn;")
	private Class1 aClass1_207;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "Lclient!pn;")
	private Class1 aClass1_208;

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
	private int anInt6062 = 0;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "[Lclient!pn;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public final int anInt6054;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(I)V")
	public Class197(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt6054 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_251 = local23;
			local23.aClass1_252 = local23;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Lclient!pn;")
	public Class1 method5154() {
		@Pc(24) Class1 local24;
		if (this.anInt6062 > 0 && this.aClass1_208 != this.aClass1Array1[this.anInt6062 - 1]) {
			local24 = this.aClass1_208;
			this.aClass1_208 = local24.aClass1_252;
			return local24;
		}
		while (this.anInt6062 < this.anInt6054) {
			local24 = this.aClass1Array1[this.anInt6062++].aClass1_252;
			if (local24 != this.aClass1Array1[this.anInt6062 - 1]) {
				this.aClass1_208 = local24.aClass1_252;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public void method5155() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6054; local7++) {
			@Pc(14) Class1 local14 = this.aClass1Array1[local7];
			while (true) {
				@Pc(17) Class1 local17 = local14.aClass1_252;
				if (local17 == local14) {
					break;
				}
				local17.method5628();
			}
		}
		this.aClass1_208 = null;
		this.aClass1_207 = null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([Lclient!pn;Z)I")
	public int method5156(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6054; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_252; local19 != local16; local19 = local19.aClass1_252) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IJ)Lclient!pn;")
	public Class1 method5157(@OriginalArg(1) long arg0) {
		this.aLong184 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt6054 - 1) & arg0)];
		for (this.aClass1_207 = local20.aClass1_252; this.aClass1_207 != local20; this.aClass1_207 = this.aClass1_207.aClass1_252) {
			if (this.aClass1_207.aLong213 == arg0) {
				@Pc(39) Class1 local39 = this.aClass1_207;
				this.aClass1_207 = this.aClass1_207.aClass1_252;
				return local39;
			}
		}
		this.aClass1_207 = null;
		return null;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I")
	public int method5158() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6054; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			@Pc(19) Class1 local19 = local16.aClass1_252;
			while (local16 != local19) {
				local19 = local19.aClass1_252;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)I")
	public int method5159() {
		return this.anInt6054;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lclient!pn;")
	public Class1 method5160() {
		if (this.aClass1_207 == null) {
			return null;
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) ((long) (this.anInt6054 - 1) & this.aLong184)];
		while (local23 != this.aClass1_207) {
			if (this.aLong184 == this.aClass1_207.aLong213) {
				@Pc(35) Class1 local35 = this.aClass1_207;
				this.aClass1_207 = this.aClass1_207.aClass1_252;
				return local35;
			}
			this.aClass1_207 = this.aClass1_207.aClass1_252;
		}
		this.aClass1_207 = null;
		return null;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Lclient!pn;")
	public Class1 method5161() {
		this.anInt6062 = 0;
		return this.method5154();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!pn;IJ)V")
	public void method5166(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_251 != null) {
			arg0.method5628();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt6054 - 1) & arg1)];
		arg0.aClass1_252 = local21;
		arg0.aClass1_251 = local21.aClass1_251;
		arg0.aClass1_251.aClass1_252 = arg0;
		arg0.aLong213 = arg1;
		arg0.aClass1_252.aClass1_251 = arg0;
	}
}
