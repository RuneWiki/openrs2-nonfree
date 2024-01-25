import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class42 {

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "[J")
	public static final long[] aLongArray1 = new long[256];

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Lclient!qs;")
	private Class5 aClass5_39;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "Lclient!qs;")
	private Class5 aClass5_40;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
	private int anInt1212 = 0;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "[Lclient!qs;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	public final int anInt1198;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray1[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt1198 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_248 = local23;
			local23.aClass5_247 = local23;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([Lclient!qs;B)I")
	public int method1049(@OriginalArg(0) Class5[] arg0) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1198; local14++) {
			@Pc(21) Class5 local21 = this.aClass5Array1[local14];
			for (@Pc(24) Class5 local24 = local21.aClass5_247; local24 != local21; local24 = local24.aClass5_247) {
				arg0[local12++] = local24;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IJLclient!qs;)V")
	public void method1050(@OriginalArg(1) long arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_248 != null) {
			arg1.method5803();
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) ((long) (this.anInt1198 - 1) & arg0)];
		arg1.aClass5_247 = local21;
		arg1.aClass5_248 = local21.aClass5_248;
		arg1.aClass5_248.aClass5_247 = arg1;
		arg1.aLong218 = arg0;
		arg1.aClass5_247.aClass5_248 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)I")
	public int method1051() {
		return this.anInt1198;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BJ)Lclient!qs;")
	public Class5 method1052(@OriginalArg(1) long arg0) {
		this.aLong38 = arg0;
		@Pc(18) Class5 local18 = this.aClass5Array1[(int) ((long) (this.anInt1198 - 1) & arg0)];
		for (this.aClass5_39 = local18.aClass5_247; this.aClass5_39 != local18; this.aClass5_39 = this.aClass5_39.aClass5_247) {
			if (this.aClass5_39.aLong218 == arg0) {
				@Pc(38) Class5 local38 = this.aClass5_39;
				this.aClass5_39 = this.aClass5_39.aClass5_247;
				return local38;
			}
		}
		this.aClass5_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public void method1054() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1198; local1++) {
			@Pc(15) Class5 local15 = this.aClass5Array1[local1];
			while (true) {
				@Pc(18) Class5 local18 = local15.aClass5_247;
				if (local18 == local15) {
					break;
				}
				local18.method5803();
			}
		}
		this.aClass5_39 = null;
		this.aClass5_40 = null;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)Lclient!qs;")
	public Class5 method1055() {
		@Pc(22) Class5 local22;
		if (this.anInt1212 > 0 && this.aClass5_40 != this.aClass5Array1[this.anInt1212 - 1]) {
			local22 = this.aClass5_40;
			this.aClass5_40 = local22.aClass5_247;
			return local22;
		}
		while (this.anInt1198 > this.anInt1212) {
			local22 = this.aClass5Array1[this.anInt1212++].aClass5_247;
			if (local22 != this.aClass5Array1[this.anInt1212 - 1]) {
				this.aClass5_40 = local22.aClass5_247;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	public int method1056() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1198; local15++) {
			@Pc(22) Class5 local22 = this.aClass5Array1[local15];
			for (@Pc(25) Class5 local25 = local22.aClass5_247; local25 != local22; local25 = local25.aClass5_247) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)Lclient!qs;")
	public Class5 method1057() {
		if (this.aClass5_39 == null) {
			return null;
		}
		@Pc(23) Class5 local23 = this.aClass5Array1[(int) ((long) (this.anInt1198 - 1) & this.aLong38)];
		while (this.aClass5_39 != local23) {
			if (this.aLong38 == this.aClass5_39.aLong218) {
				@Pc(35) Class5 local35 = this.aClass5_39;
				this.aClass5_39 = this.aClass5_39.aClass5_247;
				return local35;
			}
			this.aClass5_39 = this.aClass5_39.aClass5_247;
		}
		this.aClass5_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Lclient!qs;")
	public Class5 method1060() {
		this.anInt1212 = 0;
		return this.method1055();
	}
}
