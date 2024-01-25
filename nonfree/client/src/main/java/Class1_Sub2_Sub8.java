import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
	public int anInt3604 = 0;

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
	public int anInt3600 = 0;

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
	public int anInt3602 = 12800;

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
	public int anInt3603 = 12800;

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
	public int anInt3608 = -1;

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
	public int anInt3605 = -1;

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "Z")
	public boolean aBoolean275 = true;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "Ljava/lang/String;")
	public final String aString132;

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
	public final int anInt3610;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
	public final int anInt3611;

	@OriginalMember(owner = "client!ln", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString131;

	@OriginalMember(owner = "client!ln", name = "N", descriptor = "Lclient!ar;")
	public final Class14 aClass14_13;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString132 = arg2;
		this.aBoolean275 = arg5;
		this.anInt3610 = arg3;
		this.anInt3605 = arg4;
		this.anInt3608 = arg6;
		this.anInt3611 = arg0;
		this.aString131 = arg1;
		if (this.anInt3608 == 255) {
			this.anInt3608 = 0;
		}
		this.aClass14_13 = new Class14();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([IIIB)Z")
	public boolean method3050(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) Class1_Sub4 local16 = (Class1_Sub4) this.aClass14_13.method302(); local16 != null; local16 = (Class1_Sub4) this.aClass14_13.method313()) {
			if (local16.method201(arg1, arg2)) {
				local16.method202(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([IIBI)Z")
	public boolean method3051(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class1_Sub4 local19 = (Class1_Sub4) this.aClass14_13.method302(); local19 != null; local19 = (Class1_Sub4) this.aClass14_13.method313()) {
			if (local19.method199(arg1, arg2)) {
				local19.method200(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)Z")
	public boolean method3053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub4 local11 = (Class1_Sub4) this.aClass14_13.method302(); local11 != null; local11 = (Class1_Sub4) this.aClass14_13.method313()) {
			if (local11.method199(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZI[I)Z")
	public boolean method3055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class1_Sub4 local11 = (Class1_Sub4) this.aClass14_13.method302(); local11 != null; local11 = (Class1_Sub4) this.aClass14_13.method313()) {
			if (local11.method203(arg1, arg0, arg2)) {
				local11.method200(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V")
	public void method3056() {
		this.anInt3600 = 0;
		this.anInt3604 = 0;
		this.anInt3602 = 12800;
		this.anInt3603 = 12800;
		for (@Pc(29) Class1_Sub4 local29 = (Class1_Sub4) this.aClass14_13.method302(); local29 != null; local29 = (Class1_Sub4) this.aClass14_13.method313()) {
			if (local29.anInt238 < this.anInt3602) {
				this.anInt3602 = local29.anInt238;
			}
			if (local29.anInt232 < this.anInt3603) {
				this.anInt3603 = local29.anInt232;
			}
			if (this.anInt3604 < local29.anInt240) {
				this.anInt3604 = local29.anInt240;
			}
			if (local29.anInt243 > this.anInt3600) {
				this.anInt3600 = local29.anInt243;
			}
		}
	}
}
