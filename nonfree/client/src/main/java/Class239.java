import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class239 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!mu;")
	public Class1_Sub29 aClass1_Sub29_1;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!bv;")
	public Class1_Sub6_Sub1 aClass1_Sub6_Sub1_2;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!gk;")
	public Class1_Sub5_Sub2 aClass1_Sub5_Sub2_4;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!rv;")
	public Class215 aClass215_1;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public final int anInt7119;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	public final int anInt7124;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public int anInt7126;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
	public final int anInt7128;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	public final int anInt7121;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(BIIIII)V")
	public Class239(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aByte98 = arg0;
		this.anInt7119 = arg2;
		this.anInt7124 = arg4;
		this.anInt7126 = arg3;
		this.anInt7128 = arg1;
		this.anInt7121 = arg5;
	}
}
