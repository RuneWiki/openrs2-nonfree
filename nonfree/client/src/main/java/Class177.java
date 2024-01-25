import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class177 {

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!mt;")
	public Class250 aClass250_1;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!di;")
	public Class2_Sub17 aClass2_Sub17_1;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!kda;")
	public Class2_Sub23_Sub2 aClass2_Sub23_Sub2_1;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Lclient!rb;")
	public Class2_Sub4_Sub1 aClass2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public final int anInt4169;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
	public final int anInt4170;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public final int anInt4166;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
	public final int anInt4172;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!tl;")
	public final Class4_Sub2 aClass4_Sub2_15;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public int anInt4167;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	public final int anInt4168;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(BIIIIIILclient!tl;)V")
	public Class177(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4_Sub2 arg7) {
		this.anInt4169 = arg5;
		this.anInt4170 = arg2;
		this.anInt4166 = arg4;
		this.anInt4172 = arg1;
		this.aClass4_Sub2_15 = arg7;
		this.aByte76 = arg0;
		this.anInt4167 = arg3;
		this.anInt4168 = arg6;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Z")
	public boolean method3779() {
		return this.aByte76 == 2 || this.aByte76 == 3;
	}
}
