import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class16 {

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!na;")
	private Class2 aClass2_39;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!na;")
	private Class2 aClass2_40;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	private int anInt683 = 0;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private final int anInt682;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "[Lclient!na;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
	public Class16(@OriginalArg(0) int arg0) {
		this.anInt682 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_210 = local23;
			local23.aClass2_209 = local23;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!na;")
	public Class2 method474() {
		if (this.aClass2_39 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (this.aLong40 & (long) (this.anInt682 - 1))];
		while (local21 != this.aClass2_39) {
			if (this.aLong40 == this.aClass2_39.aLong241) {
				@Pc(36) Class2 local36 = this.aClass2_39;
				this.aClass2_39 = this.aClass2_39.aClass2_209;
				return local36;
			}
			this.aClass2_39 = this.aClass2_39.aClass2_209;
		}
		this.aClass2_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I[Lclient!na;)I")
	public int method475(@OriginalArg(1) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt682; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_209; local19 != local16; local19 = local19.aClass2_209) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lclient!na;")
	public Class2 method478() {
		this.anInt683 = 0;
		return this.method481();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)Lclient!na;")
	public Class2 method479(@OriginalArg(1) long arg0) {
		this.aLong40 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt682 - 1))];
		for (this.aClass2_39 = local18.aClass2_209; this.aClass2_39 != local18; this.aClass2_39 = this.aClass2_39.aClass2_209) {
			if (arg0 == this.aClass2_39.aLong241) {
				@Pc(32) Class2 local32 = this.aClass2_39;
				this.aClass2_39 = this.aClass2_39.aClass2_209;
				return local32;
			}
		}
		this.aClass2_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!na;BJ)V")
	public void method480(@OriginalArg(0) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_210 != null) {
			arg0.method2808();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt682 - 1) & arg1)];
		arg0.aClass2_209 = local21;
		arg0.aClass2_210 = local21.aClass2_210;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aLong241 = arg1;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Lclient!na;")
	public Class2 method481() {
		@Pc(22) Class2 local22;
		if (this.anInt683 > 0 && this.aClass2Array1[this.anInt683 - 1] != this.aClass2_40) {
			local22 = this.aClass2_40;
			this.aClass2_40 = local22.aClass2_209;
			return local22;
		}
		while (this.anInt683 < this.anInt682) {
			local22 = this.aClass2Array1[this.anInt683++].aClass2_209;
			if (local22 != this.aClass2Array1[this.anInt683 - 1]) {
				this.aClass2_40 = local22.aClass2_209;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
	public int method482() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt682; local15++) {
			@Pc(22) Class2 local22 = this.aClass2Array1[local15];
			for (@Pc(25) Class2 local25 = local22.aClass2_209; local25 != local22; local25 = local25.aClass2_209) {
				local13++;
			}
		}
		return local13;
	}
}
