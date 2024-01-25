import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class6_Sub2_Sub18 extends Class6_Sub2 {

	@OriginalMember(owner = "client!th", name = "z", descriptor = "Lclient!hd;")
	private Class128 aClass128_41;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method7063(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6069();
			if (local9 == 0) {
				return;
			}
			this.method7065(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ji;II)V")
	private void method7065(@OriginalArg(0) Class6_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method6069();
		@Pc(19) int local19;
		if (this.aClass128_41 == null) {
			local19 = Static253.method4296(local12);
			this.aClass128_41 = new Class128(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(38) boolean local38 = arg0.method6069() == 1;
			@Pc(44) int local44 = arg0.method6031();
			@Pc(53) Class6 local53;
			if (local38) {
				local53 = new Class6_Sub25(arg0.method6044());
			} else {
				local53 = new Class6_Sub35(arg0.method6036());
			}
			this.aClass128_41.method3267(local53, (long) local44);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
	public int method7067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass128_41 == null) {
			return arg1;
		} else {
			@Pc(16) Class6_Sub35 local16 = (Class6_Sub35) this.aClass128_41.method3263((long) arg0);
			return local16 == null ? arg1 : local16.anInt6119;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method7068(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass128_41 == null) {
			return arg1;
		} else {
			@Pc(24) Class6_Sub25 local24 = (Class6_Sub25) this.aClass128_41.method3263((long) arg0);
			return local24 == null ? arg1 : local24.aString28;
		}
	}
}
