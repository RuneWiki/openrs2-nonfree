import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class323 {

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	public int anInt8092;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	public int anInt8093;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Lclient!tk;")
	public Class323 aClass323_2;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
	public int anInt8094;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
	public int anInt8098;

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
	public int anInt8101;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
	public int anInt8104;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
	public int anInt8107;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
	public int anInt8108;

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
	public int anInt8109;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "B")
	public final byte aByte117;

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
	private final int anInt8096;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
	public final int anInt8103;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
	public final int anInt8095;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
	public final int anInt8106;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIIIB)V")
	public Class323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte117 = arg4;
		this.anInt8096 = arg0;
		this.anInt8103 = arg2;
		this.anInt8095 = arg1;
		this.anInt8106 = arg3;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBII)Lclient!tk;")
	public Class323 method6825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class323(this.anInt8096, arg2, arg0, arg1, this.aByte117);
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Lclient!wf;")
	public Class361 method6829() {
		return Static90.method2037(this.anInt8096);
	}
}
