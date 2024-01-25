import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class208 {

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "Lclient!tea;")
	public Class3_Sub47 aClass3_Sub47_3;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "Lclient!dj;")
	public Class64 aClass64_1;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "Lclient!ma;")
	public Class3_Sub12_Sub1 aClass3_Sub12_Sub1_4;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "Lclient!bf;")
	public Class3_Sub7_Sub1 aClass3_Sub7_Sub1_4;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	public final int anInt6575;

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
	public final int anInt6574;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	public final int anInt6570;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
	public final int anInt6571;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
	public final int anInt6573;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
	public int anInt6569;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "Lclient!mb;")
	public final Class2_Sub3 aClass2_Sub3_16;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(BIIIIIILclient!mb;)V")
	public Class208(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class2_Sub3 arg7) {
		this.anInt6575 = arg2;
		this.aByte88 = arg0;
		this.anInt6574 = arg1;
		this.anInt6570 = arg6;
		this.anInt6571 = arg5;
		this.anInt6573 = arg4;
		this.anInt6569 = arg3;
		this.aClass2_Sub3_16 = arg7;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Z")
	public boolean method5501() {
		return this.aByte88 == 2 || this.aByte88 == 3;
	}
}
