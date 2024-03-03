import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vj", name = "J", descriptor = "Lclient!eh;")
	public static final Class2_Sub10 aClass2_Sub10_2 = new Class2_Sub10(0, -1);

	@OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
	public static int anInt6863 = 0;

	@OriginalMember(owner = "client!vj", name = "W", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_142 = new Class79("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
	public int anInt6851 = -1;

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
	public int anInt6850 = 12800;

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
	public int anInt6861 = 0;

	@OriginalMember(owner = "client!vj", name = "U", descriptor = "Z")
	public boolean aBoolean466 = true;

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
	public int anInt6857 = 12800;

	@OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
	public int anInt6862 = -1;

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
	public int anInt6855 = 0;

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
	public final int anInt6856;

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
	public final int anInt6859;

	@OriginalMember(owner = "client!vj", name = "R", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!vj", name = "H", descriptor = "Lclient!ld;")
	public final Class135 aClass135_41;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 240)
	public Class2_Sub2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6856 = arg0;
		this.aBoolean466 = arg5;
		this.anInt6862 = arg6;
		this.aString66 = arg2;
		this.anInt6851 = arg4;
		this.anInt6859 = arg3;
		this.aString67 = arg1;
		if (this.anInt6862 == 255) {
			this.anInt6862 = 0;
		}
		this.aClass135_41 = new Class135();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[III)Z", line = 22)
	public boolean method6146(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class2_Sub31 local17 = (Class2_Sub31) this.aClass135_41.method3552(); local17 != null; local17 = (Class2_Sub31) this.aClass135_41.method3553()) {
			if (local17.method5064(arg0, arg3, arg2)) {
				local17.method5060(arg3, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)Z", line = 72)
	public boolean method6148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub31 local11 = (Class2_Sub31) this.aClass135_41.method3552(); local11 != null; local11 = (Class2_Sub31) this.aClass135_41.method3553()) {
			if (local11.method5067(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIII)Z", line = 117)
	public boolean method6150(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class2_Sub31 local11 = (Class2_Sub31) this.aClass135_41.method3552(); local11 != null; local11 = (Class2_Sub31) this.aClass135_41.method3553()) {
			if (local11.method5061(arg1, arg2)) {
				local11.method5062(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 161)
	public void method6151() {
		this.anInt6857 = 12800;
		this.anInt6850 = 12800;
		this.anInt6855 = 0;
		this.anInt6861 = 0;
		for (@Pc(28) Class2_Sub31 local28 = (Class2_Sub31) this.aClass135_41.method3552(); local28 != null; local28 = (Class2_Sub31) this.aClass135_41.method3553()) {
			if (this.anInt6861 < local28.anInt5525) {
				this.anInt6861 = local28.anInt5525;
			}
			if (local28.anInt5535 < this.anInt6850) {
				this.anInt6850 = local28.anInt5535;
			}
			if (this.anInt6855 < local28.anInt5530) {
				this.anInt6855 = local28.anInt5530;
			}
			if (this.anInt6857 > local28.anInt5522) {
				this.anInt6857 = local28.anInt5522;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZII[I)Z", line = 196)
	public boolean method6152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class2_Sub31 local16 = (Class2_Sub31) this.aClass135_41.method3552(); local16 != null; local16 = (Class2_Sub31) this.aClass135_41.method3553()) {
			if (local16.method5067(arg1, arg0)) {
				local16.method5060(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
