import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class2_Sub9_Sub9 extends Class2_Sub9 {

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "Lclient!sq;")
	public final Class1_Sub2_Sub6 aClass1_Sub2_Sub6_1;

	static {
		new Class140("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class2_Sub9_Sub9(@OriginalArg(0) Class1_Sub2_Sub6 arg0) {
		this.aClass1_Sub2_Sub6_1 = arg0;
	}
}
