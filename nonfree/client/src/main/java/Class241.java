import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class241 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!hh;")
	public Class6_Sub17_Sub1 aClass6_Sub17_Sub1_2;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!ar;")
	public Class6_Sub4_Sub1 aClass6_Sub4_Sub1_4;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!nu;")
	public Class6_Sub26 aClass6_Sub26_1;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "Lclient!je;")
	public Class127 aClass127_1;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	public final int anInt7112;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
	public final int anInt7108;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public final int anInt7110;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	public int anInt7113;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	public final int anInt7109;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(BIIIII)V")
	public Class241(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7112 = arg1;
		this.anInt7108 = arg2;
		this.anInt7110 = arg5;
		this.anInt7113 = arg3;
		this.anInt7109 = arg4;
		this.aByte102 = arg0;
	}
}
