import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class133 {

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "Lclient!le;")
	private Class3_Sub4 aClass3_Sub4_38;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "[Lclient!le;")
	private final Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	private final int anInt4077;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
	public Class133(@OriginalArg(0) int arg0) {
		this.aClass3_Sub4Array1 = new Class3_Sub4[arg0];
		this.anInt4077 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub4 local20 = this.aClass3_Sub4Array1[local10] = new Class3_Sub4();
			local20.aClass3_Sub4_58 = local20;
			local20.aClass3_Sub4_57 = local20;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Lclient!le;")
	public Class3_Sub4 method3259() {
		if (this.aClass3_Sub4_38 == null) {
			return null;
		}
		@Pc(29) Class3_Sub4 local29 = this.aClass3_Sub4Array1[(int) (this.aLong132 & (long) (this.anInt4077 - 1))];
		while (local29 != this.aClass3_Sub4_38) {
			if (this.aLong132 == this.aClass3_Sub4_38.aLong233) {
				@Pc(45) Class3_Sub4 local45 = this.aClass3_Sub4_38;
				this.aClass3_Sub4_38 = this.aClass3_Sub4_38.aClass3_Sub4_58;
				return local45;
			}
			this.aClass3_Sub4_38 = this.aClass3_Sub4_38.aClass3_Sub4_58;
		}
		this.aClass3_Sub4_38 = null;
		return null;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BJ)Lclient!le;")
	public Class3_Sub4 method3261(@OriginalArg(1) long arg0) {
		this.aLong132 = arg0;
		@Pc(25) Class3_Sub4 local25 = this.aClass3_Sub4Array1[(int) (arg0 & (long) (this.anInt4077 - 1))];
		for (this.aClass3_Sub4_38 = local25.aClass3_Sub4_58; this.aClass3_Sub4_38 != local25; this.aClass3_Sub4_38 = this.aClass3_Sub4_38.aClass3_Sub4_58) {
			if (arg0 == this.aClass3_Sub4_38.aLong233) {
				@Pc(40) Class3_Sub4 local40 = this.aClass3_Sub4_38;
				this.aClass3_Sub4_38 = this.aClass3_Sub4_38.aClass3_Sub4_58;
				return local40;
			}
		}
		this.aClass3_Sub4_38 = null;
		return null;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BJLclient!le;)V")
	public void method3263(@OriginalArg(1) long arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg1.aClass3_Sub4_57 != null) {
			arg1.method5949();
		}
		@Pc(21) Class3_Sub4 local21 = this.aClass3_Sub4Array1[(int) (arg0 & (long) (this.anInt4077 - 1))];
		arg1.aClass3_Sub4_58 = local21;
		arg1.aClass3_Sub4_57 = local21.aClass3_Sub4_57;
		arg1.aClass3_Sub4_57.aClass3_Sub4_58 = arg1;
		arg1.aClass3_Sub4_58.aClass3_Sub4_57 = arg1;
		arg1.aLong233 = arg0;
	}
}
