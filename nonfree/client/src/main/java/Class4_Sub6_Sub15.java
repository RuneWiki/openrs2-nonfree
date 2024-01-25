import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class4_Sub6_Sub15 extends Class4_Sub6 {

	@OriginalMember(owner = "client!oaa", name = "J", descriptor = "Lclient!mo;")
	private Class221 aClass221_25;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILclient!ek;)V")
	private void method5524(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(14) int local14 = arg1.method7004();
		@Pc(21) int local21;
		if (this.aClass221_25 == null) {
			local21 = Static488.method7100(local14);
			this.aClass221_25 = new Class221(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(42) boolean local42 = arg1.method7004() == 1;
			@Pc(46) int local46 = arg1.method7013();
			@Pc(55) Class4 local55;
			if (local42) {
				local55 = new Class4_Sub11(arg1.method7016());
			} else {
				local55 = new Class4_Sub27(arg1.method6990());
			}
			this.aClass221_25.method5073(local55, (long) local46);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBI)I")
	public int method5526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass221_25 == null) {
			return arg0;
		} else {
			@Pc(23) Class4_Sub27 local23 = (Class4_Sub27) this.aClass221_25.method5075((long) arg1);
			return local23 == null ? arg0 : local23.anInt4968;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLclient!ek;)V")
	public void method5528(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7004();
			if (local7 == 0) {
				return;
			}
			this.method5524(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method5530(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass221_25 == null) {
			return arg0;
		} else {
			@Pc(18) Class4_Sub11 local18 = (Class4_Sub11) this.aClass221_25.method5075((long) arg1);
			return local18 == null ? arg0 : local18.aString37;
		}
	}
}
