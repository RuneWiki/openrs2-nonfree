import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class128 {

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[Lclient!ca;")
	public static final Class40[] aClass40Array1 = new Class40[5];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!kd;")
	private Class6 aClass6_114;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Lclient!kd;")
	private Class6 aClass6_115;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	private int anInt3752 = 0;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public final int anInt3744;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "[Lclient!kd;")
	public final Class6[] aClass6Array1;

	static {
		for (@Pc(42) int local42 = 0; local42 < aClass40Array1.length; local42++) {
			aClass40Array1[local42] = new Class40();
		}
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
	public Class128(@OriginalArg(0) int arg0) {
		this.anInt3744 = arg0;
		this.aClass6Array1 = new Class6[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_286 = local23;
			local23.aClass6_285 = local23;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JB)Lclient!kd;")
	public Class6 method3263(@OriginalArg(0) long arg0) {
		this.aLong93 = arg0;
		@Pc(20) Class6 local20 = this.aClass6Array1[(int) ((long) (this.anInt3744 - 1) & arg0)];
		for (this.aClass6_114 = local20.aClass6_286; this.aClass6_114 != local20; this.aClass6_114 = this.aClass6_114.aClass6_286) {
			if (this.aClass6_114.aLong263 == arg0) {
				@Pc(44) Class6 local44 = this.aClass6_114;
				this.aClass6_114 = this.aClass6_114.aClass6_286;
				return local44;
			}
		}
		this.aClass6_114 = null;
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lclient!kd;")
	public Class6 method3264() {
		if (this.aClass6_114 == null) {
			return null;
		}
		@Pc(23) Class6 local23 = this.aClass6Array1[(int) (this.aLong93 & (long) (this.anInt3744 - 1))];
		while (local23 != this.aClass6_114) {
			if (this.aClass6_114.aLong263 == this.aLong93) {
				@Pc(39) Class6 local39 = this.aClass6_114;
				this.aClass6_114 = this.aClass6_114.aClass6_286;
				return local39;
			}
			this.aClass6_114 = this.aClass6_114.aClass6_286;
		}
		this.aClass6_114 = null;
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Lclient!kd;")
	public Class6 method3265() {
		this.anInt3752 = 0;
		return this.method3273();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!kd;JI)V")
	public void method3267(@OriginalArg(0) Class6 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass6_285 != null) {
			arg0.method7804();
		}
		@Pc(21) Class6 local21 = this.aClass6Array1[(int) (arg1 & (long) (this.anInt3744 - 1))];
		arg0.aClass6_285 = local21.aClass6_285;
		arg0.aClass6_286 = local21;
		arg0.aClass6_285.aClass6_286 = arg0;
		arg0.aClass6_286.aClass6_285 = arg0;
		arg0.aLong263 = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	public int method3268() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3744; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_286; local19 != local16; local19 = local19.aClass6_286) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lclient!kd;B)I")
	public int method3271(@OriginalArg(0) Class6[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3744; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_286; local19 != local16; local19 = local19.aClass6_286) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)Lclient!kd;")
	public Class6 method3273() {
		@Pc(24) Class6 local24;
		if (this.anInt3752 > 0 && this.aClass6_115 != this.aClass6Array1[this.anInt3752 - 1]) {
			local24 = this.aClass6_115;
			this.aClass6_115 = local24.aClass6_286;
			return local24;
		}
		while (this.anInt3744 > this.anInt3752) {
			local24 = this.aClass6Array1[this.anInt3752++].aClass6_286;
			if (this.aClass6Array1[this.anInt3752 - 1] != local24) {
				this.aClass6_115 = local24.aClass6_286;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V")
	public void method3274() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3744; local3++) {
			@Pc(10) Class6 local10 = this.aClass6Array1[local3];
			while (true) {
				@Pc(13) Class6 local13 = local10.aClass6_286;
				if (local10 == local13) {
					break;
				}
				local13.method7804();
			}
		}
		this.aClass6_115 = null;
		this.aClass6_114 = null;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(B)I")
	public int method3275() {
		return this.anInt3744;
	}
}
