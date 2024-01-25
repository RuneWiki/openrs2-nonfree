import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class3_Sub5_Sub4 extends Class3_Sub5 {

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	public int anInt1305 = 12800;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	public int anInt1309 = 0;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "I")
	public int anInt1312 = 12800;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	public int anInt1310 = -1;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "Z")
	public boolean aBoolean90 = true;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	public int anInt1317 = -1;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "I")
	public int anInt1318 = 0;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "I")
	public final int anInt1308;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString20;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public final int anInt1301;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "Lclient!qw;")
	public final Class302 aClass302_6;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1317 = arg4;
		this.aBoolean90 = arg5;
		this.anInt1308 = arg0;
		this.aString21 = arg1;
		this.aString20 = arg2;
		this.anInt1301 = arg3;
		this.anInt1310 = arg6;
		if (this.anInt1310 == 255) {
			this.anInt1310 = 0;
		}
		this.aClass302_6 = new Class302();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)Z")
	public boolean method1146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(9) Class3_Sub34 local9 = (Class3_Sub34) this.aClass302_6.method6603(); local9 != null; local9 = (Class3_Sub34) this.aClass302_6.method6605()) {
			if (local9.method4739(arg1, arg0)) {
				local9.method4738(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public void method1148() {
		this.anInt1305 = 12800;
		this.anInt1309 = 0;
		this.anInt1318 = 0;
		this.anInt1312 = 12800;
		for (@Pc(23) Class3_Sub34 local23 = (Class3_Sub34) this.aClass302_6.method6603(); local23 != null; local23 = (Class3_Sub34) this.aClass302_6.method6605()) {
			if (this.anInt1318 < local23.anInt5529) {
				this.anInt1318 = local23.anInt5529;
			}
			if (local23.anInt5532 < this.anInt1305) {
				this.anInt1305 = local23.anInt5532;
			}
			if (local23.anInt5524 < this.anInt1312) {
				this.anInt1312 = local23.anInt5524;
			}
			if (this.anInt1309 < local23.anInt5523) {
				this.anInt1309 = local23.anInt5523;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)Z")
	public boolean method1151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class3_Sub34 local11 = (Class3_Sub34) this.aClass302_6.method6603(); local11 != null; local11 = (Class3_Sub34) this.aClass302_6.method6605()) {
			if (local11.method4739(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[III)Z")
	public boolean method1152(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(21) Class3_Sub34 local21 = (Class3_Sub34) this.aClass302_6.method6603(); local21 != null; local21 = (Class3_Sub34) this.aClass302_6.method6605()) {
			if (local21.method4740(arg2, arg0)) {
				local21.method4736(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[III)Z")
	public boolean method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) Class3_Sub34 local11 = (Class3_Sub34) this.aClass302_6.method6603(); local11 != null; local11 = (Class3_Sub34) this.aClass302_6.method6605()) {
			if (local11.method4742(arg1, arg0, arg3)) {
				local11.method4738(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}
}
