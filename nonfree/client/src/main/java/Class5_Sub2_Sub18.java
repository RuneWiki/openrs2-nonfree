import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class5_Sub2_Sub18 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
	public int anInt7484 = 0;

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
	public int anInt7483 = 0;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
	public int anInt7490 = -1;

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
	public int anInt7485 = 12800;

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
	public int anInt7489 = 12800;

	@OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
	public int anInt7495 = -1;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "Z")
	public boolean aBoolean504 = true;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
	public final int anInt7491;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
	public final int anInt7482;

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!wr", name = "H", descriptor = "Lclient!nv;")
	public final Class177 aClass177_54;

	static {
		new Class198("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString75 = arg1;
		this.anInt7490 = arg6;
		this.anInt7495 = arg4;
		this.anInt7491 = arg0;
		this.anInt7482 = arg3;
		this.aString76 = arg2;
		this.aBoolean504 = arg5;
		if (this.anInt7490 == 255) {
			this.anInt7490 = 0;
		}
		this.aClass177_54 = new Class177();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)Z")
	public boolean method6012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) Class5_Sub20 local15 = (Class5_Sub20) this.aClass177_54.method3618(); local15 != null; local15 = (Class5_Sub20) this.aClass177_54.method3619()) {
			if (local15.method2509(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[IIB)Z")
	public boolean method6013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(17) Class5_Sub20 local17 = (Class5_Sub20) this.aClass177_54.method3618(); local17 != null; local17 = (Class5_Sub20) this.aClass177_54.method3619()) {
			if (local17.method2510(arg3, arg1, arg0)) {
				local17.method2507(arg2, arg1, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[IIZ)Z")
	public boolean method6014(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(21) Class5_Sub20 local21 = (Class5_Sub20) this.aClass177_54.method3618(); local21 != null; local21 = (Class5_Sub20) this.aClass177_54.method3619()) {
			if (local21.method2512(arg0, arg2)) {
				local21.method2511(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
	public void method6015() {
		this.anInt7484 = 0;
		this.anInt7485 = 12800;
		this.anInt7489 = 12800;
		this.anInt7483 = 0;
		for (@Pc(23) Class5_Sub20 local23 = (Class5_Sub20) this.aClass177_54.method3618(); local23 != null; local23 = (Class5_Sub20) this.aClass177_54.method3619()) {
			if (local23.anInt3106 < this.anInt7489) {
				this.anInt7489 = local23.anInt3106;
			}
			if (local23.anInt3108 > this.anInt7484) {
				this.anInt7484 = local23.anInt3108;
			}
			if (this.anInt7483 < local23.anInt3119) {
				this.anInt7483 = local23.anInt3119;
			}
			if (local23.anInt3120 < this.anInt7485) {
				this.anInt7485 = local23.anInt3120;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[III)Z")
	public boolean method6017(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class5_Sub20 local11 = (Class5_Sub20) this.aClass177_54.method3618(); local11 != null; local11 = (Class5_Sub20) this.aClass177_54.method3619()) {
			if (local11.method2509(arg1, arg2)) {
				local11.method2507(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}
}
