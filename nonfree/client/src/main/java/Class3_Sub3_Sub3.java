import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
	public int anInt236 = -1;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
	public int anInt233 = -1;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
	public int anInt230 = 12800;

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
	public int anInt237 = 0;

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
	public int anInt238 = 12800;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
	public boolean aBoolean21 = true;

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
	public int anInt235 = 0;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
	public final int anInt231;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
	public final int anInt241;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "Lclient!hga;")
	public final Class130 aClass130_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt231 = arg3;
		this.aString8 = arg1;
		this.aString9 = arg2;
		this.aBoolean21 = arg5;
		this.anInt233 = arg6;
		this.anInt236 = arg4;
		this.anInt241 = arg0;
		if (this.anInt233 == 255) {
			this.anInt233 = 0;
		}
		this.aClass130_1 = new Class130();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public void method242() {
		this.anInt235 = 0;
		this.anInt237 = 0;
		this.anInt230 = 12800;
		this.anInt238 = 12800;
		for (@Pc(33) Class3_Sub9 local33 = (Class3_Sub9) this.aClass130_1.method3543(); local33 != null; local33 = (Class3_Sub9) this.aClass130_1.method3551()) {
			if (this.anInt238 > local33.anInt706) {
				this.anInt238 = local33.anInt706;
			}
			if (this.anInt237 < local33.anInt696) {
				this.anInt237 = local33.anInt696;
			}
			if (this.anInt235 < local33.anInt700) {
				this.anInt235 = local33.anInt700;
			}
			if (local33.anInt704 < this.anInt230) {
				this.anInt230 = local33.anInt704;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Z")
	public boolean method245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class3_Sub9 local17 = (Class3_Sub9) this.aClass130_1.method3543(); local17 != null; local17 = (Class3_Sub9) this.aClass130_1.method3551()) {
			if (local17.method556(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([IIII)Z")
	public boolean method246(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class3_Sub9 local11 = (Class3_Sub9) this.aClass130_1.method3543(); local11 != null; local11 = (Class3_Sub9) this.aClass130_1.method3551()) {
			if (local11.method552(arg1, arg2)) {
				local11.method554(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[II)Z")
	public boolean method247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(20) Class3_Sub9 local20 = (Class3_Sub9) this.aClass130_1.method3543(); local20 != null; local20 = (Class3_Sub9) this.aClass130_1.method3551()) {
			if (local20.method556(arg1, arg0)) {
				local20.method555(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[II)Z")
	public boolean method249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class3_Sub9 local17 = (Class3_Sub9) this.aClass130_1.method3543(); local17 != null; local17 = (Class3_Sub9) this.aClass130_1.method3551()) {
			if (local17.method558(arg1, arg3, arg0)) {
				local17.method555(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}
}
