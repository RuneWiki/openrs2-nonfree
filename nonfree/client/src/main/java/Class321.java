import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class321 {

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "Lclient!of;")
	private final Class236 aClass236_88 = new Class236(16);

	@OriginalMember(owner = "client!taa", name = "l", descriptor = "Lclient!oh;")
	private final Class237 aClass237_128;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class321(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_128 = arg2;
		this.aClass237_128.method6315(29);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V")
	public void method7499() {
		@Pc(2) Class236 local2 = this.aClass236_88;
		synchronized (this.aClass236_88) {
			this.aClass236_88.method6245();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Lclient!ar;")
	private Class23 method7500(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_88;
		@Pc(16) Class23 local16;
		synchronized (this.aClass236_88) {
			local16 = (Class23) this.aClass236_88.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_128;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_128) {
			local38 = this.aClass237_128.method6314(29, arg0);
		}
		local16 = new Class23();
		if (local38 != null) {
			local16.method965(new Class8_Sub8(local38));
		}
		@Pc(65) Class236 local65 = this.aClass236_88;
		synchronized (this.aClass236_88) {
			this.aClass236_88.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
	public void method7502() {
		@Pc(2) Class236 local2 = this.aClass236_88;
		synchronized (this.aClass236_88) {
			this.aClass236_88.method6253();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIILclient!qb;II)Lclient!mf;")
	public Class203 method7503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class270 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class105[] local7 = null;
		@Pc(12) Class23 local12 = this.method7500(arg3);
		if (local12.anIntArray29 != null) {
			local7 = new Class105[local12.anIntArray29.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class311 local32 = arg2.method6820(local12.anIntArray29[local22]);
				local7[local22] = new Class105(local32.anInt9061, local32.anInt9063, local32.anInt9064, local32.anInt9069, local32.anInt9066, local32.anInt9065, local32.anInt9060, local32.aBoolean643);
			}
		}
		return new Class203(local12.anInt1025, local7, local12.anInt1027, arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(II)V")
	public void method7504() {
		@Pc(6) Class236 local6 = this.aClass236_88;
		synchronized (this.aClass236_88) {
			this.aClass236_88.method6243(5);
		}
	}
}
