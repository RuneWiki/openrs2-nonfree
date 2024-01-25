import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class2_Sub5_Sub12 extends Class2_Sub5 {

	@OriginalMember(owner = "client!om", name = "C", descriptor = "I")
	public int anInt5154 = 12800;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	public int anInt5157 = -1;

	@OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
	public int anInt5164 = 0;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "Z")
	public boolean aBoolean380 = true;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "I")
	public int anInt5163 = 0;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "I")
	public int anInt5162 = -1;

	@OriginalMember(owner = "client!om", name = "R", descriptor = "I")
	public int anInt5165 = 12800;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString51;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "I")
	public final int anInt5160;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString50;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "I")
	public final int anInt5153;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "Lclient!ar;")
	public final Class14 aClass14_38;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub5_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean380 = arg5;
		this.anInt5157 = arg6;
		this.aString51 = arg1;
		this.anInt5162 = arg4;
		this.anInt5160 = arg0;
		this.aString50 = arg2;
		this.anInt5153 = arg3;
		if (this.anInt5157 == 255) {
			this.anInt5157 = 0;
		}
		this.aClass14_38 = new Class14();
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
	public void method4136() {
		this.anInt5165 = 12800;
		this.anInt5154 = 12800;
		this.anInt5164 = 0;
		this.anInt5163 = 0;
		for (@Pc(23) Class2_Sub28 local23 = (Class2_Sub28) this.aClass14_38.method309(); local23 != null; local23 = (Class2_Sub28) this.aClass14_38.method311()) {
			if (local23.anInt5000 > this.anInt5163) {
				this.anInt5163 = local23.anInt5000;
			}
			if (local23.anInt4995 > this.anInt5164) {
				this.anInt5164 = local23.anInt4995;
			}
			if (local23.anInt5004 < this.anInt5165) {
				this.anInt5165 = local23.anInt5004;
			}
			if (local23.anInt5001 < this.anInt5154) {
				this.anInt5154 = local23.anInt5001;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I[IIII)Z")
	public boolean method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(17) Class2_Sub28 local17 = (Class2_Sub28) this.aClass14_38.method309(); local17 != null; local17 = (Class2_Sub28) this.aClass14_38.method311()) {
			if (local17.method4018(arg2, arg3, arg0)) {
				local17.method4015(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)Z")
	public boolean method4143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class2_Sub28 local16 = (Class2_Sub28) this.aClass14_38.method309(); local16 != null; local16 = (Class2_Sub28) this.aClass14_38.method311()) {
			if (local16.method4014(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I[IIZ)Z")
	public boolean method4146(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass14_38.method309(); local11 != null; local11 = (Class2_Sub28) this.aClass14_38.method311()) {
			if (local11.method4014(arg0, arg2)) {
				local11.method4015(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B[III)Z")
	public boolean method4147(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass14_38.method309(); local11 != null; local11 = (Class2_Sub28) this.aClass14_38.method311()) {
			if (local11.method4020(arg1, arg2)) {
				local11.method4017(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
