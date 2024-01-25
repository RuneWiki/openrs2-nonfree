import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class14_Sub3_Sub7 extends Class14_Sub3 {

	@OriginalMember(owner = "client!ew", name = "F", descriptor = "Lclient!jo;")
	private Class187 aClass187_21;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method2345(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass187_21 == null) {
			return arg0;
		} else {
			@Pc(22) Class14_Sub17 local22 = (Class14_Sub17) this.aClass187_21.method4078((long) arg1);
			return local22 == null ? arg0 : local22.aString26;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZLclient!so;)V")
	public void method2346(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5866();
			if (local9 == 0) {
				return;
			}
			this.method2347(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!so;I)V")
	private void method2347(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub29 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(18) int local18 = arg1.method5866();
		@Pc(25) int local25;
		if (this.aClass187_21 == null) {
			local25 = Static330.method5181(local18);
			this.aClass187_21 = new Class187(local25);
		}
		for (local25 = 0; local25 < local18; local25++) {
			@Pc(44) boolean local44 = arg1.method5866() == 1;
			@Pc(48) int local48 = arg1.method5862();
			@Pc(57) Class14 local57;
			if (local44) {
				local57 = new Class14_Sub17(arg1.method5898());
			} else {
				local57 = new Class14_Sub18(arg1.method5878());
			}
			this.aClass187_21.method4077((long) local48, local57);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZ)I")
	public int method2348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass187_21 == null) {
			return arg0;
		} else {
			@Pc(16) Class14_Sub18 local16 = (Class14_Sub18) this.aClass187_21.method4078((long) arg1);
			return local16 == null ? arg0 : local16.anInt2644;
		}
	}
}
