import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class145 {

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_25 = new Class135();

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!h;")
	public static final Class89 aClass89_154 = new Class89(81, 8);

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!ld;")
	public static Class135 aClass135_26 = new Class135();

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
	public static final int[] anIntArray225 = new int[8];

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	private final int anInt3735;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V", line = 140)
	public Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3735 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "toString", descriptor = "()Ljava/lang/String;", line = 35)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I", line = 68)
	public int method3703() {
		return this.anInt3735;
	}
}
