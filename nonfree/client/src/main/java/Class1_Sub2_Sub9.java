import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "Z")
	public boolean aBoolean116 = true;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	public int anInt2169 = 0;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
	public int anInt2171 = 12800;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
	public int anInt2168 = -1;

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
	public int anInt2177 = -1;

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
	public int anInt2176 = 12800;

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
	public int anInt2173 = 0;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
	public int anInt2175;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	public int anInt2163;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "Lclient!qg;")
	public Class131 aClass131_4;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt2168 = arg4;
		this.aBoolean116 = arg5;
		this.anInt2175 = arg3;
		this.anInt2163 = arg0;
		this.aString69 = arg1;
		this.anInt2177 = arg6;
		if (this.anInt2177 == 255) {
			this.anInt2177 = 0;
		}
		this.aString71 = arg2;
		this.aClass131_4 = new Class131();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)[I")
	public int[] method1635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class1_Sub32 local16 = (Class1_Sub32) this.aClass131_4.method3791(); local16 != null; local16 = (Class1_Sub32) this.aClass131_4.method3792()) {
			if (local16.method4483(arg1, arg0)) {
				return local16.method4487(arg1, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)[I")
	public int[] method1638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class1_Sub32 local19 = (Class1_Sub32) this.aClass131_4.method3791(); local19 != null; local19 = (Class1_Sub32) this.aClass131_4.method3792()) {
			if (local19.method4481(arg0, arg2, arg1)) {
				return local19.method4485(arg1, arg2);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII)Z")
	public boolean method1639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub32 local11 = (Class1_Sub32) this.aClass131_4.method3791(); local11 != null; local11 = (Class1_Sub32) this.aClass131_4.method3792()) {
			if (local11.method4482(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public void method1640() {
		this.anInt2176 = 12800;
		this.anInt2169 = 0;
		this.anInt2173 = 0;
		this.anInt2171 = 12800;
		for (@Pc(29) Class1_Sub32 local29 = (Class1_Sub32) this.aClass131_4.method3791(); local29 != null; local29 = (Class1_Sub32) this.aClass131_4.method3792()) {
			if (this.anInt2171 > local29.anInt5756) {
				this.anInt2171 = local29.anInt5756;
			}
			if (this.anInt2173 < local29.anInt5744) {
				this.anInt2173 = local29.anInt5744;
			}
			if (this.anInt2169 < local29.anInt5755) {
				this.anInt2169 = local29.anInt5755;
			}
			if (local29.anInt5754 < this.anInt2176) {
				this.anInt2176 = local29.anInt5754;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZII)[I")
	public int[] method1642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub32 local11 = (Class1_Sub32) this.aClass131_4.method3791(); local11 != null; local11 = (Class1_Sub32) this.aClass131_4.method3792()) {
			if (local11.method4482(arg1, arg0)) {
				return local11.method4485(arg0, arg1);
			}
		}
		return null;
	}
}
