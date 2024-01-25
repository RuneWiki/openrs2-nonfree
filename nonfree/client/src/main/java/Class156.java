import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class156 {

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "Lclient!ui;")
	private final Class359 aClass359_25 = new Class359(64);

	@OriginalMember(owner = "client!hha", name = "g", descriptor = "Lclient!lga;")
	private final Class223 aClass223_46;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class156(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_46 = arg2;
		if (this.aClass223_46 != null) {
			this.aClass223_46.method5264(35);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
	public void method4045() {
		@Pc(2) Class359 local2 = this.aClass359_25;
		synchronized (this.aClass359_25) {
			this.aClass359_25.method8507();
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)Lclient!vp;")
	public Class382 method4046(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_25;
		@Pc(16) Class382 local16;
		synchronized (this.aClass359_25) {
			local16 = (Class382) this.aClass359_25.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_46;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_46) {
			local39 = this.aClass223_46.method5267(arg0, 35);
		}
		local16 = new Class382();
		if (local39 != null) {
			local16.method8765(new Class6_Sub15(local39));
		}
		local16.method8762();
		@Pc(66) Class359 local66 = this.aClass359_25;
		synchronized (this.aClass359_25) {
			this.aClass359_25.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(II)V")
	public void method4047() {
		@Pc(2) Class359 local2 = this.aClass359_25;
		synchronized (this.aClass359_25) {
			this.aClass359_25.method8502(5);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)V")
	public void method4048() {
		@Pc(2) Class359 local2 = this.aClass359_25;
		synchronized (this.aClass359_25) {
			this.aClass359_25.method8511();
		}
	}
}
