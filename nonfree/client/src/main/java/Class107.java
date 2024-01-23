import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class107 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Lclient!ia;")
	private Class3_Sub4 aClass3_Sub4_45;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
	private int anInt3089;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "[Lclient!ia;")
	private Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V")
	public Class107(@OriginalArg(0) int arg0) {
		this.anInt3089 = arg0;
		this.aClass3_Sub4Array1 = new Class3_Sub4[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(22) Class3_Sub4 local22 = this.aClass3_Sub4Array1[local10] = new Class3_Sub4();
			local22.aClass3_Sub4_75 = local22;
			local22.aClass3_Sub4_74 = local22;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ia;IJ)V")
	public void method2730(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_Sub4_74 != null) {
			arg0.method5022();
		}
		@Pc(23) Class3_Sub4 local23 = this.aClass3_Sub4Array1[(int) ((long) (this.anInt3089 - 1) & arg1)];
		arg0.aClass3_Sub4_75 = local23;
		arg0.aClass3_Sub4_74 = local23.aClass3_Sub4_74;
		arg0.aClass3_Sub4_74.aClass3_Sub4_75 = arg0;
		arg0.aLong245 = arg1;
		arg0.aClass3_Sub4_75.aClass3_Sub4_74 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZJ)Lclient!ia;")
	public Class3_Sub4 method2732(@OriginalArg(1) long arg0) {
		this.aLong137 = arg0;
		@Pc(25) Class3_Sub4 local25 = this.aClass3_Sub4Array1[(int) ((long) (this.anInt3089 - 1) & arg0)];
		for (this.aClass3_Sub4_45 = local25.aClass3_Sub4_75; this.aClass3_Sub4_45 != local25; this.aClass3_Sub4_45 = this.aClass3_Sub4_45.aClass3_Sub4_75) {
			if (this.aClass3_Sub4_45.aLong245 == arg0) {
				@Pc(43) Class3_Sub4 local43 = this.aClass3_Sub4_45;
				this.aClass3_Sub4_45 = this.aClass3_Sub4_45.aClass3_Sub4_75;
				return local43;
			}
		}
		this.aClass3_Sub4_45 = null;
		return null;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Lclient!ia;")
	public Class3_Sub4 method2733() {
		if (this.aClass3_Sub4_45 == null) {
			return null;
		}
		@Pc(25) Class3_Sub4 local25 = this.aClass3_Sub4Array1[(int) (this.aLong137 & (long) (this.anInt3089 - 1))];
		while (local25 != this.aClass3_Sub4_45) {
			if (this.aLong137 == this.aClass3_Sub4_45.aLong245) {
				@Pc(44) Class3_Sub4 local44 = this.aClass3_Sub4_45;
				this.aClass3_Sub4_45 = this.aClass3_Sub4_45.aClass3_Sub4_75;
				return local44;
			}
			this.aClass3_Sub4_45 = this.aClass3_Sub4_45.aClass3_Sub4_75;
		}
		this.aClass3_Sub4_45 = null;
		return null;
	}
}
