import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class3_Sub3_Sub5 extends Class3_Sub3 {

	@OriginalMember(owner = "client!dr", name = "A", descriptor = "Lclient!lp;")
	private Class140 aClass140_12;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)I")
	public int method1399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass140_12 == null) {
			return arg0;
		} else {
			@Pc(23) Class3_Sub30 local23 = (Class3_Sub30) this.aClass140_12.method3490((long) arg1);
			return local23 == null ? arg0 : local23.anInt3957;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!nj;)V")
	public void method1400(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4096();
			if (local14 == 0) {
				return;
			}
			this.method1401(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!nj;II)V")
	private void method1401(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(18) int local18 = arg0.method4096();
		@Pc(27) int local27;
		if (this.aClass140_12 == null) {
			local27 = Static342.method4774(local18);
			this.aClass140_12 = new Class140(local27);
		}
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(48) boolean local48 = arg0.method4096() == 1;
			@Pc(52) int local52 = arg0.method4099();
			@Pc(61) Class3 local61;
			if (local48) {
				local61 = new Class3_Sub35(arg0.method4073());
			} else {
				local61 = new Class3_Sub30(arg0.method4108());
			}
			this.aClass140_12.method3494((long) local52, local61);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method1403(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass140_12 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub35 local16 = (Class3_Sub35) this.aClass140_12.method3490((long) arg1);
			return local16 == null ? arg0 : local16.aString52;
		}
	}
}
