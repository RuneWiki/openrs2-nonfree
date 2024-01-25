import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class162 {

	@OriginalMember(owner = "client!po", name = "d", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Lclient!lo;")
	private Class3_Sub7 aClass3_Sub7_45;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "[Lclient!lo;")
	private final Class3_Sub7[] aClass3_Sub7Array1;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	private final int anInt4820;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.aClass3_Sub7Array1 = new Class3_Sub7[arg0];
		this.anInt4820 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[local10] = new Class3_Sub7();
			local20.aClass3_Sub7_61 = local20;
			local20.aClass3_Sub7_62 = local20;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IJ)Lclient!lo;")
	public Class3_Sub7 method4151(@OriginalArg(1) long arg0) {
		this.aLong156 = arg0;
		@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[(int) (arg0 & (long) (this.anInt4820 - 1))];
		for (this.aClass3_Sub7_45 = local20.aClass3_Sub7_62; this.aClass3_Sub7_45 != local20; this.aClass3_Sub7_45 = this.aClass3_Sub7_45.aClass3_Sub7_62) {
			if (this.aClass3_Sub7_45.aLong198 == arg0) {
				@Pc(39) Class3_Sub7 local39 = this.aClass3_Sub7_45;
				this.aClass3_Sub7_45 = this.aClass3_Sub7_45.aClass3_Sub7_62;
				return local39;
			}
		}
		this.aClass3_Sub7_45 = null;
		return null;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)Lclient!lo;")
	public Class3_Sub7 method4156() {
		if (this.aClass3_Sub7_45 == null) {
			return null;
		}
		@Pc(23) Class3_Sub7 local23 = this.aClass3_Sub7Array1[(int) (this.aLong156 & (long) (this.anInt4820 - 1))];
		while (this.aClass3_Sub7_45 != local23) {
			if (this.aClass3_Sub7_45.aLong198 == this.aLong156) {
				@Pc(39) Class3_Sub7 local39 = this.aClass3_Sub7_45;
				this.aClass3_Sub7_45 = this.aClass3_Sub7_45.aClass3_Sub7_62;
				return local39;
			}
			this.aClass3_Sub7_45 = this.aClass3_Sub7_45.aClass3_Sub7_62;
		}
		this.aClass3_Sub7_45 = null;
		return null;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!lo;IJ)V")
	public void method4158(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_Sub7_61 != null) {
			arg0.method5385();
		}
		@Pc(29) Class3_Sub7 local29 = this.aClass3_Sub7Array1[(int) ((long) (this.anInt4820 - 1) & arg1)];
		arg0.aClass3_Sub7_61 = local29.aClass3_Sub7_61;
		arg0.aClass3_Sub7_62 = local29;
		arg0.aClass3_Sub7_61.aClass3_Sub7_62 = arg0;
		arg0.aLong198 = arg1;
		arg0.aClass3_Sub7_62.aClass3_Sub7_61 = arg0;
	}
}
