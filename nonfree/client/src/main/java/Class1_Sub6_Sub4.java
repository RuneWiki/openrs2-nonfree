import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class1_Sub6_Sub4 extends Class1_Sub6 {

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
	public int anInt1845 = 12800;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
	public int anInt1847 = -1;

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "Z")
	public boolean aBoolean159 = true;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
	public int anInt1854 = -1;

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
	public int anInt1858 = 0;

	@OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
	public int anInt1861 = 0;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
	public int anInt1848 = 12800;

	@OriginalMember(owner = "client!fo", name = "O", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
	public final int anInt1850;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	public final int anInt1855;

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString14;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "Lclient!at;")
	public final Class17 aClass17_15;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString15 = arg1;
		this.anInt1854 = arg6;
		this.anInt1850 = arg0;
		this.anInt1855 = arg3;
		this.aString14 = arg2;
		this.aBoolean159 = arg5;
		this.anInt1847 = arg4;
		if (this.anInt1854 == 255) {
			this.anInt1854 = 0;
		}
		this.aClass17_15 = new Class17();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZII[I)Z")
	public boolean method1493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class1_Sub19 local11 = (Class1_Sub19) this.aClass17_15.method202(); local11 != null; local11 = (Class1_Sub19) this.aClass17_15.method207()) {
			if (local11.method2406(arg1, arg0)) {
				local11.method2405(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
	public void method1494() {
		this.anInt1845 = 12800;
		this.anInt1861 = 0;
		this.anInt1858 = 0;
		this.anInt1848 = 12800;
		for (@Pc(30) Class1_Sub19 local30 = (Class1_Sub19) this.aClass17_15.method202(); local30 != null; local30 = (Class1_Sub19) this.aClass17_15.method207()) {
			if (local30.anInt2937 < this.anInt1848) {
				this.anInt1848 = local30.anInt2937;
			}
			if (local30.anInt2936 > this.anInt1858) {
				this.anInt1858 = local30.anInt2936;
			}
			if (local30.anInt2944 < this.anInt1845) {
				this.anInt1845 = local30.anInt2944;
			}
			if (local30.anInt2932 > this.anInt1861) {
				this.anInt1861 = local30.anInt2932;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
	public boolean method1495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(20) Class1_Sub19 local20 = (Class1_Sub19) this.aClass17_15.method202(); local20 != null; local20 = (Class1_Sub19) this.aClass17_15.method207()) {
			if (local20.method2406(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([IIIB)Z")
	public boolean method1497(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class1_Sub19 local11 = (Class1_Sub19) this.aClass17_15.method202(); local11 != null; local11 = (Class1_Sub19) this.aClass17_15.method207()) {
			if (local11.method2403(arg2, arg1)) {
				local11.method2410(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[III)Z")
	public boolean method1499(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class1_Sub19 local16 = (Class1_Sub19) this.aClass17_15.method202(); local16 != null; local16 = (Class1_Sub19) this.aClass17_15.method207()) {
			if (local16.method2402(arg2, arg3, arg0)) {
				local16.method2405(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}
}
