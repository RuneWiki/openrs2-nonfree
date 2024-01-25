import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
	public int anInt1018 = 12800;

	@OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
	public int anInt1019 = 0;

	@OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
	public int anInt1016 = -1;

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
	public int anInt1010 = 12800;

	@OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
	public int anInt1014 = 0;

	@OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
	public int anInt1017 = -1;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
	public final int anInt1012;

	@OriginalMember(owner = "client!cn", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!cn", name = "O", descriptor = "Ljava/lang/String;")
	public final String aString16;

	@OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
	public final int anInt1023;

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "Lclient!pk;")
	public final Class183 aClass183_4;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1017 = arg4;
		this.anInt1016 = arg6;
		this.anInt1012 = arg0;
		this.aBoolean95 = arg5;
		this.aString15 = arg2;
		this.aString16 = arg1;
		this.anInt1023 = arg3;
		if (this.anInt1016 == 255) {
			this.anInt1016 = 0;
		}
		this.aClass183_4 = new Class183();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[IBI)Z")
	public boolean method930(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class4_Sub41 local11 = (Class4_Sub41) this.aClass183_4.method4140(); local11 != null; local11 = (Class4_Sub41) this.aClass183_4.method4144()) {
			if (local11.method5239(arg2, arg0)) {
				local11.method5237(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[III)Z")
	public boolean method931(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class4_Sub41 local11 = (Class4_Sub41) this.aClass183_4.method4140(); local11 != null; local11 = (Class4_Sub41) this.aClass183_4.method4144()) {
			if (local11.method5238(arg1, arg2)) {
				local11.method5236(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Z")
	public boolean method932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(22) Class4_Sub41 local22 = (Class4_Sub41) this.aClass183_4.method4140(); local22 != null; local22 = (Class4_Sub41) this.aClass183_4.method4144()) {
			if (local22.method5238(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "(B)V")
	public void method933() {
		this.anInt1018 = 12800;
		this.anInt1014 = 0;
		this.anInt1019 = 0;
		this.anInt1010 = 12800;
		for (@Pc(32) Class4_Sub41 local32 = (Class4_Sub41) this.aClass183_4.method4140(); local32 != null; local32 = (Class4_Sub41) this.aClass183_4.method4144()) {
			if (local32.anInt6701 < this.anInt1010) {
				this.anInt1010 = local32.anInt6701;
			}
			if (local32.anInt6690 < this.anInt1018) {
				this.anInt1018 = local32.anInt6690;
			}
			if (this.anInt1019 < local32.anInt6693) {
				this.anInt1019 = local32.anInt6693;
			}
			if (this.anInt1014 < local32.anInt6688) {
				this.anInt1014 = local32.anInt6688;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z[IIII)Z")
	public boolean method935(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class4_Sub41 local17 = (Class4_Sub41) this.aClass183_4.method4140(); local17 != null; local17 = (Class4_Sub41) this.aClass183_4.method4144()) {
			if (local17.method5240(arg2, arg3, arg1)) {
				local17.method5236(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}
}
