import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class129 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!eaa;")
	public Class4_Sub16 aClass4_Sub16_1;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!tb;")
	public Class341 aClass341_1;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!aia;")
	public Class4_Sub4_Sub1 aClass4_Sub4_Sub1_1;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!oi;")
	public Class4_Sub3_Sub3 aClass4_Sub3_Sub3_1;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	public final int anInt3080;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public final int anInt3084;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	public final int anInt3081;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	public int anInt3085;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!gda;")
	public final Class3_Sub1 aClass3_Sub1_10;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public final int anInt3087;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public final int anInt3083;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(BIIIIIILclient!gda;)V")
	public Class129(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub1 arg7) {
		this.anInt3080 = arg5;
		this.anInt3084 = arg6;
		this.anInt3081 = arg2;
		this.anInt3085 = arg3;
		this.aClass3_Sub1_10 = arg7;
		this.anInt3087 = arg4;
		this.aByte33 = arg0;
		this.anInt3083 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Z")
	public boolean method2873() {
		return this.aByte33 == 2 || this.aByte33 == 3;
	}
}
