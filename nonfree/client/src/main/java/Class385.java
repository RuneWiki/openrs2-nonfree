import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class385 {

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
	public int anInt10648;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "Lclient!wq;")
	private final Class391 aClass391_65 = new Class391(64);

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "Lclient!wq;")
	public final Class391 aClass391_66 = new Class391(60);

	@OriginalMember(owner = "client!wha", name = "g", descriptor = "Lclient!la;")
	public final Class208 aClass208_147;

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "Lclient!la;")
	private final Class208 aClass208_146;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!to;ILclient!la;Lclient!la;)V")
	public Class385(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Class208 arg3) {
		this.aClass208_147 = arg3;
		this.aClass208_146 = arg2;
		@Pc(26) int local26 = this.aClass208_146.method4988() - 1;
		this.aClass208_146.method5005(local26);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)V")
	public void method9160(@OriginalArg(1) int arg0) {
		this.anInt10648 = arg0;
		@Pc(9) Class391 local9 = this.aClass391_66;
		synchronized (this.aClass391_66) {
			this.aClass391_66.method9276(0);
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
	public void method9161() {
		@Pc(7) Class391 local7 = this.aClass391_65;
		synchronized (this.aClass391_65) {
			this.aClass391_65.method9276(0);
		}
		local7 = this.aClass391_66;
		synchronized (this.aClass391_66) {
			this.aClass391_66.method9276(0);
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IB)V")
	public void method9162() {
		@Pc(6) Class391 local6 = this.aClass391_65;
		synchronized (this.aClass391_65) {
			this.aClass391_65.method9274(5);
		}
		local6 = this.aClass391_66;
		synchronized (this.aClass391_66) {
			this.aClass391_66.method9274(5);
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(II)Lclient!hi;")
	public Class160 method9166(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_65;
		@Pc(16) Class160 local16;
		synchronized (this.aClass391_65) {
			local16 = (Class160) this.aClass391_65.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_146;
		@Pc(43) byte[] local43;
		synchronized (this.aClass208_146) {
			local43 = this.aClass208_146.method4991(Static606.method8457(arg0), Static78.method8195(arg0), 75);
		}
		local16 = new Class160();
		local16.aClass385_1 = this;
		local16.anInt3629 = arg0;
		if (local43 != null) {
			local16.method3183(new Class5_Sub23(local43));
		}
		@Pc(81) Class391 local81 = this.aClass391_65;
		synchronized (this.aClass391_65) {
			this.aClass391_65.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	public void method9168() {
		@Pc(2) Class391 local2 = this.aClass391_65;
		synchronized (this.aClass391_65) {
			this.aClass391_65.method9286();
		}
		local2 = this.aClass391_66;
		synchronized (this.aClass391_66) {
			this.aClass391_66.method9286();
		}
	}
}
