import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class37 {

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "Lclient!ff;")
	private Class1_Sub2 aClass1_Sub2_11;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "[Lclient!ff;")
	private final Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	private final int anInt1218;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class37(@OriginalArg(0) int arg0) {
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		this.anInt1218 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub2 local20 = this.aClass1_Sub2Array1[local10] = new Class1_Sub2();
			local20.aClass1_Sub2_59 = local20;
			local20.aClass1_Sub2_60 = local20;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ff;JZ)V")
	public void method1280(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_Sub2_60 != null) {
			arg0.method7390();
		}
		@Pc(25) Class1_Sub2 local25 = this.aClass1_Sub2Array1[(int) ((long) (this.anInt1218 - 1) & arg1)];
		arg0.aClass1_Sub2_60 = local25.aClass1_Sub2_60;
		arg0.aClass1_Sub2_59 = local25;
		arg0.aClass1_Sub2_60.aClass1_Sub2_59 = arg0;
		arg0.aClass1_Sub2_59.aClass1_Sub2_60 = arg0;
		arg0.aLong228 = arg1;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(JI)Lclient!ff;")
	public Class1_Sub2 method1281(@OriginalArg(0) long arg0) {
		this.aLong28 = arg0;
		@Pc(20) Class1_Sub2 local20 = this.aClass1_Sub2Array1[(int) (arg0 & (long) (this.anInt1218 - 1))];
		for (this.aClass1_Sub2_11 = local20.aClass1_Sub2_59; this.aClass1_Sub2_11 != local20; this.aClass1_Sub2_11 = this.aClass1_Sub2_11.aClass1_Sub2_59) {
			if (this.aClass1_Sub2_11.aLong228 == arg0) {
				@Pc(47) Class1_Sub2 local47 = this.aClass1_Sub2_11;
				this.aClass1_Sub2_11 = this.aClass1_Sub2_11.aClass1_Sub2_59;
				return local47;
			}
		}
		this.aClass1_Sub2_11 = null;
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lclient!ff;")
	public Class1_Sub2 method1282() {
		if (this.aClass1_Sub2_11 == null) {
			return null;
		}
		@Pc(23) Class1_Sub2 local23 = this.aClass1_Sub2Array1[(int) ((long) (this.anInt1218 - 1) & this.aLong28)];
		while (this.aClass1_Sub2_11 != local23) {
			if (this.aLong28 == this.aClass1_Sub2_11.aLong228) {
				@Pc(39) Class1_Sub2 local39 = this.aClass1_Sub2_11;
				this.aClass1_Sub2_11 = this.aClass1_Sub2_11.aClass1_Sub2_59;
				return local39;
			}
			this.aClass1_Sub2_11 = this.aClass1_Sub2_11.aClass1_Sub2_59;
		}
		this.aClass1_Sub2_11 = null;
		return null;
	}
}
