import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
	public int anInt4040 = -1;

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
	public int anInt4039 = -1;

	@OriginalMember(owner = "client!kl", name = "P", descriptor = "Z")
	public boolean aBoolean327 = true;

	@OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
	public int anInt4045 = 12800;

	@OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
	public int anInt4048 = 0;

	@OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
	public int anInt4041 = 0;

	@OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
	public int anInt4042 = 12800;

	@OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
	public final int anInt4047;

	@OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
	public final int anInt4044;

	@OriginalMember(owner = "client!kl", name = "N", descriptor = "Ljava/lang/String;")
	public final String aString35;

	@OriginalMember(owner = "client!kl", name = "S", descriptor = "Ljava/lang/String;")
	public final String aString36;

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "Lclient!wl;")
	public final Class265 aClass265_31;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4047 = arg0;
		this.anInt4044 = arg3;
		this.aBoolean327 = arg5;
		this.aString35 = arg1;
		this.aString36 = arg2;
		this.anInt4039 = arg6;
		this.anInt4040 = arg4;
		if (this.anInt4039 == 255) {
			this.anInt4039 = 0;
		}
		this.aClass265_31 = new Class265();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBI)Z")
	public boolean method3238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub34 local11 = (Class2_Sub34) this.aClass265_31.method6005(); local11 != null; local11 = (Class2_Sub34) this.aClass265_31.method6001()) {
			if (local11.method4430(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIII[I)Z")
	public boolean method3239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) Class2_Sub34 local16 = (Class2_Sub34) this.aClass265_31.method6005(); local16 != null; local16 = (Class2_Sub34) this.aClass265_31.method6001()) {
			if (local16.method4432(arg1, arg0, arg2)) {
				local16.method4437(arg0, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[II)Z")
	public boolean method3240(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub34 local11 = (Class2_Sub34) this.aClass265_31.method6005(); local11 != null; local11 = (Class2_Sub34) this.aClass265_31.method6001()) {
			if (local11.method4428(arg0, arg2)) {
				local11.method4431(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([IIBI)Z")
	public boolean method3241(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class2_Sub34 local9 = (Class2_Sub34) this.aClass265_31.method6005(); local9 != null; local9 = (Class2_Sub34) this.aClass265_31.method6001()) {
			if (local9.method4430(arg1, arg2)) {
				local9.method4437(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(B)V")
	public void method3245() {
		this.anInt4042 = 12800;
		this.anInt4048 = 0;
		this.anInt4045 = 12800;
		this.anInt4041 = 0;
		for (@Pc(29) Class2_Sub34 local29 = (Class2_Sub34) this.aClass265_31.method6005(); local29 != null; local29 = (Class2_Sub34) this.aClass265_31.method6001()) {
			if (this.anInt4042 > local29.anInt5473) {
				this.anInt4042 = local29.anInt5473;
			}
			if (this.anInt4048 < local29.anInt5465) {
				this.anInt4048 = local29.anInt5465;
			}
			if (local29.anInt5477 > this.anInt4041) {
				this.anInt4041 = local29.anInt5477;
			}
			if (local29.anInt5472 < this.anInt4045) {
				this.anInt4045 = local29.anInt5472;
			}
		}
	}
}
