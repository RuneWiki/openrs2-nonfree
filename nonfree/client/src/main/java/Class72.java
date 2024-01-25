import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class72 {

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "Lclient!uj;")
	private Class2 aClass2_83;

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "Lclient!uj;")
	private Class2 aClass2_84;

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
	private int anInt2027 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "[Lclient!uj;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
	public final int anInt2018;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(I)V")
	public Class72(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt2018 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_264 = local23;
			local23.aClass2_263 = local23;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Lclient!uj;")
	public Class2 method1649() {
		@Pc(22) Class2 local22;
		if (this.anInt2027 > 0 && this.aClass2_84 != this.aClass2Array1[this.anInt2027 - 1]) {
			local22 = this.aClass2_84;
			this.aClass2_84 = local22.aClass2_264;
			return local22;
		}
		while (this.anInt2018 > this.anInt2027) {
			local22 = this.aClass2Array1[this.anInt2027++].aClass2_264;
			if (this.aClass2Array1[this.anInt2027 - 1] != local22) {
				this.aClass2_84 = local22.aClass2_264;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
	public void method1650() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt2018; local10++) {
			@Pc(17) Class2 local17 = this.aClass2Array1[local10];
			while (true) {
				@Pc(20) Class2 local20 = local17.aClass2_264;
				if (local20 == local17) {
					break;
				}
				local20.method5703();
			}
		}
		this.aClass2_84 = null;
		this.aClass2_83 = null;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)I")
	public int method1652() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2018; local15++) {
			@Pc(22) Class2 local22 = this.aClass2Array1[local15];
			@Pc(25) Class2 local25 = local22.aClass2_264;
			while (local25 != local22) {
				local25 = local25.aClass2_264;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!uj;JI)V")
	public void method1653(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_263 != null) {
			arg0.method5703();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt2018 - 1))];
		arg0.aClass2_264 = local21;
		arg0.aClass2_263 = local21.aClass2_263;
		arg0.aClass2_263.aClass2_264 = arg0;
		arg0.aLong225 = arg1;
		arg0.aClass2_264.aClass2_263 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(B)I")
	public int method1654() {
		return this.anInt2018;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)Lclient!uj;")
	public Class2 method1655() {
		this.anInt2027 = 0;
		return this.method1649();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "([Lclient!uj;B)I")
	public int method1656(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2018; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_264; local19 != local16; local19 = local19.aClass2_264) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(B)Lclient!uj;")
	public Class2 method1657() {
		if (this.aClass2_83 == null) {
			return null;
		}
		@Pc(31) Class2 local31 = this.aClass2Array1[(int) (this.aLong64 & (long) (this.anInt2018 - 1))];
		while (this.aClass2_83 != local31) {
			if (this.aClass2_83.aLong225 == this.aLong64) {
				@Pc(43) Class2 local43 = this.aClass2_83;
				this.aClass2_83 = this.aClass2_83.aClass2_264;
				return local43;
			}
			this.aClass2_83 = this.aClass2_83.aClass2_264;
		}
		this.aClass2_83 = null;
		return null;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BJ)Lclient!uj;")
	public Class2 method1659(@OriginalArg(1) long arg0) {
		this.aLong64 = arg0;
		@Pc(27) Class2 local27 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt2018 - 1))];
		for (this.aClass2_83 = local27.aClass2_264; this.aClass2_83 != local27; this.aClass2_83 = this.aClass2_83.aClass2_264) {
			if (arg0 == this.aClass2_83.aLong225) {
				@Pc(42) Class2 local42 = this.aClass2_83;
				this.aClass2_83 = this.aClass2_83.aClass2_264;
				return local42;
			}
		}
		this.aClass2_83 = null;
		return null;
	}
}
