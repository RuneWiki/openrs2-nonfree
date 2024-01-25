import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class6_Sub2_Sub15 extends Class6_Sub2 {

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
	public int anInt7195 = 12800;

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
	public int anInt7192 = 12800;

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
	public int anInt7186 = 0;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
	public int anInt7188 = -1;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
	public int anInt7190 = -1;

	@OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
	public int anInt7197 = 0;

	@OriginalMember(owner = "client!uj", name = "V", descriptor = "Z")
	public boolean aBoolean459 = true;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
	public final int anInt7184;

	@OriginalMember(owner = "client!uj", name = "R", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
	public final int anInt7193;

	@OriginalMember(owner = "client!uj", name = "Q", descriptor = "Lclient!um;")
	public final Class244 aClass244_43;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean459 = arg5;
		this.aString64 = arg1;
		this.anInt7184 = arg0;
		this.anInt7190 = arg4;
		this.aString65 = arg2;
		this.anInt7193 = arg3;
		this.anInt7188 = arg6;
		if (this.anInt7188 == 255) {
			this.anInt7188 = 0;
		}
		this.aClass244_43 = new Class244();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([IIII)Z")
	public boolean method5928(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(20) Class6_Sub25 local20 = (Class6_Sub25) this.aClass244_43.method5976(); local20 != null; local20 = (Class6_Sub25) this.aClass244_43.method5964()) {
			if (local20.method4142(arg2, arg1)) {
				local20.method4144(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "([IIII)Z")
	public boolean method5930(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) Class6_Sub25 local16 = (Class6_Sub25) this.aClass244_43.method5976(); local16 != null; local16 = (Class6_Sub25) this.aClass244_43.method5964()) {
			if (local16.method4141(arg1, arg2)) {
				local16.method4143(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[IIII)Z")
	public boolean method5931(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class6_Sub25 local11 = (Class6_Sub25) this.aClass244_43.method5976(); local11 != null; local11 = (Class6_Sub25) this.aClass244_43.method5964()) {
			if (local11.method4146(arg0, arg3, arg2)) {
				local11.method4144(arg3, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)Z")
	public boolean method5932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) Class6_Sub25 local19 = (Class6_Sub25) this.aClass244_43.method5976(); local19 != null; local19 = (Class6_Sub25) this.aClass244_43.method5964()) {
			if (local19.method4142(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
	public void method5935() {
		this.anInt7195 = 12800;
		this.anInt7192 = 12800;
		this.anInt7186 = 0;
		this.anInt7197 = 0;
		for (@Pc(28) Class6_Sub25 local28 = (Class6_Sub25) this.aClass244_43.method5976(); local28 != null; local28 = (Class6_Sub25) this.aClass244_43.method5964()) {
			if (this.anInt7186 < local28.anInt4921) {
				this.anInt7186 = local28.anInt4921;
			}
			if (this.anInt7192 > local28.anInt4916) {
				this.anInt7192 = local28.anInt4916;
			}
			if (local28.anInt4914 > this.anInt7197) {
				this.anInt7197 = local28.anInt4914;
			}
			if (local28.anInt4919 < this.anInt7195) {
				this.anInt7195 = local28.anInt4919;
			}
		}
	}
}
