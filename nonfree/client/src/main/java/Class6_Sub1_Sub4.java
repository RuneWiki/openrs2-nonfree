import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	public int anInt1187 = 0;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "I")
	public int anInt1192 = 12800;

	@OriginalMember(owner = "client!co", name = "E", descriptor = "Z")
	public boolean aBoolean104 = true;

	@OriginalMember(owner = "client!co", name = "M", descriptor = "I")
	public int anInt1198 = 0;

	@OriginalMember(owner = "client!co", name = "N", descriptor = "I")
	public int anInt1199 = 12800;

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	public int anInt1197 = -1;

	@OriginalMember(owner = "client!co", name = "Q", descriptor = "I")
	public int anInt1202 = -1;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	public final int anInt1189;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString12;

	@OriginalMember(owner = "client!co", name = "O", descriptor = "I")
	public final int anInt1200;

	@OriginalMember(owner = "client!co", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!co", name = "u", descriptor = "Lclient!ft;")
	public final Class88 aClass88_12;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1189 = arg0;
		this.aString12 = arg2;
		this.anInt1200 = arg3;
		this.aString11 = arg1;
		this.anInt1202 = arg6;
		this.anInt1197 = arg4;
		this.aBoolean104 = arg5;
		if (this.anInt1202 == 255) {
			this.anInt1202 = 0;
		}
		this.aClass88_12 = new Class88();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI[II)Z")
	public boolean method1066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class6_Sub34 local11 = (Class6_Sub34) this.aClass88_12.method1882(); local11 != null; local11 = (Class6_Sub34) this.aClass88_12.method1891()) {
			if (local11.method5127(arg0, arg3, arg1)) {
				local11.method5122(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([IIII)Z")
	public boolean method1067(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class6_Sub34 local17 = (Class6_Sub34) this.aClass88_12.method1882(); local17 != null; local17 = (Class6_Sub34) this.aClass88_12.method1891()) {
			if (local17.method5123(arg1, arg2)) {
				local17.method5122(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI)Z")
	public boolean method1070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class6_Sub34 local11 = (Class6_Sub34) this.aClass88_12.method1882(); local11 != null; local11 = (Class6_Sub34) this.aClass88_12.method1891()) {
			if (local11.method5123(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[III)Z")
	public boolean method1071(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(22) Class6_Sub34 local22 = (Class6_Sub34) this.aClass88_12.method1882(); local22 != null; local22 = (Class6_Sub34) this.aClass88_12.method1891()) {
			if (local22.method5120(arg1, arg2)) {
				local22.method5124(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V")
	public void method1073() {
		this.anInt1198 = 0;
		this.anInt1187 = 0;
		this.anInt1192 = 12800;
		this.anInt1199 = 12800;
		for (@Pc(27) Class6_Sub34 local27 = (Class6_Sub34) this.aClass88_12.method1882(); local27 != null; local27 = (Class6_Sub34) this.aClass88_12.method1891()) {
			if (this.anInt1192 > local27.anInt6122) {
				this.anInt1192 = local27.anInt6122;
			}
			if (this.anInt1199 > local27.anInt6120) {
				this.anInt1199 = local27.anInt6120;
			}
			if (local27.anInt6110 > this.anInt1198) {
				this.anInt1198 = local27.anInt6110;
			}
			if (this.anInt1187 < local27.anInt6112) {
				this.anInt1187 = local27.anInt6112;
			}
		}
	}
}
