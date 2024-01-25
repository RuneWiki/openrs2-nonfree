import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class190 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Lclient!vi;")
	private Class5 aClass5_223;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "Lclient!vi;")
	private Class5 aClass5_224;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	private int anInt6092 = 0;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	public final int anInt6080;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "[Lclient!vi;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
	public Class190(@OriginalArg(0) int arg0) {
		this.anInt6080 = arg0;
		this.aClass5Array1 = new Class5[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_252 = local23;
			local23.aClass5_251 = local23;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[Lclient!vi;)I")
	public int method5461(@OriginalArg(1) Class5[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6080; local15++) {
			@Pc(22) Class5 local22 = this.aClass5Array1[local15];
			for (@Pc(25) Class5 local25 = local22.aClass5_251; local25 != local22; local25 = local25.aClass5_251) {
				arg0[local7++] = local25;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I")
	public int method5463() {
		return this.anInt6080;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!vi;J)V")
	public void method5464(@OriginalArg(1) Class5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass5_252 != null) {
			arg0.method6005();
		}
		@Pc(25) Class5 local25 = this.aClass5Array1[(int) ((long) (this.anInt6080 - 1) & arg1)];
		arg0.aClass5_252 = local25.aClass5_252;
		arg0.aClass5_251 = local25;
		arg0.aClass5_252.aClass5_251 = arg0;
		arg0.aClass5_251.aClass5_252 = arg0;
		arg0.aLong235 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Lclient!vi;")
	public Class5 method5465() {
		@Pc(27) Class5 local27;
		if (this.anInt6092 > 0 && this.aClass5_224 != this.aClass5Array1[this.anInt6092 - 1]) {
			local27 = this.aClass5_224;
			this.aClass5_224 = local27.aClass5_251;
			return local27;
		}
		while (this.anInt6080 > this.anInt6092) {
			local27 = this.aClass5Array1[this.anInt6092++].aClass5_251;
			if (this.aClass5Array1[this.anInt6092 - 1] != local27) {
				this.aClass5_224 = local27.aClass5_251;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BJ)Lclient!vi;")
	public Class5 method5466(@OriginalArg(1) long arg0) {
		this.aLong212 = arg0;
		@Pc(18) Class5 local18 = this.aClass5Array1[(int) ((long) (this.anInt6080 - 1) & arg0)];
		for (this.aClass5_223 = local18.aClass5_251; this.aClass5_223 != local18; this.aClass5_223 = this.aClass5_223.aClass5_251) {
			if (arg0 == this.aClass5_223.aLong235) {
				@Pc(32) Class5 local32 = this.aClass5_223;
				this.aClass5_223 = this.aClass5_223.aClass5_251;
				return local32;
			}
		}
		this.aClass5_223 = null;
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Lclient!vi;")
	public Class5 method5467() {
		if (this.aClass5_223 == null) {
			return null;
		}
		@Pc(26) Class5 local26 = this.aClass5Array1[(int) ((long) (this.anInt6080 - 1) & this.aLong212)];
		while (local26 != this.aClass5_223) {
			if (this.aClass5_223.aLong235 == this.aLong212) {
				@Pc(41) Class5 local41 = this.aClass5_223;
				this.aClass5_223 = this.aClass5_223.aClass5_251;
				return local41;
			}
			this.aClass5_223 = this.aClass5_223.aClass5_251;
		}
		this.aClass5_223 = null;
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Lclient!vi;")
	public Class5 method5471() {
		this.anInt6092 = 0;
		return this.method5465();
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V")
	public void method5472() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6080; local1++) {
			@Pc(7) Class5 local7 = this.aClass5Array1[local1];
			while (true) {
				@Pc(10) Class5 local10 = local7.aClass5_251;
				if (local10 == local7) {
					break;
				}
				local10.method6005();
			}
		}
		this.aClass5_223 = null;
		this.aClass5_224 = null;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)I")
	public int method5473() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6080; local7++) {
			@Pc(21) Class5 local21 = this.aClass5Array1[local7];
			for (@Pc(24) Class5 local24 = local21.aClass5_251; local24 != local21; local24 = local24.aClass5_251) {
				local5++;
			}
		}
		return local5;
	}
}
