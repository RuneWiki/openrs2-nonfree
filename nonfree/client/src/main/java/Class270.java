import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class270 {

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "Lclient!hm;")
	private final Class136 aClass136_82 = new Class136(16);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_98;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class270(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_98 = arg2;
		this.aClass251_98.method5768(29);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public void method6102() {
		@Pc(6) Class136 local6 = this.aClass136_82;
		synchronized (this.aClass136_82) {
			this.aClass136_82.method3476();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Lclient!gt;")
	private Class120 method6104(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_82;
		@Pc(16) Class120 local16;
		synchronized (this.aClass136_82) {
			local16 = (Class120) this.aClass136_82.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_98;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_98) {
			local38 = this.aClass251_98.method5772(arg0, 29);
		}
		local16 = new Class120();
		if (local38 != null) {
			local16.method3176(new Class6_Sub21(local38));
		}
		@Pc(60) Class136 local60 = this.aClass136_82;
		synchronized (this.aClass136_82) {
			this.aClass136_82.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)V")
	public void method6105() {
		@Pc(2) Class136 local2 = this.aClass136_82;
		synchronized (this.aClass136_82) {
			this.aClass136_82.method3474(5);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IBLclient!si;III)Lclient!qea;")
	public Class268 method6106(@OriginalArg(0) int arg0, @OriginalArg(2) Class306 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class240[] local7 = null;
		@Pc(19) Class120 local19 = this.method6104(arg3);
		if (local19.anIntArray210 != null) {
			local7 = new Class240[local19.anIntArray210.length];
			for (@Pc(29) int local29 = 0; local29 < local7.length; local29++) {
				@Pc(39) Class295 local39 = arg1.method6630(local19.anIntArray210[local29]);
				local7[local29] = new Class240(local39.anInt8000, local39.anInt7993, local39.anInt7994, local39.anInt7989, local39.anInt7987, local39.anInt7990, local39.anInt7998, local39.aBoolean573);
			}
		}
		return new Class268(local19.anInt3622, local7, local19.anInt3621, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	public void method6107() {
		@Pc(2) Class136 local2 = this.aClass136_82;
		synchronized (this.aClass136_82) {
			this.aClass136_82.method3470();
		}
	}
}
