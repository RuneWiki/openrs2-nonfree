import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class2_Sub10_Sub15 extends Class2_Sub10 {

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "Lclient!wk;")
	private Class246 aClass246_27;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!kk;Z)V")
	public void method4584(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5350();
			if (local14 == 0) {
				return;
			}
			this.method4585(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!kk;B)V")
	private void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(10) int local10 = arg1.method5350();
		@Pc(17) int local17;
		if (this.aClass246_27 == null) {
			local17 = Static6.method148(local10);
			this.aClass246_27 = new Class246(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(38) boolean local38 = arg1.method5350() == 1;
			@Pc(42) int local42 = arg1.method5356();
			@Pc(51) Class2 local51;
			if (local38) {
				local51 = new Class2_Sub8(arg1.method5364());
			} else {
				local51 = new Class2_Sub14(arg1.method5346());
			}
			this.aClass246_27.method5609(local51, (long) local42);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method4587(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass246_27 == null) {
			return arg1;
		} else {
			@Pc(23) Class2_Sub8 local23 = (Class2_Sub8) this.aClass246_27.method5613((long) arg0);
			return local23 == null ? arg1 : local23.aString8;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)I")
	public int method4588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass246_27 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub14 local21 = (Class2_Sub14) this.aClass246_27.method5613((long) arg0);
			return local21 == null ? arg1 : local21.anInt1455;
		}
	}
}
