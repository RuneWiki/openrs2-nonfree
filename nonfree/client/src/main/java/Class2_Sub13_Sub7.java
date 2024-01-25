import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class2_Sub13_Sub7 extends Class2_Sub13 {

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "Lclient!ica;")
	private Class127 aClass127_30;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method3621(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass127_30 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub43 local21 = (Class2_Sub43) this.aClass127_30.method3205((long) arg0);
			return local21 == null ? arg1 : local21.aString166;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!ps;)V")
	public void method3623(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5170();
			if (local14 == 0) {
				return;
			}
			this.method3624(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZLclient!ps;)V")
	private void method3624(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(8) int local8 = arg1.method5170();
		@Pc(15) int local15;
		if (this.aClass127_30 == null) {
			local15 = Static131.method2413(local8);
			this.aClass127_30 = new Class127(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(34) boolean local34 = arg1.method5170() == 1;
			@Pc(38) int local38 = arg1.method5210();
			@Pc(47) Class2 local47;
			if (local34) {
				local47 = new Class2_Sub43(arg1.method5194());
			} else {
				local47 = new Class2_Sub32(arg1.method5198());
			}
			this.aClass127_30.method3213(local47, (long) local38);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZI)I")
	public int method3627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass127_30 == null) {
			return arg0;
		} else {
			@Pc(16) Class2_Sub32 local16 = (Class2_Sub32) this.aClass127_30.method3205((long) arg1);
			return local16 == null ? arg0 : local16.anInt5391;
		}
	}
}
