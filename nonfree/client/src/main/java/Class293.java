import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class293 {

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Lclient!ab;")
	private Class3_Sub1 aClass3_Sub1_56;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	private final int anInt8772;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "[Lclient!ab;")
	private final Class3_Sub1[] aClass3_Sub1Array1;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
	public Class293(@OriginalArg(0) int arg0) {
		this.anInt8772 = arg0;
		this.aClass3_Sub1Array1 = new Class3_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub1 local20 = this.aClass3_Sub1Array1[local10] = new Class3_Sub1();
			local20.aClass3_Sub1_67 = local20;
			local20.aClass3_Sub1_66 = local20;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Lclient!ab;")
	public Class3_Sub1 method7242() {
		if (this.aClass3_Sub1_56 == null) {
			return null;
		}
		@Pc(28) Class3_Sub1 local28 = this.aClass3_Sub1Array1[(int) ((long) (this.anInt8772 - 1) & this.aLong220)];
		while (this.aClass3_Sub1_56 != local28) {
			if (this.aClass3_Sub1_56.aLong275 == this.aLong220) {
				@Pc(44) Class3_Sub1 local44 = this.aClass3_Sub1_56;
				this.aClass3_Sub1_56 = this.aClass3_Sub1_56.aClass3_Sub1_66;
				return local44;
			}
			this.aClass3_Sub1_56 = this.aClass3_Sub1_56.aClass3_Sub1_66;
		}
		this.aClass3_Sub1_56 = null;
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!ab;JI)V")
	public void method7244(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method8621();
		}
		@Pc(25) Class3_Sub1 local25 = this.aClass3_Sub1Array1[(int) (arg1 & (long) (this.anInt8772 - 1))];
		arg0.aClass3_Sub1_67 = local25.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = local25;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aLong275 = arg1;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IJ)Lclient!ab;")
	public Class3_Sub1 method7248(@OriginalArg(1) long arg0) {
		this.aLong220 = arg0;
		@Pc(27) Class3_Sub1 local27 = this.aClass3_Sub1Array1[(int) ((long) (this.anInt8772 - 1) & arg0)];
		for (this.aClass3_Sub1_56 = local27.aClass3_Sub1_66; this.aClass3_Sub1_56 != local27; this.aClass3_Sub1_56 = this.aClass3_Sub1_56.aClass3_Sub1_66) {
			if (this.aClass3_Sub1_56.aLong275 == arg0) {
				@Pc(46) Class3_Sub1 local46 = this.aClass3_Sub1_56;
				this.aClass3_Sub1_56 = this.aClass3_Sub1_56.aClass3_Sub1_66;
				return local46;
			}
		}
		this.aClass3_Sub1_56 = null;
		return null;
	}
}
