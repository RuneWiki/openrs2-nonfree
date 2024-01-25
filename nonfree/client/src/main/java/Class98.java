import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class98 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Lclient!ie;")
	private Class2_Sub5 aClass2_Sub5_27;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
	private final int anInt2842;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "[Lclient!ie;")
	private final Class2_Sub5[] aClass2_Sub5Array1;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(I)V")
	public Class98(@OriginalArg(0) int arg0) {
		this.anInt2842 = arg0;
		this.aClass2_Sub5Array1 = new Class2_Sub5[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub5 local20 = this.aClass2_Sub5Array1[local10] = new Class2_Sub5();
			local20.aClass2_Sub5_57 = local20;
			local20.aClass2_Sub5_58 = local20;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Lclient!ie;")
	public Class2_Sub5 method2244() {
		if (this.aClass2_Sub5_27 == null) {
			return null;
		}
		@Pc(23) Class2_Sub5 local23 = this.aClass2_Sub5Array1[(int) ((long) (this.anInt2842 - 1) & this.aLong83)];
		while (this.aClass2_Sub5_27 != local23) {
			if (this.aClass2_Sub5_27.aLong211 == this.aLong83) {
				@Pc(39) Class2_Sub5 local39 = this.aClass2_Sub5_27;
				this.aClass2_Sub5_27 = this.aClass2_Sub5_27.aClass2_Sub5_58;
				return local39;
			}
			this.aClass2_Sub5_27 = this.aClass2_Sub5_27.aClass2_Sub5_58;
		}
		this.aClass2_Sub5_27 = null;
		return null;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(JLclient!ie;I)V")
	public void method2245(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		if (arg1.aClass2_Sub5_57 != null) {
			arg1.method5534();
		}
		@Pc(23) Class2_Sub5 local23 = this.aClass2_Sub5Array1[(int) ((long) (this.anInt2842 - 1) & arg0)];
		arg1.aClass2_Sub5_57 = local23.aClass2_Sub5_57;
		arg1.aClass2_Sub5_58 = local23;
		arg1.aClass2_Sub5_57.aClass2_Sub5_58 = arg1;
		arg1.aClass2_Sub5_58.aClass2_Sub5_57 = arg1;
		arg1.aLong211 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(JI)Lclient!ie;")
	public Class2_Sub5 method2249(@OriginalArg(0) long arg0) {
		this.aLong83 = arg0;
		@Pc(25) Class2_Sub5 local25 = this.aClass2_Sub5Array1[(int) ((long) (this.anInt2842 - 1) & arg0)];
		for (this.aClass2_Sub5_27 = local25.aClass2_Sub5_58; this.aClass2_Sub5_27 != local25; this.aClass2_Sub5_27 = this.aClass2_Sub5_27.aClass2_Sub5_58) {
			if (arg0 == this.aClass2_Sub5_27.aLong211) {
				@Pc(44) Class2_Sub5 local44 = this.aClass2_Sub5_27;
				this.aClass2_Sub5_27 = this.aClass2_Sub5_27.aClass2_Sub5_58;
				return local44;
			}
		}
		this.aClass2_Sub5_27 = null;
		return null;
	}
}
