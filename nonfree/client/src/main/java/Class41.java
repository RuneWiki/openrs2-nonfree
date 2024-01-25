import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class41 {

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!pp;")
	private Class6_Sub4 aClass6_Sub4_5;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "[Lclient!pp;")
	private final Class6_Sub4[] aClass6_Sub4Array1;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	private final int anInt1281;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		this.aClass6_Sub4Array1 = new Class6_Sub4[arg0];
		this.anInt1281 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub4 local20 = this.aClass6_Sub4Array1[local10] = new Class6_Sub4();
			local20.aClass6_Sub4_60 = local20;
			local20.aClass6_Sub4_59 = local20;
		}
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Lclient!pp;")
	public Class6_Sub4 method1141() {
		if (this.aClass6_Sub4_5 == null) {
			return null;
		}
		@Pc(29) Class6_Sub4 local29 = this.aClass6_Sub4Array1[(int) (this.aLong23 & (long) (this.anInt1281 - 1))];
		while (this.aClass6_Sub4_5 != local29) {
			if (this.aLong23 == this.aClass6_Sub4_5.aLong247) {
				@Pc(41) Class6_Sub4 local41 = this.aClass6_Sub4_5;
				this.aClass6_Sub4_5 = this.aClass6_Sub4_5.aClass6_Sub4_59;
				return local41;
			}
			this.aClass6_Sub4_5 = this.aClass6_Sub4_5.aClass6_Sub4_59;
		}
		this.aClass6_Sub4_5 = null;
		return null;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(JB)Lclient!pp;")
	public Class6_Sub4 method1142(@OriginalArg(0) long arg0) {
		this.aLong23 = arg0;
		@Pc(26) Class6_Sub4 local26 = this.aClass6_Sub4Array1[(int) (arg0 & (long) (this.anInt1281 - 1))];
		for (this.aClass6_Sub4_5 = local26.aClass6_Sub4_59; this.aClass6_Sub4_5 != local26; this.aClass6_Sub4_5 = this.aClass6_Sub4_5.aClass6_Sub4_59) {
			if (this.aClass6_Sub4_5.aLong247 == arg0) {
				@Pc(45) Class6_Sub4 local45 = this.aClass6_Sub4_5;
				this.aClass6_Sub4_5 = this.aClass6_Sub4_5.aClass6_Sub4_59;
				return local45;
			}
		}
		this.aClass6_Sub4_5 = null;
		return null;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(JLclient!pp;I)V")
	public void method1143(@OriginalArg(0) long arg0, @OriginalArg(1) Class6_Sub4 arg1) {
		if (arg1.aClass6_Sub4_60 != null) {
			arg1.method8035();
		}
		@Pc(28) Class6_Sub4 local28 = this.aClass6_Sub4Array1[(int) ((long) (this.anInt1281 - 1) & arg0)];
		arg1.aClass6_Sub4_59 = local28;
		arg1.aClass6_Sub4_60 = local28.aClass6_Sub4_60;
		arg1.aClass6_Sub4_60.aClass6_Sub4_59 = arg1;
		arg1.aClass6_Sub4_59.aClass6_Sub4_60 = arg1;
		arg1.aLong247 = arg0;
	}
}
