import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class6_Sub4_Sub15 extends Class6_Sub4 {

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "Lclient!lk;")
	private Class209 aClass209_46;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILclient!gga;)V")
	private void method7010(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(20) int local20 = arg1.method8374();
		@Pc(27) int local27;
		if (this.aClass209_46 == null) {
			local27 = Static655.method8912(local20);
			this.aClass209_46 = new Class209(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(48) boolean local48 = arg1.method8374() == 1;
			@Pc(52) int local52 = arg1.method8344();
			@Pc(63) Class6 local63;
			if (local48) {
				local63 = new Class6_Sub16(arg1.method8354());
			} else {
				local63 = new Class6_Sub36(arg1.method8369());
			}
			this.aClass209_46.method5035((long) local52, local63);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method7011(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass209_46 == null) {
			return arg1;
		} else {
			@Pc(24) Class6_Sub16 local24 = (Class6_Sub16) this.aClass209_46.method5038((long) arg0);
			return local24 == null ? arg1 : local24.aString22;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)I")
	public int method7012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass209_46 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub36 local21 = (Class6_Sub36) this.aClass209_46.method5038((long) arg1);
			return local21 == null ? arg0 : local21.anInt5996;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!gga;)V")
	public void method7013(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8374();
			if (local13 == 0) {
				return;
			}
			this.method7010(local13, arg0);
		}
	}
}
