import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class303 {

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "Lclient!ho;")
	public Class3_Sub9_Sub2 aClass3_Sub9_Sub2_4;

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "Lclient!tea;")
	public Class3_Sub51 aClass3_Sub51_3;

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "Lclient!bh;")
	public Class36 aClass36_1;

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "Lclient!rea;")
	public Class3_Sub12_Sub1 aClass3_Sub12_Sub1_4;

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "B")
	public final byte aByte109;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Lclient!cn;")
	public final Class23_Sub2 aClass23_Sub2_18;

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
	public int anInt8507;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
	public final int anInt8504;

	@OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
	public final int anInt8508;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
	public final int anInt8502;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
	public final int anInt8503;

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
	public final int anInt8509;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(BIIIIIILclient!cn;)V")
	public Class303(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class23_Sub2 arg7) {
		this.aByte109 = arg0;
		this.aClass23_Sub2_18 = arg7;
		this.anInt8507 = arg3;
		this.anInt8504 = arg6;
		this.anInt8508 = arg4;
		this.anInt8502 = arg5;
		this.anInt8503 = arg2;
		this.anInt8509 = arg1;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)Z")
	public boolean method7193() {
		return this.aByte109 == 2 || this.aByte109 == 3;
	}
}
