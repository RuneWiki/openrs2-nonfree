import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class231 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public int anInt6725;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Lclient!fd;")
	public Class84 aClass84_5;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public int anInt6730;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Z")
	public boolean aBoolean424 = false;

	static {
		new Class158("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ia;ZI)V")
	private void method5123(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6725 = arg0.method1177();
		} else if (arg1 == 2) {
			this.anInt6730 = arg0.method1226();
		} else if (arg1 == 3) {
			this.aBoolean424 = true;
		} else if (arg1 == 4) {
			this.anInt6725 = -1;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method5125(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1171();
			if (local12 == 0) {
				return;
			}
			this.method5123(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z")
	public boolean method5126() {
		return this.aClass84_5.aClass211_30.method4761(this.anInt6725);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!za;ZI)Lclient!o;")
	public Class137 method5129(@OriginalArg(1) Class106 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(22) long local22 = (long) (arg0.anInt7745 << 19 | (arg1 ? 262144 : 0) | this.anInt6725 | arg2 << 16);
		@Pc(30) Class137 local30 = (Class137) this.aClass84_5.aClass91_34.method1988(local22);
		if (local30 != null) {
			return local30;
		} else if (this.aClass84_5.aClass211_30.method4761(this.anInt6725)) {
			@Pc(52) Class266 local52 = Static470.method6054(this.aClass84_5.aClass211_30, this.anInt6725, 0);
			if (local52 != null) {
				local52.anInt7822 = local52.anInt7825 = local52.anInt7821 = local52.anInt7826 = 0;
				if (arg1) {
					local52.method6053();
				}
				for (@Pc(72) int local72 = 0; local72 < arg2; local72++) {
					local52.method6047();
				}
			}
			local30 = arg0.method5938(local52);
			if (local30 != null) {
				this.aClass84_5.aClass91_34.method1990(local30, local22);
			}
			return local30;
		} else {
			return null;
		}
	}
}
