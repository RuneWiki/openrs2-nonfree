import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class12 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Lclient!nv;")
	public Class1_Sub32_Sub1 aClass1_Sub32_Sub1_1;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Lclient!gq;")
	public Class1_Sub15 aClass1_Sub15_1;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Lclient!um;")
	public Class241 aClass241_1;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "Lclient!wl;")
	public Class1_Sub7_Sub4 aClass1_Sub7_Sub4_1;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public final int anInt342;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public int anInt337;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "I")
	public final int anInt336;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "I")
	public final int anInt334;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "I")
	public final int anInt345;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(BIIIII)V")
	public Class12(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aByte1 = arg0;
		this.anInt342 = arg5;
		this.anInt337 = arg3;
		this.anInt336 = arg4;
		this.anInt334 = arg2;
		this.anInt345 = arg1;
	}
}
