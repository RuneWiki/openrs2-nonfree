import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class4_Sub5_Sub3 extends Class4_Sub5 {

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
	public int anInt869 = 0;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
	public int anInt872 = 12800;

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
	public int anInt870 = -1;

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "Z")
	public boolean aBoolean74 = true;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
	public int anInt871 = -1;

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
	public int anInt875 = 12800;

	@OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
	public int anInt879 = 0;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
	public final int anInt874;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
	public final int anInt867;

	@OriginalMember(owner = "client!bj", name = "K", descriptor = "Lclient!ifa;")
	public final Class163 aClass163_10;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString8 = arg2;
		this.anInt874 = arg0;
		this.aBoolean74 = arg5;
		this.aString9 = arg1;
		this.anInt867 = arg3;
		this.anInt870 = arg6;
		this.anInt871 = arg4;
		if (this.anInt870 == 255) {
			this.anInt870 = 0;
		}
		this.aClass163_10 = new Class163();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Z")
	public boolean method802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class4_Sub40 local16 = (Class4_Sub40) this.aClass163_10.method3639(); local16 != null; local16 = (Class4_Sub40) this.aClass163_10.method3640()) {
			if (local16.method6136(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII[I)Z")
	public boolean method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class4_Sub40 local11 = (Class4_Sub40) this.aClass163_10.method3639(); local11 != null; local11 = (Class4_Sub40) this.aClass163_10.method3640()) {
			if (local11.method6135(arg0, arg2, arg1)) {
				local11.method6134(arg3, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII[I)Z")
	public boolean method804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class4_Sub40 local17 = (Class4_Sub40) this.aClass163_10.method3639(); local17 != null; local17 = (Class4_Sub40) this.aClass163_10.method3640()) {
			if (local17.method6132(arg0, arg1)) {
				local17.method6138(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public void method806() {
		this.anInt875 = 12800;
		this.anInt872 = 12800;
		this.anInt869 = 0;
		this.anInt879 = 0;
		for (@Pc(32) Class4_Sub40 local32 = (Class4_Sub40) this.aClass163_10.method3639(); local32 != null; local32 = (Class4_Sub40) this.aClass163_10.method3640()) {
			if (local32.anInt6974 > this.anInt879) {
				this.anInt879 = local32.anInt6974;
			}
			if (this.anInt872 > local32.anInt6969) {
				this.anInt872 = local32.anInt6969;
			}
			if (local32.anInt6968 > this.anInt869) {
				this.anInt869 = local32.anInt6968;
			}
			if (this.anInt875 > local32.anInt6967) {
				this.anInt875 = local32.anInt6967;
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII[I)Z")
	public boolean method807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class4_Sub40 local17 = (Class4_Sub40) this.aClass163_10.method3639(); local17 != null; local17 = (Class4_Sub40) this.aClass163_10.method3640()) {
			if (local17.method6136(arg1, arg0)) {
				local17.method6134(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
