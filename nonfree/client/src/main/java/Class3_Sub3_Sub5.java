import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class3_Sub3_Sub5 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
	public int anInt1175 = -1;

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
	public int anInt1178 = 0;

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
	public int anInt1183 = 0;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
	public int anInt1184 = -1;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
	public int anInt1181 = 12800;

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
	public int anInt1186 = 12800;

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
	public final int anInt1185;

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
	public final int anInt1177;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "Lclient!tu;")
	public final Class229 aClass229_7;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString9 = arg2;
		this.aBoolean95 = arg5;
		this.anInt1184 = arg6;
		this.anInt1175 = arg4;
		this.aString10 = arg1;
		this.anInt1185 = arg3;
		this.anInt1177 = arg0;
		if (this.anInt1184 == 255) {
			this.anInt1184 = 0;
		}
		this.aClass229_7 = new Class229();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public void method1023() {
		this.anInt1183 = 0;
		this.anInt1178 = 0;
		this.anInt1186 = 12800;
		this.anInt1181 = 12800;
		for (@Pc(29) Class3_Sub34 local29 = (Class3_Sub34) this.aClass229_7.method5328(); local29 != null; local29 = (Class3_Sub34) this.aClass229_7.method5325()) {
			if (local29.anInt6022 > this.anInt1183) {
				this.anInt1183 = local29.anInt6022;
			}
			if (local29.anInt6024 < this.anInt1181) {
				this.anInt1181 = local29.anInt6024;
			}
			if (this.anInt1178 < local29.anInt6032) {
				this.anInt1178 = local29.anInt6032;
			}
			if (this.anInt1186 > local29.anInt6033) {
				this.anInt1186 = local29.anInt6033;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[IBI)Z")
	public boolean method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) Class3_Sub34 local13 = (Class3_Sub34) this.aClass229_7.method5328(); local13 != null; local13 = (Class3_Sub34) this.aClass229_7.method5325()) {
			if (local13.method4808(arg2, arg0)) {
				local13.method4807(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[IIB)Z")
	public boolean method1025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(9) Class3_Sub34 local9 = (Class3_Sub34) this.aClass229_7.method5328(); local9 != null; local9 = (Class3_Sub34) this.aClass229_7.method5325()) {
			if (local9.method4810(arg0, arg3, arg1)) {
				local9.method4809(arg3, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Z")
	public boolean method1026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) Class3_Sub34 local9 = (Class3_Sub34) this.aClass229_7.method5328(); local9 != null; local9 = (Class3_Sub34) this.aClass229_7.method5325()) {
			if (local9.method4806(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI[II)Z")
	public boolean method1027(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class3_Sub34 local9 = (Class3_Sub34) this.aClass229_7.method5328(); local9 != null; local9 = (Class3_Sub34) this.aClass229_7.method5325()) {
			if (local9.method4806(arg0, arg2)) {
				local9.method4809(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}
}
