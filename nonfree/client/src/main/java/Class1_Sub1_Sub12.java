import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	public int anInt2826 = -1;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	public int anInt2824 = 12800;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
	public int anInt2830 = 0;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public int anInt2825 = 12800;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
	public int anInt2829 = 0;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	public int anInt2822 = -1;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Z")
	public boolean aBoolean251 = true;

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString111;

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
	public final int anInt2834;

	@OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
	public final int anInt2833;

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "Ljava/lang/String;")
	public final String aString112;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "Lclient!tc;")
	public final Class195 aClass195_32;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub1_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aBoolean251 = arg5;
		this.anInt2822 = arg4;
		this.aString111 = arg2;
		this.anInt2834 = arg3;
		this.anInt2833 = arg0;
		this.anInt2826 = arg6;
		this.aString112 = arg1;
		if (this.anInt2826 == 255) {
			this.anInt2826 = 0;
		}
		this.aClass195_32 = new Class195();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[IIZI)Z")
	public boolean method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) Class1_Sub11 local9 = (Class1_Sub11) this.aClass195_32.method5029(); local9 != null; local9 = (Class1_Sub11) this.aClass195_32.method5021()) {
			if (local9.method1445(arg3, arg0, arg2)) {
				local9.method1446(arg0, arg1, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
	public boolean method2740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class1_Sub11 local17 = (Class1_Sub11) this.aClass195_32.method5029(); local17 != null; local17 = (Class1_Sub11) this.aClass195_32.method5021()) {
			if (local17.method1447(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public void method2741() {
		this.anInt2825 = 12800;
		this.anInt2824 = 12800;
		this.anInt2830 = 0;
		this.anInt2829 = 0;
		for (@Pc(27) Class1_Sub11 local27 = (Class1_Sub11) this.aClass195_32.method5029(); local27 != null; local27 = (Class1_Sub11) this.aClass195_32.method5021()) {
			if (this.anInt2829 < local27.anInt1517) {
				this.anInt2829 = local27.anInt1517;
			}
			if (this.anInt2824 > local27.anInt1523) {
				this.anInt2824 = local27.anInt1523;
			}
			if (this.anInt2825 > local27.anInt1529) {
				this.anInt2825 = local27.anInt1529;
			}
			if (this.anInt2830 < local27.anInt1528) {
				this.anInt2830 = local27.anInt1528;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[I)Z")
	public boolean method2742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class1_Sub11 local17 = (Class1_Sub11) this.aClass195_32.method5029(); local17 != null; local17 = (Class1_Sub11) this.aClass195_32.method5021()) {
			if (local17.method1444(arg1, arg0)) {
				local17.method1442(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII[I)Z")
	public boolean method2743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class1_Sub11 local17 = (Class1_Sub11) this.aClass195_32.method5029(); local17 != null; local17 = (Class1_Sub11) this.aClass195_32.method5021()) {
			if (local17.method1447(arg1, arg0)) {
				local17.method1446(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
