import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class139 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!ph;")
	private Class1_Sub5 aClass1_Sub5_57;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	private int anInt4178;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[Lclient!ph;")
	private Class1_Sub5[] aClass1_Sub5Array1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	public Class139(@OriginalArg(0) int arg0) {
		this.anInt4178 = arg0;
		this.aClass1_Sub5Array1 = new Class1_Sub5[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(22) Class1_Sub5 local22 = this.aClass1_Sub5Array1[local10] = new Class1_Sub5();
			local22.aClass1_Sub5_73 = local22;
			local22.aClass1_Sub5_72 = local22;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)Lclient!ph;")
	public Class1_Sub5 method3588(@OriginalArg(0) long arg0) {
		this.aLong159 = arg0;
		@Pc(22) Class1_Sub5 local22 = this.aClass1_Sub5Array1[(int) (arg0 & (long) (this.anInt4178 - 1))];
		for (this.aClass1_Sub5_57 = local22.aClass1_Sub5_73; this.aClass1_Sub5_57 != local22; this.aClass1_Sub5_57 = this.aClass1_Sub5_57.aClass1_Sub5_73) {
			if (arg0 == this.aClass1_Sub5_57.aLong211) {
				@Pc(48) Class1_Sub5 local48 = this.aClass1_Sub5_57;
				this.aClass1_Sub5_57 = this.aClass1_Sub5_57.aClass1_Sub5_73;
				return local48;
			}
		}
		this.aClass1_Sub5_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!ph;J)V")
	public void method3589(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub5_72 != null) {
			arg0.method4577();
		}
		@Pc(21) Class1_Sub5 local21 = this.aClass1_Sub5Array1[(int) ((long) (this.anInt4178 - 1) & arg1)];
		arg0.aClass1_Sub5_73 = local21;
		arg0.aLong211 = arg1;
		arg0.aClass1_Sub5_72 = local21.aClass1_Sub5_72;
		arg0.aClass1_Sub5_72.aClass1_Sub5_73 = arg0;
		arg0.aClass1_Sub5_73.aClass1_Sub5_72 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lclient!ph;")
	public Class1_Sub5 method3595() {
		if (this.aClass1_Sub5_57 == null) {
			return null;
		}
		@Pc(31) Class1_Sub5 local31 = this.aClass1_Sub5Array1[(int) (this.aLong159 & (long) (this.anInt4178 - 1))];
		while (local31 != this.aClass1_Sub5_57) {
			if (this.aClass1_Sub5_57.aLong211 == this.aLong159) {
				@Pc(46) Class1_Sub5 local46 = this.aClass1_Sub5_57;
				this.aClass1_Sub5_57 = this.aClass1_Sub5_57.aClass1_Sub5_73;
				return local46;
			}
			this.aClass1_Sub5_57 = this.aClass1_Sub5_57.aClass1_Sub5_73;
		}
		this.aClass1_Sub5_57 = null;
		return null;
	}
}
