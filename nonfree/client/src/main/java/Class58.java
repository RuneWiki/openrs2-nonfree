import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class58 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!pl;")
	private Class11 aClass11_56;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Lclient!pl;")
	private Class11 aClass11_57;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	private int anInt1263 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public final int anInt1252;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[Lclient!pl;")
	public final Class11[] aClass11Array1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.anInt1252 = arg0;
		this.aClass11Array1 = new Class11[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class11 local23 = this.aClass11Array1[local13] = new Class11();
			local23.aClass11_251 = local23;
			local23.aClass11_252 = local23;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([Lclient!pl;B)I")
	public int method1003(@OriginalArg(0) Class11[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1252; local17++) {
			@Pc(24) Class11 local24 = this.aClass11Array1[local17];
			for (@Pc(27) Class11 local27 = local24.aClass11_251; local27 != local24; local27 = local27.aClass11_251) {
				arg0[local7++] = local27;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lclient!pl;")
	public Class11 method1004() {
		@Pc(30) Class11 local30;
		if (this.anInt1263 > 0 && this.aClass11_57 != this.aClass11Array1[this.anInt1263 - 1]) {
			local30 = this.aClass11_57;
			this.aClass11_57 = local30.aClass11_251;
			return local30;
		}
		while (this.anInt1263 < this.anInt1252) {
			local30 = this.aClass11Array1[this.anInt1263++].aClass11_251;
			if (this.aClass11Array1[this.anInt1263 - 1] != local30) {
				this.aClass11_57 = local30.aClass11_251;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Lclient!pl;")
	public Class11 method1005() {
		if (this.aClass11_56 == null) {
			return null;
		}
		@Pc(29) Class11 local29 = this.aClass11Array1[(int) ((long) (this.anInt1252 - 1) & this.aLong39)];
		while (local29 != this.aClass11_56) {
			if (this.aLong39 == this.aClass11_56.aLong215) {
				@Pc(45) Class11 local45 = this.aClass11_56;
				this.aClass11_56 = this.aClass11_56.aClass11_251;
				return local45;
			}
			this.aClass11_56 = this.aClass11_56.aClass11_251;
		}
		this.aClass11_56 = null;
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BJLclient!pl;)V")
	public void method1006(@OriginalArg(1) long arg0, @OriginalArg(2) Class11 arg1) {
		if (arg1.aClass11_252 != null) {
			arg1.method5701();
		}
		@Pc(21) Class11 local21 = this.aClass11Array1[(int) ((long) (this.anInt1252 - 1) & arg0)];
		arg1.aClass11_251 = local21;
		arg1.aClass11_252 = local21.aClass11_252;
		arg1.aClass11_252.aClass11_251 = arg1;
		arg1.aClass11_251.aClass11_252 = arg1;
		arg1.aLong215 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
	public int method1007() {
		return this.anInt1252;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Lclient!pl;")
	public Class11 method1008() {
		this.anInt1263 = 0;
		return this.method1004();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(JI)Lclient!pl;")
	public Class11 method1009(@OriginalArg(0) long arg0) {
		this.aLong39 = arg0;
		@Pc(25) Class11 local25 = this.aClass11Array1[(int) (arg0 & (long) (this.anInt1252 - 1))];
		for (this.aClass11_56 = local25.aClass11_251; this.aClass11_56 != local25; this.aClass11_56 = this.aClass11_56.aClass11_251) {
			if (arg0 == this.aClass11_56.aLong215) {
				@Pc(40) Class11 local40 = this.aClass11_56;
				this.aClass11_56 = this.aClass11_56.aClass11_251;
				return local40;
			}
		}
		this.aClass11_56 = null;
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I")
	public int method1010() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1252; local15++) {
			@Pc(22) Class11 local22 = this.aClass11Array1[local15];
			for (@Pc(25) Class11 local25 = local22.aClass11_251; local25 != local22; local25 = local25.aClass11_251) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	public void method1011() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt1252; local15++) {
			@Pc(22) Class11 local22 = this.aClass11Array1[local15];
			while (true) {
				@Pc(25) Class11 local25 = local22.aClass11_251;
				if (local22 == local25) {
					break;
				}
				local25.method5701();
			}
		}
		this.aClass11_56 = null;
		this.aClass11_57 = null;
	}
}
