import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class142 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!vs;")
	private Class3_Sub7 aClass3_Sub7_38;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[Lclient!vs;")
	private final Class3_Sub7[] aClass3_Sub7Array1;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	private final int anInt3924;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	public Class142(@OriginalArg(0) int arg0) {
		this.aClass3_Sub7Array1 = new Class3_Sub7[arg0];
		this.anInt3924 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[local10] = new Class3_Sub7();
			local20.aClass3_Sub7_61 = local20;
			local20.aClass3_Sub7_62 = local20;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lclient!vs;")
	public Class3_Sub7 method3498() {
		if (this.aClass3_Sub7_38 == null) {
			return null;
		}
		@Pc(28) Class3_Sub7 local28 = this.aClass3_Sub7Array1[(int) (this.aLong119 & (long) (this.anInt3924 - 1))];
		while (this.aClass3_Sub7_38 != local28) {
			if (this.aClass3_Sub7_38.aLong263 == this.aLong119) {
				@Pc(44) Class3_Sub7 local44 = this.aClass3_Sub7_38;
				this.aClass3_Sub7_38 = this.aClass3_Sub7_38.aClass3_Sub7_61;
				return local44;
			}
			this.aClass3_Sub7_38 = this.aClass3_Sub7_38.aClass3_Sub7_61;
		}
		this.aClass3_Sub7_38 = null;
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)Lclient!vs;")
	public Class3_Sub7 method3500(@OriginalArg(1) long arg0) {
		this.aLong119 = arg0;
		@Pc(25) Class3_Sub7 local25 = this.aClass3_Sub7Array1[(int) (arg0 & (long) (this.anInt3924 - 1))];
		for (this.aClass3_Sub7_38 = local25.aClass3_Sub7_61; this.aClass3_Sub7_38 != local25; this.aClass3_Sub7_38 = this.aClass3_Sub7_38.aClass3_Sub7_61) {
			if (arg0 == this.aClass3_Sub7_38.aLong263) {
				@Pc(44) Class3_Sub7 local44 = this.aClass3_Sub7_38;
				this.aClass3_Sub7_38 = this.aClass3_Sub7_38.aClass3_Sub7_61;
				return local44;
			}
		}
		this.aClass3_Sub7_38 = null;
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JBLclient!vs;)V")
	public void method3501(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_62 != null) {
			arg1.method7614();
		}
		@Pc(21) Class3_Sub7 local21 = this.aClass3_Sub7Array1[(int) ((long) (this.anInt3924 - 1) & arg0)];
		arg1.aClass3_Sub7_61 = local21;
		arg1.aClass3_Sub7_62 = local21.aClass3_Sub7_62;
		arg1.aClass3_Sub7_62.aClass3_Sub7_61 = arg1;
		arg1.aClass3_Sub7_61.aClass3_Sub7_62 = arg1;
		arg1.aLong263 = arg0;
	}
}
