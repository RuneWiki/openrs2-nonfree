import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class8_Sub5_Sub4 extends Class8_Sub5 {

	@OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
	public int anInt2503 = -1;

	@OriginalMember(owner = "client!dba", name = "F", descriptor = "I")
	public int anInt2511 = -1;

	@OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
	public int anInt2508 = 12800;

	@OriginalMember(owner = "client!dba", name = "O", descriptor = "I")
	public int anInt2515 = 0;

	@OriginalMember(owner = "client!dba", name = "z", descriptor = "I")
	public int anInt2506 = 0;

	@OriginalMember(owner = "client!dba", name = "M", descriptor = "I")
	public int anInt2514 = 12800;

	@OriginalMember(owner = "client!dba", name = "Q", descriptor = "Z")
	public boolean aBoolean188 = true;

	@OriginalMember(owner = "client!dba", name = "P", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!dba", name = "N", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!dba", name = "y", descriptor = "I")
	public final int anInt2505;

	@OriginalMember(owner = "client!dba", name = "G", descriptor = "I")
	public final int anInt2512;

	@OriginalMember(owner = "client!dba", name = "A", descriptor = "Lclient!bq;")
	public final Class43 aClass43_18;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class8_Sub5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString27 = arg2;
		this.aBoolean188 = arg5;
		this.aString26 = arg1;
		this.anInt2505 = arg3;
		this.anInt2503 = arg6;
		this.anInt2511 = arg4;
		this.anInt2512 = arg0;
		if (this.anInt2503 == 255) {
			this.anInt2503 = 0;
		}
		this.aClass43_18 = new Class43();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I[IIZ)Z")
	public boolean method2127(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) Class8_Sub14 local16 = (Class8_Sub14) this.aClass43_18.method1422(); local16 != null; local16 = (Class8_Sub14) this.aClass43_18.method1426()) {
			if (local16.method2087(arg0, arg2)) {
				local16.method2086(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
	public void method2128() {
		this.anInt2515 = 0;
		this.anInt2508 = 12800;
		this.anInt2506 = 0;
		this.anInt2514 = 12800;
		for (@Pc(28) Class8_Sub14 local28 = (Class8_Sub14) this.aClass43_18.method1422(); local28 != null; local28 = (Class8_Sub14) this.aClass43_18.method1426()) {
			if (local28.anInt2472 < this.anInt2508) {
				this.anInt2508 = local28.anInt2472;
			}
			if (this.anInt2515 < local28.anInt2468) {
				this.anInt2515 = local28.anInt2468;
			}
			if (this.anInt2514 > local28.anInt2460) {
				this.anInt2514 = local28.anInt2460;
			}
			if (local28.anInt2470 > this.anInt2506) {
				this.anInt2506 = local28.anInt2470;
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIB)Z")
	public boolean method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(9) Class8_Sub14 local9 = (Class8_Sub14) this.aClass43_18.method1422(); local9 != null; local9 = (Class8_Sub14) this.aClass43_18.method1426()) {
			if (local9.method2089(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIB[I)Z")
	public boolean method2130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class8_Sub14 local11 = (Class8_Sub14) this.aClass43_18.method1422(); local11 != null; local11 = (Class8_Sub14) this.aClass43_18.method1426()) {
			if (local11.method2089(arg0, arg1)) {
				local11.method2088(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIII[I)Z")
	public boolean method2131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(17) Class8_Sub14 local17 = (Class8_Sub14) this.aClass43_18.method1422(); local17 != null; local17 = (Class8_Sub14) this.aClass43_18.method1426()) {
			if (local17.method2090(arg2, arg0, arg1)) {
				local17.method2088(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}
}
