import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "[I")
	public final int[] anIntArray160;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "[I")
	public final int[] anIntArray161;

	static {
		new Class142("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(II[I[I)V")
	public Class73_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray160 = arg2;
		this.anIntArray161 = arg3;
	}
}
