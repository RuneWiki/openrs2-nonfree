import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class246 {

	@OriginalMember(owner = "client!we", name = "o", descriptor = "I")
	public int anInt6221;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!tl;")
	private final Class227 aClass227_51 = new Class227(64);

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!tl;")
	public final Class227 aClass227_52 = new Class227(30);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!ui;")
	private final Class230 aClass230_86;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Lclient!ui;")
	public final Class230 aClass230_88;

	static {
		new Class169("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;Lclient!ui;)V")
	public Class246(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(3) Class230 arg3) {
		this.aClass230_86 = arg2;
		this.aClass230_88 = arg3;
		@Pc(26) int local26 = this.aClass230_86.method4969() - 1;
		this.aClass230_86.method4956(local26);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	public void method5425(@OriginalArg(1) int arg0) {
		this.anInt6221 = arg0;
		@Pc(9) Class227 local9 = this.aClass227_52;
		synchronized (this.aClass227_52) {
			this.aClass227_52.method4871();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public void method5426() {
		@Pc(6) Class227 local6 = this.aClass227_51;
		synchronized (this.aClass227_51) {
			this.aClass227_51.method4871();
		}
		local6 = this.aClass227_52;
		synchronized (this.aClass227_52) {
			this.aClass227_52.method4871();
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public void method5427() {
		@Pc(2) Class227 local2 = this.aClass227_51;
		synchronized (this.aClass227_51) {
			this.aClass227_51.method4858();
		}
		local2 = this.aClass227_52;
		synchronized (this.aClass227_52) {
			this.aClass227_52.method4858();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lclient!kj;")
	public Class134 method5429(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_51;
		@Pc(16) Class134 local16;
		synchronized (this.aClass227_51) {
			local16 = (Class134) this.aClass227_51.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) byte[] local42 = this.aClass230_86.method4985(Static24.method368(arg0), Static234.method3217(arg0));
		local16 = new Class134();
		local16.aClass246_2 = this;
		local16.anInt3353 = arg0;
		if (local42 != null) {
			local16.method2731(new Class1_Sub33(local42));
		}
		@Pc(64) Class227 local64 = this.aClass227_51;
		synchronized (this.aClass227_51) {
			this.aClass227_51.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public void method5432() {
		@Pc(10) Class227 local10 = this.aClass227_51;
		synchronized (this.aClass227_51) {
			this.aClass227_51.method4859(5);
		}
		local10 = this.aClass227_52;
		synchronized (this.aClass227_52) {
			this.aClass227_52.method4859(5);
		}
	}
}
