import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class3_Sub7_Sub13 extends Class3_Sub7 {

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "Lclient!qn;")
	private Class313 aClass313_21;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)I")
	public int method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass313_21 == null) {
			return arg0;
		} else {
			@Pc(17) Class3_Sub44 local17 = (Class3_Sub44) this.aClass313_21.method7104((long) arg1);
			return local17 == null ? arg0 : local17.anInt7298;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!ika;)V")
	public void method4647(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2048(255);
			if (local9 == 0) {
				return;
			}
			this.method4653(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZLjava/lang/String;)Ljava/lang/String;")
	public String method4650(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass313_21 == null) {
			return arg1;
		} else {
			@Pc(17) Class3_Sub40 local17 = (Class3_Sub40) this.aClass313_21.method7104((long) arg0);
			return local17 == null ? arg1 : local17.aString78;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ika;II)V")
	private void method4653(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method2048(255);
		@Pc(15) int local15;
		if (this.aClass313_21 == null) {
			local15 = Static92.method1941(local8);
			this.aClass313_21 = new Class313(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(39) boolean local39 = arg0.method2048(255) == 1;
			@Pc(43) int local43 = arg0.method2061();
			@Pc(52) Class3 local52;
			if (local39) {
				local52 = new Class3_Sub40(arg0.method2014());
			} else {
				local52 = new Class3_Sub44(arg0.method2036());
			}
			this.aClass313_21.method7107((long) local43, local52);
		}
	}
}
