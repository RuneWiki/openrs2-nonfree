import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public abstract class Class6_Sub2_Sub4 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "[Lclient!i;")
	public static final Class111[] aClass111Array3 = new Class111[5];

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	public final int anInt4663;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Lclient!qa;")
	public final Interface9 anInterface9_3;

	static {
		for (@Pc(16) int local16 = 0; local16 < aClass111Array3.length; local16++) {
			aClass111Array3[local16] = new Class111();
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!qa;I)V")
	protected Class6_Sub2_Sub4(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1) {
		this.anInt4663 = arg1;
		this.anInterface9_3 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3930();

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)Z")
	public abstract boolean method3933();
}
