import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class22 {

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!tf;")
	private Class1 aClass1_35;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!tf;")
	private Class1 aClass1_36;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	private int anInt748 = 0;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "[Lclient!tf;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
	public Class22(@OriginalArg(0) int arg0) {
		this.anInt737 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class1 local29 = this.aClass1Array1[local13] = new Class1();
			local29.aClass1_230 = local29;
			local29.aClass1_231 = local29;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JB)Lclient!tf;")
	public Class1 method633(@OriginalArg(0) long arg0) {
		this.aLong28 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt737 - 1) & arg0)];
		for (this.aClass1_35 = local20.aClass1_230; this.aClass1_35 != local20; this.aClass1_35 = this.aClass1_35.aClass1_230) {
			if (arg0 == this.aClass1_35.aLong202) {
				@Pc(42) Class1 local42 = this.aClass1_35;
				this.aClass1_35 = this.aClass1_35.aClass1_230;
				return local42;
			}
		}
		this.aClass1_35 = null;
		return null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I")
	public int method634() {
		return this.anInt737;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public void method635() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt737; local7++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local7];
			while (true) {
				@Pc(19) Class1 local19 = local16.aClass1_230;
				if (local16 == local19) {
					break;
				}
				local19.method4534();
			}
		}
		this.aClass1_36 = null;
		this.aClass1_35 = null;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Lclient!tf;")
	public Class1 method637() {
		@Pc(33) Class1 local33;
		if (this.anInt748 > 0 && this.aClass1_36 != this.aClass1Array1[this.anInt748 - 1]) {
			local33 = this.aClass1_36;
			this.aClass1_36 = local33.aClass1_230;
			return local33;
		}
		do {
			if (this.anInt737 <= this.anInt748) {
				return null;
			}
			local33 = this.aClass1Array1[this.anInt748++].aClass1_230;
		} while (this.aClass1Array1[this.anInt748 - 1] == local33);
		this.aClass1_36 = local33.aClass1_230;
		return local33;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z[Lclient!tf;)I")
	public int method639(@OriginalArg(1) Class1[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt737; local15++) {
			@Pc(28) Class1 local28 = this.aClass1Array1[local15];
			for (@Pc(31) Class1 local31 = local28.aClass1_230; local31 != local28; local31 = local31.aClass1_230) {
				arg0[local13++] = local31;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Lclient!tf;")
	public Class1 method640() {
		this.anInt748 = 0;
		return this.method637();
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)Lclient!tf;")
	public Class1 method641() {
		if (this.aClass1_35 == null) {
			return null;
		}
		@Pc(30) Class1 local30 = this.aClass1Array1[(int) ((long) (this.anInt737 - 1) & this.aLong28)];
		while (local30 != this.aClass1_35) {
			if (this.aLong28 == this.aClass1_35.aLong202) {
				@Pc(44) Class1 local44 = this.aClass1_35;
				this.aClass1_35 = this.aClass1_35.aClass1_230;
				return local44;
			}
			this.aClass1_35 = this.aClass1_35.aClass1_230;
		}
		this.aClass1_35 = null;
		return null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	public int method642() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt737; local16++) {
			@Pc(29) Class1 local29 = this.aClass1Array1[local16];
			for (@Pc(32) Class1 local32 = local29.aClass1_230; local32 != local29; local32 = local32.aClass1_230) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IJLclient!tf;)V")
	public void method643(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_231 != null) {
			arg1.method4534();
		}
		@Pc(22) Class1 local22 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt737 - 1))];
		arg1.aClass1_231 = local22.aClass1_231;
		arg1.aClass1_230 = local22;
		arg1.aLong202 = arg0;
		arg1.aClass1_231.aClass1_230 = arg1;
		arg1.aClass1_230.aClass1_231 = arg1;
	}
}
