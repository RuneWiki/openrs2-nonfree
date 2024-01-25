import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class1_Sub6_Sub9 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Lclient!fa;")
	private Class77 aClass77_22;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2315(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass77_22 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub8 local21 = (Class1_Sub8) this.aClass77_22.method1368((long) arg0);
			return local21 == null ? arg1 : local21.aString9;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!re;B)V")
	public void method2316(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5174();
			if (local9 == 0) {
				return;
			}
			this.method2320(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILclient!re;)V")
	private void method2320(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(19) int local19 = arg1.method5174();
		@Pc(26) int local26;
		if (this.aClass77_22 == null) {
			local26 = Static183.method1325(local19);
			this.aClass77_22 = new Class77(local26);
		}
		for (local26 = 0; local26 < local19; local26++) {
			@Pc(45) boolean local45 = arg1.method5174() == 1;
			@Pc(49) int local49 = arg1.method5159();
			@Pc(58) Class1 local58;
			if (local45) {
				local58 = new Class1_Sub8(arg1.method5128());
			} else {
				local58 = new Class1_Sub30(arg1.method5150());
			}
			this.aClass77_22.method1370((long) local49, local58);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)I")
	public int method2321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass77_22 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub30 local21 = (Class1_Sub30) this.aClass77_22.method1368((long) arg1);
			return local21 == null ? arg0 : local21.anInt3799;
		}
	}
}
