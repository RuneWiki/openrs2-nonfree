import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
	public int anInt880 = 12800;

	@OriginalMember(owner = "client!bea", name = "K", descriptor = "I")
	public int anInt886 = 0;

	@OriginalMember(owner = "client!bea", name = "B", descriptor = "I")
	public int anInt882 = 0;

	@OriginalMember(owner = "client!bea", name = "N", descriptor = "Z")
	public boolean aBoolean34 = true;

	@OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
	public int anInt879 = -1;

	@OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
	public int anInt878 = 12800;

	@OriginalMember(owner = "client!bea", name = "P", descriptor = "I")
	public int anInt889 = -1;

	@OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
	public final int anInt876;

	@OriginalMember(owner = "client!bea", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!bea", name = "O", descriptor = "I")
	public final int anInt888;

	@OriginalMember(owner = "client!bea", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString20;

	@OriginalMember(owner = "client!bea", name = "I", descriptor = "Lclient!fea;")
	public final Class99 aClass99_10;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt876 = arg3;
		this.aString21 = arg2;
		this.anInt889 = arg6;
		this.anInt879 = arg4;
		this.anInt888 = arg0;
		this.aBoolean34 = arg5;
		this.aString20 = arg1;
		if (this.anInt889 == 255) {
			this.anInt889 = 0;
		}
		this.aClass99_10 = new Class99();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	public void method821() {
		this.anInt880 = 12800;
		this.anInt882 = 0;
		this.anInt878 = 12800;
		this.anInt886 = 0;
		for (@Pc(23) Class5_Sub30 local23 = (Class5_Sub30) this.aClass99_10.method2526(); local23 != null; local23 = (Class5_Sub30) this.aClass99_10.method2519()) {
			if (local23.anInt5803 > this.anInt882) {
				this.anInt882 = local23.anInt5803;
			}
			if (this.anInt886 < local23.anInt5810) {
				this.anInt886 = local23.anInt5810;
			}
			if (local23.anInt5817 < this.anInt878) {
				this.anInt878 = local23.anInt5817;
			}
			if (this.anInt880 > local23.anInt5814) {
				this.anInt880 = local23.anInt5814;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIB[I)Z")
	public boolean method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) Class5_Sub30 local16 = (Class5_Sub30) this.aClass99_10.method2526(); local16 != null; local16 = (Class5_Sub30) this.aClass99_10.method2519()) {
			if (local16.method4814(arg2, arg0, arg1)) {
				local16.method4815(arg1, arg3, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I[IIB)Z")
	public boolean method825(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class5_Sub30 local11 = (Class5_Sub30) this.aClass99_10.method2526(); local11 != null; local11 = (Class5_Sub30) this.aClass99_10.method2519()) {
			if (local11.method4819(arg2, arg0)) {
				local11.method4815(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III[I)Z")
	public boolean method826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(9) Class5_Sub30 local9 = (Class5_Sub30) this.aClass99_10.method2526(); local9 != null; local9 = (Class5_Sub30) this.aClass99_10.method2519()) {
			if (local9.method4817(arg0, arg1)) {
				local9.method4816(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZII)Z")
	public boolean method827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class5_Sub30 local11 = (Class5_Sub30) this.aClass99_10.method2526(); local11 != null; local11 = (Class5_Sub30) this.aClass99_10.method2519()) {
			if (local11.method4819(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
