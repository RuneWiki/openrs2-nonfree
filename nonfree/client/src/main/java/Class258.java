import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class258 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!gg;")
	private final Class112 aClass112_46 = new Class112(64);

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public int anInt7836 = 0;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!kha;")
	private final Class181 aClass181_79;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public final int anInt7834;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class258(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_79 = arg2;
		this.anInt7834 = this.aClass181_79.method5025(4);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lclient!wm;")
	public Class374 method6555(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_46;
		@Pc(18) Class374 local18;
		synchronized (this.aClass112_46) {
			local18 = (Class374) this.aClass112_46.method3640((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class181 local31 = this.aClass181_79;
		@Pc(40) byte[] local40;
		synchronized (this.aClass181_79) {
			local40 = this.aClass181_79.method5023(4, arg0);
		}
		local18 = new Class374();
		local18.aClass258_6 = this;
		local18.anInt10473 = arg0;
		if (local40 != null) {
			local18.method8615(new Class3_Sub15(local40));
		}
		local18.method8616();
		@Pc(73) Class112 local73 = this.aClass112_46;
		synchronized (this.aClass112_46) {
			this.aClass112_46.method3636((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
	public void method6556() {
		@Pc(12) Class112 local12 = this.aClass112_46;
		synchronized (this.aClass112_46) {
			this.aClass112_46.method3637(5);
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public void method6558() {
		@Pc(2) Class112 local2 = this.aClass112_46;
		synchronized (this.aClass112_46) {
			this.aClass112_46.method3643();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public void method6559() {
		@Pc(2) Class112 local2 = this.aClass112_46;
		synchronized (this.aClass112_46) {
			this.aClass112_46.method3638();
		}
	}
}
