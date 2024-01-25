import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class57 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	public int anInt1255;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public int anInt1256;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public int anInt1257;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public int anInt1262;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "Lclient!cm;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public int anInt1266;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
	public int anInt1267;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
	public int anInt1269;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
	public int anInt1271;

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
	public int anInt1272;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	public final int anInt1270;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
	public final int anInt1265;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
	private final int anInt1268;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public final int anInt1261;

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "B")
	public final byte aByte18;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIIB)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt1270 = arg3;
		this.anInt1265 = arg2;
		this.anInt1268 = arg0;
		this.anInt1261 = arg1;
		this.aByte18 = arg4;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lclient!fga;")
	public Class107 method1232() {
		return Static599.method8374(this.anInt1268);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)Lclient!cm;")
	public Class57 method1236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class57(this.anInt1268, arg2, arg0, arg1, this.aByte18);
	}
}
