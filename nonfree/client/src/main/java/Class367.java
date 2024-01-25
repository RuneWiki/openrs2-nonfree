import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public final class Class367 {

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "Lclient!qga;")
	public Class3_Sub16_Sub2 aClass3_Sub16_Sub2_4;

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "Lclient!qr;")
	public Class3_Sub17_Sub1 aClass3_Sub17_Sub1_4;

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "Lclient!kg;")
	public Class3_Sub32 aClass3_Sub32_3;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "Lclient!mc;")
	public Class199 aClass199_1;

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
	public final int anInt10337;

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
	public final int anInt10341;

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "B")
	public final byte aByte128;

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
	public final int anInt10339;

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
	public final int anInt10342;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
	public final int anInt10340;

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
	public int anInt10343;

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "Lclient!pn;")
	public final Class25_Sub2 aClass25_Sub2_3;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(BIIIIIILclient!pn;)V")
	public Class367(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class25_Sub2 arg7) {
		this.anInt10337 = arg4;
		this.anInt10341 = arg5;
		this.aByte128 = arg0;
		this.anInt10339 = arg6;
		this.anInt10342 = arg1;
		this.anInt10340 = arg2;
		this.anInt10343 = arg3;
		this.aClass25_Sub2_3 = arg7;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)Z")
	public boolean method8184() {
		return this.aByte128 == 2 || this.aByte128 == 3;
	}
}
