import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class51 {

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "Lclient!vca;")
	public Class3_Sub12_Sub4 aClass3_Sub12_Sub4_1;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "Lclient!pv;")
	public Class3_Sub39_Sub1 aClass3_Sub39_Sub1_1;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "Lclient!lj;")
	public Class210 aClass210_1;

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "Lclient!wm;")
	public Class3_Sub54 aClass3_Sub54_1;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
	public final int anInt1400;

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
	public final int anInt1395;

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
	public final int anInt1393;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
	public final int anInt1397;

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
	public final int anInt1399;

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "Lclient!fq;")
	public final Class34_Sub1 aClass34_Sub1_4;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(BIIIIIILclient!fq;)V")
	public Class51(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class34_Sub1 arg7) {
		this.anInt1400 = arg2;
		this.anInt1395 = arg1;
		this.anInt1393 = arg6;
		this.anInt1397 = arg5;
		this.aByte16 = arg0;
		this.anInt1399 = arg4;
		this.anInt1398 = arg3;
		this.aClass34_Sub1_4 = arg7;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)Z")
	public boolean method1232() {
		return this.aByte16 == 2 || this.aByte16 == 3;
	}
}
