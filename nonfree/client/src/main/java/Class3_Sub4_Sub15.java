import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class3_Sub4_Sub15 extends Class3_Sub4 {

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "Lclient!bc;")
	private Class25 aClass25_30;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method5994(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method6538();
		@Pc(17) int local17;
		if (this.aClass25_30 == null) {
			local17 = Static178.method3152(local8);
			this.aClass25_30 = new Class25(local17);
		}
		for (local17 = 0; local17 < local8; local17++) {
			@Pc(37) boolean local37 = arg0.method6538() == 1;
			@Pc(43) int local43 = arg0.method6506();
			@Pc(52) Class3 local52;
			if (local37) {
				local52 = new Class3_Sub31(arg0.method6536());
			} else {
				local52 = new Class3_Sub48(arg0.method6497());
			}
			this.aClass25_30.method945(local52, (long) local43);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!fd;)V")
	public void method5995(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6538();
			if (local15 == 0) {
				return;
			}
			this.method5994(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method5997(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass25_30 == null) {
			return arg1;
		} else {
			@Pc(24) Class3_Sub31 local24 = (Class3_Sub31) this.aClass25_30.method946((long) arg0);
			return local24 == null ? arg1 : local24.aString63;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZ)I")
	public int method5998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass25_30 == null) {
			return arg0;
		} else {
			@Pc(22) Class3_Sub48 local22 = (Class3_Sub48) this.aClass25_30.method946((long) arg1);
			return local22 == null ? arg0 : local22.anInt9989;
		}
	}
}
