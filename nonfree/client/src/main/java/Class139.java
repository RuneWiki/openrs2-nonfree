import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class139 {

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "Lclient!bm;")
	private Class3_Sub7 aClass3_Sub7_31;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
	private final int anInt4586;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "[Lclient!bm;")
	private final Class3_Sub7[] aClass3_Sub7Array1;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(I)V")
	public Class139(@OriginalArg(0) int arg0) {
		this.anInt4586 = arg0;
		this.aClass3_Sub7Array1 = new Class3_Sub7[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[local10] = new Class3_Sub7();
			local20.aClass3_Sub7_62 = local20;
			local20.aClass3_Sub7_61 = local20;
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!bm;J)V")
	public void method3675(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_Sub7_62 != null) {
			arg0.method8136();
		}
		@Pc(21) Class3_Sub7 local21 = this.aClass3_Sub7Array1[(int) (arg1 & (long) (this.anInt4586 - 1))];
		arg0.aClass3_Sub7_61 = local21;
		arg0.aClass3_Sub7_62 = local21.aClass3_Sub7_62;
		arg0.aClass3_Sub7_62.aClass3_Sub7_61 = arg0;
		arg0.aLong263 = arg1;
		arg0.aClass3_Sub7_61.aClass3_Sub7_62 = arg0;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IJ)Lclient!bm;")
	public Class3_Sub7 method3678(@OriginalArg(1) long arg0) {
		this.aLong105 = arg0;
		@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[(int) ((long) (this.anInt4586 - 1) & arg0)];
		for (this.aClass3_Sub7_31 = local20.aClass3_Sub7_61; this.aClass3_Sub7_31 != local20; this.aClass3_Sub7_31 = this.aClass3_Sub7_31.aClass3_Sub7_61) {
			if (arg0 == this.aClass3_Sub7_31.aLong263) {
				@Pc(39) Class3_Sub7 local39 = this.aClass3_Sub7_31;
				this.aClass3_Sub7_31 = this.aClass3_Sub7_31.aClass3_Sub7_61;
				return local39;
			}
		}
		this.aClass3_Sub7_31 = null;
		return null;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)Lclient!bm;")
	public Class3_Sub7 method3679() {
		if (this.aClass3_Sub7_31 == null) {
			return null;
		}
		@Pc(31) Class3_Sub7 local31 = this.aClass3_Sub7Array1[(int) ((long) (this.anInt4586 - 1) & this.aLong105)];
		while (this.aClass3_Sub7_31 != local31) {
			if (this.aClass3_Sub7_31.aLong263 == this.aLong105) {
				@Pc(47) Class3_Sub7 local47 = this.aClass3_Sub7_31;
				this.aClass3_Sub7_31 = this.aClass3_Sub7_31.aClass3_Sub7_61;
				return local47;
			}
			this.aClass3_Sub7_31 = this.aClass3_Sub7_31.aClass3_Sub7_61;
		}
		this.aClass3_Sub7_31 = null;
		return null;
	}
}
