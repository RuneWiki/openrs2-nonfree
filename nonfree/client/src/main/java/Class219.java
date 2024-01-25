import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class219 {

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
	public int anInt6900;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "Lclient!nda;")
	public Class219 aClass219_2;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
	public int anInt6902;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
	public int anInt6903;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
	public int anInt6904;

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
	public int anInt6905;

	@OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
	public int anInt6908;

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
	public int anInt6911;

	@OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
	public int anInt6913;

	@OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
	public int anInt6916;

	@OriginalMember(owner = "client!nda", name = "x", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
	public final int anInt6898;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
	public final int anInt6899;

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
	public final int anInt6906;

	@OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
	private final int anInt6909;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(IIIIB)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte69 = arg4;
		this.anInt6898 = arg1;
		this.anInt6899 = arg2;
		this.anInt6906 = arg3;
		this.anInt6909 = arg0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)Lclient!gw;")
	public Class125 method5657() {
		return Static443.method6815(this.anInt6909);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)Lclient!nda;")
	public Class219 method5663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class219(this.anInt6909, arg2, arg0, arg1, this.aByte69);
	}
}
