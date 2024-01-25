import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class42 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!wfa;")
	private Class3_Sub4 aClass3_Sub4_17;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
	private final int anInt1569;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "[Lclient!wfa;")
	private final Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		this.anInt1569 = arg0;
		this.aClass3_Sub4Array1 = new Class3_Sub4[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub4 local20 = this.aClass3_Sub4Array1[local10] = new Class3_Sub4();
			local20.aClass3_Sub4_66 = local20;
			local20.aClass3_Sub4_67 = local20;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BJLclient!wfa;)V")
	public void method1578(@OriginalArg(1) long arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg1.aClass3_Sub4_67 != null) {
			arg1.method8732();
		}
		@Pc(21) Class3_Sub4 local21 = this.aClass3_Sub4Array1[(int) (arg0 & (long) (this.anInt1569 - 1))];
		arg1.aClass3_Sub4_67 = local21.aClass3_Sub4_67;
		arg1.aClass3_Sub4_66 = local21;
		arg1.aClass3_Sub4_67.aClass3_Sub4_66 = arg1;
		arg1.aLong274 = arg0;
		arg1.aClass3_Sub4_66.aClass3_Sub4_67 = arg1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Lclient!wfa;")
	public Class3_Sub4 method1579() {
		if (this.aClass3_Sub4_17 == null) {
			return null;
		}
		@Pc(28) Class3_Sub4 local28 = this.aClass3_Sub4Array1[(int) (this.aLong32 & (long) (this.anInt1569 - 1))];
		while (local28 != this.aClass3_Sub4_17) {
			if (this.aLong32 == this.aClass3_Sub4_17.aLong274) {
				@Pc(40) Class3_Sub4 local40 = this.aClass3_Sub4_17;
				this.aClass3_Sub4_17 = this.aClass3_Sub4_17.aClass3_Sub4_66;
				return local40;
			}
			this.aClass3_Sub4_17 = this.aClass3_Sub4_17.aClass3_Sub4_66;
		}
		this.aClass3_Sub4_17 = null;
		return null;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(JI)Lclient!wfa;")
	public Class3_Sub4 method1581(@OriginalArg(0) long arg0) {
		this.aLong32 = arg0;
		@Pc(28) Class3_Sub4 local28 = this.aClass3_Sub4Array1[(int) (arg0 & (long) (this.anInt1569 - 1))];
		for (this.aClass3_Sub4_17 = local28.aClass3_Sub4_66; this.aClass3_Sub4_17 != local28; this.aClass3_Sub4_17 = this.aClass3_Sub4_17.aClass3_Sub4_66) {
			if (this.aClass3_Sub4_17.aLong274 == arg0) {
				@Pc(43) Class3_Sub4 local43 = this.aClass3_Sub4_17;
				this.aClass3_Sub4_17 = this.aClass3_Sub4_17.aClass3_Sub4_66;
				return local43;
			}
		}
		this.aClass3_Sub4_17 = null;
		return null;
	}
}
