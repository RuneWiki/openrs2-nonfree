import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class68 {

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "Lclient!ui;")
	private final Class359 aClass359_9 = new Class359(64);

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "Lclient!ui;")
	private final Class359 aClass359_10 = new Class359(100);

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "Lclient!lga;")
	private final Class223 aClass223_21;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;Lclient!lga;Lclient!lga;)V")
	public Class68(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class223 arg4) {
		this.aClass223_21 = arg2;
		if (this.aClass223_21 != null) {
			@Pc(26) int local26 = this.aClass223_21.method5290() - 1;
			this.aClass223_21.method5264(local26);
		}
		Static188.method3528(arg4, arg3);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public void method1282() {
		@Pc(2) Class359 local2 = this.aClass359_9;
		synchronized (this.aClass359_9) {
			this.aClass359_9.method8507();
		}
		local2 = this.aClass359_10;
		synchronized (this.aClass359_10) {
			this.aClass359_10.method8507();
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
	public void method1284() {
		@Pc(10) Class359 local10 = this.aClass359_9;
		synchronized (this.aClass359_9) {
			this.aClass359_9.method8511();
		}
		local10 = this.aClass359_10;
		synchronized (this.aClass359_10) {
			this.aClass359_10.method8511();
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)Lclient!dt;")
	public Class6_Sub2_Sub5 method1285(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_10;
		synchronized (this.aClass359_10) {
			@Pc(16) Class6_Sub2_Sub5 local16 = (Class6_Sub2_Sub5) this.aClass359_10.method8517((long) arg0);
			if (local16 == null) {
				local16 = new Class6_Sub2_Sub5(arg0);
				this.aClass359_10.method8515((long) arg0, local16);
			}
			return local16.method2149() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)Lclient!kn;")
	public Class212 method1286(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_9;
		@Pc(16) Class212 local16;
		synchronized (this.aClass359_9) {
			local16 = (Class212) this.aClass359_9.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class223 local37 = this.aClass223_21;
		@Pc(50) byte[] local50;
		synchronized (this.aClass223_21) {
			local50 = this.aClass223_21.method5267(Static321.method5038(arg0), Static15.method197(arg0));
		}
		local16 = new Class212();
		local16.anInt5515 = arg0;
		if (local50 != null) {
			local16.method5030(new Class6_Sub15(local50));
		}
		local16.method5027();
		@Pc(80) Class359 local80 = this.aClass359_9;
		synchronized (this.aClass359_9) {
			this.aClass359_9.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
	public void method1287() {
		@Pc(2) Class359 local2 = this.aClass359_9;
		synchronized (this.aClass359_9) {
			this.aClass359_9.method8502(5);
		}
		local2 = this.aClass359_10;
		synchronized (this.aClass359_10) {
			this.aClass359_10.method8502(5);
		}
	}
}
