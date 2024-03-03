import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class173_Sub4 extends Class173 {

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_243 = new Class89(89, 6);

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "Lclient!h;")
	public static final Class89 aClass89_244 = new Class89(33, 15);

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray66 = new String[100];

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "Z")
	public static volatile boolean aBoolean475 = true;

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
	private final int anInt7003;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	private final int anInt6990;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	private final int anInt7002;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
	private final int anInt6991;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
	private final int anInt6997;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	private final int anInt6996;

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
	private final int anInt6994;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
	private final int anInt6989;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 186)
	public Class173_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7003 = arg5;
		this.anInt6990 = arg0;
		this.anInt7002 = arg6;
		this.anInt6991 = arg4;
		this.anInt6997 = arg1;
		this.anInt6996 = arg7;
		this.anInt6994 = arg3;
		this.anInt6989 = arg2;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(III)V", line = 80)
	@Override
	public void method6252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V", line = 124)
	@Override
	public void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * this.anInt6990 >> 12;
		@Pc(24) int local24 = this.anInt6997 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt6989 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt6994 * arg0 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt6991 >> 12;
		@Pc(52) int local52 = this.anInt7003 * arg0 >> 12;
		@Pc(59) int local59 = arg1 * this.anInt7002 >> 12;
		@Pc(66) int local66 = this.anInt6996 * arg0 >> 12;
		Static29.method943(local38, local24, super.anInt6983, local31, local52, local17, local45, local59, local66);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)V", line = 151)
	@Override
	public void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
