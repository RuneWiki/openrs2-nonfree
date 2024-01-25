import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class119 {

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "Lclient!pea;")
	private Class6_Sub5 aClass6_Sub5_15;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
	private final int anInt3143;

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "[Lclient!pea;")
	private final Class6_Sub5[] aClass6_Sub5Array1;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(I)V")
	public Class119(@OriginalArg(0) int arg0) {
		this.anInt3143 = arg0;
		this.aClass6_Sub5Array1 = new Class6_Sub5[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub5 local20 = this.aClass6_Sub5Array1[local10] = new Class6_Sub5();
			local20.aClass6_Sub5_60 = local20;
			local20.aClass6_Sub5_59 = local20;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(JI)Lclient!pea;")
	public Class6_Sub5 method2705(@OriginalArg(0) long arg0) {
		this.aLong69 = arg0;
		@Pc(20) Class6_Sub5 local20 = this.aClass6_Sub5Array1[(int) ((long) (this.anInt3143 - 1) & arg0)];
		for (this.aClass6_Sub5_15 = local20.aClass6_Sub5_59; this.aClass6_Sub5_15 != local20; this.aClass6_Sub5_15 = this.aClass6_Sub5_15.aClass6_Sub5_59) {
			if (arg0 == this.aClass6_Sub5_15.aLong242) {
				@Pc(39) Class6_Sub5 local39 = this.aClass6_Sub5_15;
				this.aClass6_Sub5_15 = this.aClass6_Sub5_15.aClass6_Sub5_59;
				return local39;
			}
		}
		this.aClass6_Sub5_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lclient!pea;")
	public Class6_Sub5 method2708() {
		if (this.aClass6_Sub5_15 == null) {
			return null;
		}
		@Pc(31) Class6_Sub5 local31 = this.aClass6_Sub5Array1[(int) (this.aLong69 & (long) (this.anInt3143 - 1))];
		while (this.aClass6_Sub5_15 != local31) {
			if (this.aClass6_Sub5_15.aLong242 == this.aLong69) {
				@Pc(43) Class6_Sub5 local43 = this.aClass6_Sub5_15;
				this.aClass6_Sub5_15 = this.aClass6_Sub5_15.aClass6_Sub5_59;
				return local43;
			}
			this.aClass6_Sub5_15 = this.aClass6_Sub5_15.aClass6_Sub5_59;
		}
		this.aClass6_Sub5_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!pea;ZJ)V")
	public void method2709(@OriginalArg(0) Class6_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass6_Sub5_60 != null) {
			arg0.method7814();
		}
		@Pc(21) Class6_Sub5 local21 = this.aClass6_Sub5Array1[(int) (arg1 & (long) (this.anInt3143 - 1))];
		arg0.aClass6_Sub5_60 = local21.aClass6_Sub5_60;
		arg0.aClass6_Sub5_59 = local21;
		arg0.aClass6_Sub5_60.aClass6_Sub5_59 = arg0;
		arg0.aLong242 = arg1;
		arg0.aClass6_Sub5_59.aClass6_Sub5_60 = arg0;
	}
}
