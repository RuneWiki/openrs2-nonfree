import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class393 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!dga;")
	public Class14_Sub14_Sub1 aClass14_Sub14_Sub1_4;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Lclient!uia;")
	public Class354 aClass354_1;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "Lclient!qk;")
	public Class14_Sub5_Sub4 aClass14_Sub5_Sub4_4;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!dfa;")
	public Class14_Sub13 aClass14_Sub13_3;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	public final int anInt11159;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
	public final int anInt11160;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	public final int anInt11158;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
	public final int anInt11163;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "Lclient!je;")
	public final Class12_Sub2 aClass12_Sub2_23;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
	public int anInt11164;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	public final int anInt11165;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "B")
	public final byte aByte150;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(BIIIIIILclient!je;)V")
	public Class393(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class12_Sub2 arg7) {
		this.anInt11159 = arg4;
		this.anInt11160 = arg6;
		this.anInt11158 = arg1;
		this.anInt11163 = arg2;
		this.aClass12_Sub2_23 = arg7;
		this.anInt11164 = arg3;
		this.anInt11165 = arg5;
		this.aByte150 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Z")
	public boolean method9276() {
		return this.aByte150 == 2 || this.aByte150 == 3;
	}
}
