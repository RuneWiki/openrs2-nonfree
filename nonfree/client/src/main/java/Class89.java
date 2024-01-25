import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class89 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!bk;")
	private Class1_Sub6 aClass1_Sub6_17;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	private final int anInt2059;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "[Lclient!bk;")
	private final Class1_Sub6[] aClass1_Sub6Array1;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt2059 = arg0;
		this.aClass1_Sub6Array1 = new Class1_Sub6[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub6 local20 = this.aClass1_Sub6Array1[local10] = new Class1_Sub6();
			local20.aClass1_Sub6_53 = local20;
			local20.aClass1_Sub6_54 = local20;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lclient!bk;")
	public Class1_Sub6 method1694() {
		if (this.aClass1_Sub6_17 == null) {
			return null;
		}
		@Pc(23) Class1_Sub6 local23 = this.aClass1_Sub6Array1[(int) ((long) (this.anInt2059 - 1) & this.aLong62)];
		while (this.aClass1_Sub6_17 != local23) {
			if (this.aClass1_Sub6_17.aLong208 == this.aLong62) {
				@Pc(43) Class1_Sub6 local43 = this.aClass1_Sub6_17;
				this.aClass1_Sub6_17 = this.aClass1_Sub6_17.aClass1_Sub6_54;
				return local43;
			}
			this.aClass1_Sub6_17 = this.aClass1_Sub6_17.aClass1_Sub6_54;
		}
		this.aClass1_Sub6_17 = null;
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)Lclient!bk;")
	public Class1_Sub6 method1696(@OriginalArg(1) long arg0) {
		this.aLong62 = arg0;
		@Pc(20) Class1_Sub6 local20 = this.aClass1_Sub6Array1[(int) (arg0 & (long) (this.anInt2059 - 1))];
		for (this.aClass1_Sub6_17 = local20.aClass1_Sub6_54; this.aClass1_Sub6_17 != local20; this.aClass1_Sub6_17 = this.aClass1_Sub6_17.aClass1_Sub6_54) {
			if (this.aClass1_Sub6_17.aLong208 == arg0) {
				@Pc(39) Class1_Sub6 local39 = this.aClass1_Sub6_17;
				this.aClass1_Sub6_17 = this.aClass1_Sub6_17.aClass1_Sub6_54;
				return local39;
			}
		}
		this.aClass1_Sub6_17 = null;
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(JZLclient!bk;)V")
	public void method1698(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg1.aClass1_Sub6_53 != null) {
			arg1.method5580();
		}
		@Pc(21) Class1_Sub6 local21 = this.aClass1_Sub6Array1[(int) ((long) (this.anInt2059 - 1) & arg0)];
		arg1.aClass1_Sub6_53 = local21.aClass1_Sub6_53;
		arg1.aClass1_Sub6_54 = local21;
		arg1.aClass1_Sub6_53.aClass1_Sub6_54 = arg1;
		arg1.aClass1_Sub6_54.aClass1_Sub6_53 = arg1;
		arg1.aLong208 = arg0;
	}
}
