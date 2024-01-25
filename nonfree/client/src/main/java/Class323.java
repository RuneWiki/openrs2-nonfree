import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class323 {

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "J")
	private long aLong233;

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "Lclient!dfa;")
	private Class2 aClass2_246;

	@OriginalMember(owner = "client!tba", name = "r", descriptor = "Lclient!dfa;")
	private Class2 aClass2_247;

	@OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
	private int anInt8687 = 0;

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "[Lclient!dfa;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
	public final int anInt8680;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(I)V")
	public Class323(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt8680 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_300 = local23;
			local23.aClass2_299 = local23;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "([Lclient!dfa;I)I")
	public int method7476(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt8680; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			for (@Pc(24) Class2 local24 = local21.aClass2_300; local24 != local21; local24 = local24.aClass2_300) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!dfa;JI)V")
	public void method7477(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_299 != null) {
			arg0.method8920();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt8680 - 1) & arg1)];
		arg0.aClass2_300 = local21;
		arg0.aClass2_299 = local21.aClass2_299;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
		arg0.aLong278 = arg1;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)I")
	public int method7478() {
		return this.anInt8680;
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Lclient!dfa;")
	public Class2 method7480() {
		this.anInt8687 = 0;
		return this.method7482();
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)Lclient!dfa;")
	public Class2 method7482() {
		@Pc(29) Class2 local29;
		if (this.anInt8687 > 0 && this.aClass2_247 != this.aClass2Array1[this.anInt8687 - 1]) {
			local29 = this.aClass2_247;
			this.aClass2_247 = local29.aClass2_300;
			return local29;
		}
		while (this.anInt8687 < this.anInt8680) {
			local29 = this.aClass2Array1[this.anInt8687++].aClass2_300;
			if (local29 != this.aClass2Array1[this.anInt8687 - 1]) {
				this.aClass2_247 = local29.aClass2_300;
				return local29;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)I")
	public int method7483() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt8680; local13++) {
			@Pc(19) Class2 local19 = this.aClass2Array1[local13];
			@Pc(22) Class2 local22 = local19.aClass2_300;
			while (local22 != local19) {
				local22 = local22.aClass2_300;
				local11++;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(JI)Lclient!dfa;")
	public Class2 method7484(@OriginalArg(0) long arg0) {
		this.aLong233 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) ((long) (this.anInt8680 - 1) & arg0)];
		for (this.aClass2_246 = local18.aClass2_300; this.aClass2_246 != local18; this.aClass2_246 = this.aClass2_246.aClass2_300) {
			if (arg0 == this.aClass2_246.aLong278) {
				@Pc(41) Class2 local41 = this.aClass2_246;
				this.aClass2_246 = this.aClass2_246.aClass2_300;
				return local41;
			}
		}
		this.aClass2_246 = null;
		return null;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V")
	public void method7485() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8680; local1++) {
			@Pc(10) Class2 local10 = this.aClass2Array1[local1];
			while (true) {
				@Pc(13) Class2 local13 = local10.aClass2_300;
				if (local10 == local13) {
					break;
				}
				local13.method8920();
			}
		}
		this.aClass2_247 = null;
		this.aClass2_246 = null;
	}

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)Lclient!dfa;")
	public Class2 method7486() {
		if (this.aClass2_246 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (this.aLong233 & (long) (this.anInt8680 - 1))];
		while (local21 != this.aClass2_246) {
			if (this.aClass2_246.aLong278 == this.aLong233) {
				@Pc(40) Class2 local40 = this.aClass2_246;
				this.aClass2_246 = this.aClass2_246.aClass2_300;
				return local40;
			}
			this.aClass2_246 = this.aClass2_246.aClass2_300;
		}
		this.aClass2_246 = null;
		return null;
	}
}
