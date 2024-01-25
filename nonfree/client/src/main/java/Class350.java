import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class350 {

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "J")
	private long aLong260;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "Lclient!ii;")
	private Class4 aClass4_275;

	@OriginalMember(owner = "client!waa", name = "t", descriptor = "Lclient!ii;")
	private Class4 aClass4_276;

	@OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
	private int anInt10043 = 0;

	@OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
	public final int anInt10039;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "[Lclient!ii;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(I)V")
	public Class350(@OriginalArg(0) int arg0) {
		this.anInt10039 = arg0;
		this.aClass4Array1 = new Class4[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_286 = local23;
			local23.aClass4_285 = local23;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Lclient!ii;")
	public Class4 method8198() {
		this.anInt10043 = 0;
		return this.method8205();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(JLclient!ii;B)V")
	public void method8199(@OriginalArg(0) long arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_286 != null) {
			arg1.method8379();
		}
		@Pc(27) Class4 local27 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt10039 - 1))];
		arg1.aClass4_285 = local27;
		arg1.aClass4_286 = local27.aClass4_286;
		arg1.aClass4_286.aClass4_285 = arg1;
		arg1.aClass4_285.aClass4_286 = arg1;
		arg1.aLong268 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)Lclient!ii;")
	public Class4 method8200() {
		if (this.aClass4_275 == null) {
			return null;
		}
		@Pc(28) Class4 local28 = this.aClass4Array1[(int) ((long) (this.anInt10039 - 1) & this.aLong260)];
		while (this.aClass4_275 != local28) {
			if (this.aClass4_275.aLong268 == this.aLong260) {
				@Pc(44) Class4 local44 = this.aClass4_275;
				this.aClass4_275 = this.aClass4_275.aClass4_285;
				return local44;
			}
			this.aClass4_275 = this.aClass4_275.aClass4_285;
		}
		this.aClass4_275 = null;
		return null;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)I")
	public int method8202() {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt10039; local16++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local16];
			@Pc(26) Class4 local26 = local23.aClass4_285;
			while (local23 != local26) {
				local26 = local26.aClass4_285;
				local14++;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "(B)V")
	public void method8203() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt10039; local1++) {
			@Pc(7) Class4 local7 = this.aClass4Array1[local1];
			while (true) {
				@Pc(10) Class4 local10 = local7.aClass4_285;
				if (local7 == local10) {
					break;
				}
				local10.method8379();
			}
		}
		this.aClass4_276 = null;
		this.aClass4_275 = null;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([Lclient!ii;I)I")
	public int method8204(@OriginalArg(0) Class4[] arg0) {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt10039; local16++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local16];
			for (@Pc(26) Class4 local26 = local23.aClass4_285; local26 != local23; local26 = local26.aClass4_285) {
				arg0[local14++] = local26;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "(B)Lclient!ii;")
	public Class4 method8205() {
		@Pc(19) Class4 local19;
		if (this.anInt10043 > 0 && this.aClass4_276 != this.aClass4Array1[this.anInt10043 - 1]) {
			local19 = this.aClass4_276;
			this.aClass4_276 = local19.aClass4_285;
			return local19;
		}
		while (this.anInt10043 < this.anInt10039) {
			local19 = this.aClass4Array1[this.anInt10043++].aClass4_285;
			if (local19 != this.aClass4Array1[this.anInt10043 - 1]) {
				this.aClass4_276 = local19.aClass4_285;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(JI)Lclient!ii;")
	public Class4 method8207(@OriginalArg(0) long arg0) {
		this.aLong260 = arg0;
		@Pc(18) Class4 local18 = this.aClass4Array1[(int) ((long) (this.anInt10039 - 1) & arg0)];
		for (this.aClass4_275 = local18.aClass4_285; this.aClass4_275 != local18; this.aClass4_275 = this.aClass4_275.aClass4_285) {
			if (this.aClass4_275.aLong268 == arg0) {
				@Pc(32) Class4 local32 = this.aClass4_275;
				this.aClass4_275 = this.aClass4_275.aClass4_285;
				return local32;
			}
		}
		this.aClass4_275 = null;
		return null;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)I")
	public int method8208() {
		return this.anInt10039;
	}
}
