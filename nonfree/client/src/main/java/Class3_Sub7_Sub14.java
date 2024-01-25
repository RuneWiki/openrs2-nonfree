import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub7_Sub14 extends Class3_Sub7 {

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!cp;")
	private Class44 aClass44_33;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
	public int method5225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass44_33 == null) {
			return arg1;
		} else {
			@Pc(24) Class3_Sub28 local24 = (Class3_Sub28) this.aClass44_33.method942((long) arg0);
			return local24 == null ? arg1 : local24.anInt3982;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!rp;)V")
	private void method5226(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(12) int local12 = arg1.method2739();
		@Pc(19) int local19;
		if (this.aClass44_33 == null) {
			local19 = Static304.method2746(local12);
			this.aClass44_33 = new Class44(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(40) boolean local40 = arg1.method2739() == 1;
			@Pc(44) int local44 = arg1.method2786();
			@Pc(53) Class3 local53;
			if (local40) {
				local53 = new Class3_Sub20(arg1.method2788());
			} else {
				local53 = new Class3_Sub28(arg1.method2726());
			}
			this.aClass44_33.method948((long) local44, local53);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method5229(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass44_33 == null) {
			return arg0;
		} else {
			@Pc(21) Class3_Sub20 local21 = (Class3_Sub20) this.aClass44_33.method942((long) arg1);
			return local21 == null ? arg0 : local21.aString28;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!rp;Z)V")
	public void method5232(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2739();
			if (local9 == 0) {
				return;
			}
			this.method5226(local9, arg0);
		}
	}
}
