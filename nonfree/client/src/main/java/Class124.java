import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class124 {

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Lclient!wi;")
	public Class393 aClass393_1;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Lclient!hba;")
	public Class6_Sub17_Sub2 aClass6_Sub17_Sub2_1;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "Lclient!eia;")
	public Class6_Sub16 aClass6_Sub16_1;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "Lclient!vfa;")
	public Class6_Sub54_Sub1 aClass6_Sub54_Sub1_1;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
	public final int anInt3568;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "Lclient!rfa;")
	public final Class60_Sub1 aClass60_Sub1_9;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
	public final int anInt3567;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
	public final int anInt3565;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
	public int anInt3564;

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
	public final int anInt3562;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	public final int anInt3563;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "B")
	public final byte aByte48;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(BIIIIIILclient!rfa;)V")
	public Class124(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class60_Sub1 arg7) {
		this.anInt3568 = arg4;
		this.aClass60_Sub1_9 = arg7;
		this.anInt3567 = arg6;
		this.anInt3565 = arg1;
		this.anInt3564 = arg3;
		this.anInt3562 = arg2;
		this.anInt3563 = arg5;
		this.aByte48 = arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)Z")
	public boolean method3369() {
		return this.aByte48 == 2 || this.aByte48 == 3;
	}
}
