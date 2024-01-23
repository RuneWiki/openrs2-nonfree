import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "Lclient!s;")
	private Class156 aClass156_2;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method597(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass156_2 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub25 local16 = (Class1_Sub25) this.aClass156_2.method3821((long) arg0);
			return local16 == null ? arg1 : local16.aString147;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!sb;)V")
	private void method600(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(8) int local8 = arg1.method2595();
		@Pc(16) int local16;
		if (this.aClass156_2 == null) {
			local16 = Static203.method3254(local8);
			this.aClass156_2 = new Class156(local16);
		}
		for (local16 = 0; local16 < local8; local16++) {
			@Pc(38) boolean local38 = arg1.method2595() == 1;
			@Pc(42) int local42 = arg1.method2588();
			@Pc(51) Class1 local51;
			if (local38) {
				local51 = new Class1_Sub25(arg1.method2605());
			} else {
				local51 = new Class1_Sub13(arg1.method2647());
			}
			this.aClass156_2.method3816((long) local42, local51);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I")
	public int method601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass156_2 == null) {
			return arg1;
		} else {
			@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass156_2.method3821((long) arg0);
			return local17 == null ? arg1 : local17.anInt2852;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!sb;Z)V")
	public void method603(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2595();
			if (local5 == 0) {
				return;
			}
			this.method600(local5, arg0);
		}
	}
}
