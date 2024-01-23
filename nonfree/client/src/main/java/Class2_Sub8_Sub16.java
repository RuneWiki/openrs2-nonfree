import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class2_Sub8_Sub16 extends Class2_Sub8 {

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	public int anInt4412 = -1;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
	public int anInt4414 = 12800;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
	public int anInt4416 = 12800;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Z")
	public boolean aBoolean297 = true;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
	public int anInt4419 = 0;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public int anInt4411 = 0;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
	public int anInt4420 = -1;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "Ljava/lang/String;")
	public String aString152;

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "Ljava/lang/String;")
	public String aString151;

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	public int anInt4422;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
	public int anInt4413;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "Lclient!en;")
	public Class44 aClass44_22;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class2_Sub8_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt4412 = arg6;
		if (this.anInt4412 == 255) {
			this.anInt4412 = 0;
		}
		this.aBoolean297 = arg5;
		this.aString152 = arg2;
		this.aString151 = arg1;
		this.anInt4422 = arg3;
		this.anInt4420 = arg4;
		this.anInt4413 = arg0;
		this.aClass44_22 = new Class44();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
	public boolean method3591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub30 local11 = (Class2_Sub30) this.aClass44_22.method1352(); local11 != null; local11 = (Class2_Sub30) this.aClass44_22.method1360()) {
			if (local11.method4512(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public void method3592() {
		this.anInt4419 = 0;
		this.anInt4414 = 12800;
		this.anInt4416 = 12800;
		this.anInt4411 = 0;
		for (@Pc(23) Class2_Sub30 local23 = (Class2_Sub30) this.aClass44_22.method1352(); local23 != null; local23 = (Class2_Sub30) this.aClass44_22.method1360()) {
			if (local23.anInt5715 < this.anInt4416) {
				this.anInt4416 = local23.anInt5715;
			}
			if (this.anInt4419 < local23.anInt5725) {
				this.anInt4419 = local23.anInt5725;
			}
			if (this.anInt4414 > local23.anInt5717) {
				this.anInt4414 = local23.anInt5717;
			}
			if (local23.anInt5728 > this.anInt4411) {
				this.anInt4411 = local23.anInt5728;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[IBI)Z")
	public boolean method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub30 local11 = (Class2_Sub30) this.aClass44_22.method1352(); local11 != null; local11 = (Class2_Sub30) this.aClass44_22.method1360()) {
			if (local11.method4518(arg2, arg0)) {
				local11.method4511(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB[I)Z")
	public boolean method3594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class2_Sub30 local11 = (Class2_Sub30) this.aClass44_22.method1352(); local11 != null; local11 = (Class2_Sub30) this.aClass44_22.method1360()) {
			if (local11.method4512(arg0, arg1)) {
				local11.method4519(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[III)Z")
	public boolean method3595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(17) Class2_Sub30 local17 = (Class2_Sub30) this.aClass44_22.method1352(); local17 != null; local17 = (Class2_Sub30) this.aClass44_22.method1360()) {
			if (local17.method4517(arg3, arg0, arg1)) {
				local17.method4519(arg3, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
