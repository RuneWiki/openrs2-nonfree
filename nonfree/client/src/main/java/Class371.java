import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class371 {

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "[Lclient!hfa;")
	private static final Class136[] aClass136Array1 = new Class136[32];

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!jda;")
	public Class3_Sub30_Sub1 aClass3_Sub30_Sub1_4;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!pd;")
	public Class3_Sub43 aClass3_Sub43_3;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!mga;")
	public Class217 aClass217_1;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!iq;")
	public Class3_Sub7_Sub3 aClass3_Sub7_Sub3_4;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	public final int anInt10067;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "B")
	public final byte aByte129;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!jw;")
	public final Class4_Sub1 aClass4_Sub1_3;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	public int anInt10065;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public final int anInt10066;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	public final int anInt10070;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	public final int anInt10071;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	public final int anInt10069;

	static {
		@Pc(91) Class136[] local91 = Static354.method5837();
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			aClass136Array1[local91[local93].anInt4034] = local91[local93];
		}
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(BIIIIIILclient!jw;)V")
	public Class371(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4_Sub1 arg7) {
		this.anInt10067 = arg6;
		this.aByte129 = arg0;
		this.aClass4_Sub1_3 = arg7;
		this.anInt10065 = arg3;
		this.anInt10066 = arg5;
		this.anInt10070 = arg1;
		this.anInt10071 = arg2;
		this.anInt10069 = arg4;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)Z")
	public boolean method8629() {
		return this.aByte129 == 2 || this.aByte129 == 3;
	}
}
