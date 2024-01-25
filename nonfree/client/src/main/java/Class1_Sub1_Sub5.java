import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Z")
	public boolean aBoolean216 = true;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	public int anInt3148 = 12800;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
	public int anInt3152 = 12800;

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
	public int anInt3154 = -1;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	public int anInt3146 = -1;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	public int anInt3144 = 0;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
	public int anInt3156 = 0;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString33;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	public final int anInt3155;

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString34;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	public final int anInt3147;

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "Lclient!bv;")
	public final Class37 aClass37_40;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3154 = arg4;
		this.aString33 = arg2;
		this.anInt3155 = arg3;
		this.aBoolean216 = arg5;
		this.aString34 = arg1;
		this.anInt3146 = arg6;
		this.anInt3147 = arg0;
		if (this.anInt3146 == 255) {
			this.anInt3146 = 0;
		}
		this.aClass37_40 = new Class37();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[I)Z")
	public boolean method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class1_Sub28 local11 = (Class1_Sub28) this.aClass37_40.method977(); local11 != null; local11 = (Class1_Sub28) this.aClass37_40.method971()) {
			if (local11.method4196(arg0, arg1)) {
				local11.method4194(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)Z")
	public boolean method2664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(20) Class1_Sub28 local20 = (Class1_Sub28) this.aClass37_40.method977(); local20 != null; local20 = (Class1_Sub28) this.aClass37_40.method971()) {
			if (local20.method4197(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public void method2665() {
		this.anInt3152 = 12800;
		this.anInt3148 = 12800;
		this.anInt3144 = 0;
		this.anInt3156 = 0;
		for (@Pc(31) Class1_Sub28 local31 = (Class1_Sub28) this.aClass37_40.method977(); local31 != null; local31 = (Class1_Sub28) this.aClass37_40.method971()) {
			if (this.anInt3156 < local31.anInt4866) {
				this.anInt3156 = local31.anInt4866;
			}
			if (local31.anInt4864 < this.anInt3148) {
				this.anInt3148 = local31.anInt4864;
			}
			if (local31.anInt4869 > this.anInt3144) {
				this.anInt3144 = local31.anInt4869;
			}
			if (this.anInt3152 > local31.anInt4870) {
				this.anInt3152 = local31.anInt4870;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIB)Z")
	public boolean method2666(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(17) Class1_Sub28 local17 = (Class1_Sub28) this.aClass37_40.method977(); local17 != null; local17 = (Class1_Sub28) this.aClass37_40.method971()) {
			if (local17.method4197(arg1, arg2)) {
				local17.method4193(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[IIII)Z")
	public boolean method2667(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(21) Class1_Sub28 local21 = (Class1_Sub28) this.aClass37_40.method977(); local21 != null; local21 = (Class1_Sub28) this.aClass37_40.method971()) {
			if (local21.method4192(arg3, arg2, arg0)) {
				local21.method4193(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}
}
