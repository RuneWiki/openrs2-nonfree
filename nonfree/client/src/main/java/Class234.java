import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class234 {

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Lclient!ia;")
	private Class6 aClass6_186;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Lclient!ia;")
	private Class6 aClass6_187;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	private int anInt6761 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "[Lclient!ia;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
	public final int anInt6758;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V")
	public Class234(@OriginalArg(0) int arg0) {
		this.aClass6Array1 = new Class6[arg0];
		this.anInt6758 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_283 = local23;
			local23.aClass6_284 = local23;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I")
	public int method5460() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6758; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_284; local19 != local16; local19 = local19.aClass6_284) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)I")
	public int method5461() {
		return this.anInt6758;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B[Lclient!ia;)I")
	public int method5462(@OriginalArg(1) Class6[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6758; local15++) {
			@Pc(22) Class6 local22 = this.aClass6Array1[local15];
			for (@Pc(25) Class6 local25 = local22.aClass6_284; local25 != local22; local25 = local25.aClass6_284) {
				arg0[local13++] = local25;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	public void method5463() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6758; local7++) {
			@Pc(14) Class6 local14 = this.aClass6Array1[local7];
			while (true) {
				@Pc(17) Class6 local17 = local14.aClass6_284;
				if (local14 == local17) {
					break;
				}
				local17.method7948();
			}
		}
		this.aClass6_187 = null;
		this.aClass6_186 = null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IJ)Lclient!ia;")
	public Class6 method5464(@OriginalArg(1) long arg0) {
		this.aLong172 = arg0;
		@Pc(25) Class6 local25 = this.aClass6Array1[(int) ((long) (this.anInt6758 - 1) & arg0)];
		for (this.aClass6_186 = local25.aClass6_284; this.aClass6_186 != local25; this.aClass6_186 = this.aClass6_186.aClass6_284) {
			if (arg0 == this.aClass6_186.aLong245) {
				@Pc(40) Class6 local40 = this.aClass6_186;
				this.aClass6_186 = this.aClass6_186.aClass6_284;
				return local40;
			}
		}
		this.aClass6_186 = null;
		return null;
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)Lclient!ia;")
	public Class6 method5465() {
		@Pc(21) Class6 local21;
		if (this.anInt6761 > 0 && this.aClass6Array1[this.anInt6761 - 1] != this.aClass6_187) {
			local21 = this.aClass6_187;
			this.aClass6_187 = local21.aClass6_284;
			return local21;
		}
		while (this.anInt6761 < this.anInt6758) {
			local21 = this.aClass6Array1[this.anInt6761++].aClass6_284;
			if (this.aClass6Array1[this.anInt6761 - 1] != local21) {
				this.aClass6_187 = local21.aClass6_284;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(JILclient!ia;)V")
	public void method5466(@OriginalArg(0) long arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_283 != null) {
			arg1.method7948();
		}
		@Pc(21) Class6 local21 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt6758 - 1))];
		arg1.aClass6_283 = local21.aClass6_283;
		arg1.aClass6_284 = local21;
		arg1.aClass6_283.aClass6_284 = arg1;
		arg1.aLong245 = arg0;
		arg1.aClass6_284.aClass6_283 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)Lclient!ia;")
	public Class6 method5467() {
		if (this.aClass6_186 == null) {
			return null;
		}
		@Pc(23) Class6 local23 = this.aClass6Array1[(int) (this.aLong172 & (long) (this.anInt6758 - 1))];
		while (this.aClass6_186 != local23) {
			if (this.aClass6_186.aLong245 == this.aLong172) {
				@Pc(35) Class6 local35 = this.aClass6_186;
				this.aClass6_186 = this.aClass6_186.aClass6_284;
				return local35;
			}
			this.aClass6_186 = this.aClass6_186.aClass6_284;
		}
		this.aClass6_186 = null;
		return null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Lclient!ia;")
	public Class6 method5469() {
		this.anInt6761 = 0;
		return this.method5465();
	}
}
