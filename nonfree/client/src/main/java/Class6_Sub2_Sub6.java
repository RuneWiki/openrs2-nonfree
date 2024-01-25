import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class6_Sub2_Sub6 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
	public int anInt2229 = 0;

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
	public int anInt2235 = -1;

	@OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
	public int anInt2234 = 12800;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
	public int anInt2233 = -1;

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
	public int anInt2231 = 12800;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
	public int anInt2239 = 0;

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
	public final int anInt2238;

	@OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
	public final int anInt2237;

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "Lclient!ws;")
	public final Class361 aClass361_11;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2233 = arg6;
		this.aBoolean155 = arg5;
		this.aString19 = arg2;
		this.anInt2238 = arg0;
		this.anInt2235 = arg4;
		this.anInt2237 = arg3;
		this.aString18 = arg1;
		if (this.anInt2233 == 255) {
			this.anInt2233 = 0;
		}
		this.aClass361_11 = new Class361();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII[I)Z")
	public boolean method2026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class6_Sub13 local17 = (Class6_Sub13) this.aClass361_11.method7838(); local17 != null; local17 = (Class6_Sub13) this.aClass361_11.method7845()) {
			if (local17.method1621(arg1, arg0)) {
				local17.method1622(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[II)Z")
	public boolean method2028(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class6_Sub13 local16 = (Class6_Sub13) this.aClass361_11.method7838(); local16 != null; local16 = (Class6_Sub13) this.aClass361_11.method7845()) {
			if (local16.method1624(arg2, arg0)) {
				local16.method1623(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[I)Z")
	public boolean method2029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) Class6_Sub13 local16 = (Class6_Sub13) this.aClass361_11.method7838(); local16 != null; local16 = (Class6_Sub13) this.aClass361_11.method7845()) {
			if (local16.method1625(arg0, arg2, arg1)) {
				local16.method1623(arg1, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
	public void method2031() {
		this.anInt2229 = 0;
		this.anInt2234 = 12800;
		this.anInt2239 = 0;
		this.anInt2231 = 12800;
		for (@Pc(23) Class6_Sub13 local23 = (Class6_Sub13) this.aClass361_11.method7838(); local23 != null; local23 = (Class6_Sub13) this.aClass361_11.method7845()) {
			if (local23.anInt1681 < this.anInt2231) {
				this.anInt2231 = local23.anInt1681;
			}
			if (this.anInt2234 > local23.anInt1691) {
				this.anInt2234 = local23.anInt1691;
			}
			if (this.anInt2239 < local23.anInt1690) {
				this.anInt2239 = local23.anInt1690;
			}
			if (this.anInt2229 < local23.anInt1687) {
				this.anInt2229 = local23.anInt1687;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z")
	public boolean method2034(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(21) Class6_Sub13 local21 = (Class6_Sub13) this.aClass361_11.method7838(); local21 != null; local21 = (Class6_Sub13) this.aClass361_11.method7845()) {
			if (local21.method1624(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
