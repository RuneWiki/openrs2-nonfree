import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class247 {

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!tl;")
	private final Class227 aClass227_53 = new Class227(64);

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!ui;")
	private final Class230 aClass230_89;

	static {
		new Class169("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class247(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_89 = arg2;
		this.aClass230_89.method4956(5);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!wp;")
	public Class1_Sub6_Sub17 method5446(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_53;
		@Pc(16) Class1_Sub6_Sub17 local16;
		synchronized (this.aClass227_53) {
			local16 = (Class1_Sub6_Sub17) this.aClass227_53.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) byte[] local35 = this.aClass230_89.method4985(arg0, 5);
		local16 = new Class1_Sub6_Sub17();
		if (local35 != null) {
			local16.method5543(new Class1_Sub33(local35));
		}
		@Pc(51) Class227 local51 = this.aClass227_53;
		synchronized (this.aClass227_53) {
			this.aClass227_53.method4865(local16, (long) arg0);
			return local16;
		}
	}
}
