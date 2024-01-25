import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	public int anInt356 = -1;

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
	public int anInt360 = 0;

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
	public int anInt354 = -1;

	@OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
	public int anInt362 = 0;

	@OriginalMember(owner = "client!ba", name = "T", descriptor = "Z")
	public boolean aBoolean22 = true;

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
	public int anInt366 = 12800;

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
	public int anInt361 = 12800;

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
	public final int anInt359;

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
	public final int anInt351;

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "Ljava/lang/String;")
	public final String aString20;

	@OriginalMember(owner = "client!ba", name = "U", descriptor = "Lclient!or;")
	public final Class244 aClass244_2;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt354 = arg4;
		this.anInt359 = arg3;
		this.anInt356 = arg6;
		this.aString21 = arg1;
		this.aBoolean22 = arg5;
		this.anInt351 = arg0;
		this.aString20 = arg2;
		if (this.anInt356 == 255) {
			this.anInt356 = 0;
		}
		this.aClass244_2 = new Class244();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[II)Z")
	public boolean method328(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class3_Sub48 local17 = (Class3_Sub48) this.aClass244_2.method5572(); local17 != null; local17 = (Class3_Sub48) this.aClass244_2.method5576()) {
			if (local17.method6632(arg2, arg0)) {
				local17.method6638(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[IIII)Z")
	public boolean method330(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class3_Sub48 local11 = (Class3_Sub48) this.aClass244_2.method5572(); local11 != null; local11 = (Class3_Sub48) this.aClass244_2.method5576()) {
			if (local11.method6631(arg0, arg2, arg3)) {
				local11.method6635(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
	public void method331() {
		this.anInt362 = 0;
		this.anInt360 = 0;
		this.anInt366 = 12800;
		this.anInt361 = 12800;
		for (@Pc(31) Class3_Sub48 local31 = (Class3_Sub48) this.aClass244_2.method5572(); local31 != null; local31 = (Class3_Sub48) this.aClass244_2.method5576()) {
			if (local31.anInt8459 > this.anInt362) {
				this.anInt362 = local31.anInt8459;
			}
			if (this.anInt366 > local31.anInt8462) {
				this.anInt366 = local31.anInt8462;
			}
			if (local31.anInt8456 < this.anInt361) {
				this.anInt361 = local31.anInt8456;
			}
			if (local31.anInt8468 > this.anInt360) {
				this.anInt360 = local31.anInt8468;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZ)Z")
	public boolean method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(17) Class3_Sub48 local17 = (Class3_Sub48) this.aClass244_2.method5572(); local17 != null; local17 = (Class3_Sub48) this.aClass244_2.method5576()) {
			if (local17.method6633(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZII[I)Z")
	public boolean method334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class3_Sub48 local16 = (Class3_Sub48) this.aClass244_2.method5572(); local16 != null; local16 = (Class3_Sub48) this.aClass244_2.method5576()) {
			if (local16.method6633(arg1, arg0)) {
				local16.method6635(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}
}
