import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class103 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!tm;")
	private Class7_Sub4 aClass7_Sub4_24;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[Lclient!tm;")
	private final Class7_Sub4[] aClass7_Sub4Array1;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	private final int anInt2824;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V")
	public Class103(@OriginalArg(0) int arg0) {
		this.aClass7_Sub4Array1 = new Class7_Sub4[arg0];
		this.anInt2824 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class7_Sub4 local20 = this.aClass7_Sub4Array1[local10] = new Class7_Sub4();
			local20.aClass7_Sub4_57 = local20;
			local20.aClass7_Sub4_58 = local20;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(JI)Lclient!tm;")
	public Class7_Sub4 method2280(@OriginalArg(0) long arg0) {
		this.aLong80 = arg0;
		@Pc(20) Class7_Sub4 local20 = this.aClass7_Sub4Array1[(int) (arg0 & (long) (this.anInt2824 - 1))];
		for (this.aClass7_Sub4_24 = local20.aClass7_Sub4_57; this.aClass7_Sub4_24 != local20; this.aClass7_Sub4_24 = this.aClass7_Sub4_24.aClass7_Sub4_57) {
			if (this.aClass7_Sub4_24.aLong225 == arg0) {
				@Pc(39) Class7_Sub4 local39 = this.aClass7_Sub4_24;
				this.aClass7_Sub4_24 = this.aClass7_Sub4_24.aClass7_Sub4_57;
				return local39;
			}
		}
		this.aClass7_Sub4_24 = null;
		return null;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lclient!tm;")
	public Class7_Sub4 method2282() {
		if (this.aClass7_Sub4_24 == null) {
			return null;
		}
		@Pc(31) Class7_Sub4 local31 = this.aClass7_Sub4Array1[(int) (this.aLong80 & (long) (this.anInt2824 - 1))];
		while (local31 != this.aClass7_Sub4_24) {
			if (this.aLong80 == this.aClass7_Sub4_24.aLong225) {
				@Pc(43) Class7_Sub4 local43 = this.aClass7_Sub4_24;
				this.aClass7_Sub4_24 = this.aClass7_Sub4_24.aClass7_Sub4_57;
				return local43;
			}
			this.aClass7_Sub4_24 = this.aClass7_Sub4_24.aClass7_Sub4_57;
		}
		this.aClass7_Sub4_24 = null;
		return null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!tm;J)V")
	public void method2283(@OriginalArg(1) Class7_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass7_Sub4_58 != null) {
			arg0.method5661();
		}
		@Pc(21) Class7_Sub4 local21 = this.aClass7_Sub4Array1[(int) ((long) (this.anInt2824 - 1) & arg1)];
		arg0.aClass7_Sub4_58 = local21.aClass7_Sub4_58;
		arg0.aClass7_Sub4_57 = local21;
		arg0.aClass7_Sub4_58.aClass7_Sub4_57 = arg0;
		arg0.aLong225 = arg1;
		arg0.aClass7_Sub4_57.aClass7_Sub4_58 = arg0;
	}
}
