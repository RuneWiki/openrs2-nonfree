import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class170 {

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Lclient!daa;")
	private Class2_Sub1 aClass2_Sub1_29;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[Lclient!daa;")
	private final Class2_Sub1[] aClass2_Sub1Array1;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	private final int anInt4997;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
	public Class170(@OriginalArg(0) int arg0) {
		this.aClass2_Sub1Array1 = new Class2_Sub1[arg0];
		this.anInt4997 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub1 local20 = this.aClass2_Sub1Array1[local10] = new Class2_Sub1();
			local20.aClass2_Sub1_67 = local20;
			local20.aClass2_Sub1_66 = local20;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!daa;JI)V")
	public void method4521(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_Sub1_66 != null) {
			arg0.method9377();
		}
		@Pc(21) Class2_Sub1 local21 = this.aClass2_Sub1Array1[(int) (arg1 & (long) (this.anInt4997 - 1))];
		arg0.aClass2_Sub1_67 = local21;
		arg0.aClass2_Sub1_66 = local21.aClass2_Sub1_66;
		arg0.aClass2_Sub1_66.aClass2_Sub1_67 = arg0;
		arg0.aClass2_Sub1_67.aClass2_Sub1_66 = arg0;
		arg0.aLong296 = arg1;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Lclient!daa;")
	public Class2_Sub1 method4522() {
		if (this.aClass2_Sub1_29 == null) {
			return null;
		}
		@Pc(23) Class2_Sub1 local23 = this.aClass2_Sub1Array1[(int) (this.aLong134 & (long) (this.anInt4997 - 1))];
		while (local23 != this.aClass2_Sub1_29) {
			if (this.aLong134 == this.aClass2_Sub1_29.aLong296) {
				@Pc(35) Class2_Sub1 local35 = this.aClass2_Sub1_29;
				this.aClass2_Sub1_29 = this.aClass2_Sub1_29.aClass2_Sub1_67;
				return local35;
			}
			this.aClass2_Sub1_29 = this.aClass2_Sub1_29.aClass2_Sub1_67;
		}
		this.aClass2_Sub1_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(JB)Lclient!daa;")
	public Class2_Sub1 method4524(@OriginalArg(0) long arg0) {
		this.aLong134 = arg0;
		@Pc(25) Class2_Sub1 local25 = this.aClass2_Sub1Array1[(int) (arg0 & (long) (this.anInt4997 - 1))];
		for (this.aClass2_Sub1_29 = local25.aClass2_Sub1_67; this.aClass2_Sub1_29 != local25; this.aClass2_Sub1_29 = this.aClass2_Sub1_29.aClass2_Sub1_67) {
			if (this.aClass2_Sub1_29.aLong296 == arg0) {
				@Pc(40) Class2_Sub1 local40 = this.aClass2_Sub1_29;
				this.aClass2_Sub1_29 = this.aClass2_Sub1_29.aClass2_Sub1_67;
				return local40;
			}
		}
		this.aClass2_Sub1_29 = null;
		return null;
	}
}
