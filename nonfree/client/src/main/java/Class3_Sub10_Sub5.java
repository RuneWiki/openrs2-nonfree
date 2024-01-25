import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class3_Sub10_Sub5 extends Class3_Sub10 {

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	public int anInt1884 = 0;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
	public int anInt1890 = 12800;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
	public int anInt1889 = 12800;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	public int anInt1880 = 0;

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
	public int anInt1893 = -1;

	@OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
	public int anInt1894 = -1;

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "Z")
	public boolean aBoolean137 = true;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
	public final int anInt1883;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
	public final int anInt1886;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString17;

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "Lclient!eea;")
	public final Class71 aClass71_18;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub10_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean137 = arg5;
		this.anInt1894 = arg4;
		this.anInt1883 = arg3;
		this.anInt1886 = arg0;
		this.anInt1893 = arg6;
		this.aString17 = arg2;
		this.aString18 = arg1;
		if (this.anInt1893 == 255) {
			this.anInt1893 = 0;
		}
		this.aClass71_18 = new Class71();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBI)Z")
	public boolean method1771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(18) Class3_Sub20 local18 = (Class3_Sub20) this.aClass71_18.method2089(); local18 != null; local18 = (Class3_Sub20) this.aClass71_18.method2086()) {
			if (local18.method3224(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI[II)Z")
	public boolean method1772(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class3_Sub20 local16 = (Class3_Sub20) this.aClass71_18.method2089(); local16 != null; local16 = (Class3_Sub20) this.aClass71_18.method2086()) {
			if (local16.method3224(arg0, arg2)) {
				local16.method3226(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[III)Z")
	public boolean method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class3_Sub20 local11 = (Class3_Sub20) this.aClass71_18.method2089(); local11 != null; local11 = (Class3_Sub20) this.aClass71_18.method2086()) {
			if (local11.method3227(arg0, arg2)) {
				local11.method3222(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	public void method1775() {
		this.anInt1890 = 12800;
		this.anInt1884 = 0;
		this.anInt1880 = 0;
		this.anInt1889 = 12800;
		for (@Pc(32) Class3_Sub20 local32 = (Class3_Sub20) this.aClass71_18.method2089(); local32 != null; local32 = (Class3_Sub20) this.aClass71_18.method2086()) {
			if (this.anInt1880 < local32.anInt3878) {
				this.anInt1880 = local32.anInt3878;
			}
			if (this.anInt1889 > local32.anInt3877) {
				this.anInt1889 = local32.anInt3877;
			}
			if (local32.anInt3873 > this.anInt1884) {
				this.anInt1884 = local32.anInt3873;
			}
			if (local32.anInt3870 < this.anInt1890) {
				this.anInt1890 = local32.anInt3870;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII[I)Z")
	public boolean method1776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(15) Class3_Sub20 local15 = (Class3_Sub20) this.aClass71_18.method2089(); local15 != null; local15 = (Class3_Sub20) this.aClass71_18.method2086()) {
			if (local15.method3223(arg1, arg2, arg0)) {
				local15.method3226(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}
}
