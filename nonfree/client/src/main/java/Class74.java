import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class74 {

	@OriginalMember(owner = "client!dfa", name = "e", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!dfa", name = "j", descriptor = "Lclient!wb;")
	private Class6 aClass6_55;

	@OriginalMember(owner = "client!dfa", name = "s", descriptor = "Lclient!wb;")
	private Class6 aClass6_56;

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "I")
	private int anInt1444 = 0;

	@OriginalMember(owner = "client!dfa", name = "k", descriptor = "[Lclient!wb;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
	public final int anInt1437;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V")
	public Class74(@OriginalArg(0) int arg0) {
		this.aClass6Array1 = new Class6[arg0];
		this.anInt1437 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_339 = local23;
			local23.aClass6_340 = local23;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
	public void method1398() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1437; local11++) {
			@Pc(20) Class6 local20 = this.aClass6Array1[local11];
			while (true) {
				@Pc(23) Class6 local23 = local20.aClass6_339;
				if (local23 == local20) {
					break;
				}
				local23.method9051();
			}
		}
		this.aClass6_56 = null;
		this.aClass6_55 = null;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!wb;JI)V")
	public void method1399(@OriginalArg(0) Class6 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass6_340 != null) {
			arg0.method9051();
		}
		@Pc(23) Class6 local23 = this.aClass6Array1[(int) ((long) (this.anInt1437 - 1) & arg1)];
		arg0.aClass6_339 = local23;
		arg0.aClass6_340 = local23.aClass6_340;
		arg0.aClass6_340.aClass6_339 = arg0;
		arg0.aLong346 = arg1;
		arg0.aClass6_339.aClass6_340 = arg0;
	}

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)I")
	public int method1400() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt1437; local16++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local16];
			for (@Pc(26) Class6 local26 = local23.aClass6_339; local26 != local23; local26 = local26.aClass6_339) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZJ)Lclient!wb;")
	public Class6 method1401(@OriginalArg(1) long arg0) {
		this.aLong60 = arg0;
		@Pc(20) Class6 local20 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt1437 - 1))];
		for (this.aClass6_55 = local20.aClass6_339; this.aClass6_55 != local20; this.aClass6_55 = this.aClass6_55.aClass6_339) {
			if (this.aClass6_55.aLong346 == arg0) {
				@Pc(41) Class6 local41 = this.aClass6_55;
				this.aClass6_55 = this.aClass6_55.aClass6_339;
				return local41;
			}
		}
		if (false) {
			this.method1406();
		}
		this.aClass6_55 = null;
		return null;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B[Lclient!wb;)I")
	public int method1402(@OriginalArg(1) Class6[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1437; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_339; local19 != local16; local19 = local19.aClass6_339) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)Lclient!wb;")
	public Class6 method1404() {
		this.anInt1444 = 0;
		return this.method1405();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)Lclient!wb;")
	public Class6 method1405() {
		@Pc(33) Class6 local33;
		if (this.anInt1444 > 0 && this.aClass6Array1[this.anInt1444 - 1] != this.aClass6_56) {
			local33 = this.aClass6_56;
			this.aClass6_56 = local33.aClass6_339;
			return local33;
		}
		while (this.anInt1444 < this.anInt1437) {
			local33 = this.aClass6Array1[this.anInt1444++].aClass6_339;
			if (local33 != this.aClass6Array1[this.anInt1444 - 1]) {
				this.aClass6_56 = local33.aClass6_339;
				return local33;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)I")
	public int method1406() {
		return this.anInt1437;
	}

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)Lclient!wb;")
	public Class6 method1407() {
		if (this.aClass6_55 == null) {
			return null;
		}
		@Pc(24) Class6 local24 = this.aClass6Array1[(int) (this.aLong60 & (long) (this.anInt1437 - 1))];
		while (local24 != this.aClass6_55) {
			if (this.aClass6_55.aLong346 == this.aLong60) {
				@Pc(42) Class6 local42 = this.aClass6_55;
				this.aClass6_55 = this.aClass6_55.aClass6_339;
				return local42;
			}
			this.aClass6_55 = this.aClass6_55.aClass6_339;
		}
		this.aClass6_55 = null;
		return null;
	}
}
