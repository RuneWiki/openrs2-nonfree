import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class347 {

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!wda;")
	public Class3_Sub50 aClass3_Sub50_3;

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "Lclient!caa;")
	public Class43 aClass43_1;

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "Lclient!ug;")
	public Class3_Sub48_Sub1 aClass3_Sub48_Sub1_4;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "Lclient!am;")
	public Class3_Sub4_Sub1 aClass3_Sub4_Sub1_4;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
	public final int anInt8757;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
	public int anInt8753;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
	public final int anInt8752;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
	public final int anInt8755;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
	public final int anInt8758;

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "B")
	public final byte aByte112;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(BIIIII)V")
	public Class347(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8757 = arg1;
		this.anInt8753 = arg3;
		this.anInt8752 = arg2;
		this.anInt8755 = arg5;
		this.anInt8758 = arg4;
		this.aByte112 = arg0;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Z")
	public boolean method7297() {
		return this.aByte112 == 2 || this.aByte112 == 3;
	}
}
