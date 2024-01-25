import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class198 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!gl;")
	private Class4 aClass4_223;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "J")
	private long aLong233;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "Lclient!gl;")
	private Class4 aClass4_224;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
	private int anInt6306 = 0;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "[Lclient!gl;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public final int anInt6295;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class198(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt6295 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_247 = local23;
			local23.aClass4_248 = local23;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public void method5260() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6295; local11++) {
			@Pc(18) Class4 local18 = this.aClass4Array1[local11];
			while (true) {
				@Pc(21) Class4 local21 = local18.aClass4_247;
				if (local21 == local18) {
					break;
				}
				local21.method5667();
			}
		}
		this.aClass4_223 = null;
		this.aClass4_224 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JB)Lclient!gl;")
	public Class4 method5261(@OriginalArg(0) long arg0) {
		this.aLong233 = arg0;
		@Pc(28) Class4 local28 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt6295 - 1))];
		for (this.aClass4_223 = local28.aClass4_247; this.aClass4_223 != local28; this.aClass4_223 = this.aClass4_223.aClass4_247) {
			if (this.aClass4_223.aLong259 == arg0) {
				@Pc(47) Class4 local47 = this.aClass4_223;
				this.aClass4_223 = this.aClass4_223.aClass4_247;
				return local47;
			}
		}
		this.aClass4_223 = null;
		return null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Lclient!gl;")
	public Class4 method5263() {
		@Pc(29) Class4 local29;
		if (this.anInt6306 > 0 && this.aClass4Array1[this.anInt6306 - 1] != this.aClass4_224) {
			local29 = this.aClass4_224;
			this.aClass4_224 = local29.aClass4_247;
			return local29;
		}
		while (this.anInt6306 < this.anInt6295) {
			local29 = this.aClass4Array1[this.anInt6306++].aClass4_247;
			if (local29 != this.aClass4Array1[this.anInt6306 - 1]) {
				this.aClass4_224 = local29.aClass4_247;
				return local29;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I")
	public int method5264() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6295; local9++) {
			@Pc(16) Class4 local16 = this.aClass4Array1[local9];
			for (@Pc(19) Class4 local19 = local16.aClass4_247; local19 != local16; local19 = local19.aClass4_247) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Lclient!gl;")
	public Class4 method5265() {
		if (this.aClass4_223 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) ((long) (this.anInt6295 - 1) & this.aLong233)];
		while (this.aClass4_223 != local23) {
			if (this.aClass4_223.aLong259 == this.aLong233) {
				@Pc(35) Class4 local35 = this.aClass4_223;
				this.aClass4_223 = this.aClass4_223.aClass4_247;
				return local35;
			}
			this.aClass4_223 = this.aClass4_223.aClass4_247;
		}
		this.aClass4_223 = null;
		return null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JLclient!gl;I)V")
	public void method5267(@OriginalArg(0) long arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_248 != null) {
			arg1.method5667();
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt6295 - 1))];
		arg1.aClass4_248 = local21.aClass4_248;
		arg1.aClass4_247 = local21;
		arg1.aClass4_248.aClass4_247 = arg1;
		arg1.aClass4_247.aClass4_248 = arg1;
		arg1.aLong259 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Lclient!gl;")
	public Class4 method5268() {
		this.anInt6306 = 0;
		return this.method5263();
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)I")
	public int method5270() {
		return this.anInt6295;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([Lclient!gl;B)I")
	public int method5271(@OriginalArg(0) Class4[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt6295; local17++) {
			@Pc(24) Class4 local24 = this.aClass4Array1[local17];
			for (@Pc(27) Class4 local27 = local24.aClass4_247; local27 != local24; local27 = local27.aClass4_247) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}
}
