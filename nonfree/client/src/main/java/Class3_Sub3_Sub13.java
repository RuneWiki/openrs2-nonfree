import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class3_Sub3_Sub13 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
	public int anInt3496 = 12800;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "Z")
	public boolean aBoolean267 = true;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
	public int anInt3500 = 12800;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
	public int anInt3494 = 0;

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
	public int anInt3503 = 0;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
	public int anInt3502 = -1;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
	public int anInt3504 = -1;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
	public final int anInt3495;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	public final int anInt3497;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString43;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Lclient!ps;")
	public final Class193 aClass193_29;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub3_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3495 = arg0;
		this.anInt3497 = arg3;
		this.aString44 = arg1;
		this.aString43 = arg2;
		this.aBoolean267 = arg5;
		this.anInt3502 = arg6;
		this.anInt3504 = arg4;
		if (this.anInt3502 == 255) {
			this.anInt3502 = 0;
		}
		this.aClass193_29 = new Class193();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIBI)Z")
	public boolean method3004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(19) Class3_Sub34 local19 = (Class3_Sub34) this.aClass193_29.method4519(); local19 != null; local19 = (Class3_Sub34) this.aClass193_29.method4525()) {
			if (local19.method3723(arg3, arg2, arg1)) {
				local19.method3725(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
	public void method3006() {
		this.anInt3503 = 0;
		this.anInt3500 = 12800;
		this.anInt3494 = 0;
		this.anInt3496 = 12800;
		for (@Pc(31) Class3_Sub34 local31 = (Class3_Sub34) this.aClass193_29.method4519(); local31 != null; local31 = (Class3_Sub34) this.aClass193_29.method4525()) {
			if (this.anInt3503 < local31.anInt4490) {
				this.anInt3503 = local31.anInt4490;
			}
			if (this.anInt3496 > local31.anInt4495) {
				this.anInt3496 = local31.anInt4495;
			}
			if (this.anInt3500 > local31.anInt4493) {
				this.anInt3500 = local31.anInt4493;
			}
			if (local31.anInt4492 > this.anInt3494) {
				this.anInt3494 = local31.anInt4492;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZII[I)Z")
	public boolean method3008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class3_Sub34 local11 = (Class3_Sub34) this.aClass193_29.method4519(); local11 != null; local11 = (Class3_Sub34) this.aClass193_29.method4525()) {
			if (local11.method3719(arg0, arg1)) {
				local11.method3725(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)Z")
	public boolean method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class3_Sub34 local11 = (Class3_Sub34) this.aClass193_29.method4519(); local11 != null; local11 = (Class3_Sub34) this.aClass193_29.method4525()) {
			if (local11.method3719(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[II)Z")
	public boolean method3011(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class3_Sub34 local11 = (Class3_Sub34) this.aClass193_29.method4519(); local11 != null; local11 = (Class3_Sub34) this.aClass193_29.method4525()) {
			if (local11.method3722(arg2, arg0)) {
				local11.method3721(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
