import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class301 {

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!rm;")
	public Class2_Sub38 aClass2_Sub38_3;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Lclient!gs;")
	public Class2_Sub11_Sub4 aClass2_Sub11_Sub4_4;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!ct;")
	public Class2_Sub14_Sub1 aClass2_Sub14_Sub1_4;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!gp;")
	public Class134 aClass134_1;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
	public final int anInt7903;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public final int anInt7899;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
	public final int anInt7908;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public int anInt7906;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	public final int anInt7902;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Lclient!rba;")
	public final Class16_Sub1 aClass16_Sub1_22;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	public final int anInt7905;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(BIIIIIILclient!rba;)V")
	public Class301(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class16_Sub1 arg7) {
		this.anInt7903 = arg1;
		this.anInt7899 = arg2;
		this.anInt7908 = arg4;
		this.anInt7906 = arg3;
		this.anInt7902 = arg5;
		this.aClass16_Sub1_22 = arg7;
		this.anInt7905 = arg6;
		this.aByte102 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Z")
	public boolean method6928() {
		return this.aByte102 == 2 || this.aByte102 == 3;
	}
}
