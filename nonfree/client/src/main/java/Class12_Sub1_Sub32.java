import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class12_Sub1_Sub32 extends Class12_Sub1 {

	static {
		new Class88("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		return Static347.anIntArray455;
	}
}
