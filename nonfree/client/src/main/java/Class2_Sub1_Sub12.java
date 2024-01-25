import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "Lclient!ao;")
	public final Class12_Sub1_Sub1 aClass12_Sub1_Sub1_1;

	static {
		new Class221("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class2_Sub1_Sub12(@OriginalArg(0) Class12_Sub1_Sub1 arg0) {
		this.aClass12_Sub1_Sub1_1 = arg0;
	}
}
