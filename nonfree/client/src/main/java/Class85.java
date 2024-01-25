import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class85 {

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_14 = new Class288(64);

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!gp;")
	private final Class117 aClass117_63;

	static {
		new Class40("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class85(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_63 = arg2;
		this.aClass117_63.method2951(32);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public void method2264() {
		@Pc(10) Class288 local10 = this.aClass288_14;
		synchronized (this.aClass288_14) {
			this.aClass288_14.method6744();
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	public void method2268() {
		@Pc(6) Class288 local6 = this.aClass288_14;
		synchronized (this.aClass288_14) {
			this.aClass288_14.method6735(5);
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(II)Lclient!ti;")
	public Class281 method2270(@OriginalArg(1) int arg0) {
		@Pc(11) Class288 local11 = this.aClass288_14;
		@Pc(21) Class281 local21;
		synchronized (this.aClass288_14) {
			local21 = (Class281) this.aClass288_14.method6745((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class117 local34 = this.aClass117_63;
		@Pc(43) byte[] local43;
		synchronized (this.aClass117_63) {
			local43 = this.aClass117_63.method2962(arg0, 32);
		}
		local21 = new Class281();
		if (local43 != null) {
			local21.method6594(new Class5_Sub3(local43));
		}
		@Pc(65) Class288 local65 = this.aClass288_14;
		synchronized (this.aClass288_14) {
			this.aClass288_14.method6746(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
	public void method2271() {
		@Pc(2) Class288 local2 = this.aClass288_14;
		synchronized (this.aClass288_14) {
			this.aClass288_14.method6742();
		}
	}
}
