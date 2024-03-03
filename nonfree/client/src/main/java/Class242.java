import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class242 {

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "[Lclient!bl;")
	public static final Class25_Sub1[] aClass25_Sub1Array2 = new Class25_Sub1[29];

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!s;")
	public static final Class210 aClass210_15 = new Class210(9, 17);

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString70 = "";

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_255 = new Class145(66, 2);

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public final int anInt7025;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(II)V", line = 78)
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7025 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
