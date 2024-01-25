import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class277 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Lclient!mf;")
	private final Class222 aClass222_50 = new Class222(64);

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "Lclient!pu;")
	private final Class270 aClass270_93;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	public final int anInt7657;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class277(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_93 = arg2;
		this.anInt7657 = this.aClass270_93.method5685(19);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)Lclient!ef;")
	public Class85 method6091(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_50;
		@Pc(16) Class85 local16;
		synchronized (this.aClass222_50) {
			local16 = (Class85) this.aClass222_50.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_93;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_93) {
			local38 = this.aClass270_93.method5704(19, arg0);
		}
		local16 = new Class85();
		if (local38 != null) {
			local16.method1760(new Class1_Sub35(local38));
		}
		@Pc(60) Class222 local60 = this.aClass222_50;
		synchronized (this.aClass222_50) {
			this.aClass222_50.method4434(local16, (long) arg0);
			return local16;
		}
	}
}
