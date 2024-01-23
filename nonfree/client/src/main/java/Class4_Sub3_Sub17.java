import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class4_Sub3_Sub17 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "Lclient!ic;")
	private Class85 aClass85_21;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void method3836(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method4666();
		@Pc(21) int local21;
		if (this.aClass85_21 == null) {
			local21 = Static161.method2608(local12);
			this.aClass85_21 = new Class85(local21);
		}
		for (local21 = 0; local21 < local12; local21++) {
			@Pc(41) boolean local41 = arg0.method4666() == 1;
			@Pc(45) int local45 = arg0.method4655();
			@Pc(54) Class4 local54;
			if (local41) {
				local54 = new Class4_Sub26(arg0.method4630());
			} else {
				local54 = new Class4_Sub32(arg0.method4632());
			}
			this.aClass85_21.method1841(local54, (long) local45);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)I")
	public int method3837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass85_21 == null) {
			return arg0;
		} else {
			@Pc(19) Class4_Sub32 local19 = (Class4_Sub32) this.aClass85_21.method1845((long) arg1);
			return local19 == null ? arg0 : local19.anInt5435;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method3838(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4666();
			if (local9 == 0) {
				return;
			}
			this.method3836(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method3841(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass85_21 == null) {
			return arg0;
		} else {
			@Pc(22) Class4_Sub26 local22 = (Class4_Sub26) this.aClass85_21.method1845((long) arg1);
			return local22 == null ? arg0 : local22.aString285;
		}
	}
}
