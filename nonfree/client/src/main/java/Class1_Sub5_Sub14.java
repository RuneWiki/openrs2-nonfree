import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class1_Sub5_Sub14 extends Class1_Sub5 {

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "[J")
	public static long[] aLongArray8 = new long[256];

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
	public int anInt3526 = 0;

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
	public int anInt3533 = -1;

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
	public int anInt3529 = -1;

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "Z")
	public boolean aBoolean312 = true;

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
	public int anInt3534 = 12800;

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
	public int anInt3536 = 0;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
	public int anInt3535 = 12800;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
	public int anInt3525;

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "Ljava/lang/String;")
	public String aString121;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
	public int anInt3528;

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "Ljava/lang/String;")
	public String aString120;

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "Lclient!jo;")
	public Class96 aClass96_17;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(14) long local14 = (long) local6;
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if ((local14 & 0x1L) == 1L) {
					local14 = local14 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local14 >>>= 0x1;
				}
			}
			aLongArray8[local6] = local14;
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub5_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt3525 = arg0;
		this.anInt3529 = arg4;
		this.aString121 = arg2;
		this.aBoolean312 = arg5;
		this.anInt3528 = arg3;
		this.aString120 = arg1;
		this.anInt3533 = arg6;
		if (this.anInt3533 == 255) {
			this.anInt3533 = 0;
		}
		this.aClass96_17 = new Class96();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[III)Z")
	public boolean method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class1_Sub31 local19 = (Class1_Sub31) this.aClass96_17.method2340(); local19 != null; local19 = (Class1_Sub31) this.aClass96_17.method2342()) {
			if (local19.method4353(arg2, arg0)) {
				local19.method4355(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([IIIII)Z")
	public boolean method3125(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) Class1_Sub31 local11 = (Class1_Sub31) this.aClass96_17.method2340(); local11 != null; local11 = (Class1_Sub31) this.aClass96_17.method2342()) {
			if (local11.method4352(arg1, arg3, arg2)) {
				local11.method4358(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[IB)Z")
	public boolean method3126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(22) Class1_Sub31 local22 = (Class1_Sub31) this.aClass96_17.method2340(); local22 != null; local22 = (Class1_Sub31) this.aClass96_17.method2342()) {
			if (local22.method4354(arg0, arg1)) {
				local22.method4358(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)Z")
	public boolean method3128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub31 local11 = (Class1_Sub31) this.aClass96_17.method2340(); local11 != null; local11 = (Class1_Sub31) this.aClass96_17.method2342()) {
			if (local11.method4354(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	public void method3129() {
		this.anInt3526 = 0;
		this.anInt3535 = 12800;
		this.anInt3534 = 12800;
		this.anInt3536 = 0;
		for (@Pc(31) Class1_Sub31 local31 = (Class1_Sub31) this.aClass96_17.method2340(); local31 != null; local31 = (Class1_Sub31) this.aClass96_17.method2342()) {
			if (local31.anInt5244 < this.anInt3534) {
				this.anInt3534 = local31.anInt5244;
			}
			if (this.anInt3535 > local31.anInt5242) {
				this.anInt3535 = local31.anInt5242;
			}
			if (this.anInt3526 < local31.anInt5243) {
				this.anInt3526 = local31.anInt5243;
			}
			if (local31.anInt5253 > this.anInt3536) {
				this.anInt3536 = local31.anInt5253;
			}
		}
	}
}
