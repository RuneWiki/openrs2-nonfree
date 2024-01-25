import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "Z")
	public boolean aBoolean217 = true;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	public int anInt2892 = 0;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	public int anInt2899 = 12800;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
	public int anInt2897 = 12800;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
	public int anInt2902 = -1;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	public int anInt2903 = 0;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	public int anInt2900 = -1;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
	public final int anInt2895;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
	public final int anInt2906;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!fha;")
	public final Class109 aClass109_26;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2902 = arg4;
		this.anInt2895 = arg3;
		this.aBoolean217 = arg5;
		this.anInt2900 = arg6;
		this.aString27 = arg1;
		this.aString26 = arg2;
		this.anInt2906 = arg0;
		if (this.anInt2900 == 255) {
			this.anInt2900 = 0;
		}
		this.aClass109_26 = new Class109();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[II)Z")
	public boolean method2425(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub36 local11 = (Class2_Sub36) this.aClass109_26.method2325(); local11 != null; local11 = (Class2_Sub36) this.aClass109_26.method2318()) {
			if (local11.method5421(arg0, arg2)) {
				local11.method5416(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([IIII)Z")
	public boolean method2426(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub36 local11 = (Class2_Sub36) this.aClass109_26.method2325(); local11 != null; local11 = (Class2_Sub36) this.aClass109_26.method2318()) {
			if (local11.method5419(arg2, arg1)) {
				local11.method5420(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z")
	public boolean method2427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub36 local11 = (Class2_Sub36) this.aClass109_26.method2325(); local11 != null; local11 = (Class2_Sub36) this.aClass109_26.method2318()) {
			if (local11.method5419(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([IIIZI)Z")
	public boolean method2428(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class2_Sub36 local16 = (Class2_Sub36) this.aClass109_26.method2325(); local16 != null; local16 = (Class2_Sub36) this.aClass109_26.method2318()) {
			if (local16.method5417(arg3, arg1, arg2)) {
				local16.method5420(arg2, arg3, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2429() {
		this.anInt2899 = 12800;
		this.anInt2892 = 0;
		this.anInt2897 = 12800;
		this.anInt2903 = 0;
		for (@Pc(23) Class2_Sub36 local23 = (Class2_Sub36) this.aClass109_26.method2325(); local23 != null; local23 = (Class2_Sub36) this.aClass109_26.method2318()) {
			if (local23.anInt6243 > this.anInt2892) {
				this.anInt2892 = local23.anInt6243;
			}
			if (local23.anInt6248 < this.anInt2897) {
				this.anInt2897 = local23.anInt6248;
			}
			if (local23.anInt6250 < this.anInt2899) {
				this.anInt2899 = local23.anInt6250;
			}
			if (local23.anInt6251 > this.anInt2903) {
				this.anInt2903 = local23.anInt6251;
			}
		}
	}
}
