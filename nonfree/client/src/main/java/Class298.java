import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class298 {

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "Lclient!ffa;")
	private Class3_Sub4 aClass3_Sub4_59;

	@OriginalMember(owner = "client!qaa", name = "i", descriptor = "J")
	private long aLong289;

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "[Lclient!ffa;")
	private final Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
	private final int anInt8629;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(I)V")
	public Class298(@OriginalArg(0) int arg0) {
		this.aClass3_Sub4Array1 = new Class3_Sub4[arg0];
		this.anInt8629 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub4 local20 = this.aClass3_Sub4Array1[local10] = new Class3_Sub4();
			local20.aClass3_Sub4_66 = local20;
			local20.aClass3_Sub4_67 = local20;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Z)Lclient!ffa;")
	public Class3_Sub4 method7238() {
		if (this.aClass3_Sub4_59 == null) {
			return null;
		}
		@Pc(34) Class3_Sub4 local34 = this.aClass3_Sub4Array1[(int) ((long) (this.anInt8629 - 1) & this.aLong289)];
		while (local34 != this.aClass3_Sub4_59) {
			if (this.aClass3_Sub4_59.aLong363 == this.aLong289) {
				@Pc(52) Class3_Sub4 local52 = this.aClass3_Sub4_59;
				this.aClass3_Sub4_59 = this.aClass3_Sub4_59.aClass3_Sub4_66;
				return local52;
			}
			this.aClass3_Sub4_59 = this.aClass3_Sub4_59.aClass3_Sub4_66;
		}
		this.aClass3_Sub4_59 = null;
		return null;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IJ)Lclient!ffa;")
	public Class3_Sub4 method7240(@OriginalArg(1) long arg0) {
		this.aLong289 = arg0;
		@Pc(30) Class3_Sub4 local30 = this.aClass3_Sub4Array1[(int) ((long) (this.anInt8629 - 1) & arg0)];
		for (this.aClass3_Sub4_59 = local30.aClass3_Sub4_66; this.aClass3_Sub4_59 != local30; this.aClass3_Sub4_59 = this.aClass3_Sub4_59.aClass3_Sub4_66) {
			if (this.aClass3_Sub4_59.aLong363 == arg0) {
				@Pc(51) Class3_Sub4 local51 = this.aClass3_Sub4_59;
				this.aClass3_Sub4_59 = this.aClass3_Sub4_59.aClass3_Sub4_66;
				return local51;
			}
		}
		this.aClass3_Sub4_59 = null;
		return null;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!ffa;BJ)V")
	public void method7241(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_Sub4_67 != null) {
			arg0.method8848();
		}
		@Pc(32) Class3_Sub4 local32 = this.aClass3_Sub4Array1[(int) ((long) (this.anInt8629 - 1) & arg1)];
		arg0.aClass3_Sub4_67 = local32.aClass3_Sub4_67;
		arg0.aClass3_Sub4_66 = local32;
		arg0.aClass3_Sub4_67.aClass3_Sub4_66 = arg0;
		arg0.aClass3_Sub4_66.aClass3_Sub4_67 = arg0;
		arg0.aLong363 = arg1;
	}
}
