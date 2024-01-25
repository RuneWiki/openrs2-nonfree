import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public final class Class244 {

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
	public int anInt6807;

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
	public int anInt6809;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	public int anInt6810;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "I")
	public int anInt6811;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "Lclient!nha;")
	public Class244 aClass244_1;

	@OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
	public int anInt6812;

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
	public int anInt6813;

	@OriginalMember(owner = "client!nha", name = "o", descriptor = "I")
	public int anInt6818;

	@OriginalMember(owner = "client!nha", name = "r", descriptor = "I")
	public int anInt6820;

	@OriginalMember(owner = "client!nha", name = "u", descriptor = "I")
	public int anInt6823;

	@OriginalMember(owner = "client!nha", name = "n", descriptor = "I")
	public final int anInt6817;

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "B")
	public final byte aByte87;

	@OriginalMember(owner = "client!nha", name = "w", descriptor = "I")
	private final int anInt6825;

	@OriginalMember(owner = "client!nha", name = "q", descriptor = "I")
	public final int anInt6819;

	@OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
	public final int anInt6816;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(IIIIB)V")
	public Class244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6817 = arg3;
		this.aByte87 = arg4;
		this.anInt6825 = arg0;
		this.anInt6819 = arg1;
		this.anInt6816 = arg2;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)Lclient!lh;")
	public Class217 method5736() {
		return Static362.method5338(this.anInt6825);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIII)Lclient!nha;")
	public Class244 method5737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class244(this.anInt6825, arg1, arg2, arg0, this.aByte87);
	}
}
