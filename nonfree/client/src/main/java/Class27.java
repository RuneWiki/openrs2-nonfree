import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class27 {

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "[Lclient!gi;")
	private Class94_Sub1[] aClass94_Sub1Array1;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!si;")
	private Class2_Sub23 aClass2_Sub23_1;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "Lclient!ug;")
	private final Class243 aClass243_1;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Lclient!br;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Lclient!fg;")
	private Class2_Sub5_Sub6_Sub1 aClass2_Sub5_Sub6_Sub1_1;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!ug;Lclient!br;)V")
	public Class27(@OriginalArg(0) Class243 arg0, @OriginalArg(1) Class30 arg1) {
		this.aClass243_1 = arg0;
		this.aClass30_1 = arg1;
		if (!this.aClass243_1.method5231()) {
			this.aClass2_Sub5_Sub6_Sub1_1 = this.aClass243_1.method5238(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!va;ILclient!va;ZI)Lclient!gi;")
	private Class94_Sub1 method522(@OriginalArg(0) Class248 arg0, @OriginalArg(2) Class248 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass2_Sub23_1 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub23_1.anInt6952 = arg2 * 8 + 5;
		if (this.aClass2_Sub23_1.anInt6952 >= this.aClass2_Sub23_1.aByteArray130.length) {
			throw new RuntimeException();
		} else if (this.aClass94_Sub1Array1[arg2] == null) {
			@Pc(45) int local45 = this.aClass2_Sub23_1.method5508();
			@Pc(50) int local50 = this.aClass2_Sub23_1.method5508();
			@Pc(64) Class94_Sub1 local64 = new Class94_Sub1(arg2, arg1, arg0, this.aClass243_1, this.aClass30_1, local45, local50, true);
			this.aClass94_Sub1Array1[arg2] = local64;
			return local64;
		} else {
			return this.aClass94_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!va;IILclient!va;)Lclient!gi;")
	public Class94_Sub1 method523(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class248 arg2) {
		return this.method522(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
	public void method525() {
		if (this.aClass94_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass94_Sub1Array1.length; local11++) {
			if (this.aClass94_Sub1Array1[local11] != null) {
				this.aClass94_Sub1Array1[local11].method2184();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass94_Sub1Array1.length; local36++) {
			if (this.aClass94_Sub1Array1[local36] != null) {
				this.aClass94_Sub1Array1[local36].method2182();
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Z")
	public boolean method526() {
		if (this.aClass2_Sub23_1 != null) {
			return true;
		}
		if (this.aClass2_Sub5_Sub6_Sub1_1 == null) {
			if (this.aClass243_1.method5231()) {
				return false;
			}
			this.aClass2_Sub5_Sub6_Sub1_1 = this.aClass243_1.method5238(255, true, (byte) 0, 255);
		}
		if (this.aClass2_Sub5_Sub6_Sub1_1.aBoolean336) {
			return false;
		} else {
			this.aClass2_Sub23_1 = new Class2_Sub23(this.aClass2_Sub5_Sub6_Sub1_1.method3782());
			this.aClass94_Sub1Array1 = new Class94_Sub1[(this.aClass2_Sub23_1.aByteArray130.length - 5) / 8];
			return true;
		}
	}
}
