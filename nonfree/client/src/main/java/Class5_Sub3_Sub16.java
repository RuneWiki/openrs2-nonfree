import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class5_Sub3_Sub16 extends Class5_Sub3 {

	@OriginalMember(owner = "client!rca", name = "u", descriptor = "Z")
	public boolean aBoolean712 = true;

	@OriginalMember(owner = "client!rca", name = "z", descriptor = "I")
	public int anInt8376 = -1;

	@OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
	public int anInt8374 = 0;

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "I")
	public int anInt8377 = -1;

	@OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
	public int anInt8378 = 12800;

	@OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
	public int anInt8372 = 0;

	@OriginalMember(owner = "client!rca", name = "P", descriptor = "I")
	public int anInt8385 = 12800;

	@OriginalMember(owner = "client!rca", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString80;

	@OriginalMember(owner = "client!rca", name = "L", descriptor = "I")
	public final int anInt8384;

	@OriginalMember(owner = "client!rca", name = "K", descriptor = "I")
	public final int anInt8383;

	@OriginalMember(owner = "client!rca", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!rca", name = "J", descriptor = "Lclient!fca;")
	public final Class114 aClass114_57;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub3_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean712 = arg5;
		this.anInt8376 = arg4;
		this.aString80 = arg1;
		this.anInt8377 = arg6;
		this.anInt8384 = arg3;
		this.anInt8383 = arg0;
		this.aString79 = arg2;
		if (this.anInt8377 == 255) {
			this.anInt8377 = 0;
		}
		this.aClass114_57 = new Class114();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([IIII)Z")
	public boolean method7162(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class5_Sub15 local9 = (Class5_Sub15) this.aClass114_57.method2805(); local9 != null; local9 = (Class5_Sub15) this.aClass114_57.method2814()) {
			if (local9.method2227(arg2, arg1)) {
				local9.method2230(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II[II)Z")
	public boolean method7164(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class5_Sub15 local11 = (Class5_Sub15) this.aClass114_57.method2805(); local11 != null; local11 = (Class5_Sub15) this.aClass114_57.method2814()) {
			if (local11.method2224(arg2, arg0)) {
				local11.method2228(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IBI)Z")
	public boolean method7165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) Class5_Sub15 local15 = (Class5_Sub15) this.aClass114_57.method2805(); local15 != null; local15 = (Class5_Sub15) this.aClass114_57.method2814()) {
			if (local15.method2224(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIBI[I)Z")
	public boolean method7166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(18) Class5_Sub15 local18 = (Class5_Sub15) this.aClass114_57.method2805(); local18 != null; local18 = (Class5_Sub15) this.aClass114_57.method2814()) {
			if (local18.method2223(arg0, arg1, arg2)) {
				local18.method2228(arg2, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
	public void method7168() {
		this.anInt8385 = 12800;
		this.anInt8372 = 0;
		this.anInt8374 = 0;
		this.anInt8378 = 12800;
		for (@Pc(27) Class5_Sub15 local27 = (Class5_Sub15) this.aClass114_57.method2805(); local27 != null; local27 = (Class5_Sub15) this.aClass114_57.method2814()) {
			if (this.anInt8385 > local27.anInt2480) {
				this.anInt8385 = local27.anInt2480;
			}
			if (this.anInt8378 > local27.anInt2472) {
				this.anInt8378 = local27.anInt2472;
			}
			if (local27.anInt2476 > this.anInt8372) {
				this.anInt8372 = local27.anInt2476;
			}
			if (local27.anInt2470 > this.anInt8374) {
				this.anInt8374 = local27.anInt2470;
			}
		}
	}
}
