import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class4_Sub6_Sub16 extends Class4_Sub6 {

	@OriginalMember(owner = "client!qba", name = "C", descriptor = "[F")
	public static final float[] aFloatArray61 = new float[16384];

	@OriginalMember(owner = "client!qba", name = "J", descriptor = "[F")
	public static final float[] aFloatArray62 = new float[16384];

	@OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
	public int anInt8092 = -1;

	@OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
	public int anInt8095 = 0;

	@OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
	public int anInt8096 = 12800;

	@OriginalMember(owner = "client!qba", name = "S", descriptor = "I")
	public int anInt8103 = 12800;

	@OriginalMember(owner = "client!qba", name = "U", descriptor = "Z")
	public boolean aBoolean580 = true;

	@OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
	public int anInt8093 = -1;

	@OriginalMember(owner = "client!qba", name = "V", descriptor = "I")
	public int anInt8105 = 0;

	@OriginalMember(owner = "client!qba", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString166;

	@OriginalMember(owner = "client!qba", name = "I", descriptor = "I")
	public final int anInt8097;

	@OriginalMember(owner = "client!qba", name = "L", descriptor = "I")
	public final int anInt8098;

	@OriginalMember(owner = "client!qba", name = "N", descriptor = "Ljava/lang/String;")
	public final String aString167;

	@OriginalMember(owner = "client!qba", name = "B", descriptor = "Lclient!au;")
	public final Class22 aClass22_54;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray62[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray61[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub6_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString166 = arg2;
		this.anInt8097 = arg3;
		this.aBoolean580 = arg5;
		this.anInt8093 = arg6;
		this.anInt8098 = arg0;
		this.aString167 = arg1;
		this.anInt8092 = arg4;
		if (this.anInt8093 == 255) {
			this.anInt8093 = 0;
		}
		this.aClass22_54 = new Class22();
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
	public void method6309() {
		this.anInt8105 = 0;
		this.anInt8095 = 0;
		this.anInt8103 = 12800;
		this.anInt8096 = 12800;
		for (@Pc(25) Class4_Sub22 local25 = (Class4_Sub22) this.aClass22_54.method895(); local25 != null; local25 = (Class4_Sub22) this.aClass22_54.method889()) {
			if (this.anInt8096 > local25.anInt3668) {
				this.anInt8096 = local25.anInt3668;
			}
			if (this.anInt8103 > local25.anInt3677) {
				this.anInt8103 = local25.anInt3677;
			}
			if (local25.anInt3670 > this.anInt8095) {
				this.anInt8095 = local25.anInt3670;
			}
			if (this.anInt8105 < local25.anInt3675) {
				this.anInt8105 = local25.anInt3675;
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIZ[I)Z")
	public boolean method6311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(21) Class4_Sub22 local21 = (Class4_Sub22) this.aClass22_54.method895(); local21 != null; local21 = (Class4_Sub22) this.aClass22_54.method889()) {
			if (local21.method2895(arg1, arg2, arg0)) {
				local21.method2899(arg3, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I[III)Z")
	public boolean method6312(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class4_Sub22 local11 = (Class4_Sub22) this.aClass22_54.method895(); local11 != null; local11 = (Class4_Sub22) this.aClass22_54.method889()) {
			if (local11.method2898(arg0, arg2)) {
				local11.method2899(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZ)Z")
	public boolean method6313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(22) Class4_Sub22 local22 = (Class4_Sub22) this.aClass22_54.method895(); local22 != null; local22 = (Class4_Sub22) this.aClass22_54.method889()) {
			if (local22.method2898(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "([IIII)Z")
	public boolean method6315(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class4_Sub22 local16 = (Class4_Sub22) this.aClass22_54.method895(); local16 != null; local16 = (Class4_Sub22) this.aClass22_54.method889()) {
			if (local16.method2896(arg2, arg1)) {
				local16.method2894(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
