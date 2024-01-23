import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	public int anInt3842 = -1;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "I")
	public int anInt3848 = 12800;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "I")
	public int anInt3841 = -1;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
	public boolean aBoolean192 = true;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
	public int anInt3846 = 0;

	@OriginalMember(owner = "client!o", name = "G", descriptor = "I")
	public int anInt3839 = 12800;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
	public int anInt3854 = 0;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	public int anInt3844;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "Ljava/lang/String;")
	public String aString249;

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "Ljava/lang/String;")
	public String aString250;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "I")
	public int anInt3843;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Lclient!ab;")
	public Class3 aClass3_15;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt3842 = arg6;
		this.anInt3844 = arg0;
		this.anInt3841 = arg4;
		this.aString249 = arg2;
		this.aString250 = arg1;
		this.anInt3843 = arg3;
		this.aBoolean192 = arg5;
		if (this.anInt3842 == 255) {
			this.anInt3842 = 0;
		}
		this.aClass3_15 = new Class3();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)[I")
	public int[] method2856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class1_Sub8 local16 = (Class1_Sub8) this.aClass3_15.method30(); local16 != null; local16 = (Class1_Sub8) this.aClass3_15.method33()) {
			if (local16.method1137(arg1, arg0)) {
				return local16.method1144(arg1, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public void method2859() {
		this.anInt3846 = 0;
		this.anInt3854 = 0;
		this.anInt3848 = 12800;
		this.anInt3839 = 12800;
		for (@Pc(25) Class1_Sub8 local25 = (Class1_Sub8) this.aClass3_15.method30(); local25 != null; local25 = (Class1_Sub8) this.aClass3_15.method33()) {
			if (local25.anInt1635 > this.anInt3854) {
				this.anInt3854 = local25.anInt1635;
			}
			if (this.anInt3846 < local25.anInt1636) {
				this.anInt3846 = local25.anInt1636;
			}
			if (local25.anInt1632 < this.anInt3848) {
				this.anInt3848 = local25.anInt1632;
			}
			if (local25.anInt1638 < this.anInt3839) {
				this.anInt3839 = local25.anInt1638;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)[I")
	public int[] method2860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class1_Sub8 local19 = (Class1_Sub8) this.aClass3_15.method30(); local19 != null; local19 = (Class1_Sub8) this.aClass3_15.method33()) {
			if (local19.method1142(arg2, arg0, arg1)) {
				return local19.method1143(arg1, arg2);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB)[I")
	public int[] method2861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(17) Class1_Sub8 local17 = (Class1_Sub8) this.aClass3_15.method30(); local17 != null; local17 = (Class1_Sub8) this.aClass3_15.method33()) {
			if (local17.method1139(arg0, arg1)) {
				return local17.method1143(arg1, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Z")
	public boolean method2863(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) Class1_Sub8 local19 = (Class1_Sub8) this.aClass3_15.method30(); local19 != null; local19 = (Class1_Sub8) this.aClass3_15.method33()) {
			if (local19.method1139(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}
}
