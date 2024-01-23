import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class3_Sub4_Sub14 extends Class3_Sub4 {

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "Z")
	public boolean aBoolean198 = true;

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
	public int anInt2665 = -1;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
	public int anInt2660 = 12800;

	@OriginalMember(owner = "client!jo", name = "M", descriptor = "I")
	public int anInt2668 = 0;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
	public int anInt2662 = 0;

	@OriginalMember(owner = "client!jo", name = "W", descriptor = "I")
	public int anInt2674 = 12800;

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
	public int anInt2663 = -1;

	@OriginalMember(owner = "client!jo", name = "N", descriptor = "Ljava/lang/String;")
	public String aString99;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
	public int anInt2659;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
	public int anInt2661;

	@OriginalMember(owner = "client!jo", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!jo", name = "V", descriptor = "Lclient!fk;")
	public Class56 aClass56_6;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class3_Sub4_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aBoolean198 = arg5;
		this.anInt2665 = arg6;
		this.anInt2663 = arg4;
		this.aString99 = arg2;
		if (this.anInt2665 == 255) {
			this.anInt2665 = 0;
		}
		this.anInt2659 = arg0;
		this.anInt2661 = arg3;
		this.aString100 = arg1;
		this.aClass56_6 = new Class56();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III[IB)Z")
	public boolean method2353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(17) Class3_Sub5 local17 = (Class3_Sub5) this.aClass56_6.method1281(); local17 != null; local17 = (Class3_Sub5) this.aClass56_6.method1278()) {
			if (local17.method556(arg2, arg1, arg0)) {
				local17.method553(arg3, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([IIII)Z")
	public boolean method2356(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class3_Sub5 local11 = (Class3_Sub5) this.aClass56_6.method1281(); local11 != null; local11 = (Class3_Sub5) this.aClass56_6.method1278()) {
			if (local11.method549(arg2, arg1)) {
				local11.method557(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(III)Z")
	public boolean method2357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class3_Sub5 local11 = (Class3_Sub5) this.aClass56_6.method1281(); local11 != null; local11 = (Class3_Sub5) this.aClass56_6.method1278()) {
			if (local11.method550(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[IIB)Z")
	public boolean method2358(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(19) Class3_Sub5 local19 = (Class3_Sub5) this.aClass56_6.method1281(); local19 != null; local19 = (Class3_Sub5) this.aClass56_6.method1278()) {
			if (local19.method550(arg0, arg2)) {
				local19.method553(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)V")
	public void method2359() {
		this.anInt2662 = 0;
		this.anInt2660 = 12800;
		this.anInt2668 = 0;
		this.anInt2674 = 12800;
		for (@Pc(19) Class3_Sub5 local19 = (Class3_Sub5) this.aClass56_6.method1281(); local19 != null; local19 = (Class3_Sub5) this.aClass56_6.method1278()) {
			if (local19.anInt655 < this.anInt2674) {
				this.anInt2674 = local19.anInt655;
			}
			if (this.anInt2668 < local19.anInt669) {
				this.anInt2668 = local19.anInt669;
			}
			if (this.anInt2660 > local19.anInt666) {
				this.anInt2660 = local19.anInt666;
			}
			if (local19.anInt653 > this.anInt2662) {
				this.anInt2662 = local19.anInt653;
			}
		}
	}
}
