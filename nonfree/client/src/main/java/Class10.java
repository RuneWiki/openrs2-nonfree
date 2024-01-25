import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "Lclient!s;")
	private Class7 aClass7_9;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!s;")
	private Class7 aClass7_10;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
	private int anInt188 = 0;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	public final int anInt182;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "[Lclient!s;")
	public final Class7[] aClass7Array1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		this.anInt182 = arg0;
		this.aClass7Array1 = new Class7[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class7 local23 = this.aClass7Array1[local13] = new Class7();
			local23.aClass7_247 = local23;
			local23.aClass7_248 = local23;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lclient!s;")
	public Class7 method154() {
		if (this.aClass7_9 == null) {
			return null;
		}
		@Pc(29) Class7 local29 = this.aClass7Array1[(int) ((long) (this.anInt182 - 1) & this.aLong8)];
		while (local29 != this.aClass7_9) {
			if (this.aClass7_9.aLong232 == this.aLong8) {
				@Pc(44) Class7 local44 = this.aClass7_9;
				this.aClass7_9 = this.aClass7_9.aClass7_247;
				return local44;
			}
			this.aClass7_9 = this.aClass7_9.aClass7_247;
		}
		this.aClass7_9 = null;
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Lclient!s;")
	public Class7 method155() {
		@Pc(22) Class7 local22;
		if (this.anInt188 > 0 && this.aClass7_10 != this.aClass7Array1[this.anInt188 - 1]) {
			local22 = this.aClass7_10;
			this.aClass7_10 = local22.aClass7_247;
			return local22;
		}
		while (this.anInt188 < this.anInt182) {
			local22 = this.aClass7Array1[this.anInt188++].aClass7_247;
			if (this.aClass7Array1[this.anInt188 - 1] != local22) {
				this.aClass7_10 = local22.aClass7_247;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public void method156() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt182; local1++) {
			@Pc(7) Class7 local7 = this.aClass7Array1[local1];
			while (true) {
				@Pc(10) Class7 local10 = local7.aClass7_247;
				if (local10 == local7) {
					break;
				}
				local10.method5648();
			}
		}
		this.aClass7_9 = null;
		this.aClass7_10 = null;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)Lclient!s;")
	public Class7 method157() {
		this.anInt188 = 0;
		return this.method155();
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)I")
	public int method159() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt182; local7++) {
			@Pc(17) Class7 local17 = this.aClass7Array1[local7];
			for (@Pc(20) Class7 local20 = local17.aClass7_247; local20 != local17; local20 = local20.aClass7_247) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[Lclient!s;)I")
	public int method160(@OriginalArg(1) Class7[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt182; local15++) {
			@Pc(22) Class7 local22 = this.aClass7Array1[local15];
			for (@Pc(25) Class7 local25 = local22.aClass7_247; local25 != local22; local25 = local25.aClass7_247) {
				arg0[local13++] = local25;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(JILclient!s;)V")
	public void method161(@OriginalArg(0) long arg0, @OriginalArg(2) Class7 arg1) {
		if (arg1.aClass7_248 != null) {
			arg1.method5648();
		}
		@Pc(21) Class7 local21 = this.aClass7Array1[(int) ((long) (this.anInt182 - 1) & arg0)];
		arg1.aClass7_247 = local21;
		arg1.aClass7_248 = local21.aClass7_248;
		arg1.aClass7_248.aClass7_247 = arg1;
		arg1.aClass7_247.aClass7_248 = arg1;
		arg1.aLong232 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IJ)Lclient!s;")
	public Class7 method163(@OriginalArg(1) long arg0) {
		this.aLong8 = arg0;
		@Pc(18) Class7 local18 = this.aClass7Array1[(int) (arg0 & (long) (this.anInt182 - 1))];
		for (this.aClass7_9 = local18.aClass7_247; this.aClass7_9 != local18; this.aClass7_9 = this.aClass7_9.aClass7_247) {
			if (this.aClass7_9.aLong232 == arg0) {
				@Pc(36) Class7 local36 = this.aClass7_9;
				this.aClass7_9 = this.aClass7_9.aClass7_247;
				return local36;
			}
		}
		this.aClass7_9 = null;
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)I")
	public int method164() {
		return this.anInt182;
	}
}
