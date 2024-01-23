import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class117 {

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "J")
	private long aLong148;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "Lclient!hl;")
	private Class1 aClass1_166;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "Lclient!hl;")
	private Class1 aClass1_167;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
	private int anInt4400 = 0;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
	public int anInt4392;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "[Lclient!hl;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I)V")
	public Class117(@OriginalArg(0) int arg0) {
		this.anInt4392 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class1 local29 = this.aClass1Array1[local13] = new Class1();
			local29.aClass1_230 = local29;
			local29.aClass1_231 = local29;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(JB)Lclient!hl;")
	public Class1 method3438(@OriginalArg(0) long arg0) {
		this.aLong148 = arg0;
		@Pc(16) Class1 local16 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt4392 - 1))];
		for (this.aClass1_166 = local16.aClass1_231; this.aClass1_166 != local16; this.aClass1_166 = this.aClass1_166.aClass1_231) {
			if (this.aClass1_166.aLong201 == arg0) {
				@Pc(38) Class1 local38 = this.aClass1_166;
				this.aClass1_166 = this.aClass1_166.aClass1_231;
				return local38;
			}
		}
		this.aClass1_166 = null;
		return null;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I")
	public int method3439() {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4392; local5++) {
			@Pc(18) Class1 local18 = this.aClass1Array1[local5];
			for (@Pc(21) Class1 local21 = local18.aClass1_231; local21 != local18; local21 = local21.aClass1_231) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	public void method3440() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt4392; local10++) {
			@Pc(19) Class1 local19 = this.aClass1Array1[local10];
			while (true) {
				@Pc(22) Class1 local22 = local19.aClass1_231;
				if (local22 == local19) {
					break;
				}
				local22.method4742();
			}
		}
		this.aClass1_167 = null;
		this.aClass1_166 = null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Lclient!hl;")
	public Class1 method3441() {
		this.anInt4400 = 0;
		return this.method3444();
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Lclient!hl;")
	public Class1 method3442() {
		if (this.aClass1_166 == null) {
			return null;
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) ((long) (this.anInt4392 - 1) & this.aLong148)];
		while (this.aClass1_166 != local29) {
			if (this.aClass1_166.aLong201 == this.aLong148) {
				@Pc(43) Class1 local43 = this.aClass1_166;
				this.aClass1_166 = this.aClass1_166.aClass1_231;
				return local43;
			}
			this.aClass1_166 = this.aClass1_166.aClass1_231;
		}
		this.aClass1_166 = null;
		return null;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I")
	public int method3443() {
		return this.anInt4392;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)Lclient!hl;")
	public Class1 method3444() {
		@Pc(32) Class1 local32;
		if (this.anInt4400 > 0 && this.aClass1_167 != this.aClass1Array1[this.anInt4400 - 1]) {
			local32 = this.aClass1_167;
			this.aClass1_167 = local32.aClass1_231;
			return local32;
		}
		do {
			if (this.anInt4392 <= this.anInt4400) {
				return null;
			}
			local32 = this.aClass1Array1[this.anInt4400++].aClass1_231;
		} while (local32 == this.aClass1Array1[this.anInt4400 - 1]);
		this.aClass1_167 = local32.aClass1_231;
		return local32;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!hl;BJ)V")
	public void method3445(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_230 != null) {
			arg0.method4742();
		}
		@Pc(30) Class1 local30 = this.aClass1Array1[(int) ((long) (this.anInt4392 - 1) & arg1)];
		arg0.aClass1_231 = local30;
		arg0.aLong201 = arg1;
		arg0.aClass1_230 = local30.aClass1_230;
		arg0.aClass1_230.aClass1_231 = arg0;
		arg0.aClass1_231.aClass1_230 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([Lclient!hl;I)I")
	public int method3447(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4392; local9++) {
			@Pc(25) Class1 local25 = this.aClass1Array1[local9];
			for (@Pc(28) Class1 local28 = local25.aClass1_231; local28 != local25; local28 = local28.aClass1_231) {
				arg0[local7++] = local28;
			}
		}
		return local7;
	}
}
