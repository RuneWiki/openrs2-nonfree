import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class49 {

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
	public int anInt1231;

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
	public int anInt1232;

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "Lclient!cba;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
	public int anInt1233;

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
	public int anInt1234;

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
	public int anInt1238;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
	public int anInt1239;

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
	public int anInt1245;

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "I")
	public int anInt1246;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
	public int anInt1248;

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
	public final int anInt1241;

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
	public final int anInt1237;

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "B")
	public final byte aByte20;

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
	public final int anInt1244;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
	private final int anInt1230;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIIB)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt1241 = arg2;
		this.anInt1237 = arg3;
		this.aByte20 = arg4;
		this.anInt1244 = arg1;
		this.anInt1230 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)Lclient!cba;")
	public Class49 method1283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class49(this.anInt1230, arg1, arg2, arg0, this.aByte20);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)Lclient!nd;")
	public Class235 method1285() {
		return Static621.method8753(this.anInt1230);
	}
}
