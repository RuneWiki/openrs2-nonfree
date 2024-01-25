import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class219 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public int anInt5910;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	public int anInt5912;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Lclient!mp;")
	public Class219 aClass219_1;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
	public int anInt5914;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public int anInt5915;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	public int anInt5917;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public int anInt5918;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
	public int anInt5919;

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
	public int anInt5925;

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
	public int anInt5926;

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
	public final int anInt5924;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
	private final int anInt5923;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
	public final int anInt5916;

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
	public final int anInt5927;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIIB)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5924 = arg2;
		this.anInt5923 = arg0;
		this.aByte80 = arg4;
		this.anInt5916 = arg3;
		this.anInt5927 = arg1;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Lclient!efa;")
	public Class86 method4982() {
		return Static396.method5612(this.anInt5923);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIII)Lclient!mp;")
	public Class219 method4983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class219(this.anInt5923, arg0, arg1, arg2, this.aByte80);
	}
}
