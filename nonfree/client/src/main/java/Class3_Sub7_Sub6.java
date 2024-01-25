import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub7_Sub6 extends Class3_Sub7 {

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public int anInt1837 = 0;

	@OriginalMember(owner = "client!de", name = "A", descriptor = "Z")
	public boolean aBoolean135 = true;

	@OriginalMember(owner = "client!de", name = "x", descriptor = "I")
	public int anInt1839 = -1;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	public int anInt1840 = 12800;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "I")
	public int anInt1845 = 0;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "I")
	public int anInt1835 = -1;

	@OriginalMember(owner = "client!de", name = "I", descriptor = "I")
	public int anInt1847 = 12800;

	@OriginalMember(owner = "client!de", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!de", name = "G", descriptor = "I")
	public final int anInt1846;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	public final int anInt1842;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!mba;")
	public final Class216 aClass216_10;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub7_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString11 = arg2;
		this.aString10 = arg1;
		this.anInt1835 = arg4;
		this.aBoolean135 = arg5;
		this.anInt1846 = arg0;
		this.anInt1842 = arg3;
		this.anInt1839 = arg6;
		if (this.anInt1839 == 255) {
			this.anInt1839 = 0;
		}
		this.aClass216_10 = new Class216();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
	public boolean method1565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class3_Sub24 local11 = (Class3_Sub24) this.aClass216_10.method5457(); local11 != null; local11 = (Class3_Sub24) this.aClass216_10.method5458()) {
			if (local11.method4343(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[II)Z")
	public boolean method1566(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class3_Sub24 local11 = (Class3_Sub24) this.aClass216_10.method5457(); local11 != null; local11 = (Class3_Sub24) this.aClass216_10.method5458()) {
			if (local11.method4343(arg0, arg2)) {
				local11.method4341(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([IIZI)Z")
	public boolean method1569(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class3_Sub24 local16 = (Class3_Sub24) this.aClass216_10.method5457(); local16 != null; local16 = (Class3_Sub24) this.aClass216_10.method5458()) {
			if (local16.method4337(arg2, arg1)) {
				local16.method4342(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[IB)Z")
	public boolean method1570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(16) Class3_Sub24 local16 = (Class3_Sub24) this.aClass216_10.method5457(); local16 != null; local16 = (Class3_Sub24) this.aClass216_10.method5458()) {
			if (local16.method4340(arg2, arg0, arg1)) {
				local16.method4341(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public void method1571() {
		this.anInt1840 = 12800;
		this.anInt1837 = 0;
		this.anInt1845 = 0;
		this.anInt1847 = 12800;
		for (@Pc(23) Class3_Sub24 local23 = (Class3_Sub24) this.aClass216_10.method5457(); local23 != null; local23 = (Class3_Sub24) this.aClass216_10.method5458()) {
			if (local23.anInt5054 < this.anInt1847) {
				this.anInt1847 = local23.anInt5054;
			}
			if (local23.anInt5047 > this.anInt1837) {
				this.anInt1837 = local23.anInt5047;
			}
			if (local23.anInt5049 > this.anInt1845) {
				this.anInt1845 = local23.anInt5049;
			}
			if (local23.anInt5043 < this.anInt1840) {
				this.anInt1840 = local23.anInt5043;
			}
		}
	}
}
