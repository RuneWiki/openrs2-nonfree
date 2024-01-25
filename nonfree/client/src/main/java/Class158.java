import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class158 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!tl;")
	private final Class227 aClass227_28 = new Class227(64);

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	public int anInt3831 = 0;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!ui;")
	private final Class230 aClass230_56;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
	public final int anInt3830;

	static {
		new Class169("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class158(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_56 = arg2;
		this.anInt3830 = this.aClass230_56.method4956(4);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)Lclient!an;")
	public Class13 method3161(@OriginalArg(1) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_28;
		@Pc(16) Class13 local16;
		synchronized (this.aClass227_28) {
			local16 = (Class13) this.aClass227_28.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass230_56.method4985(arg0, 4);
		local16 = new Class13();
		local16.aClass158_1 = this;
		local16.anInt201 = arg0;
		if (local33 != null) {
			local16.method115(new Class1_Sub33(local33));
		}
		local16.method113();
		@Pc(58) Class227 local58 = this.aClass227_28;
		synchronized (this.aClass227_28) {
			this.aClass227_28.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public void method3162() {
		@Pc(6) Class227 local6 = this.aClass227_28;
		synchronized (this.aClass227_28) {
			this.aClass227_28.method4858();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V")
	public void method3164() {
		@Pc(2) Class227 local2 = this.aClass227_28;
		synchronized (this.aClass227_28) {
			this.aClass227_28.method4859(5);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	public void method3165() {
		@Pc(10) Class227 local10 = this.aClass227_28;
		synchronized (this.aClass227_28) {
			this.aClass227_28.method4871();
		}
	}
}
