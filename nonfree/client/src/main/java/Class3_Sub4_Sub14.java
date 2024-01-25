import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class3_Sub4_Sub14 extends Class3_Sub4 {

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!an;")
	private Class11 aClass11_39;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIB)I")
	public int method4992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass11_39 == null) {
			return arg1;
		} else {
			@Pc(25) Class3_Sub34 local25 = (Class3_Sub34) this.aClass11_39.method324((long) arg0);
			return local25 == null ? arg1 : local25.anInt5289;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!cu;B)V")
	public void method4994(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2582();
			if (local7 == 0) {
				return;
			}
			this.method4997(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
	public String method4996(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass11_39 == null) {
			return arg1;
		} else {
			@Pc(24) Class3_Sub35 local24 = (Class3_Sub35) this.aClass11_39.method324((long) arg0);
			return local24 == null ? arg1 : local24.aString54;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method4997(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method2582();
		@Pc(15) int local15;
		if (this.aClass11_39 == null) {
			local15 = Static288.method4088(local8);
			this.aClass11_39 = new Class11(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(35) boolean local35 = arg0.method2582() == 1;
			@Pc(39) int local39 = arg0.method2604();
			@Pc(48) Class3 local48;
			if (local35) {
				local48 = new Class3_Sub35(arg0.method2620());
			} else {
				local48 = new Class3_Sub34(arg0.method2589());
			}
			this.aClass11_39.method319(local48, (long) local39);
		}
	}
}
