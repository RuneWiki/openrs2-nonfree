import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class243 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "Lclient!fu;")
	public Class123 aClass123_5;

	@OriginalMember(owner = "client!naa", name = "n", descriptor = "Lclient!gb;")
	public Class60_Sub1_Sub3 aClass60_Sub1_Sub3_1;

	@OriginalMember(owner = "client!naa", name = "m", descriptor = "S")
	public short aShort72;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Lclient!gb;")
	public Class60_Sub1_Sub3 aClass60_Sub1_Sub3_2;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "Lclient!lg;")
	public Class60_Sub1_Sub5 aClass60_Sub1_Sub5_1;

	@OriginalMember(owner = "client!naa", name = "q", descriptor = "Lclient!jea;")
	public Class60_Sub1_Sub4 aClass60_Sub1_Sub4_1;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!naa;")
	public Class243 aClass243_1;

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "Lclient!vea;")
	public Class60_Sub1_Sub2 aClass60_Sub1_Sub2_1;

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "S")
	public short aShort73;

	@OriginalMember(owner = "client!naa", name = "p", descriptor = "Lclient!lg;")
	public Class60_Sub1_Sub5 aClass60_Sub1_Sub5_2;

	@OriginalMember(owner = "client!naa", name = "o", descriptor = "S")
	public short aShort74;

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "B")
	public byte aByte97;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(I)V")
	public Class243(@OriginalArg(0) int arg0) {
		this.aByte97 = (byte) arg0;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
	public void method5956() {
		while (this.aClass123_5 != null) {
			@Pc(7) Class123 local7 = this.aClass123_5.aClass123_1;
			this.aClass123_5.method3364();
			this.aClass123_5 = local7;
		}
	}
}
