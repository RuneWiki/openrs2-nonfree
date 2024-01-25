import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class343 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!cl;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Lclient!wi;")
	public Class6_Sub4_Sub5 aClass6_Sub4_Sub5_4;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!fw;")
	public Class6_Sub20 aClass6_Sub20_3;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Lclient!ib;")
	public Class6_Sub27_Sub1 aClass6_Sub27_Sub1_4;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	public int anInt9814;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	public final int anInt9822;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public final int anInt9812;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
	public final int anInt9820;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public final int anInt9817;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!gg;")
	public final Class9_Sub4 aClass9_Sub4_21;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public final int anInt9813;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "B")
	public final byte aByte125;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(BIIIIIILclient!gg;)V")
	public Class343(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class9_Sub4 arg7) {
		this.anInt9814 = arg3;
		this.anInt9822 = arg6;
		this.anInt9812 = arg1;
		this.anInt9820 = arg4;
		this.anInt9817 = arg5;
		this.aClass9_Sub4_21 = arg7;
		this.anInt9813 = arg2;
		this.aByte125 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z")
	public boolean method8016() {
		return this.aByte125 == 2 || this.aByte125 == 3;
	}
}
