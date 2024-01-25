import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class6_Sub5_Sub13 extends Class6_Sub5 {

	@OriginalMember(owner = "client!gga", name = "z", descriptor = "I")
	public int anInt4035 = -1;

	@OriginalMember(owner = "client!gga", name = "A", descriptor = "I")
	public int anInt4036 = 12800;

	@OriginalMember(owner = "client!gga", name = "B", descriptor = "I")
	public int anInt4037 = 12800;

	@OriginalMember(owner = "client!gga", name = "M", descriptor = "I")
	public int anInt4043 = 0;

	@OriginalMember(owner = "client!gga", name = "V", descriptor = "Z")
	public boolean aBoolean329 = true;

	@OriginalMember(owner = "client!gga", name = "Y", descriptor = "I")
	public int anInt4051 = 0;

	@OriginalMember(owner = "client!gga", name = "J", descriptor = "I")
	public int anInt4041 = -1;

	@OriginalMember(owner = "client!gga", name = "K", descriptor = "I")
	public final int anInt4042;

	@OriginalMember(owner = "client!gga", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!gga", name = "x", descriptor = "I")
	public final int anInt4033;

	@OriginalMember(owner = "client!gga", name = "P", descriptor = "Ljava/lang/String;")
	public final String aString41;

	@OriginalMember(owner = "client!gga", name = "C", descriptor = "Lclient!kba;")
	public final Class163 aClass163_21;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub5_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4035 = arg6;
		this.anInt4042 = arg0;
		this.aString40 = arg2;
		this.anInt4033 = arg3;
		this.aString41 = arg1;
		this.aBoolean329 = arg5;
		this.anInt4041 = arg4;
		if (this.anInt4035 == 255) {
			this.anInt4035 = 0;
		}
		this.aClass163_21 = new Class163();
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II[II)Z")
	public boolean method3434(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(24) Class6_Sub11 local24 = (Class6_Sub11) this.aClass163_21.method4966(); local24 != null; local24 = (Class6_Sub11) this.aClass163_21.method4965()) {
			if (local24.method1775(arg0, arg2)) {
				local24.method1777(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)Z")
	public boolean method3435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class6_Sub11 local16 = (Class6_Sub11) this.aClass163_21.method4966(); local16 != null; local16 = (Class6_Sub11) this.aClass163_21.method4965()) {
			if (local16.method1778(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V")
	public void method3440() {
		this.anInt4037 = 12800;
		this.anInt4051 = 0;
		this.anInt4036 = 12800;
		this.anInt4043 = 0;
		for (@Pc(32) Class6_Sub11 local32 = (Class6_Sub11) this.aClass163_21.method4966(); local32 != null; local32 = (Class6_Sub11) this.aClass163_21.method4965()) {
			if (this.anInt4043 < local32.anInt1934) {
				this.anInt4043 = local32.anInt1934;
			}
			if (this.anInt4036 > local32.anInt1935) {
				this.anInt4036 = local32.anInt1935;
			}
			if (this.anInt4037 > local32.anInt1943) {
				this.anInt4037 = local32.anInt1943;
			}
			if (local32.anInt1945 > this.anInt4051) {
				this.anInt4051 = local32.anInt1945;
			}
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BI[II)Z")
	public boolean method3441(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class6_Sub11 local19 = (Class6_Sub11) this.aClass163_21.method4966(); local19 != null; local19 = (Class6_Sub11) this.aClass163_21.method4965()) {
			if (local19.method1778(arg2, arg0)) {
				local19.method1780(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[IIII)Z")
	public boolean method3444(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(24) Class6_Sub11 local24 = (Class6_Sub11) this.aClass163_21.method4966(); local24 != null; local24 = (Class6_Sub11) this.aClass163_21.method4965()) {
			if (local24.method1774(arg2, arg3, arg0)) {
				local24.method1780(arg2, arg3, arg1);
				return true;
			}
		}
		return false;
	}
}
