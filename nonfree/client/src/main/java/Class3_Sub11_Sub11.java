import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class3_Sub11_Sub11 extends Class3_Sub11 {

	@OriginalMember(owner = "client!kka", name = "y", descriptor = "Lclient!ee;")
	private Class83 aClass83_17;

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "(III)I")
	public int method4808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass83_17 == null) {
			return arg0;
		} else {
			@Pc(22) Class3_Sub33 local22 = (Class3_Sub33) this.aClass83_17.method2368((long) arg1);
			return local22 == null ? arg0 : local22.anInt4831;
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method4811(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8632();
			if (local5 == 0) {
				return;
			}
			this.method4812(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(ILclient!jp;I)V")
	private void method4812(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(20) int local20 = arg1.method8632();
		@Pc(27) int local27;
		if (this.aClass83_17 == null) {
			local27 = Static282.method4521(local20);
			this.aClass83_17 = new Class83(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(46) boolean local46 = arg1.method8632() == 1;
			@Pc(50) int local50 = arg1.method8607();
			@Pc(59) Class3 local59;
			if (local46) {
				local59 = new Class3_Sub49(arg1.method8613());
			} else {
				local59 = new Class3_Sub33(arg1.method8618());
			}
			this.aClass83_17.method2377((long) local50, local59);
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4814(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass83_17 == null) {
			return arg0;
		} else {
			@Pc(22) Class3_Sub49 local22 = (Class3_Sub49) this.aClass83_17.method2368((long) arg1);
			return local22 == null ? arg0 : local22.aString100;
		}
	}
}
