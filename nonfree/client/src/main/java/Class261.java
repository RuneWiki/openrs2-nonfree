import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public final class Class261 {

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
	public int anInt7166;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Lclient!ou;")
	public Class261 aClass261_2;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	public int anInt7168;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
	public int anInt7169;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
	public int anInt7173;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
	public int anInt7174;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
	public int anInt7176;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	public int anInt7177;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	public int anInt7180;

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
	public int anInt7182;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
	public final int anInt7167;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
	public final int anInt7170;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
	public final int anInt7181;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
	private final int anInt7171;

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "B")
	public final byte aByte100;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIIIB)V")
	public Class261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt7167 = arg3;
		this.anInt7170 = arg2;
		this.anInt7181 = arg1;
		this.anInt7171 = arg0;
		this.aByte100 = arg4;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIII)Lclient!ou;")
	public Class261 method6337(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class261(this.anInt7171, arg0, arg2, arg1, this.aByte100);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Lclient!vfa;")
	public Class360 method6339() {
		return Static258.method4239(this.anInt7171);
	}
}
