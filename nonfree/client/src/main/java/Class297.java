import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class297 {

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "Lclient!u;")
	private Class3 aClass3_235;

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "J")
	private long aLong223;

	@OriginalMember(owner = "client!sba", name = "t", descriptor = "Lclient!u;")
	private Class3 aClass3_236;

	@OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
	private int anInt8326 = 0;

	@OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
	public final int anInt8325;

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "[Lclient!u;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(I)V")
	public Class297(@OriginalArg(0) int arg0) {
		this.anInt8325 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_286 = local23;
			local23.aClass3_285 = local23;
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)I")
	public int method6528() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt8325; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_285; local19 != local16; local19 = local19.aClass3_285) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)Lclient!u;")
	public Class3 method6529() {
		this.anInt8326 = 0;
		return this.method6532();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(JB)Lclient!u;")
	public Class3 method6531(@OriginalArg(0) long arg0) {
		this.aLong223 = arg0;
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt8325 - 1))];
		for (this.aClass3_235 = local25.aClass3_285; this.aClass3_235 != local25; this.aClass3_235 = this.aClass3_235.aClass3_285) {
			if (arg0 == this.aClass3_235.aLong262) {
				@Pc(44) Class3 local44 = this.aClass3_235;
				this.aClass3_235 = this.aClass3_235.aClass3_285;
				return local44;
			}
		}
		this.aClass3_235 = null;
		return null;
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)Lclient!u;")
	public Class3 method6532() {
		@Pc(24) Class3 local24;
		if (this.anInt8326 > 0 && this.aClass3_236 != this.aClass3Array1[this.anInt8326 - 1]) {
			local24 = this.aClass3_236;
			this.aClass3_236 = local24.aClass3_285;
			return local24;
		}
		while (this.anInt8326 < this.anInt8325) {
			local24 = this.aClass3Array1[this.anInt8326++].aClass3_285;
			if (this.aClass3Array1[this.anInt8326 - 1] != local24) {
				this.aClass3_236 = local24.aClass3_285;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)I")
	public int method6534() {
		return this.anInt8325;
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(B)V")
	public void method6535() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt8325; local15++) {
			@Pc(22) Class3 local22 = this.aClass3Array1[local15];
			while (true) {
				@Pc(25) Class3 local25 = local22.aClass3_285;
				if (local25 == local22) {
					break;
				}
				local25.method8128();
			}
		}
		this.aClass3_235 = null;
		this.aClass3_236 = null;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "([Lclient!u;I)I")
	public int method6536(@OriginalArg(0) Class3[] arg0) {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt8325; local16++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local16];
			for (@Pc(26) Class3 local26 = local23.aClass3_285; local26 != local23; local26 = local26.aClass3_285) {
				arg0[local14++] = local26;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(JLclient!u;B)V")
	public void method6537(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_286 != null) {
			arg1.method8128();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt8325 - 1))];
		arg1.aClass3_286 = local21.aClass3_286;
		arg1.aClass3_285 = local21;
		arg1.aClass3_286.aClass3_285 = arg1;
		arg1.aLong262 = arg0;
		arg1.aClass3_285.aClass3_286 = arg1;
	}

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "(B)Lclient!u;")
	public Class3 method6538() {
		if (this.aClass3_235 == null) {
			return null;
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) (this.aLong223 & (long) (this.anInt8325 - 1))];
		while (local23 != this.aClass3_235) {
			if (this.aLong223 == this.aClass3_235.aLong262) {
				@Pc(44) Class3 local44 = this.aClass3_235;
				this.aClass3_235 = this.aClass3_235.aClass3_285;
				return local44;
			}
			this.aClass3_235 = this.aClass3_235.aClass3_285;
		}
		this.aClass3_235 = null;
		return null;
	}
}
