import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class164 {

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!qp;")
	private Class5_Sub9 aClass5_Sub9_49;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	private final int anInt4901;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "[Lclient!qp;")
	private final Class5_Sub9[] aClass5_Sub9Array1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public Class164(@OriginalArg(0) int arg0) {
		this.anInt4901 = arg0;
		this.aClass5_Sub9Array1 = new Class5_Sub9[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub9 local20 = this.aClass5_Sub9Array1[local10] = new Class5_Sub9();
			local20.aClass5_Sub9_60 = local20;
			local20.aClass5_Sub9_61 = local20;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZJ)Lclient!qp;")
	public Class5_Sub9 method4408(@OriginalArg(1) long arg0) {
		this.aLong170 = arg0;
		@Pc(20) Class5_Sub9 local20 = this.aClass5_Sub9Array1[(int) (arg0 & (long) (this.anInt4901 - 1))];
		for (this.aClass5_Sub9_49 = local20.aClass5_Sub9_60; this.aClass5_Sub9_49 != local20; this.aClass5_Sub9_49 = this.aClass5_Sub9_49.aClass5_Sub9_60) {
			if (this.aClass5_Sub9_49.aLong208 == arg0) {
				@Pc(35) Class5_Sub9 local35 = this.aClass5_Sub9_49;
				this.aClass5_Sub9_49 = this.aClass5_Sub9_49.aClass5_Sub9_60;
				return local35;
			}
		}
		this.aClass5_Sub9_49 = null;
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lclient!qp;")
	public Class5_Sub9 method4409() {
		if (this.aClass5_Sub9_49 == null) {
			return null;
		}
		@Pc(23) Class5_Sub9 local23 = this.aClass5_Sub9Array1[(int) ((long) (this.anInt4901 - 1) & this.aLong170)];
		while (local23 != this.aClass5_Sub9_49) {
			if (this.aClass5_Sub9_49.aLong208 == this.aLong170) {
				@Pc(39) Class5_Sub9 local39 = this.aClass5_Sub9_49;
				this.aClass5_Sub9_49 = this.aClass5_Sub9_49.aClass5_Sub9_60;
				return local39;
			}
			this.aClass5_Sub9_49 = this.aClass5_Sub9_49.aClass5_Sub9_60;
		}
		this.aClass5_Sub9_49 = null;
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!qp;J)V")
	public void method4411(@OriginalArg(1) Class5_Sub9 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass5_Sub9_61 != null) {
			arg0.method5494();
		}
		@Pc(21) Class5_Sub9 local21 = this.aClass5_Sub9Array1[(int) ((long) (this.anInt4901 - 1) & arg1)];
		arg0.aClass5_Sub9_61 = local21.aClass5_Sub9_61;
		arg0.aClass5_Sub9_60 = local21;
		arg0.aClass5_Sub9_61.aClass5_Sub9_60 = arg0;
		arg0.aLong208 = arg1;
		arg0.aClass5_Sub9_60.aClass5_Sub9_61 = arg0;
	}
}
