import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class249 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!ut;")
	private Class1_Sub2 aClass1_Sub2_54;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "[Lclient!ut;")
	private final Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	private final int anInt7282;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	public Class249(@OriginalArg(0) int arg0) {
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		this.anInt7282 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub2 local20 = this.aClass1_Sub2Array1[local10] = new Class1_Sub2();
			local20.aClass1_Sub2_57 = local20;
			local20.aClass1_Sub2_58 = local20;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(JBLclient!ut;)V")
	public void method5639(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg1.aClass1_Sub2_58 != null) {
			arg1.method5883();
		}
		@Pc(21) Class1_Sub2 local21 = this.aClass1_Sub2Array1[(int) (arg0 & (long) (this.anInt7282 - 1))];
		arg1.aClass1_Sub2_57 = local21;
		arg1.aClass1_Sub2_58 = local21.aClass1_Sub2_58;
		arg1.aClass1_Sub2_58.aClass1_Sub2_57 = arg1;
		arg1.aClass1_Sub2_57.aClass1_Sub2_58 = arg1;
		arg1.aLong221 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Lclient!ut;")
	public Class1_Sub2 method5640() {
		if (this.aClass1_Sub2_54 == null) {
			return null;
		}
		@Pc(31) Class1_Sub2 local31 = this.aClass1_Sub2Array1[(int) (this.aLong212 & (long) (this.anInt7282 - 1))];
		while (local31 != this.aClass1_Sub2_54) {
			if (this.aClass1_Sub2_54.aLong221 == this.aLong212) {
				@Pc(43) Class1_Sub2 local43 = this.aClass1_Sub2_54;
				this.aClass1_Sub2_54 = this.aClass1_Sub2_54.aClass1_Sub2_57;
				return local43;
			}
			this.aClass1_Sub2_54 = this.aClass1_Sub2_54.aClass1_Sub2_57;
		}
		this.aClass1_Sub2_54 = null;
		return null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(JI)Lclient!ut;")
	public Class1_Sub2 method5642(@OriginalArg(0) long arg0) {
		this.aLong212 = arg0;
		@Pc(25) Class1_Sub2 local25 = this.aClass1_Sub2Array1[(int) ((long) (this.anInt7282 - 1) & arg0)];
		for (this.aClass1_Sub2_54 = local25.aClass1_Sub2_57; this.aClass1_Sub2_54 != local25; this.aClass1_Sub2_54 = this.aClass1_Sub2_54.aClass1_Sub2_57) {
			if (arg0 == this.aClass1_Sub2_54.aLong221) {
				@Pc(44) Class1_Sub2 local44 = this.aClass1_Sub2_54;
				this.aClass1_Sub2_54 = this.aClass1_Sub2_54.aClass1_Sub2_57;
				return local44;
			}
		}
		this.aClass1_Sub2_54 = null;
		return null;
	}
}
