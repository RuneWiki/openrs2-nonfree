import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class263 {

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "Lclient!lm;")
	private Class6_Sub4 aClass6_Sub4_41;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "[Lclient!lm;")
	private final Class6_Sub4[] aClass6_Sub4Array1;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	private final int anInt7430;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I)V")
	public Class263(@OriginalArg(0) int arg0) {
		this.aClass6_Sub4Array1 = new Class6_Sub4[arg0];
		this.anInt7430 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub4 local20 = this.aClass6_Sub4Array1[local10] = new Class6_Sub4();
			local20.aClass6_Sub4_67 = local20;
			local20.aClass6_Sub4_66 = local20;
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!lm;BJ)V")
	public void method6425(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass6_Sub4_66 != null) {
			arg0.method9043();
		}
		@Pc(23) Class6_Sub4 local23 = this.aClass6_Sub4Array1[(int) (arg1 & (long) (this.anInt7430 - 1))];
		arg0.aClass6_Sub4_67 = local23;
		arg0.aClass6_Sub4_66 = local23.aClass6_Sub4_66;
		arg0.aClass6_Sub4_66.aClass6_Sub4_67 = arg0;
		arg0.aLong310 = arg1;
		arg0.aClass6_Sub4_67.aClass6_Sub4_66 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Lclient!lm;")
	public Class6_Sub4 method6426() {
		if (this.aClass6_Sub4_41 == null) {
			return null;
		}
		@Pc(23) Class6_Sub4 local23 = this.aClass6_Sub4Array1[(int) (this.aLong214 & (long) (this.anInt7430 - 1))];
		while (this.aClass6_Sub4_41 != local23) {
			if (this.aClass6_Sub4_41.aLong310 == this.aLong214) {
				@Pc(35) Class6_Sub4 local35 = this.aClass6_Sub4_41;
				this.aClass6_Sub4_41 = this.aClass6_Sub4_41.aClass6_Sub4_67;
				return local35;
			}
			this.aClass6_Sub4_41 = this.aClass6_Sub4_41.aClass6_Sub4_67;
		}
		this.aClass6_Sub4_41 = null;
		return null;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(JI)Lclient!lm;")
	public Class6_Sub4 method6428(@OriginalArg(0) long arg0) {
		this.aLong214 = arg0;
		@Pc(20) Class6_Sub4 local20 = this.aClass6_Sub4Array1[(int) (arg0 & (long) (this.anInt7430 - 1))];
		for (this.aClass6_Sub4_41 = local20.aClass6_Sub4_67; this.aClass6_Sub4_41 != local20; this.aClass6_Sub4_41 = this.aClass6_Sub4_41.aClass6_Sub4_67) {
			if (this.aClass6_Sub4_41.aLong310 == arg0) {
				@Pc(35) Class6_Sub4 local35 = this.aClass6_Sub4_41;
				this.aClass6_Sub4_41 = this.aClass6_Sub4_41.aClass6_Sub4_67;
				return local35;
			}
		}
		this.aClass6_Sub4_41 = null;
		return null;
	}
}
