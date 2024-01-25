import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub4_Sub20 extends Class1_Sub4 {

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!tm;")
	private Class197 aClass197_27;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!bg;I)V")
	public void method4916(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method4532();
			if (local18 == 0) {
				return;
			}
			this.method4921(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)I")
	public int method4917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass197_27 == null) {
			return arg0;
		} else {
			@Pc(24) Class1_Sub13 local24 = (Class1_Sub13) this.aClass197_27.method5157((long) arg1);
			return local24 == null ? arg0 : local24.anInt1849;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4919(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass197_27 == null) {
			return arg0;
		} else {
			@Pc(25) Class1_Sub31 local25 = (Class1_Sub31) this.aClass197_27.method5157((long) arg1);
			return local25 == null ? arg0 : local25.aString55;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!bg;I)V")
	private void method4921(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(13) int local13 = arg0.method4532();
		@Pc(20) int local20;
		if (this.aClass197_27 == null) {
			local20 = Static194.method3745(local13);
			this.aClass197_27 = new Class197(local20);
		}
		for (local20 = 0; local20 < local13; local20++) {
			@Pc(41) boolean local41 = arg0.method4532() == 1;
			@Pc(45) int local45 = arg0.method4514();
			@Pc(54) Class1 local54;
			if (local41) {
				local54 = new Class1_Sub31(arg0.method4534());
			} else {
				local54 = new Class1_Sub13(arg0.method4545());
			}
			this.aClass197_27.method5166(local54, (long) local45);
		}
	}
}
