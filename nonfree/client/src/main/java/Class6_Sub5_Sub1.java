import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class6_Sub5_Sub1 extends Class6_Sub5 {

	@OriginalMember(owner = "client!am", name = "v", descriptor = "Lclient!oj;")
	private Class234 aClass234_1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!jr;B)V")
	public void method252(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6019();
			if (local9 == 0) {
				return;
			}
			this.method256(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)I")
	public int method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass234_1 == null) {
			return arg1;
		} else {
			@Pc(21) Class6_Sub14 local21 = (Class6_Sub14) this.aClass234_1.method5464((long) arg0);
			return local21 == null ? arg1 : local21.anInt2188;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method255(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass234_1 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub36 local21 = (Class6_Sub36) this.aClass234_1.method5464((long) arg1);
			return local21 == null ? arg0 : local21.aString54;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLclient!jr;I)V")
	private void method256(@OriginalArg(1) Class6_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(20) int local20 = arg0.method6019();
		@Pc(27) int local27;
		if (this.aClass234_1 == null) {
			local27 = Static14.method5936(local20);
			this.aClass234_1 = new Class234(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(46) boolean local46 = arg0.method6019() == 1;
			@Pc(50) int local50 = arg0.method6037();
			@Pc(59) Class6 local59;
			if (local46) {
				local59 = new Class6_Sub36(arg0.method6040());
			} else {
				local59 = new Class6_Sub14(arg0.method6015());
			}
			this.aClass234_1.method5466((long) local50, local59);
		}
	}
}
