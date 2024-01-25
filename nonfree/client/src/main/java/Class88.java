import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class88 {

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!ig;")
	private Class6_Sub2 aClass6_Sub2_21;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "[Lclient!ig;")
	private final Class6_Sub2[] aClass6_Sub2Array1;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	private final int anInt2282;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class88(@OriginalArg(0) int arg0) {
		this.aClass6_Sub2Array1 = new Class6_Sub2[arg0];
		this.anInt2282 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[local10] = new Class6_Sub2();
			local20.aClass6_Sub2_65 = local20;
			local20.aClass6_Sub2_66 = local20;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!ig;J)V")
	public void method2180(@OriginalArg(1) Class6_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass6_Sub2_66 != null) {
			arg0.method8464();
		}
		@Pc(23) Class6_Sub2 local23 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt2282 - 1) & arg1)];
		arg0.aClass6_Sub2_66 = local23.aClass6_Sub2_66;
		arg0.aClass6_Sub2_65 = local23;
		arg0.aClass6_Sub2_66.aClass6_Sub2_65 = arg0;
		arg0.aLong317 = arg1;
		arg0.aClass6_Sub2_65.aClass6_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)Lclient!ig;")
	public Class6_Sub2 method2181(@OriginalArg(1) long arg0) {
		this.aLong70 = arg0;
		@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[(int) (arg0 & (long) (this.anInt2282 - 1))];
		for (this.aClass6_Sub2_21 = local20.aClass6_Sub2_65; this.aClass6_Sub2_21 != local20; this.aClass6_Sub2_21 = this.aClass6_Sub2_21.aClass6_Sub2_65) {
			if (this.aClass6_Sub2_21.aLong317 == arg0) {
				@Pc(37) Class6_Sub2 local37 = this.aClass6_Sub2_21;
				this.aClass6_Sub2_21 = this.aClass6_Sub2_21.aClass6_Sub2_65;
				return local37;
			}
		}
		this.aClass6_Sub2_21 = null;
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)Lclient!ig;")
	public Class6_Sub2 method2182() {
		if (this.aClass6_Sub2_21 == null) {
			return null;
		}
		@Pc(24) Class6_Sub2 local24 = this.aClass6_Sub2Array1[(int) (this.aLong70 & (long) (this.anInt2282 - 1))];
		while (this.aClass6_Sub2_21 != local24) {
			if (this.aLong70 == this.aClass6_Sub2_21.aLong317) {
				@Pc(42) Class6_Sub2 local42 = this.aClass6_Sub2_21;
				this.aClass6_Sub2_21 = this.aClass6_Sub2_21.aClass6_Sub2_65;
				return local42;
			}
			this.aClass6_Sub2_21 = this.aClass6_Sub2_21.aClass6_Sub2_65;
		}
		this.aClass6_Sub2_21 = null;
		return false ? null : null;
	}
}
