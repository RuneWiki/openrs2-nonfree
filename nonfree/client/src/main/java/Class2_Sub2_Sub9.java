import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ida", name = "w", descriptor = "I")
	public int anInt3268 = -1;

	@OriginalMember(owner = "client!ida", name = "v", descriptor = "I")
	public int anInt3267 = 0;

	@OriginalMember(owner = "client!ida", name = "x", descriptor = "Z")
	public boolean aBoolean236 = true;

	@OriginalMember(owner = "client!ida", name = "z", descriptor = "I")
	public int anInt3269 = 0;

	@OriginalMember(owner = "client!ida", name = "u", descriptor = "I")
	public int anInt3266 = 12800;

	@OriginalMember(owner = "client!ida", name = "F", descriptor = "I")
	public int anInt3273 = 12800;

	@OriginalMember(owner = "client!ida", name = "H", descriptor = "I")
	public int anInt3275 = -1;

	@OriginalMember(owner = "client!ida", name = "D", descriptor = "I")
	public final int anInt3271;

	@OriginalMember(owner = "client!ida", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString46;

	@OriginalMember(owner = "client!ida", name = "B", descriptor = "I")
	public final int anInt3270;

	@OriginalMember(owner = "client!ida", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString47;

	@OriginalMember(owner = "client!ida", name = "L", descriptor = "Lclient!dc;")
	public final Class70 aClass70_20;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3268 = arg4;
		this.anInt3271 = arg3;
		this.aString46 = arg2;
		this.anInt3270 = arg0;
		this.aString47 = arg1;
		this.anInt3275 = arg6;
		this.aBoolean236 = arg5;
		if (this.anInt3275 == 255) {
			this.anInt3275 = 0;
		}
		this.aClass70_20 = new Class70();
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V")
	public void method2728() {
		this.anInt3266 = 12800;
		this.anInt3273 = 12800;
		this.anInt3267 = 0;
		this.anInt3269 = 0;
		for (@Pc(23) Class2_Sub26 local23 = (Class2_Sub26) this.aClass70_20.method1264(); local23 != null; local23 = (Class2_Sub26) this.aClass70_20.method1261()) {
			if (this.anInt3267 < local23.anInt4053) {
				this.anInt3267 = local23.anInt4053;
			}
			if (local23.anInt4047 > this.anInt3269) {
				this.anInt3269 = local23.anInt4047;
			}
			if (this.anInt3266 > local23.anInt4044) {
				this.anInt3266 = local23.anInt4044;
			}
			if (this.anInt3273 > local23.anInt4043) {
				this.anInt3273 = local23.anInt4043;
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III[I)Z")
	public boolean method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class2_Sub26 local16 = (Class2_Sub26) this.aClass70_20.method1264(); local16 != null; local16 = (Class2_Sub26) this.aClass70_20.method1261()) {
			if (local16.method3478(arg1, arg0)) {
				local16.method3477(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "([IIII)Z")
	public boolean method2731(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class2_Sub26 local11 = (Class2_Sub26) this.aClass70_20.method1264(); local11 != null; local11 = (Class2_Sub26) this.aClass70_20.method1261()) {
			if (local11.method3474(arg2, arg1)) {
				local11.method3476(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)Z")
	public boolean method2733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub26 local11 = (Class2_Sub26) this.aClass70_20.method1264(); local11 != null; local11 = (Class2_Sub26) this.aClass70_20.method1261()) {
			if (local11.method3478(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIBI[I)Z")
	public boolean method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) Class2_Sub26 local16 = (Class2_Sub26) this.aClass70_20.method1264(); local16 != null; local16 = (Class2_Sub26) this.aClass70_20.method1261()) {
			if (local16.method3475(arg1, arg2, arg0)) {
				local16.method3477(arg2, arg3, arg1);
				return true;
			}
		}
		return false;
	}
}
