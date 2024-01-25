import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class100 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Lclient!js;")
	private Class2_Sub1 aClass2_Sub1_24;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	private final int anInt2483;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[Lclient!js;")
	private final Class2_Sub1[] aClass2_Sub1Array1;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V")
	public Class100(@OriginalArg(0) int arg0) {
		this.anInt2483 = arg0;
		this.aClass2_Sub1Array1 = new Class2_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub1 local20 = this.aClass2_Sub1Array1[local10] = new Class2_Sub1();
			local20.aClass2_Sub1_53 = local20;
			local20.aClass2_Sub1_54 = local20;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(JI)Lclient!js;")
	public Class2_Sub1 method2334(@OriginalArg(0) long arg0) {
		this.aLong78 = arg0;
		@Pc(25) Class2_Sub1 local25 = this.aClass2_Sub1Array1[(int) ((long) (this.anInt2483 - 1) & arg0)];
		for (this.aClass2_Sub1_24 = local25.aClass2_Sub1_54; this.aClass2_Sub1_24 != local25; this.aClass2_Sub1_24 = this.aClass2_Sub1_24.aClass2_Sub1_54) {
			if (this.aClass2_Sub1_24.aLong209 == arg0) {
				@Pc(40) Class2_Sub1 local40 = this.aClass2_Sub1_24;
				this.aClass2_Sub1_24 = this.aClass2_Sub1_24.aClass2_Sub1_54;
				return local40;
			}
		}
		this.aClass2_Sub1_24 = null;
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Lclient!js;")
	public Class2_Sub1 method2335() {
		if (this.aClass2_Sub1_24 == null) {
			return null;
		}
		@Pc(31) Class2_Sub1 local31 = this.aClass2_Sub1Array1[(int) (this.aLong78 & (long) (this.anInt2483 - 1))];
		while (local31 != this.aClass2_Sub1_24) {
			if (this.aLong78 == this.aClass2_Sub1_24.aLong209) {
				@Pc(47) Class2_Sub1 local47 = this.aClass2_Sub1_24;
				this.aClass2_Sub1_24 = this.aClass2_Sub1_24.aClass2_Sub1_54;
				return local47;
			}
			this.aClass2_Sub1_24 = this.aClass2_Sub1_24.aClass2_Sub1_54;
		}
		this.aClass2_Sub1_24 = null;
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!js;JI)V")
	public void method2339(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_Sub1_53 != null) {
			arg0.method5748();
		}
		@Pc(21) Class2_Sub1 local21 = this.aClass2_Sub1Array1[(int) ((long) (this.anInt2483 - 1) & arg1)];
		arg0.aClass2_Sub1_53 = local21.aClass2_Sub1_53;
		arg0.aClass2_Sub1_54 = local21;
		arg0.aClass2_Sub1_53.aClass2_Sub1_54 = arg0;
		arg0.aClass2_Sub1_54.aClass2_Sub1_53 = arg0;
		arg0.aLong209 = arg1;
	}
}
