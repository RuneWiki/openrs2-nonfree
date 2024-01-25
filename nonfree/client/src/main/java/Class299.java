import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class299 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!lda;")
	private Class3_Sub6 aClass3_Sub6_55;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "J")
	private long aLong247;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "[Lclient!lda;")
	private final Class3_Sub6[] aClass3_Sub6Array1;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	private final int anInt8382;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(I)V")
	public Class299(@OriginalArg(0) int arg0) {
		this.aClass3_Sub6Array1 = new Class3_Sub6[arg0];
		this.anInt8382 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub6 local20 = this.aClass3_Sub6Array1[local10] = new Class3_Sub6();
			local20.aClass3_Sub6_66 = local20;
			local20.aClass3_Sub6_67 = local20;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IJ)Lclient!lda;")
	public Class3_Sub6 method7102(@OriginalArg(1) long arg0) {
		this.aLong247 = arg0;
		@Pc(26) Class3_Sub6 local26 = this.aClass3_Sub6Array1[(int) (arg0 & (long) (this.anInt8382 - 1))];
		for (this.aClass3_Sub6_55 = local26.aClass3_Sub6_67; this.aClass3_Sub6_55 != local26; this.aClass3_Sub6_55 = this.aClass3_Sub6_55.aClass3_Sub6_67) {
			if (arg0 == this.aClass3_Sub6_55.aLong290) {
				@Pc(45) Class3_Sub6 local45 = this.aClass3_Sub6_55;
				this.aClass3_Sub6_55 = this.aClass3_Sub6_55.aClass3_Sub6_67;
				return local45;
			}
		}
		this.aClass3_Sub6_55 = null;
		return null;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!lda;IJ)V")
	public void method7103(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_Sub6_66 != null) {
			arg0.method8342();
		}
		@Pc(26) Class3_Sub6 local26 = this.aClass3_Sub6Array1[(int) (arg1 & (long) (this.anInt8382 - 1))];
		arg0.aClass3_Sub6_66 = local26.aClass3_Sub6_66;
		arg0.aClass3_Sub6_67 = local26;
		arg0.aClass3_Sub6_66.aClass3_Sub6_67 = arg0;
		arg0.aClass3_Sub6_67.aClass3_Sub6_66 = arg0;
		arg0.aLong290 = arg1;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)Lclient!lda;")
	public Class3_Sub6 method7107() {
		if (this.aClass3_Sub6_55 == null) {
			return null;
		}
		@Pc(23) Class3_Sub6 local23 = this.aClass3_Sub6Array1[(int) (this.aLong247 & (long) (this.anInt8382 - 1))];
		while (local23 != this.aClass3_Sub6_55) {
			if (this.aLong247 == this.aClass3_Sub6_55.aLong290) {
				@Pc(35) Class3_Sub6 local35 = this.aClass3_Sub6_55;
				this.aClass3_Sub6_55 = this.aClass3_Sub6_55.aClass3_Sub6_67;
				return local35;
			}
			this.aClass3_Sub6_55 = this.aClass3_Sub6_55.aClass3_Sub6_67;
		}
		this.aClass3_Sub6_55 = null;
		return null;
	}
}
