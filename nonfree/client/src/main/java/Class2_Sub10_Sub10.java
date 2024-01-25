import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class2_Sub10_Sub10 extends Class2_Sub10 {

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "Lclient!wa;")
	public final Class1_Sub5_Sub6 aClass1_Sub5_Sub6_1;

	static {
		new Class32("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class2_Sub10_Sub10(@OriginalArg(0) Class1_Sub5_Sub6 arg0) {
		this.aClass1_Sub5_Sub6_1 = arg0;
	}
}
