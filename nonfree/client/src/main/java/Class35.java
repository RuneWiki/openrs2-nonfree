import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class35 {

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "Lclient!ti;")
	public Class1_Sub37_Sub1 aClass1_Sub37_Sub1_1;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "Lclient!ka;")
	public Class1_Sub27 aClass1_Sub27_1;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "Lclient!ju;")
	public Class1_Sub16_Sub2 aClass1_Sub16_Sub2_1;

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "Lclient!jt;")
	public Class159 aClass159_1;

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
	public final int anInt943;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	public int anInt937;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
	public final int anInt944;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
	public final int anInt938;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
	public final int anInt941;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(BIIIII)V")
	public Class35(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt943 = arg1;
		this.anInt937 = arg3;
		this.anInt944 = arg4;
		this.anInt938 = arg5;
		this.aByte1 = arg0;
		this.anInt941 = arg2;
	}
}
