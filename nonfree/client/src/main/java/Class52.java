import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class52 {

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!bd;")
	private Class2_Sub1 aClass2_Sub1_11;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "[Lclient!bd;")
	private final Class2_Sub1[] aClass2_Sub1Array1;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	private final int anInt1192;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
	public Class52(@OriginalArg(0) int arg0) {
		this.aClass2_Sub1Array1 = new Class2_Sub1[arg0];
		this.anInt1192 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub1 local20 = this.aClass2_Sub1Array1[local10] = new Class2_Sub1();
			local20.aClass2_Sub1_58 = local20;
			local20.aClass2_Sub1_57 = local20;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JLclient!bd;Z)V")
	public void method1094(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		if (arg1.aClass2_Sub1_58 != null) {
			arg1.method5838();
		}
		@Pc(21) Class2_Sub1 local21 = this.aClass2_Sub1Array1[(int) ((long) (this.anInt1192 - 1) & arg0)];
		arg1.aClass2_Sub1_58 = local21.aClass2_Sub1_58;
		arg1.aClass2_Sub1_57 = local21;
		arg1.aClass2_Sub1_58.aClass2_Sub1_57 = arg1;
		arg1.aClass2_Sub1_57.aClass2_Sub1_58 = arg1;
		arg1.aLong378 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Lclient!bd;")
	public Class2_Sub1 method1098() {
		if (this.aClass2_Sub1_11 == null) {
			return null;
		}
		@Pc(28) Class2_Sub1 local28 = this.aClass2_Sub1Array1[(int) (this.aLong78 & (long) (this.anInt1192 - 1))];
		while (this.aClass2_Sub1_11 != local28) {
			if (this.aClass2_Sub1_11.aLong378 == this.aLong78) {
				@Pc(40) Class2_Sub1 local40 = this.aClass2_Sub1_11;
				this.aClass2_Sub1_11 = this.aClass2_Sub1_11.aClass2_Sub1_57;
				return local40;
			}
			this.aClass2_Sub1_11 = this.aClass2_Sub1_11.aClass2_Sub1_57;
		}
		this.aClass2_Sub1_11 = null;
		return null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JB)Lclient!bd;")
	public Class2_Sub1 method1099(@OriginalArg(0) long arg0) {
		this.aLong78 = arg0;
		@Pc(20) Class2_Sub1 local20 = this.aClass2_Sub1Array1[(int) ((long) (this.anInt1192 - 1) & arg0)];
		for (this.aClass2_Sub1_11 = local20.aClass2_Sub1_57; this.aClass2_Sub1_11 != local20; this.aClass2_Sub1_11 = this.aClass2_Sub1_11.aClass2_Sub1_57) {
			if (arg0 == this.aClass2_Sub1_11.aLong378) {
				@Pc(35) Class2_Sub1 local35 = this.aClass2_Sub1_11;
				this.aClass2_Sub1_11 = this.aClass2_Sub1_11.aClass2_Sub1_57;
				return local35;
			}
		}
		this.aClass2_Sub1_11 = null;
		return null;
	}
}
