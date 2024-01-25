import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class6_Sub1_Sub9 extends Class6_Sub1 {

	@OriginalMember(owner = "client!he", name = "v", descriptor = "I")
	public int anInt3220 = 0;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "I")
	public int anInt3221 = -1;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "I")
	public int anInt3228 = 12800;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "I")
	public int anInt3231 = 0;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "I")
	public int anInt3229 = -1;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "I")
	public int anInt3230 = 12800;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "Z")
	public boolean aBoolean217 = true;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString46;

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString47;

	@OriginalMember(owner = "client!he", name = "L", descriptor = "I")
	public final int anInt3232;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "I")
	public final int anInt3226;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "Lclient!rh;")
	public final Class275 aClass275_61;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3221 = arg4;
		this.anInt3229 = arg6;
		this.aBoolean217 = arg5;
		this.aString46 = arg2;
		this.aString47 = arg1;
		this.anInt3232 = arg0;
		this.anInt3226 = arg3;
		if (this.anInt3229 == 255) {
			this.anInt3229 = 0;
		}
		this.aClass275_61 = new Class275();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[III)Z")
	public boolean method2745(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class6_Sub41 local11 = (Class6_Sub41) this.aClass275_61.method6366(); local11 != null; local11 = (Class6_Sub41) this.aClass275_61.method6364()) {
			if (local11.method5797(arg2, arg0)) {
				local11.method5791(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
	public boolean method2746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class6_Sub41 local16 = (Class6_Sub41) this.aClass275_61.method6366(); local16 != null; local16 = (Class6_Sub41) this.aClass275_61.method6364()) {
			if (local16.method5792(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI[I)Z")
	public boolean method2747(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class6_Sub41 local11 = (Class6_Sub41) this.aClass275_61.method6366(); local11 != null; local11 = (Class6_Sub41) this.aClass275_61.method6364()) {
			if (local11.method5792(arg0, arg1)) {
				local11.method5793(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII[I)Z")
	public boolean method2748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class6_Sub41 local11 = (Class6_Sub41) this.aClass275_61.method6366(); local11 != null; local11 = (Class6_Sub41) this.aClass275_61.method6364()) {
			if (local11.method5795(arg0, arg2, arg1)) {
				local11.method5793(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
	public void method2749() {
		this.anInt3231 = 0;
		this.anInt3220 = 0;
		this.anInt3230 = 12800;
		this.anInt3228 = 12800;
		for (@Pc(28) Class6_Sub41 local28 = (Class6_Sub41) this.aClass275_61.method6366(); local28 != null; local28 = (Class6_Sub41) this.aClass275_61.method6364()) {
			if (this.anInt3220 < local28.anInt6943) {
				this.anInt3220 = local28.anInt6943;
			}
			if (local28.anInt6950 > this.anInt3231) {
				this.anInt3231 = local28.anInt6950;
			}
			if (local28.anInt6942 < this.anInt3228) {
				this.anInt3228 = local28.anInt6942;
			}
			if (this.anInt3230 > local28.anInt6947) {
				this.anInt3230 = local28.anInt6947;
			}
		}
	}
}
