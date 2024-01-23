import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	public int anInt1044 = 0;

	@OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
	public int anInt1052 = -1;

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
	public int anInt1050 = 12800;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
	public int anInt1053 = 12800;

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
	public int anInt1061 = 0;

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "Z")
	public boolean aBoolean81 = true;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	public int anInt1059 = -1;

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
	public int anInt1060;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "Lclient!bo;")
	public Class24 aClass24_4;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub1_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt1060 = arg0;
		this.anInt1043 = arg3;
		this.aString30 = arg1;
		this.aBoolean81 = arg5;
		this.anInt1059 = arg6;
		this.aString29 = arg2;
		this.anInt1052 = arg4;
		if (this.anInt1059 == 255) {
			this.anInt1059 = 0;
		}
		this.aClass24_4 = new Class24();
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
	public void method933() {
		this.anInt1050 = 12800;
		this.anInt1044 = 0;
		this.anInt1061 = 0;
		this.anInt1053 = 12800;
		for (@Pc(23) Class1_Sub26 local23 = (Class1_Sub26) this.aClass24_4.method460(); local23 != null; local23 = (Class1_Sub26) this.aClass24_4.method464()) {
			if (this.anInt1053 > local23.anInt4694) {
				this.anInt1053 = local23.anInt4694;
			}
			if (local23.anInt4706 > this.anInt1061) {
				this.anInt1061 = local23.anInt4706;
			}
			if (this.anInt1050 > local23.anInt4708) {
				this.anInt1050 = local23.anInt4708;
			}
			if (this.anInt1044 < local23.anInt4686) {
				this.anInt1044 = local23.anInt4686;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[III)Z")
	public boolean method940(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class1_Sub26 local17 = (Class1_Sub26) this.aClass24_4.method460(); local17 != null; local17 = (Class1_Sub26) this.aClass24_4.method464()) {
			if (local17.method3674(arg0, arg2, arg3)) {
				local17.method3679(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[II)Z")
	public boolean method942(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class1_Sub26 local11 = (Class1_Sub26) this.aClass24_4.method460(); local11 != null; local11 = (Class1_Sub26) this.aClass24_4.method464()) {
			if (local11.method3675(arg0, arg2)) {
				local11.method3679(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII)Z")
	public boolean method943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub26 local11 = (Class1_Sub26) this.aClass24_4.method460(); local11 != null; local11 = (Class1_Sub26) this.aClass24_4.method464()) {
			if (local11.method3675(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II[II)Z")
	public boolean method944(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class1_Sub26 local11 = (Class1_Sub26) this.aClass24_4.method460(); local11 != null; local11 = (Class1_Sub26) this.aClass24_4.method464()) {
			if (local11.method3678(arg0, arg2)) {
				local11.method3677(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
