import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class5_Sub9_Sub15 extends Class5_Sub9 {

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Lclient!cs;")
	private Class42 aClass42_34;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!bk;)V")
	private void method3392(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(12) int local12 = arg1.method1832();
		@Pc(19) int local19;
		if (this.aClass42_34 == null) {
			local19 = Static266.method4535(local12);
			this.aClass42_34 = new Class42(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(40) boolean local40 = arg1.method1832() == 1;
			@Pc(46) int local46 = arg1.method1843();
			@Pc(55) Class5 local55;
			if (local40) {
				local55 = new Class5_Sub30(arg1.method1840());
			} else {
				local55 = new Class5_Sub37(arg1.method1826());
			}
			this.aClass42_34.method1050((long) local46, local55);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!bk;B)V")
	public void method3393(@OriginalArg(0) Class5_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1832();
			if (local5 == 0) {
				return;
			}
			this.method3392(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
	public int method3394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass42_34 == null) {
			return arg0;
		} else {
			@Pc(26) Class5_Sub37 local26 = (Class5_Sub37) this.aClass42_34.method1052((long) arg1);
			return local26 == null ? arg0 : local26.anInt5532;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method3397(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass42_34 == null) {
			return arg0;
		} else {
			@Pc(21) Class5_Sub30 local21 = (Class5_Sub30) this.aClass42_34.method1052((long) arg1);
			return local21 == null ? arg0 : local21.aString227;
		}
	}
}
