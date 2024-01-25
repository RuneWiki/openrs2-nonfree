import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class90 {

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "Lclient!du;")
	private Class2 aClass2_57;

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "Lclient!du;")
	private Class2 aClass2_58;

	@OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
	private int anInt2025 = 0;

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
	public final int anInt2017;

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "[Lclient!du;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(I)V")
	public Class90(@OriginalArg(0) int arg0) {
		this.anInt2017 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_285 = local23;
			local23.aClass2_286 = local23;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Lclient!du;")
	public Class2 method1676() {
		this.anInt2025 = 0;
		return this.method1680();
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "([Lclient!du;B)I")
	public int method1677(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2017; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_286; local19 != local16; local19 = local19.aClass2_286) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
	public void method1678() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2017; local13++) {
			@Pc(20) Class2 local20 = this.aClass2Array1[local13];
			while (true) {
				@Pc(23) Class2 local23 = local20.aClass2_286;
				if (local23 == local20) {
					break;
				}
				local23.method7657();
			}
		}
		this.aClass2_58 = null;
		this.aClass2_57 = null;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)I")
	public int method1679() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt2017; local16++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local16];
			for (@Pc(26) Class2 local26 = local23.aClass2_286; local26 != local23; local26 = local26.aClass2_286) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)Lclient!du;")
	public Class2 method1680() {
		@Pc(24) Class2 local24;
		if (this.anInt2025 > 0 && this.aClass2_58 != this.aClass2Array1[this.anInt2025 - 1]) {
			local24 = this.aClass2_58;
			this.aClass2_58 = local24.aClass2_286;
			return local24;
		}
		while (this.anInt2025 < this.anInt2017) {
			local24 = this.aClass2Array1[this.anInt2025++].aClass2_286;
			if (local24 != this.aClass2Array1[this.anInt2025 - 1]) {
				this.aClass2_58 = local24.aClass2_286;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)I")
	public int method1681() {
		return this.anInt2017;
	}

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "(I)Lclient!du;")
	public Class2 method1682() {
		if (this.aClass2_57 == null) {
			return null;
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt2017 - 1) & this.aLong47)];
		while (local23 != this.aClass2_57) {
			if (this.aLong47 == this.aClass2_57.aLong268) {
				@Pc(35) Class2 local35 = this.aClass2_57;
				this.aClass2_57 = this.aClass2_57.aClass2_286;
				return local35;
			}
			this.aClass2_57 = this.aClass2_57.aClass2_286;
		}
		this.aClass2_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!du;J)V")
	public void method1684(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_285 != null) {
			arg0.method7657();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt2017 - 1))];
		arg0.aClass2_286 = local21;
		arg0.aClass2_285 = local21.aClass2_285;
		arg0.aClass2_285.aClass2_286 = arg0;
		arg0.aClass2_286.aClass2_285 = arg0;
		arg0.aLong268 = arg1;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BJ)Lclient!du;")
	public Class2 method1685(@OriginalArg(1) long arg0) {
		this.aLong47 = arg0;
		@Pc(20) Class2 local20 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt2017 - 1))];
		for (this.aClass2_57 = local20.aClass2_286; this.aClass2_57 != local20; this.aClass2_57 = this.aClass2_57.aClass2_286) {
			if (this.aClass2_57.aLong268 == arg0) {
				@Pc(39) Class2 local39 = this.aClass2_57;
				this.aClass2_57 = this.aClass2_57.aClass2_286;
				return local39;
			}
		}
		this.aClass2_57 = null;
		return null;
	}
}
