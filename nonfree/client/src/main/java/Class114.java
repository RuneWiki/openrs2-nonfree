import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class114 {

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
	public static final int[] anIntArray186 = new int[500];

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public int anInt2912;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public int anInt2913;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!jf;")
	public Class114 aClass114_1;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public int anInt2918;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public int anInt2919;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public int anInt2921;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public int anInt2922;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	public int anInt2925;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	public int anInt2926;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	public final int anInt2917;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public final int anInt2915;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	public final int anInt2923;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
	public final int anInt2927;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIB)V", line = 191)
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2917 = arg3;
		this.aByte26 = arg4;
		this.anInt2915 = arg1;
		this.anInt2923 = arg2;
		this.anInt2927 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!jf;I)V", line = 242)
	public Class114(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1) {
		this.aClass114_1 = arg0;
		this.anInt2917 = arg1 + this.aClass114_1.anInt2917;
		this.aByte26 = this.aClass114_1.aByte26;
		this.anInt2923 = arg1 + this.aClass114_1.anInt2923;
		this.anInt2927 = this.aClass114_1.anInt2927;
		this.anInt2915 = this.aClass114_1.anInt2915 + arg1;
	}
}
