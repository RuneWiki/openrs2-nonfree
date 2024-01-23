import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class163 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!te;")
	private Class4 aClass4_211;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "Lclient!te;")
	private Class4 aClass4_212;

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
	private int anInt5227 = 0;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "[Lclient!te;")
	public Class4[] aClass4Array1;

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
	public int anInt5223;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(I)V")
	public Class163(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt5223 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class4 local29 = this.aClass4Array1[local13] = new Class4();
			local29.aClass4_233 = local29;
			local29.aClass4_232 = local29;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
	public int method4179() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt5223; local16++) {
			@Pc(29) Class4 local29 = this.aClass4Array1[local16];
			@Pc(32) Class4 local32 = local29.aClass4_233;
			while (local32 != local29) {
				local32 = local32.aClass4_233;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(JLclient!te;I)V")
	public void method4181(@OriginalArg(0) long arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_232 != null) {
			arg1.method4690();
		}
		@Pc(24) Class4 local24 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt5223 - 1))];
		arg1.aClass4_232 = local24.aClass4_232;
		arg1.aLong211 = arg0;
		arg1.aClass4_233 = local24;
		arg1.aClass4_232.aClass4_233 = arg1;
		arg1.aClass4_233.aClass4_232 = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Lclient!te;")
	public Class4 method4182() {
		if (this.aClass4_211 == null) {
			return null;
		}
		@Pc(28) Class4 local28 = this.aClass4Array1[(int) (this.aLong188 & (long) (this.anInt5223 - 1))];
		while (this.aClass4_211 != local28) {
			if (this.aLong188 == this.aClass4_211.aLong211) {
				@Pc(42) Class4 local42 = this.aClass4_211;
				this.aClass4_211 = this.aClass4_211.aClass4_233;
				return local42;
			}
			this.aClass4_211 = this.aClass4_211.aClass4_233;
		}
		this.aClass4_211 = null;
		return null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lclient!te;")
	public Class4 method4183() {
		@Pc(28) Class4 local28;
		if (this.anInt5227 > 0 && this.aClass4_212 != this.aClass4Array1[this.anInt5227 - 1]) {
			local28 = this.aClass4_212;
			this.aClass4_212 = local28.aClass4_233;
			return local28;
		}
		do {
			if (this.anInt5227 >= this.anInt5223) {
				return null;
			}
			local28 = this.aClass4Array1[this.anInt5227++].aClass4_233;
		} while (this.aClass4Array1[this.anInt5227 - 1] == local28);
		this.aClass4_212 = local28.aClass4_233;
		return local28;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[Lclient!te;)I")
	public int method4187(@OriginalArg(1) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5223; local9++) {
			@Pc(22) Class4 local22 = this.aClass4Array1[local9];
			for (@Pc(25) Class4 local25 = local22.aClass4_233; local25 != local22; local25 = local25.aClass4_233) {
				arg0[local7++] = local25;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(JZ)Lclient!te;")
	public Class4 method4188(@OriginalArg(0) long arg0) {
		this.aLong188 = arg0;
		@Pc(20) Class4 local20 = this.aClass4Array1[(int) ((long) (this.anInt5223 - 1) & arg0)];
		for (this.aClass4_211 = local20.aClass4_233; this.aClass4_211 != local20; this.aClass4_211 = this.aClass4_211.aClass4_233) {
			if (this.aClass4_211.aLong211 == arg0) {
				@Pc(42) Class4 local42 = this.aClass4_211;
				this.aClass4_211 = this.aClass4_211.aClass4_233;
				return local42;
			}
		}
		this.aClass4_211 = null;
		return null;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I")
	public int method4189() {
		return this.anInt5223;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
	public void method4190() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5223; local7++) {
			@Pc(16) Class4 local16 = this.aClass4Array1[local7];
			while (true) {
				@Pc(19) Class4 local19 = local16.aClass4_233;
				if (local16 == local19) {
					break;
				}
				local19.method4690();
			}
		}
		this.aClass4_212 = null;
		this.aClass4_211 = null;
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Lclient!te;")
	public Class4 method4192() {
		this.anInt5227 = 0;
		return this.method4183();
	}
}
