import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class68 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!fh;")
	public Class10_Sub17 aClass10_Sub17_1;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Lclient!um;")
	public Class251 aClass251_1;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "Lclient!bs;")
	public Class10_Sub7_Sub1 aClass10_Sub7_Sub1_1;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "Lclient!wq;")
	public Class10_Sub25_Sub1 aClass10_Sub25_Sub1_1;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "I")
	public final int anInt1953;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public final int anInt1952;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public final int anInt1947;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "I")
	public int anInt1950;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public final int anInt1946;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "B")
	public final byte aByte14;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(BIIIII)V")
	public Class68(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1953 = arg1;
		this.anInt1952 = arg2;
		this.anInt1947 = arg4;
		this.anInt1950 = arg3;
		this.anInt1946 = arg5;
		this.aByte14 = arg0;
	}
}
