import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class240 {

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!da;")
	private Class2 aClass2_226;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!da;")
	private Class2 aClass2_227;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	private int anInt6933 = 0;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[Lclient!da;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	public final int anInt6931;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
	public Class240(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt6931 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_261 = local23;
			local23.aClass2_262 = local23;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(JLclient!da;B)V")
	public void method5430(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_262 != null) {
			arg1.method6072();
		}
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) ((long) (this.anInt6931 - 1) & arg0)];
		arg1.aClass2_261 = local25;
		arg1.aClass2_262 = local25.aClass2_262;
		arg1.aClass2_262.aClass2_261 = arg1;
		arg1.aClass2_261.aClass2_262 = arg1;
		arg1.aLong227 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method5431() {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt6931; local16++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local16];
			for (@Pc(26) Class2 local26 = local23.aClass2_261; local26 != local23; local26 = local26.aClass2_261) {
				local14++;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[Lclient!da;)I")
	public int method5432(@OriginalArg(1) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6931; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_261; local19 != local16; local19 = local19.aClass2_261) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public void method5433() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6931; local3++) {
			@Pc(10) Class2 local10 = this.aClass2Array1[local3];
			while (true) {
				@Pc(13) Class2 local13 = local10.aClass2_261;
				if (local13 == local10) {
					break;
				}
				local13.method6072();
			}
		}
		this.aClass2_226 = null;
		this.aClass2_227 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Lclient!da;")
	public Class2 method5434() {
		if (this.aClass2_226 == null) {
			return null;
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) (this.aLong205 & (long) (this.anInt6931 - 1))];
		while (this.aClass2_226 != local28) {
			if (this.aClass2_226.aLong227 == this.aLong205) {
				@Pc(44) Class2 local44 = this.aClass2_226;
				this.aClass2_226 = this.aClass2_226.aClass2_261;
				return local44;
			}
			this.aClass2_226 = this.aClass2_226.aClass2_261;
		}
		this.aClass2_226 = null;
		return null;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Lclient!da;")
	public Class2 method5436() {
		@Pc(19) Class2 local19;
		if (this.anInt6933 > 0 && this.aClass2Array1[this.anInt6933 - 1] != this.aClass2_227) {
			local19 = this.aClass2_227;
			this.aClass2_227 = local19.aClass2_261;
			return local19;
		}
		while (this.anInt6933 < this.anInt6931) {
			local19 = this.aClass2Array1[this.anInt6933++].aClass2_261;
			if (this.aClass2Array1[this.anInt6933 - 1] != local19) {
				this.aClass2_227 = local19.aClass2_261;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Lclient!da;")
	public Class2 method5438() {
		this.anInt6933 = 0;
		return this.method5436();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(JB)Lclient!da;")
	public Class2 method5439(@OriginalArg(0) long arg0) {
		this.aLong205 = arg0;
		@Pc(20) Class2 local20 = this.aClass2Array1[(int) ((long) (this.anInt6931 - 1) & arg0)];
		for (this.aClass2_226 = local20.aClass2_261; this.aClass2_226 != local20; this.aClass2_226 = this.aClass2_226.aClass2_261) {
			if (arg0 == this.aClass2_226.aLong227) {
				@Pc(35) Class2 local35 = this.aClass2_226;
				this.aClass2_226 = this.aClass2_226.aClass2_261;
				return local35;
			}
		}
		this.aClass2_226 = null;
		return null;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)I")
	public int method5440() {
		return this.anInt6931;
	}
}
