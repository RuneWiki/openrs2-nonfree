import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "Lclient!vk;")
	private Class207 aClass207_27;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method3444(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass207_27 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub39 local16 = (Class1_Sub39) this.aClass207_27.method5555((long) arg1);
			return local16 == null ? arg0 : local16.aString215;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!nj;)V")
	public void method3447(@OriginalArg(1) Class1_Sub21 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5720();
			if (local15 == 0) {
				return;
			}
			this.method3449(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(III)I")
	public int method3448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass207_27 == null) {
			return arg0;
		} else {
			@Pc(20) Class1_Sub14 local20 = (Class1_Sub14) this.aClass207_27.method5555((long) arg1);
			return local20 == null ? arg0 : local20.anInt1474;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!nj;ZI)V")
	private void method3449(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method5720();
		@Pc(15) int local15;
		if (this.aClass207_27 == null) {
			local15 = Static304.method5275(local8);
			this.aClass207_27 = new Class207(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(34) boolean local34 = arg0.method5720() == 1;
			@Pc(38) int local38 = arg0.method5705();
			@Pc(47) Class1 local47;
			if (local34) {
				local47 = new Class1_Sub39(arg0.method5701());
			} else {
				local47 = new Class1_Sub14(arg0.method5716());
			}
			this.aClass207_27.method5552(local47, (long) local38);
		}
	}
}
