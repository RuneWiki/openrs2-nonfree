import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class166 {

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!kda;")
	public Class5_Sub29 aClass5_Sub29_3;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!sv;")
	public Class5_Sub1_Sub4 aClass5_Sub1_Sub4_4;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Lclient!so;")
	public Class5_Sub37_Sub1 aClass5_Sub37_Sub1_4;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Lclient!gd;")
	public Class117 aClass117_1;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "Lclient!ov;")
	public final Class4_Sub2 aClass4_Sub2_12;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public final int anInt4332;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "I")
	public final int anInt4335;

	@OriginalMember(owner = "client!im", name = "o", descriptor = "I")
	public final int anInt4334;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "I")
	public final int anInt4327;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "I")
	public final int anInt4333;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "I")
	public int anInt4328;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(BIIIIIILclient!ov;)V")
	public Class166(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4_Sub2 arg7) {
		this.aClass4_Sub2_12 = arg7;
		this.anInt4332 = arg1;
		this.anInt4335 = arg4;
		this.anInt4334 = arg2;
		this.aByte69 = arg0;
		this.anInt4327 = arg5;
		this.anInt4333 = arg6;
		this.anInt4328 = arg3;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z")
	public boolean method3916() {
		return this.aByte69 == 2 || this.aByte69 == 3;
	}
}
