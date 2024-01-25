import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class206 {

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!dc;")
	private final Class44 aClass44_44 = new Class44(64);

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!he;")
	private final Class100 aClass100_59;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public final int anInt5535;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class206(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_59 = arg2;
		this.anInt5535 = this.aClass100_59.method2523(19);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!s;")
	public Class220 method4621(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_44;
		@Pc(22) Class220 local22;
		synchronized (this.aClass44_44) {
			local22 = (Class220) this.aClass44_44.method1353((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass100_59.method2520(arg0, 19);
		local22 = new Class220();
		if (local39 != null) {
			local22.method5251(new Class6_Sub1(local39));
		}
		@Pc(55) Class44 local55 = this.aClass44_44;
		synchronized (this.aClass44_44) {
			this.aClass44_44.method1349(local22, (long) arg0);
			return local22;
		}
	}
}
