import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
	public int anInt5074 = 0;

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
	public int anInt5083 = -1;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "Z")
	public boolean aBoolean347 = true;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
	public int anInt5079 = 0;

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
	public int anInt5084 = -1;

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
	public int anInt5085 = 12800;

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
	public int anInt5086 = 12800;

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "Ljava/lang/String;")
	public String aString301;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
	public int anInt5072;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "Ljava/lang/String;")
	public String aString298;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	public int anInt5071;

	@OriginalMember(owner = "client!uc", name = "V", descriptor = "Lclient!gj;")
	public Class59 aClass59_36;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aBoolean347 = arg5;
		this.aString301 = arg1;
		this.anInt5084 = arg6;
		if (this.anInt5084 == 255) {
			this.anInt5084 = 0;
		}
		this.anInt5072 = arg3;
		this.aString298 = arg2;
		this.anInt5083 = arg4;
		this.anInt5071 = arg0;
		this.aClass59_36 = new Class59();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB[II)Z")
	public boolean method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(19) Class1_Sub19 local19 = (Class1_Sub19) this.aClass59_36.method1704(); local19 != null; local19 = (Class1_Sub19) this.aClass59_36.method1701()) {
			if (local19.method2516(arg0, arg3, arg1)) {
				local19.method2519(arg3, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([IIII)Z")
	public boolean method4335(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class1_Sub19 local16 = (Class1_Sub19) this.aClass59_36.method1704(); local16 != null; local16 = (Class1_Sub19) this.aClass59_36.method1701()) {
			if (local16.method2511(arg1, arg2)) {
				local16.method2513(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II[II)Z")
	public boolean method4336(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class1_Sub19 local17 = (Class1_Sub19) this.aClass59_36.method1704(); local17 != null; local17 = (Class1_Sub19) this.aClass59_36.method1701()) {
			if (local17.method2518(arg0, arg2)) {
				local17.method2519(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
	public void method4339() {
		this.anInt5085 = 12800;
		this.anInt5074 = 0;
		this.anInt5079 = 0;
		this.anInt5086 = 12800;
		for (@Pc(32) Class1_Sub19 local32 = (Class1_Sub19) this.aClass59_36.method1704(); local32 != null; local32 = (Class1_Sub19) this.aClass59_36.method1701()) {
			if (local32.anInt2926 < this.anInt5086) {
				this.anInt5086 = local32.anInt2926;
			}
			if (local32.anInt2924 > this.anInt5074) {
				this.anInt5074 = local32.anInt2924;
			}
			if (local32.anInt2928 < this.anInt5085) {
				this.anInt5085 = local32.anInt2928;
			}
			if (this.anInt5079 < local32.anInt2921) {
				this.anInt5079 = local32.anInt2921;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)Z")
	public boolean method4340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub19 local11 = (Class1_Sub19) this.aClass59_36.method1704(); local11 != null; local11 = (Class1_Sub19) this.aClass59_36.method1701()) {
			if (local11.method2518(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
