import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class4_Sub2_Sub6 extends Class4_Sub2 {

	@OriginalMember(owner = "client!di", name = "B", descriptor = "Lclient!tm;")
	private Class163 aClass163_16;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!pi;II)V")
	private void method1016(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(20) int local20 = arg0.method3110();
		@Pc(28) int local28;
		if (this.aClass163_16 == null) {
			local28 = Static308.method4715(local20);
			this.aClass163_16 = new Class163(local28);
		}
		for (local28 = 0; local28 < local20; local28++) {
			@Pc(54) boolean local54 = arg0.method3110() == 1;
			@Pc(58) int local58 = arg0.method3063();
			@Pc(67) Class4 local67;
			if (local54) {
				local67 = new Class4_Sub17(arg0.method3111());
			} else {
				local67 = new Class4_Sub25(arg0.method3084());
			}
			this.aClass163_16.method4181((long) local58, local67);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method1019(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass163_16 == null) {
			return arg0;
		} else {
			@Pc(23) Class4_Sub17 local23 = (Class4_Sub17) this.aClass163_16.method4188((long) arg1);
			return local23 == null ? arg0 : local23.aString77;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
	public int method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass163_16 == null) {
			return arg1;
		} else {
			@Pc(24) Class4_Sub25 local24 = (Class4_Sub25) this.aClass163_16.method4188((long) arg0);
			return local24 == null ? arg1 : local24.anInt3892;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!pi;Z)V")
	public void method1022(@OriginalArg(0) Class4_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method1016(arg0, local5);
		}
	}
}
