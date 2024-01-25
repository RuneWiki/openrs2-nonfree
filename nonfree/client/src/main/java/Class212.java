import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class212 {

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "Lclient!sf;")
	private Class6 aClass6_190;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "Lclient!sf;")
	private Class6 aClass6_191;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
	private int anInt5981 = 0;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "[Lclient!sf;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public final int anInt5972;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
	public Class212(@OriginalArg(0) int arg0) {
		this.aClass6Array1 = new Class6[arg0];
		this.anInt5972 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_284 = local23;
			local23.aClass6_283 = local23;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lclient!sf;")
	public Class6 method5099() {
		this.anInt5981 = 0;
		return this.method5103();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[Lclient!sf;)I")
	public int method5100(@OriginalArg(1) Class6[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5972; local17++) {
			@Pc(24) Class6 local24 = this.aClass6Array1[local17];
			for (@Pc(27) Class6 local27 = local24.aClass6_284; local27 != local24; local27 = local27.aClass6_284) {
				arg0[local7++] = local27;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Lclient!sf;")
	public Class6 method5103() {
		@Pc(20) Class6 local20;
		if (this.anInt5981 > 0 && this.aClass6_191 != this.aClass6Array1[this.anInt5981 - 1]) {
			local20 = this.aClass6_191;
			this.aClass6_191 = local20.aClass6_284;
			return local20;
		}
		while (this.anInt5981 < this.anInt5972) {
			local20 = this.aClass6Array1[this.anInt5981++].aClass6_284;
			if (this.aClass6Array1[this.anInt5981 - 1] != local20) {
				this.aClass6_191 = local20.aClass6_284;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(JILclient!sf;)V")
	public void method5104(@OriginalArg(0) long arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_283 != null) {
			arg1.method7849();
		}
		@Pc(21) Class6 local21 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt5972 - 1))];
		arg1.aClass6_284 = local21;
		arg1.aClass6_283 = local21.aClass6_283;
		arg1.aClass6_283.aClass6_284 = arg1;
		arg1.aLong249 = arg0;
		arg1.aClass6_284.aClass6_283 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)I")
	public int method5105() {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt5972; local16++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local16];
			for (@Pc(26) Class6 local26 = local23.aClass6_284; local26 != local23; local26 = local26.aClass6_284) {
				local14++;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IJ)Lclient!sf;")
	public Class6 method5106(@OriginalArg(1) long arg0) {
		this.aLong157 = arg0;
		@Pc(25) Class6 local25 = this.aClass6Array1[(int) ((long) (this.anInt5972 - 1) & arg0)];
		for (this.aClass6_190 = local25.aClass6_284; this.aClass6_190 != local25; this.aClass6_190 = this.aClass6_190.aClass6_284) {
			if (arg0 == this.aClass6_190.aLong249) {
				@Pc(44) Class6 local44 = this.aClass6_190;
				this.aClass6_190 = this.aClass6_190.aClass6_284;
				return local44;
			}
		}
		this.aClass6_190 = null;
		return null;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Lclient!sf;")
	public Class6 method5107() {
		if (this.aClass6_190 == null) {
			return null;
		}
		@Pc(23) Class6 local23 = this.aClass6Array1[(int) (this.aLong157 & (long) (this.anInt5972 - 1))];
		while (local23 != this.aClass6_190) {
			if (this.aClass6_190.aLong249 == this.aLong157) {
				@Pc(39) Class6 local39 = this.aClass6_190;
				this.aClass6_190 = this.aClass6_190.aClass6_284;
				return local39;
			}
			this.aClass6_190 = this.aClass6_190.aClass6_284;
		}
		this.aClass6_190 = null;
		return null;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)I")
	public int method5108() {
		return this.anInt5972;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
	public void method5110() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5972; local7++) {
			@Pc(14) Class6 local14 = this.aClass6Array1[local7];
			while (true) {
				@Pc(17) Class6 local17 = local14.aClass6_284;
				if (local17 == local14) {
					break;
				}
				local17.method7849();
			}
		}
		this.aClass6_190 = null;
		this.aClass6_191 = null;
	}
}
