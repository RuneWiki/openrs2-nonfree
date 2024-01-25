import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class398 {

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "Lclient!hb;")
	public Class3_Sub27 aClass3_Sub27_3;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "Lclient!wha;")
	public Class3_Sub34_Sub1 aClass3_Sub34_Sub1_3;

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "Lclient!uv;")
	public Class3_Sub33_Sub5 aClass3_Sub33_Sub5_3;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!wi;")
	public Class402 aClass402_1;

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
	public final int anInt10988;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
	public final int anInt10987;

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
	public int anInt10981;

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
	public final int anInt10985;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
	public final int anInt10986;

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
	public final int anInt10984;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!ee;")
	public final Class9_Sub1 aClass9_Sub1_25;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "B")
	public final byte aByte142;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(BIIIIIILclient!ee;)V")
	public Class398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class9_Sub1 arg7) {
		this.anInt10988 = arg6;
		this.anInt10987 = arg2;
		this.anInt10981 = arg3;
		this.anInt10985 = arg4;
		this.anInt10986 = arg1;
		this.anInt10984 = arg5;
		this.aClass9_Sub1_25 = arg7;
		this.aByte142 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Z")
	public boolean method9310() {
		return this.aByte142 == 2 || this.aByte142 == 3;
	}
}
