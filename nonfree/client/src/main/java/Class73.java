import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class73 {

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!qm;")
	private Class1_Sub2 aClass1_Sub2_21;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	private int anInt2468;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lclient!qm;")
	private Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	public Class73(@OriginalArg(0) int arg0) {
		this.anInt2468 = arg0;
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(22) Class1_Sub2 local22 = this.aClass1_Sub2Array1[local10] = new Class1_Sub2();
			local22.aClass1_Sub2_74 = local22;
			local22.aClass1_Sub2_75 = local22;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Lclient!qm;")
	public Class1_Sub2 method2102() {
		if (this.aClass1_Sub2_21 == null) {
			return null;
		}
		@Pc(24) Class1_Sub2 local24 = this.aClass1_Sub2Array1[(int) (this.aLong87 & (long) (this.anInt2468 - 1))];
		while (local24 != this.aClass1_Sub2_21) {
			if (this.aClass1_Sub2_21.aLong196 == this.aLong87) {
				@Pc(43) Class1_Sub2 local43 = this.aClass1_Sub2_21;
				this.aClass1_Sub2_21 = this.aClass1_Sub2_21.aClass1_Sub2_75;
				return local43;
			}
			this.aClass1_Sub2_21 = this.aClass1_Sub2_21.aClass1_Sub2_75;
		}
		this.aClass1_Sub2_21 = null;
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BJ)Lclient!qm;")
	public Class1_Sub2 method2104(@OriginalArg(1) long arg0) {
		this.aLong87 = arg0;
		@Pc(26) Class1_Sub2 local26 = this.aClass1_Sub2Array1[(int) ((long) (this.anInt2468 - 1) & arg0)];
		for (this.aClass1_Sub2_21 = local26.aClass1_Sub2_75; this.aClass1_Sub2_21 != local26; this.aClass1_Sub2_21 = this.aClass1_Sub2_21.aClass1_Sub2_75) {
			if (arg0 == this.aClass1_Sub2_21.aLong196) {
				@Pc(48) Class1_Sub2 local48 = this.aClass1_Sub2_21;
				this.aClass1_Sub2_21 = this.aClass1_Sub2_21.aClass1_Sub2_75;
				return local48;
			}
		}
		this.aClass1_Sub2_21 = null;
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BJLclient!qm;)V")
	public void method2106(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg1.aClass1_Sub2_74 != null) {
			arg1.method4493();
		}
		@Pc(23) Class1_Sub2 local23 = this.aClass1_Sub2Array1[(int) (arg0 & (long) (this.anInt2468 - 1))];
		arg1.aClass1_Sub2_74 = local23.aClass1_Sub2_74;
		arg1.aLong196 = arg0;
		arg1.aClass1_Sub2_75 = local23;
		arg1.aClass1_Sub2_74.aClass1_Sub2_75 = arg1;
		arg1.aClass1_Sub2_75.aClass1_Sub2_74 = arg1;
	}
}
