import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class10_Sub1_Sub16 extends Class10_Sub1 {

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "Lclient!mn;")
	private Class167 aClass167_27;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB)I")
	public int method4974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass167_27 == null) {
			return arg0;
		} else {
			@Pc(16) Class10_Sub12 local16 = (Class10_Sub12) this.aClass167_27.method3709((long) arg1);
			return local16 == null ? arg0 : local16.anInt1159;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!nn;)V")
	private void method4976(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(15) int local15 = arg1.method2502();
		@Pc(22) int local22;
		if (this.aClass167_27 == null) {
			local22 = Static186.method3002(local15);
			this.aClass167_27 = new Class167(local22);
		}
		for (local22 = 0; local22 < local15; local22++) {
			@Pc(41) boolean local41 = arg1.method2502() == 1;
			@Pc(45) int local45 = arg1.method2507();
			@Pc(54) Class10 local54;
			if (local41) {
				local54 = new Class10_Sub18(arg1.method2478());
			} else {
				local54 = new Class10_Sub12(arg1.method2459());
			}
			this.aClass167_27.method3705(local54, (long) local45);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method4977(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass167_27 == null) {
			return arg0;
		} else {
			@Pc(23) Class10_Sub18 local23 = (Class10_Sub18) this.aClass167_27.method3709((long) arg1);
			return local23 == null ? arg0 : local23.aString15;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!nn;)V")
	public void method4978(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2502();
			if (local9 == 0) {
				return;
			}
			this.method4976(local9, arg0);
		}
	}
}
