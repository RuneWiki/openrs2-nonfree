import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class20 {

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Lclient!wd;")
	private Class4 aClass4_39;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "Lclient!wd;")
	private Class4 aClass4_40;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "I")
	private int anInt779 = 0;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[Lclient!wd;")
	private final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private final int anInt775;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
	public Class20(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt775 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_215 = local23;
			local23.aClass4_216 = local23;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lclient!wd;")
	public Class4 method498() {
		@Pc(19) Class4 local19;
		if (this.anInt779 > 0 && this.aClass4Array1[this.anInt779 - 1] != this.aClass4_40) {
			local19 = this.aClass4_40;
			this.aClass4_40 = local19.aClass4_216;
			return local19;
		}
		while (this.anInt775 > this.anInt779) {
			local19 = this.aClass4Array1[this.anInt779++].aClass4_216;
			if (local19 != this.aClass4Array1[this.anInt779 - 1]) {
				this.aClass4_40 = local19.aClass4_216;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BJLclient!wd;)V")
	public void method499(@OriginalArg(1) long arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_215 != null) {
			arg1.method3173();
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) ((long) (this.anInt775 - 1) & arg0)];
		arg1.aClass4_215 = local21.aClass4_215;
		arg1.aLong148 = arg0;
		arg1.aClass4_216 = local21;
		arg1.aClass4_215.aClass4_216 = arg1;
		arg1.aClass4_216.aClass4_215 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!wd;")
	public Class4 method503() {
		if (this.aClass4_39 == null) {
			return null;
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) (this.aLong22 & (long) (this.anInt775 - 1))];
		while (local21 != this.aClass4_39) {
			if (this.aClass4_39.aLong148 == this.aLong22) {
				@Pc(36) Class4 local36 = this.aClass4_39;
				this.aClass4_39 = this.aClass4_39.aClass4_216;
				return local36;
			}
			this.aClass4_39 = this.aClass4_39.aClass4_216;
		}
		this.aClass4_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)Lclient!wd;")
	public Class4 method504() {
		this.anInt779 = 0;
		return this.method498();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)Lclient!wd;")
	public Class4 method505(@OriginalArg(1) long arg0) {
		this.aLong22 = arg0;
		@Pc(18) Class4 local18 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt775 - 1))];
		for (this.aClass4_39 = local18.aClass4_216; this.aClass4_39 != local18; this.aClass4_39 = this.aClass4_39.aClass4_216) {
			if (this.aClass4_39.aLong148 == arg0) {
				@Pc(41) Class4 local41 = this.aClass4_39;
				this.aClass4_39 = this.aClass4_39.aClass4_216;
				return local41;
			}
		}
		this.aClass4_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B[Lclient!wd;)I")
	public int method506(@OriginalArg(1) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt775; local14++) {
			@Pc(21) Class4 local21 = this.aClass4Array1[local14];
			for (@Pc(24) Class4 local24 = local21.aClass4_216; local24 != local21; local24 = local24.aClass4_216) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)I")
	public int method507() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt775; local14++) {
			@Pc(21) Class4 local21 = this.aClass4Array1[local14];
			@Pc(24) Class4 local24 = local21.aClass4_216;
			while (local24 != local21) {
				local24 = local24.aClass4_216;
				local7++;
			}
		}
		return local7;
	}
}
