import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "[Lclient!bt;")
	public static final Class43[] aClass43Array1 = new Class43[5];

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	public final int anInt1202;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public final int anInt1206;

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass43Array1.length; local6++) {
			aClass43Array1[local6] = new Class43();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class6_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1202 = arg0;
		this.anInt1206 = arg1;
	}
}
