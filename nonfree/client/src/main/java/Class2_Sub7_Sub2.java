import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class2_Sub7_Sub2 extends Class2_Sub7 {

	static {
		new Class256("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
		new Class256(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIII)V")
	@Override
	public void method2998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt3740 = arg1;
		super.anInt3739 = arg2;
		super.anInt3741 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IF)V")
	@Override
	public void method2995(@OriginalArg(1) float arg0) {
		super.aFloat123 = arg0;
	}
}
