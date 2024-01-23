import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class103 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!lf;")
	private Class2 aClass2_205;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "Lclient!lf;")
	private Class2 aClass2_206;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	private int anInt4622 = 0;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "[Lclient!lf;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	private int anInt4621;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
	public Class103(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt4621 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_219 = local23;
			local23.aClass2_220 = local23;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(JB)Lclient!lf;")
	public Class2 method3659(@OriginalArg(0) long arg0) {
		this.aLong172 = arg0;
		@Pc(14) Class2 local14 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt4621 - 1))];
		for (this.aClass2_205 = local14.aClass2_219; this.aClass2_205 != local14; this.aClass2_205 = this.aClass2_205.aClass2_219) {
			if (arg0 == this.aClass2_205.aLong188) {
				@Pc(32) Class2 local32 = this.aClass2_205;
				this.aClass2_205 = this.aClass2_205.aClass2_219;
				return local32;
			}
		}
		this.aClass2_205 = null;
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public void method3662() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4621; local7++) {
			@Pc(13) Class2 local13 = this.aClass2Array1[local7];
			while (true) {
				@Pc(16) Class2 local16 = local13.aClass2_219;
				if (local13 == local16) {
					break;
				}
				local16.method3986();
			}
		}
		this.aClass2_206 = null;
		this.aClass2_205 = null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Lclient!lf;")
	public Class2 method3664() {
		if (this.aClass2_205 == null) {
			return null;
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) (this.aLong172 & (long) (this.anInt4621 - 1))];
		while (this.aClass2_205 != local28) {
			if (this.aClass2_205.aLong188 == this.aLong172) {
				@Pc(43) Class2 local43 = this.aClass2_205;
				this.aClass2_205 = this.aClass2_205.aClass2_219;
				return local43;
			}
			this.aClass2_205 = this.aClass2_205.aClass2_219;
		}
		this.aClass2_205 = null;
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(JILclient!lf;)V")
	public void method3665(@OriginalArg(0) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_220 != null) {
			arg1.method3986();
		}
		@Pc(29) Class2 local29 = this.aClass2Array1[(int) ((long) (this.anInt4621 - 1) & arg0)];
		arg1.aLong188 = arg0;
		arg1.aClass2_220 = local29.aClass2_220;
		arg1.aClass2_219 = local29;
		arg1.aClass2_220.aClass2_219 = arg1;
		arg1.aClass2_219.aClass2_220 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Lclient!lf;")
	public Class2 method3666() {
		@Pc(19) Class2 local19;
		if (this.anInt4622 > 0 && this.aClass2Array1[this.anInt4622 - 1] != this.aClass2_206) {
			local19 = this.aClass2_206;
			this.aClass2_206 = local19.aClass2_219;
			return local19;
		}
		while (this.anInt4621 > this.anInt4622) {
			local19 = this.aClass2Array1[this.anInt4622++].aClass2_219;
			if (local19 != this.aClass2Array1[this.anInt4622 - 1]) {
				this.aClass2_206 = local19.aClass2_219;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Lclient!lf;")
	public Class2 method3668() {
		this.anInt4622 = 0;
		return this.method3666();
	}
}
