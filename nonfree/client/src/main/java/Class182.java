import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class182 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!mk;")
	public Class3_Sub41 aClass3_Sub41_3;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!ab;")
	public Class3_Sub1_Sub1 aClass3_Sub1_Sub1_3;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!ks;")
	public Class3_Sub35_Sub1 aClass3_Sub35_Sub1_3;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!ma;")
	public Class209 aClass209_1;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public int anInt4975;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "B")
	public final byte aByte70;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public final int anInt4978;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!wea;")
	public final Class28_Sub1 aClass28_Sub1_11;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public final int anInt4982;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public final int anInt4977;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	public final int anInt4976;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public final int anInt4980;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(BIIIIIILclient!wea;)V")
	public Class182(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class28_Sub1 arg7) {
		this.anInt4975 = arg3;
		this.aByte70 = arg0;
		this.anInt4978 = arg6;
		this.aClass28_Sub1_11 = arg7;
		this.anInt4982 = arg2;
		this.anInt4977 = arg4;
		this.anInt4976 = arg5;
		this.anInt4980 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z")
	public boolean method4576() {
		return this.aByte70 == 2 || this.aByte70 == 3;
	}
}
