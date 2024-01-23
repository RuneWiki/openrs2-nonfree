import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class142 {

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!ba;")
	private Class1 aClass1_170;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!ba;")
	private Class1 aClass1_171;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
	private int anInt4198 = 0;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "[Lclient!ba;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public int anInt4180;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	public Class142(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt4180 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class1 local29 = this.aClass1Array1[local13] = new Class1();
			local29.aClass1_234 = local29;
			local29.aClass1_235 = local29;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
	public int method3529() {
		@Pc(3) int local3 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4180; local15++) {
			@Pc(24) Class1 local24 = this.aClass1Array1[local15];
			@Pc(27) Class1 local27 = local24.aClass1_235;
			while (local24 != local27) {
				local27 = local27.aClass1_235;
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Lclient!ba;")
	public Class1 method3530() {
		@Pc(22) Class1 local22;
		if (this.anInt4198 > 0 && this.aClass1Array1[this.anInt4198 - 1] != this.aClass1_171) {
			local22 = this.aClass1_171;
			this.aClass1_171 = local22.aClass1_235;
			return local22;
		}
		do {
			if (this.anInt4180 <= this.anInt4198) {
				return null;
			}
			local22 = this.aClass1Array1[this.anInt4198++].aClass1_235;
		} while (local22 == this.aClass1Array1[this.anInt4198 - 1]);
		this.aClass1_171 = local22.aClass1_235;
		return local22;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Lclient!ba;")
	public Class1 method3531() {
		if (this.aClass1_170 == null) {
			return null;
		}
		@Pc(30) Class1 local30 = this.aClass1Array1[(int) ((long) (this.anInt4180 - 1) & this.aLong150)];
		while (local30 != this.aClass1_170) {
			if (this.aClass1_170.aLong214 == this.aLong150) {
				@Pc(45) Class1 local45 = this.aClass1_170;
				this.aClass1_170 = this.aClass1_170.aClass1_235;
				return local45;
			}
			this.aClass1_170 = this.aClass1_170.aClass1_235;
		}
		this.aClass1_170 = null;
		return null;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I")
	public int method3532() {
		return this.anInt4180;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lclient!ba;")
	public Class1 method3534() {
		this.anInt4198 = 0;
		return this.method3530();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!ba;J)V")
	public void method3537(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_234 != null) {
			arg0.method4779();
		}
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) ((long) (this.anInt4180 - 1) & arg1)];
		arg0.aClass1_235 = local18;
		arg0.aClass1_234 = local18.aClass1_234;
		arg0.aLong214 = arg1;
		arg0.aClass1_234.aClass1_235 = arg0;
		arg0.aClass1_235.aClass1_234 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lclient!ba;B)I")
	public int method3540(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4180; local9++) {
			@Pc(22) Class1 local22 = this.aClass1Array1[local9];
			for (@Pc(25) Class1 local25 = local22.aClass1_235; local25 != local22; local25 = local25.aClass1_235) {
				arg0[local7++] = local25;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
	public void method3542() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4180; local11++) {
			@Pc(24) Class1 local24 = this.aClass1Array1[local11];
			while (true) {
				@Pc(27) Class1 local27 = local24.aClass1_235;
				if (local24 == local27) {
					break;
				}
				local27.method4779();
			}
		}
		this.aClass1_170 = null;
		this.aClass1_171 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)Lclient!ba;")
	public Class1 method3543(@OriginalArg(0) long arg0) {
		this.aLong150 = arg0;
		@Pc(28) Class1 local28 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt4180 - 1))];
		for (this.aClass1_170 = local28.aClass1_235; this.aClass1_170 != local28; this.aClass1_170 = this.aClass1_170.aClass1_235) {
			if (this.aClass1_170.aLong214 == arg0) {
				@Pc(49) Class1 local49 = this.aClass1_170;
				this.aClass1_170 = this.aClass1_170.aClass1_235;
				return local49;
			}
		}
		this.aClass1_170 = null;
		return null;
	}
}
