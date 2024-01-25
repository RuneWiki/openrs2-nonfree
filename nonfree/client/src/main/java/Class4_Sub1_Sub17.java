import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "Lclient!qo;")
	private Class196 aClass196_36;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method5069(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass196_36 == null) {
			return arg0;
		} else {
			@Pc(21) Class4_Sub25 local21 = (Class4_Sub25) this.aClass196_36.method4477((long) arg1);
			return local21 == null ? arg0 : local21.aString45;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)I")
	public int method5070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass196_36 == null) {
			return arg1;
		} else {
			@Pc(23) Class4_Sub15 local23 = (Class4_Sub15) this.aClass196_36.method4477((long) arg0);
			return local23 == null ? arg1 : local23.anInt2603;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!tl;II)V")
	private void method5071(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(13) int local13 = arg0.method4864();
		@Pc(20) int local20;
		if (this.aClass196_36 == null) {
			local20 = Static183.method2711(local13);
			this.aClass196_36 = new Class196(local20);
		}
		for (local20 = 0; local20 < local13; local20++) {
			@Pc(39) boolean local39 = arg0.method4864() == 1;
			@Pc(43) int local43 = arg0.method4887();
			@Pc(52) Class4 local52;
			if (local39) {
				local52 = new Class4_Sub25(arg0.method4867());
			} else {
				local52 = new Class4_Sub15(arg0.method4872());
			}
			this.aClass196_36.method4474((long) local43, local52);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method5074(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method5071(arg0, local5);
		}
	}
}
