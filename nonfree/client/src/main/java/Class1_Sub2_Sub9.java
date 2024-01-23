import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!li", name = "A", descriptor = "[I")
	public static int[] anIntArray266 = new int[256];

	@OriginalMember(owner = "client!li", name = "C", descriptor = "Lclient!qb;")
	private Class142 aClass142_15;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(9) int local9 = local4;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray266[local4] = local9;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!lf;)V")
	public void method2754(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1378();
			if (local14 == 0) {
				return;
			}
			this.method2757(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!lf;BI)V")
	private void method2757(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(13) int local13 = arg0.method1378();
		@Pc(20) int local20;
		if (this.aClass142_15 == null) {
			local20 = Static218.method1098(local13);
			this.aClass142_15 = new Class142(local20);
		}
		for (local20 = 0; local20 < local13; local20++) {
			@Pc(40) boolean local40 = arg0.method1378() == 1;
			@Pc(44) int local44 = arg0.method1352();
			@Pc(53) Class1 local53;
			if (local40) {
				local53 = new Class1_Sub17(arg0.method1375());
			} else {
				local53 = new Class1_Sub1(arg0.method1392());
			}
			this.aClass142_15.method3537(local53, (long) local44);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IBI)I")
	public int method2758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass142_15 == null) {
			return arg0;
		} else {
			@Pc(26) Class1_Sub1 local26 = (Class1_Sub1) this.aClass142_15.method3543((long) arg1);
			return local26 == null ? arg0 : local26.anInt12;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2759(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass142_15 == null) {
			return arg1;
		} else {
			@Pc(24) Class1_Sub17 local24 = (Class1_Sub17) this.aClass142_15.method3543((long) arg0);
			return local24 == null ? arg1 : local24.aString105;
		}
	}
}
