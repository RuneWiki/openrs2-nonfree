import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class7_Sub4_Sub10 extends Class7_Sub4 {

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!mt;")
	private Class164 aClass164_21;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method2733(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass164_21 == null) {
			return arg0;
		} else {
			@Pc(22) Class7_Sub17 local22 = (Class7_Sub17) this.aClass164_21.method3512((long) arg1);
			return local22 == null ? arg0 : local22.aString22;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method2735(@OriginalArg(1) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(18) int local18 = arg0.method3981();
		@Pc(27) int local27;
		if (this.aClass164_21 == null) {
			local27 = Static444.method5654(local18);
			this.aClass164_21 = new Class164(local27);
		}
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(48) boolean local48 = arg0.method3981() == 1;
			@Pc(54) int local54 = arg0.method3975();
			@Pc(63) Class7 local63;
			if (local48) {
				local63 = new Class7_Sub17(arg0.method3986());
			} else {
				local63 = new Class7_Sub2(arg0.method3938());
			}
			this.aClass164_21.method3508((long) local54, local63);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method2737(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3981();
			if (local9 == 0) {
				return;
			}
			this.method2735(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)I")
	public int method2738(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass164_21 == null) {
			return arg1;
		} else {
			@Pc(16) Class7_Sub2 local16 = (Class7_Sub2) this.aClass164_21.method3512((long) arg0);
			return local16 == null ? arg1 : local16.anInt128;
		}
	}
}
