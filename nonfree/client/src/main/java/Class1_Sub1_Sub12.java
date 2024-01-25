import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "Lclient!co;")
	public final Class47_Sub1_Sub1 aClass47_Sub1_Sub1_1;

	static {
		new Class96("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class1_Sub1_Sub12(@OriginalArg(0) Class47_Sub1_Sub1 arg0) {
		this.aClass47_Sub1_Sub1_1 = arg0;
	}
}
