import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class261 {

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
	public int anInt7117;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
	public int anInt7118;

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
	public int anInt7123;

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "Lclient!oea;")
	public Class261 aClass261_2;

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
	public int anInt7125;

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
	public int anInt7127;

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
	public int anInt7128;

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
	public int anInt7129;

	@OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
	public int anInt7130;

	@OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
	public int anInt7135;

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
	public final int anInt7121;

	@OriginalMember(owner = "client!oea", name = "v", descriptor = "I")
	public final int anInt7134;

	@OriginalMember(owner = "client!oea", name = "r", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "I")
	public final int anInt7124;

	@OriginalMember(owner = "client!oea", name = "u", descriptor = "I")
	private final int anInt7133;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(IIIIB)V")
	public Class261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt7121 = arg1;
		this.anInt7134 = arg2;
		this.aByte95 = arg4;
		this.anInt7124 = arg3;
		this.anInt7133 = arg0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BIII)Lclient!oea;")
	public Class261 method6012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class261(this.anInt7133, arg1, arg2, arg0, this.aByte95);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)Lclient!iea;")
	public Class174 method6013() {
		return Static302.method4659(this.anInt7133);
	}
}
