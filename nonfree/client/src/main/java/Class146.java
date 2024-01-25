import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class146 {

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "Lclient!tg;")
	private Class7_Sub1 aClass7_Sub1_39;

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "[Lclient!tg;")
	private final Class7_Sub1[] aClass7_Sub1Array1;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
	private final int anInt4414;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(I)V")
	public Class146(@OriginalArg(0) int arg0) {
		this.aClass7_Sub1Array1 = new Class7_Sub1[arg0];
		this.anInt4414 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class7_Sub1 local20 = this.aClass7_Sub1Array1[local10] = new Class7_Sub1();
			local20.aClass7_Sub1_62 = local20;
			local20.aClass7_Sub1_61 = local20;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Lclient!tg;")
	public Class7_Sub1 method3902() {
		if (this.aClass7_Sub1_39 == null) {
			return null;
		}
		@Pc(28) Class7_Sub1 local28 = this.aClass7_Sub1Array1[(int) ((long) (this.anInt4414 - 1) & this.aLong150)];
		while (this.aClass7_Sub1_39 != local28) {
			if (this.aLong150 == this.aClass7_Sub1_39.aLong222) {
				@Pc(40) Class7_Sub1 local40 = this.aClass7_Sub1_39;
				this.aClass7_Sub1_39 = this.aClass7_Sub1_39.aClass7_Sub1_61;
				return local40;
			}
			this.aClass7_Sub1_39 = this.aClass7_Sub1_39.aClass7_Sub1_61;
		}
		this.aClass7_Sub1_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!tg;JZ)V")
	public void method3905(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass7_Sub1_62 != null) {
			arg0.method5509();
		}
		@Pc(21) Class7_Sub1 local21 = this.aClass7_Sub1Array1[(int) ((long) (this.anInt4414 - 1) & arg1)];
		arg0.aClass7_Sub1_62 = local21.aClass7_Sub1_62;
		arg0.aClass7_Sub1_61 = local21;
		arg0.aClass7_Sub1_62.aClass7_Sub1_61 = arg0;
		arg0.aClass7_Sub1_61.aClass7_Sub1_62 = arg0;
		arg0.aLong222 = arg1;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZJ)Lclient!tg;")
	public Class7_Sub1 method3908(@OriginalArg(1) long arg0) {
		this.aLong150 = arg0;
		@Pc(20) Class7_Sub1 local20 = this.aClass7_Sub1Array1[(int) (arg0 & (long) (this.anInt4414 - 1))];
		for (this.aClass7_Sub1_39 = local20.aClass7_Sub1_61; this.aClass7_Sub1_39 != local20; this.aClass7_Sub1_39 = this.aClass7_Sub1_39.aClass7_Sub1_61) {
			if (this.aClass7_Sub1_39.aLong222 == arg0) {
				@Pc(39) Class7_Sub1 local39 = this.aClass7_Sub1_39;
				this.aClass7_Sub1_39 = this.aClass7_Sub1_39.aClass7_Sub1_61;
				return local39;
			}
		}
		this.aClass7_Sub1_39 = null;
		return null;
	}
}
