import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
	public int anInt5435 = 12800;

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
	public int anInt5439 = -1;

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "Z")
	public boolean aBoolean427 = true;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
	public int anInt5437 = 0;

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
	public int anInt5443 = -1;

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
	public int anInt5444 = 12800;

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
	public int anInt5442 = 0;

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "Ljava/lang/String;")
	public String aString318;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "Ljava/lang/String;")
	public String aString319;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
	public int anInt5432;

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
	public int anInt5434;

	@OriginalMember(owner = "client!vm", name = "y", descriptor = "Lclient!hi;")
	public Class61 aClass61_30;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aBoolean427 = arg5;
		this.aString318 = arg2;
		this.aString319 = arg1;
		this.anInt5432 = arg3;
		this.anInt5439 = arg4;
		this.anInt5434 = arg0;
		this.anInt5443 = arg6;
		if (this.anInt5443 == 255) {
			this.anInt5443 = 0;
		}
		this.aClass61_30 = new Class61();
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
	public void method4285() {
		this.anInt5435 = 12800;
		this.anInt5437 = 0;
		this.anInt5442 = 0;
		this.anInt5444 = 12800;
		for (@Pc(25) Class1_Sub13 local25 = (Class1_Sub13) this.aClass61_30.method1835(); local25 != null; local25 = (Class1_Sub13) this.aClass61_30.method1836()) {
			if (local25.anInt1241 < this.anInt5435) {
				this.anInt5435 = local25.anInt1241;
			}
			if (local25.anInt1251 > this.anInt5442) {
				this.anInt5442 = local25.anInt1251;
			}
			if (this.anInt5437 < local25.anInt1247) {
				this.anInt5437 = local25.anInt1247;
			}
			if (this.anInt5444 > local25.anInt1235) {
				this.anInt5444 = local25.anInt1235;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)Z")
	public boolean method4286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass61_30.method1835(); local17 != null; local17 = (Class1_Sub13) this.aClass61_30.method1836()) {
			if (local17.method1056(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BII)[I")
	public int[] method4287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub13 local11 = (Class1_Sub13) this.aClass61_30.method1835(); local11 != null; local11 = (Class1_Sub13) this.aClass61_30.method1836()) {
			if (local11.method1056(arg0, arg1)) {
				return local11.method1049(arg1, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBII)[I")
	public int[] method4288(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass61_30.method1835(); local17 != null; local17 = (Class1_Sub13) this.aClass61_30.method1836()) {
			if (local17.method1053(arg0, arg1, arg2)) {
				return local17.method1049(arg0, arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)[I")
	public int[] method4290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass61_30.method1835(); local17 != null; local17 = (Class1_Sub13) this.aClass61_30.method1836()) {
			if (local17.method1057(arg0, arg1)) {
				return local17.method1050(arg1, arg0);
			}
		}
		return null;
	}
}
