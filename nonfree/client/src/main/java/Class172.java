import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class172 {

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
	public int anInt4916;

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "Lclient!ui;")
	private final Class359 aClass359_35 = new Class359(64);

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "Lclient!ui;")
	public final Class359 aClass359_36 = new Class359(60);

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "Lclient!lga;")
	private final Class223 aClass223_60;

	@OriginalMember(owner = "client!iha", name = "o", descriptor = "Lclient!lga;")
	public final Class223 aClass223_59;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;Lclient!lga;)V")
	public Class172(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_60 = arg2;
		this.aClass223_59 = arg3;
		@Pc(26) int local26 = this.aClass223_60.method5290() - 1;
		this.aClass223_60.method5264(local26);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BI)V")
	public void method4443() {
		@Pc(6) Class359 local6 = this.aClass359_35;
		synchronized (this.aClass359_35) {
			this.aClass359_35.method8502(5);
		}
		local6 = this.aClass359_36;
		synchronized (this.aClass359_36) {
			this.aClass359_36.method8502(5);
		}
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V")
	public void method4445() {
		@Pc(6) Class359 local6 = this.aClass359_35;
		synchronized (this.aClass359_35) {
			this.aClass359_35.method8507();
		}
		local6 = this.aClass359_36;
		synchronized (this.aClass359_36) {
			this.aClass359_36.method8507();
		}
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(II)Lclient!aja;")
	public Class17 method4449(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_35;
		@Pc(16) Class17 local16;
		synchronized (this.aClass359_35) {
			local16 = (Class17) this.aClass359_35.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_60;
		@Pc(43) byte[] local43;
		synchronized (this.aClass223_60) {
			local43 = this.aClass223_60.method5267(Static615.method8481(arg0), Static334.method5177(arg0));
		}
		local16 = new Class17();
		local16.anInt247 = arg0;
		local16.aClass172_1 = this;
		if (local43 != null) {
			local16.method222(new Class6_Sub15(local43));
		}
		@Pc(81) Class359 local81 = this.aClass359_35;
		synchronized (this.aClass359_35) {
			this.aClass359_35.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
	public void method4450() {
		@Pc(2) Class359 local2 = this.aClass359_35;
		synchronized (this.aClass359_35) {
			this.aClass359_35.method8511();
		}
		local2 = this.aClass359_36;
		synchronized (this.aClass359_36) {
			this.aClass359_36.method8511();
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V")
	public void method4451(@OriginalArg(1) int arg0) {
		this.anInt4916 = arg0;
		@Pc(9) Class359 local9 = this.aClass359_36;
		synchronized (this.aClass359_36) {
			this.aClass359_36.method8507();
		}
	}
}
