import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class3_Sub23_Sub2 extends Class3_Sub23 {

	static {
		new Class180("", 73);
		new Class175("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub23_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt4508 = arg1;
		super.anInt4509 = arg2;
		super.anInt4513 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BF)V")
	@Override
	public void method3672(@OriginalArg(1) float arg0) {
		super.aFloat59 = arg0;
	}
}
