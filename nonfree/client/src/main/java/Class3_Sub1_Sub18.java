import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rga", name = "t", descriptor = "Lclient!sga;")
	private Class307 aClass307_43;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method7121(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass307_43 == null) {
			return arg1;
		} else {
			@Pc(21) Class3_Sub44 local21 = (Class3_Sub44) this.aClass307_43.method7424((long) arg0);
			return local21 == null ? arg1 : local21.aString102;
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILclient!tn;)V")
	public void method7124(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8401();
			if (local9 == 0) {
				return;
			}
			this.method7127(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(III)I")
	public int method7125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass307_43 == null) {
			return arg1;
		} else {
			@Pc(23) Class3_Sub8 local23 = (Class3_Sub8) this.aClass307_43.method7424((long) arg0);
			return local23 == null ? arg1 : local23.anInt706;
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!tn;II)V")
	private void method7127(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(16) int local16 = arg0.method8401();
		@Pc(23) int local23;
		if (this.aClass307_43 == null) {
			local23 = Static95.method2482(local16);
			this.aClass307_43 = new Class307(local23);
		}
		for (local23 = 0; local23 < local16; local23++) {
			@Pc(44) boolean local44 = arg0.method8401() == 1;
			@Pc(48) int local48 = arg0.method8421();
			@Pc(57) Class3 local57;
			if (local44) {
				local57 = new Class3_Sub44(arg0.method8413());
			} else {
				local57 = new Class3_Sub8(arg0.method8402());
			}
			this.aClass307_43.method7425((long) local48, local57);
		}
	}
}
