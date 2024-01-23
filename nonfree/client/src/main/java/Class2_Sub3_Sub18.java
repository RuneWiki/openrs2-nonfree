import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class2_Sub3_Sub18 extends Class2_Sub3 {

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
	public int anInt3680 = -1;

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
	public int anInt3691 = 12800;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
	public int anInt3692 = -1;

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "Z")
	public boolean aBoolean306 = true;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
	public int anInt3695 = 0;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
	public int anInt3693 = 0;

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
	public int anInt3696 = 12800;

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "Ljava/lang/String;")
	public String aString182;

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
	public int anInt3689;

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
	public int anInt3687;

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "Ljava/lang/String;")
	public String aString183;

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "Lclient!a;")
	public Class1 aClass1_13;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class2_Sub3_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString182 = arg2;
		this.anInt3689 = arg0;
		this.aBoolean306 = arg5;
		this.anInt3692 = arg6;
		this.anInt3687 = arg3;
		this.aString183 = arg1;
		if (this.anInt3692 == 255) {
			this.anInt3692 = 0;
		}
		this.anInt3680 = arg4;
		this.aClass1_13 = new Class1();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)[I")
	public int[] method2977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(20) Class2_Sub25 local20 = (Class2_Sub25) this.aClass1_13.method13(); local20 != null; local20 = (Class2_Sub25) this.aClass1_13.method9()) {
			if (local20.method4019(arg0, arg1)) {
				return local20.method4014(arg0, arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	public void method2978() {
		this.anInt3695 = 0;
		this.anInt3691 = 12800;
		this.anInt3696 = 12800;
		this.anInt3693 = 0;
		for (@Pc(26) Class2_Sub25 local26 = (Class2_Sub25) this.aClass1_13.method13(); local26 != null; local26 = (Class2_Sub25) this.aClass1_13.method9()) {
			if (this.anInt3695 < local26.anInt5005) {
				this.anInt3695 = local26.anInt5005;
			}
			if (this.anInt3691 > local26.anInt5019) {
				this.anInt3691 = local26.anInt5019;
			}
			if (local26.anInt5018 < this.anInt3696) {
				this.anInt3696 = local26.anInt5018;
			}
			if (local26.anInt5000 > this.anInt3693) {
				this.anInt3693 = local26.anInt5000;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)Z")
	public boolean method2980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class2_Sub25 local16 = (Class2_Sub25) this.aClass1_13.method13(); local16 != null; local16 = (Class2_Sub25) this.aClass1_13.method9()) {
			if (local16.method4019(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIB)[I")
	public int[] method2981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(19) Class2_Sub25 local19 = (Class2_Sub25) this.aClass1_13.method13(); local19 != null; local19 = (Class2_Sub25) this.aClass1_13.method9()) {
			if (local19.method4013(arg1, arg0, arg2)) {
				return local19.method4014(arg2, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)[I")
	public int[] method2982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(13) Class2_Sub25 local13 = (Class2_Sub25) this.aClass1_13.method13(); local13 != null; local13 = (Class2_Sub25) this.aClass1_13.method9()) {
			if (local13.method4016(arg0, arg1)) {
				return local13.method4017(arg0, arg1);
			}
		}
		return null;
	}
}
