import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class11_Sub4_Sub7 extends Class11_Sub4 {

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	public int anInt1914 = 0;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "Z")
	public boolean aBoolean121 = true;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
	public int anInt1922 = -1;

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public int anInt1925 = 0;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	public int anInt1917 = -1;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
	public int anInt1920 = 12800;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
	public int anInt1921 = 12800;

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
	public final int anInt1915;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
	public final int anInt1916;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString20;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "Lclient!aq;")
	public final Class16 aClass16_18;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class11_Sub4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1915 = arg3;
		this.anInt1916 = arg0;
		this.anInt1917 = arg6;
		this.aString20 = arg1;
		this.aBoolean121 = arg5;
		this.anInt1922 = arg4;
		this.aString19 = arg2;
		if (this.anInt1917 == 255) {
			this.anInt1917 = 0;
		}
		this.aClass16_18 = new Class16();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIII)Z")
	public boolean method1584(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class11_Sub28 local11 = (Class11_Sub28) this.aClass16_18.method193(); local11 != null; local11 = (Class11_Sub28) this.aClass16_18.method188()) {
			if (local11.method3844(arg3, arg2, arg1)) {
				local11.method3842(arg0, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIII)Z")
	public boolean method1585(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class11_Sub28 local11 = (Class11_Sub28) this.aClass16_18.method193(); local11 != null; local11 = (Class11_Sub28) this.aClass16_18.method188()) {
			if (local11.method3838(arg2, arg1)) {
				local11.method3842(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)Z")
	public boolean method1586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(21) Class11_Sub28 local21 = (Class11_Sub28) this.aClass16_18.method193(); local21 != null; local21 = (Class11_Sub28) this.aClass16_18.method188()) {
			if (local21.method3838(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([IZII)Z")
	public boolean method1590(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class11_Sub28 local11 = (Class11_Sub28) this.aClass16_18.method193(); local11 != null; local11 = (Class11_Sub28) this.aClass16_18.method188()) {
			if (local11.method3841(arg2, arg1)) {
				local11.method3843(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	public void method1591() {
		this.anInt1920 = 12800;
		this.anInt1921 = 12800;
		this.anInt1925 = 0;
		this.anInt1914 = 0;
		for (@Pc(34) Class11_Sub28 local34 = (Class11_Sub28) this.aClass16_18.method193(); local34 != null; local34 = (Class11_Sub28) this.aClass16_18.method188()) {
			if (this.anInt1914 < local34.anInt4361) {
				this.anInt1914 = local34.anInt4361;
			}
			if (local34.anInt4363 < this.anInt1921) {
				this.anInt1921 = local34.anInt4363;
			}
			if (local34.anInt4369 > this.anInt1925) {
				this.anInt1925 = local34.anInt4369;
			}
			if (this.anInt1920 > local34.anInt4360) {
				this.anInt1920 = local34.anInt4360;
			}
		}
	}
}
