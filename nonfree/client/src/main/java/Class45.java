import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class45 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!vq;")
	public Class1_Sub19_Sub4 aClass1_Sub19_Sub4_2;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!ht;")
	public Class112 aClass112_1;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Lclient!mg;")
	public Class1_Sub12_Sub1 aClass1_Sub12_Sub1_2;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "Lclient!bt;")
	public Class1_Sub6 aClass1_Sub6_1;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	public final int anInt1513;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public final int anInt1509;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	public final int anInt1511;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	public final int anInt1512;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public int anInt1514;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "B")
	public final byte aByte35;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(BIIIII)V")
	public Class45(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1513 = arg4;
		this.anInt1509 = arg1;
		this.anInt1511 = arg2;
		this.anInt1512 = arg5;
		this.anInt1514 = arg3;
		this.aByte35 = arg0;
	}
}
