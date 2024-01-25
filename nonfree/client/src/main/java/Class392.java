import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class392 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!ui;")
	private final Class359 aClass359_69 = new Class359(64);

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!lga;")
	private final Class223 aClass223_122;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Lclient!oc;")
	public final Class262 aClass262_2;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;Lclient!oc;)V")
	public Class392(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class262 arg3) {
		this.aClass223_122 = arg2;
		this.aClass223_122.method5264(32);
		this.aClass262_2 = arg3;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Lclient!wo;")
	public Class396 method8909(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_69;
		@Pc(16) Class396 local16;
		synchronized (this.aClass359_69) {
			local16 = (Class396) this.aClass359_69.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_122;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_122) {
			local39 = this.aClass223_122.method5267(arg0, 32);
		}
		local16 = new Class396();
		local16.aClass392_2 = this;
		if (local39 != null) {
			local16.method8961(new Class6_Sub15(local39));
		}
		@Pc(72) Class359 local72 = this.aClass359_69;
		synchronized (this.aClass359_69) {
			this.aClass359_69.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public void method8910() {
		@Pc(8) Class359 local8 = this.aClass359_69;
		synchronized (this.aClass359_69) {
			this.aClass359_69.method8507();
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public void method8911() {
		@Pc(7) Class359 local7 = this.aClass359_69;
		synchronized (this.aClass359_69) {
			this.aClass359_69.method8511();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public void method8913() {
		@Pc(2) Class359 local2 = this.aClass359_69;
		synchronized (this.aClass359_69) {
			this.aClass359_69.method8502(5);
		}
	}
}
