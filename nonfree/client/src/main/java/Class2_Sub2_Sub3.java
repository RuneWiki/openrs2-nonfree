import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "Lclient!ub;")
	private Class240 aClass240_5;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method938(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_5 == null) {
			return arg0;
		} else {
			@Pc(25) Class2_Sub31 local25 = (Class2_Sub31) this.aClass240_5.method5439((long) arg1);
			return local25 == null ? arg0 : local25.aString43;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I")
	public int method939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass240_5 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub16 local16 = (Class2_Sub16) this.aClass240_5.method5439((long) arg0);
			return local16 == null ? arg1 : local16.anInt2428;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!md;I)V")
	public void method942(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3737();
			if (local13 == 0) {
				return;
			}
			this.method945(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!md;I)V")
	private void method945(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(16) int local16 = arg0.method3737();
		@Pc(23) int local23;
		if (this.aClass240_5 == null) {
			local23 = Static316.method4530(local16);
			this.aClass240_5 = new Class240(local23);
		}
		for (local23 = 0; local23 < local16; local23++) {
			@Pc(42) boolean local42 = arg0.method3737() == 1;
			@Pc(46) int local46 = arg0.method3748();
			@Pc(55) Class2 local55;
			if (local42) {
				local55 = new Class2_Sub31(arg0.method3717());
			} else {
				local55 = new Class2_Sub16(arg0.method3731());
			}
			this.aClass240_5.method5430((long) local46, local55);
		}
	}
}
