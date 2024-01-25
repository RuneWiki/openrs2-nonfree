import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class3_Sub7_Sub17 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ss", name = "Q", descriptor = "[I")
	public static final int[] anIntArray515 = new int[128];

	@OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
	public int anInt8075 = 12800;

	@OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
	public int anInt8081 = 12800;

	@OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
	public int anInt8080 = 0;

	@OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
	public int anInt8082 = -1;

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
	public int anInt8077 = -1;

	@OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
	public int anInt8085 = 0;

	@OriginalMember(owner = "client!ss", name = "L", descriptor = "Z")
	public boolean aBoolean623 = true;

	@OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
	public final int anInt8076;

	@OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
	public final int anInt8083;

	@OriginalMember(owner = "client!ss", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "client!ss", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!ss", name = "G", descriptor = "Lclient!gk;")
	public final Class112 aClass112_60;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray515.length; local4++) {
			anIntArray515[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray515[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray515[local33] = local33 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray515[local50] = local50 + 4;
		}
		anIntArray515[42] = anIntArray515[43] = 62;
		anIntArray515[45] = anIntArray515[47] = 63;
	}

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub7_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8076 = arg3;
		this.anInt8083 = arg0;
		this.anInt8082 = arg4;
		this.anInt8077 = arg6;
		this.aString77 = arg2;
		this.aBoolean623 = arg5;
		this.aString76 = arg1;
		if (this.anInt8077 == 255) {
			this.anInt8077 = 0;
		}
		this.aClass112_60 = new Class112();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public void method6701() {
		this.anInt8075 = 12800;
		this.anInt8080 = 0;
		this.anInt8085 = 0;
		this.anInt8081 = 12800;
		for (@Pc(23) Class3_Sub33 local23 = (Class3_Sub33) this.aClass112_60.method3088(); local23 != null; local23 = (Class3_Sub33) this.aClass112_60.method3084()) {
			if (local23.anInt4825 > this.anInt8080) {
				this.anInt8080 = local23.anInt4825;
			}
			if (this.anInt8081 > local23.anInt4817) {
				this.anInt8081 = local23.anInt4817;
			}
			if (this.anInt8085 < local23.anInt4823) {
				this.anInt8085 = local23.anInt4823;
			}
			if (this.anInt8075 > local23.anInt4824) {
				this.anInt8075 = local23.anInt4824;
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III[II)Z")
	public boolean method6705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class3_Sub33 local16 = (Class3_Sub33) this.aClass112_60.method3088(); local16 != null; local16 = (Class3_Sub33) this.aClass112_60.method3084()) {
			if (local16.method4153(arg0, arg3, arg1)) {
				local16.method4156(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z")
	public boolean method6706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(20) Class3_Sub33 local20 = (Class3_Sub33) this.aClass112_60.method3088(); local20 != null; local20 = (Class3_Sub33) this.aClass112_60.method3084()) {
			if (local20.method4154(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II[II)Z")
	public boolean method6707(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class3_Sub33 local17 = (Class3_Sub33) this.aClass112_60.method3088(); local17 != null; local17 = (Class3_Sub33) this.aClass112_60.method3084()) {
			if (local17.method4154(arg2, arg0)) {
				local17.method4156(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[IIB)Z")
	public boolean method6708(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class3_Sub33 local11 = (Class3_Sub33) this.aClass112_60.method3088(); local11 != null; local11 = (Class3_Sub33) this.aClass112_60.method3084()) {
			if (local11.method4160(arg0, arg2)) {
				local11.method4152(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}
}
